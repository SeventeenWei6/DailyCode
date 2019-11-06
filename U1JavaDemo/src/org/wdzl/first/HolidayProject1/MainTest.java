package org.wdzl.first.HolidayProject1;

import java.io.*;
import java.util.*;

public class MainTest {

    public static  List show()
    {
        Schedule schedule = new Schedule();
        System.out.println("序号\t\t电影名称\t\t英文名称\t\t导演\t\t主演\t\t类型\t\t价格\t\t时间");
        List<Scheduleltem> list = schedule.loadItems("aaa.xml");
        return  list;
    }
    public  static void seat()
    {
        System.out.println("\t\t\t\t\t\t\t\t*******屏幕*******");
        for (int i = 1; i <=6 ; i++) {
            for (int j = 1; j <=7 ; j++) {
                System.out.print(i+"-"+j+"\t\t\t");
            }
            System.out.println();
        }

    }
    public static  void save (Object obj)
    {

        File file = new File("F:\\AllSaveandRead.txt");
        boolean isexit = false;
        if (file.exists()) {
            isexit = true;// 序列化文件存在,追加内容

            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file, true);
                ObjectOutputStream op = new ObjectOutputStream(fileOutputStream);
                long pos = 0;
                if (isexit) {
                    //JAVA默认对象序列化写入对象时都会在头部写入StreamHeader了占了四个字节，追加时需要删除
                    pos = fileOutputStream.getChannel().position() - 4;
                    fileOutputStream.getChannel().truncate(pos);

                }
                op.writeObject(obj);
                op.close();
                fileOutputStream.close();
                System.out.println("追加成功~");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
            else
                {
                    try {
                        file.createNewFile();
                        FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                        ObjectOutputStream op = new ObjectOutputStream(fileOutputStream);
                        op.writeObject(obj);
                        op.close();
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }


        }

    public static void read()
    {
        File file = new File("F:\\AllSaveandRead.txt");
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        List<Ticket> list = new ArrayList<>();

        try {
            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            while (fileInputStream.available() > 0) {
                list.add((Ticket) objectInputStream.readObject());
            }
            for (int i = 0; i < list.size(); i++) {
                System.out.print("电影名:"+list.get(i).getName());
                System.out.println("座位  :"+list.get(i).getSeat());
                System.out.println("时间  :"+list.get(i).getTime());
                System.out.println("价格  :"+list.get(i).getPrice());
                System.out.println();
            }
            objectInputStream.close();
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }




        }

    public static void send(String name,String time,double price)
    {
        Scanner in =new Scanner(System.in);

        System.out.print("请输入赠者姓名:");
        String sendname = in.next();

        String s = time;
        char [] temp =s.toCharArray();//String 转化为char 数组
        for (int j = 0; j <temp.length ; j++) {
            if(temp[j]==':')
            {
                temp[j] = '-';
            }
        }
        String s1 = String.valueOf(temp);

        List<String> list1 = new ArrayList<>();//建立数组接收座位类txt文档中集合
        String seat;
        int a,b;
        boolean flag = false;
        System.out.println("请输入你所选的座位号:");
        System.out.print("请输入你的行:");
        a = in.nextInt();
        System.out.print("请输入你的列:");
        b = in.nextInt();
        seat = a+"-"+b;
        System.out.println("你所选的为:"+seat);
        //读取座位表
        File file = new File("f:\\"+name+"_"+s1+".txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String p;
            while((p = br.readLine())!=null)
            {
                list1.add(p);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(list1.get(a*b).equals("true"))
        {
            list1.set(a*b,"flase");
            System.out.println("购票成功!正在出票");
            //将更改完后的文件重新写回去
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                for (String k:list1){
                    bw.write(k);
                    bw.write("\r\n");
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //创建SendTicket类 出票
            SendTicket ticket = new SendTicket(name,time,seat,price,sendname);
            save(ticket);
            try {
                ticket.Printticket();
                Thread.sleep(1000);
                System.out.println("出票成功!");
                return;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        else
        {
            System.out.println("该座位已经售出，请重新购票");
            return;
        }

    }
    public static  void student(String name,String time,double price)
    {
        Random r= new Random();
        double number = (r.nextInt(10)+1)*0.1;//随机折扣
        System.out.println("学生票的随机折扣为"+number);
        //将时间转化为指定格式
        String s = time;
        char [] temp =s.toCharArray();//String 转化为char 数组
        for (int j = 0; j <temp.length ; j++) {
            if(temp[j]==':')
            {
                temp[j] = '-';
            }
        }
        String s1 = String.valueOf(temp);

        List<String> list1 = new ArrayList<>();//建立数组接收座位类txt文档中集合
        Scanner in = new Scanner(System.in);
        String seat;
        int a,b;
        boolean flag = false;
        System.out.println("请输入你所选的座位号:");
        System.out.print("请输入你的行:");
        a = in.nextInt();
        System.out.print("请输入你的列:");
        b = in.nextInt();
        seat = a+"-"+b;
        System.out.println("你所选的为:"+seat);
        //读取座位表
        File file = new File("f:\\"+name+"_"+s1+".txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String p;
            while((p = br.readLine())!=null)
            {
                list1.add(p);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(list1.get(a*b).equals("true"))
        {
            list1.set(a*b,"flase");
            System.out.println("购票成功!正在出票");
            //将更改完后的文件重新写回去
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                for (String k:list1){
                    bw.write(k);
                    bw.write("\r\n");
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //创建Ticket类 出票
            StudentTicket ticket = new StudentTicket(name,time,seat,price,number);
            save(ticket);
            try {
                ticket.Printticket();
                Thread.sleep(1000);
                System.out.println("出票成功!");
                return;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        else
        {
            System.out.println("该座位已经售出，请重新购票");
            return;
        }

    }
    public static void common(String name,String time,double price)
    {

        //将时间转化为指定格式
        String s = time;
        char [] temp =s.toCharArray();//String 转化为char 数组
        for (int j = 0; j <temp.length ; j++) {
            if(temp[j]==':')
            {
                temp[j] = '-';
            }
        }
        String s1 = String.valueOf(temp);

        List<String> list1 = new ArrayList<>();//建立数组接收座位类txt文档中集合
        Scanner in = new Scanner(System.in);
        String seat;
        int a,b;
        boolean flag = false;
        System.out.println("请输入你所选的座位号:");
        System.out.print("请输入你的行:");
        a = in.nextInt();
        System.out.print("请输入你的列:");
        b = in.nextInt();
        seat = a+"-"+b;
        System.out.println("你所选的为:"+seat);
        //读取座位表
        File file = new File("f:\\"+name+"_"+s1+".txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String p;
            while((p = br.readLine())!=null)
            {
                list1.add(p);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(list1.get(a*b).equals("true"))
        {
            list1.set(a*b,"flase");
            System.out.println("购票成功!正在出票");
            //将更改完后的文件重新写回去
            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                for (String k:list1){
                    bw.write(k);
                    bw.write("\r\n");
                }
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //创建Ticket类 出票
            Ticket ticket = new Ticket(name,time,seat,price);
            save(ticket);
            try {
                ticket.Printticket();
                Thread.sleep(1000);
                System.out.println("出票成功!");
                return;
            } catch (IOException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        else
        {
            System.out.println("该座位已经售出，请重新购票");
            return;
        }

    }
    public static void main(String[] args) throws InterruptedException {
       String name;
       String time;
       double price = 0;
       boolean flag = false;
       boolean flag2 = false;
       int choice = 0;
       int key = 0;
       Scanner input = new Scanner(System.in);
       List<Scheduleltem> list ;//获取每场的影讯
      //输出电影信息和座位表
       list =  show();
       seat();
       while(true)
        {

            System.out.print("请输入电影名称:");
            name = input.next();
            Iterator<Scheduleltem> it = list.iterator();
            while (it.hasNext())
            {
                Scheduleltem sch = it.next();
                if(sch.getMovie().getName().equals(name))
                {
                    flag =true;
                    break;
                }
            }
            if(!flag)
            {
                System.out.println("输入有误,请重新输入");
                Thread.sleep(1000);
                continue;
            }
            System.out.print("请输入电影播放时间,以xx:xx格式:");
            time = input.next();
            //判断是否有该段电影时间,遍历集合
            Iterator<Scheduleltem> it2 = list.iterator();
            while (it.hasNext())
            {
                Scheduleltem sch = it.next();
                if(sch.getTime().equals(time))
                {

                    price = sch.getMovie().getPrice();
                    flag2 =true;

                    break;
                }
            }
            if(!flag2)
            {
                System.out.println("无该段时间,请重新输入");
                Thread.sleep(1000);
                continue;
            }
            System.out.print("请输入你所要购买的电影票类型:1.普通票 2.学生票 3.赠票");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    common(name,time,price);
                    break;
                case 2:
                    student(name,time,price);
                    break;
                case 3:
                    send(name,time,price);

            }
            System.out.print("若想查看已售出票信息,请输入1:");
             key = input.nextInt();
             if(key == 1)
             {
                 read();
             }
             else {
                 System.out.println("输入任意键返回");
                 input.next();
             }


        }
    }
}
