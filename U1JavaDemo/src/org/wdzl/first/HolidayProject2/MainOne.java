package org.wdzl.first.HolidayProject2;

import java.io.*;
import java.util.*;

public class MainOne {
    public static void Chongzhi(Map<String,MobileCard> card)
    {
        Scanner input = new Scanner(System.in);
        String number;
        String str;
        double money;
        boolean flag = false;
        MobileCard mobileCard;
        System.out.print("请输入卡号:");
        number = input.next();
        System.out.print("请输入充值金额:");
        money = input.nextDouble();

        Set<String> temp = card.keySet();
        Iterator<String> it = temp.iterator();
        while (it.hasNext())
        {
            str = it.next();
            if(str.equals(number))
            {
                flag =true;
                card.get(str).setConsumAmount(money);
                System.out.println("充值成功，当前话费余额为:"+card.get(str).getConsumAmount());
                break;
            }
        }
        if(!flag)
        {
            System.out.println("查无此人");
            return;
        }
    }
    public  static  void save2(Map<String,MobileCard> card)
    {
        String str;
        MobileCard mobileCard;
        File file = new File("F:\\电话信息.txt");
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file));
            Set<String> temp = card.keySet();
            Iterator<String> it = temp.iterator();
            while (it.hasNext())
            {
                str = it.next();
                mobileCard = card.get(str);
                bw.write(str);
                bw.write(":");
                bw.write("\r"+mobileCard.getPassWord());
                bw.write("\r"+mobileCard.getConsumAmount());
                bw.write("\r"+mobileCard.getRealTalkTime());
                bw.write("\r"+mobileCard.getRealSMSCount());
                bw.write("\r\n");
            }
            bw.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static  void save(Map<String, List<ConsumInfo>> consumInfos)
    {
        File file = new File("F:\\消费信息.txt");
        String k;
        if(!file.exists())
        {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file,true));

            Set<String> temp = consumInfos.keySet();
            Iterator<String> it = temp.iterator();
            while(it.hasNext())
            {
                k = it.next();
                List<ConsumInfo> list = new LinkedList<>();
                list = consumInfos.get(k);
                for (ConsumInfo c:list) {
                    bw.write(k+":");
                    bw.write("\t"+c.getMessage());
                    bw.write("\r\n");
                }
                bw.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public  static  void consum(String number,Map<String,MobileCard> card,Map<String, List<ConsumInfo>> consumInfos)
    {
        Scanner in = new Scanner(System.in);
        List<ConsumInfo> list = new LinkedList<>();
        int choice = 0;
        String message;
        System.out.println("输入场景:");
        choice = in.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("问候客户，谁知其如此难缠  通话90分钟");
                Set<String> temp = card.keySet();
                Iterator<String> it = temp.iterator();
                while (it.hasNext()) {
                    String key = it.next();

                    if (key.equals(number)) {
                        MobileCard mobileCard =card.get(key);
                        mobileCard.setRealTalkTime(90);
                    }
                }
                message = "通话90分钟";
                ConsumInfo consumInfo = new ConsumInfo(message);
                list.add(consumInfo);
                break;
            case 2:
                System.out.println("通知朋友手机换号，发送短信50条");
                Set<String> temp2 = card.keySet();
                Iterator<String> it2 = temp2.iterator();
                while (it2.hasNext()) {
                    String key = it2.next();

                    if (key.equals(number)) {
                        MobileCard mobileCard =card.get(key);
                        mobileCard.setRealSMSCount(50);
                    }
                }
                message = "发送短信50条";
                ConsumInfo consumInfo2 = new ConsumInfo(message);
                list.add(consumInfo2);
                break;
            case 3:
                System.out.println("上网使用流量500mb");
                Set<String> temp3 = card.keySet();
                Iterator<String> it3= temp3.iterator();
                while (it3.hasNext()) {
                    String key = it3.next();

                    if (key.equals(number)) {
                        MobileCard mobileCard =card.get(key);
                        mobileCard.setRealFlow(500);
                    }
                }
                break;
            case 4:
                System.out.println("退出");
                break;
        }
        consumInfos.put(number,list);
        save(consumInfos);
    }
    public static  void denglu2(String number,Map<String,MobileCard> card) {
        Scanner in = new Scanner(System.in);
        int choice;
        System.out.println("********嗖嗖移动用户菜单********");
        System.out.println("1.本月账单查询");
        System.out.println("2.套餐余量查询");
        System.out.println("3.打印消费详单");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                Set<String> temp = card.keySet();
                Iterator<String> it = temp.iterator();
                while (it.hasNext()) {
                    String key = it.next();
                    if (key.equals(number)) {
                        MobileCard mobileCard = card.get(key);
                        System.out.println("*****本月账单查询*****");
                        System.out.println("你的卡号:" + number);
                        System.out.println("套餐资费:" + mobileCard.getServicePackage().getPrice());
                        System.out.println("合计:" + mobileCard.getConsumAmount());
                        System.out.println("账户余额:" + mobileCard.getMoney());
                    }
                }
                break;
            case 2:
                Set<String> temp2 = card.keySet();
                Iterator<String> it2 = temp2.iterator();
                while (it2.hasNext()) {
                    String key = it2.next();
                    if (key.equals(number)) {
                        MobileCard mobileCard = card.get(key);
                        System.out.println("*****本月账单查询*****");
                        System.out.println("你的卡号:" + number);
                        System.out.println("套餐剩余:");
                        if(mobileCard.getServicePackage()instanceof TalkPackage)
                        {
                            TalkPackage talkPackage = (TalkPackage) mobileCard.getServicePackage();
                            System.out.println("通话时长:"+talkPackage.call(mobileCard));
                            System.out.println("短信条数:"+talkPackage.send(mobileCard));
                        }
                        else if(mobileCard.getServicePackage()instanceof NetPackage)
                        {
                            NetPackage netPackage = (NetPackage) mobileCard.getServicePackage();
                            System.out.println("剩余流量:"+netPackage.netPlay(mobileCard));
                        }
                        else
                        {
                            SuperPackage superPackage =(SuperPackage) mobileCard.getServicePackage();
                            System.out.println("通话时长:"+superPackage.call(mobileCard));
                            System.out.println("短信条数:"+superPackage.send(mobileCard));
                            System.out.println("剩余流量:"+superPackage.netPlay(mobileCard));
                        }
                    }
                }
                break;
            case 3://打印消费清单
                File file = new File("F:\\消费信息.txt");
                String s;
                try {
                    System.out.println("消费账单:");
                    BufferedReader br = new BufferedReader(new FileReader(file));
                   while((s =  br.readLine())!=null)
                   {
                       System.out.println(s);
                   }
                    br.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
                default:
                    return;

        }
        return;
    }

    public static  void denglu(Map<String,MobileCard> card,CardUtil cardUtil)
    {
        String name;
        String password;
        boolean flag;
        Scanner in = new Scanner(System.in);
        System.out.println("请输入手机卡号: ");
        name = in.next();
        System.out.println("请输入密码: ");
        password = in.next();
        cardUtil.isExistCard(name,password);
        denglu2(name,card);
        return;


    }
    public static  void zhuce(String cards[],Map<String,MobileCard> card)
    {
        String number;
        String name;
        String password;
        double money;
        double money2;
        int key = 0;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 9; i++) {
            if((i+1)%3 == 0)
            {
                System.out.print(i+1+"."+cards[i]+"\t\t");
                System.out.println();
            }
            else {
                System.out.print(i + 1 + "." + cards[i] + "\t\t");
            }
        }
        System.out.print("请选择卡号序号: ");
        key = in.nextInt();
        number = cards[key-1];
        System.out.println("请选择套餐");
        System.out.println("1：话痨套餐");
        System.out.println("2：网虫套餐");
        System.out.println("3：超人套餐");
        key = in.nextInt();
        switch(key)
        {
            case 1:
                TalkPackage talkPackage = new TalkPackage(58,200,50);
                System.out.print("请输入姓名：");
                name = in.next();
                System.out.print("请输入密码：");
                password = in.next();
                System.out.print("请输入预存话费：");
                money  = in.nextDouble();
                while(money < talkPackage.getPrice())
                {
                    System.out.println("你预存的话费金额不足以支付本月套餐，请重新输入:");
                    money = in.nextDouble();
                }

                System.out.println("注册成功！");
                System.out.println("你的卡号:"+number+"\t用户名:"+name+"\t当前余额:"+(money-talkPackage.getPrice()));
                money2 = (money-talkPackage.getPrice());
                MobileCard mb = new MobileCard(number,name,password,talkPackage,money,money2,0,0,0);
                card.put(number,mb);
                talkPackage.showInfo();
                break;
            case 2:
                NetPackage netPackage = new NetPackage(68,5012);
                System.out.print("请输入姓名：");
                name = in.next();
                System.out.print("请输入密码：");
                password = in.next();
                System.out.print("请输入预存话费：");
                money  = in.nextDouble();
                while(money < netPackage.getPrice())
                {
                    System.out.println("你预存的话费金额不足以支付本月套餐，请重新输入:");
                    money = in.nextDouble();
                }
                System.out.println("注册成功！");
                System.out.println("你的卡号:"+number+"\t用户名:"+name+"\t当前余额:"+(money-netPackage.getPrice()));
                money2 = (money-netPackage.getPrice());
                MobileCard mb2 = new MobileCard(number,name,password,netPackage,money,money2,0,0,0);
                card.put(number,mb2);
                netPackage.showInfo();
                break;
            case 3:
                SuperPackage superPackage = new SuperPackage(78,200,100,1024);
                System.out.print("请输入姓名：");
                name = in.next();
                System.out.print("请输入密码：");
                password = in.next();
                System.out.print("请输入预存话费：");
                money  = in.nextDouble();
                while(money < superPackage.getPrice())
                {
                    System.out.println("你预存的话费金额不足以支付本月套餐，请重新输入:");
                    money = in.nextDouble();
                }
                System.out.println("注册成功！");
                System.out.println("你的卡号:"+number+"\t用户名:"+name+"\t当前余额:"+(money-superPackage.getPrice()));
                money2 = (money-superPackage.getPrice());
                MobileCard mb3 = new MobileCard(number,name,password,superPackage,money,money2,0,0,0);
                card.put(number,mb3);
                superPackage.showInfo();
                break;
            default:
                System.out.println("输入错误");
                return;
        }
        save2(card);
    }
    public static void main(String[] args) {
        Map<String,MobileCard> card = new HashMap<String, MobileCard>();
        Map<String, List<ConsumInfo>> consumInfos = new HashMap<String, List<ConsumInfo>>();
        CardUtil cardUtil = new CardUtil(card,consumInfos);
        Scanner input = new Scanner(System.in);
        String newcards[] = new String[9];
        String number;
        int choice;
        while(true) {
            System.out.println("**********欢迎使用嗖嗖移动业务大厅**********");
            System.out.println("1.用户登录");
            System.out.println("2.用户注册");
            System.out.println("3.使用嗖嗖");
            System.out.println("4.话费充值");
            System.out.println("5.资费说明");
            System.out.println("6.退出");
            System.out.print("请输入你的选择: ");
            choice = input.nextInt();
            switch (choice)
            {
                case 1 :
                    denglu(card,cardUtil);
                    break;
                case 2 :
                    newcards = cardUtil.getNewNumbers();
                    zhuce(newcards,card);
                    break;
                case 3 :
                    System.out.print("请输入手机号: ");
                    number = input.next();
                    consum(number,card,consumInfos);
                    break;
                case 4 :
                    Chongzhi(card);
                    break;
            }
        }
    }
}
