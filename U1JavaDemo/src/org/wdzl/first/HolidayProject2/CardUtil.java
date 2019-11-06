package org.wdzl.first.HolidayProject2;

import java.util.*;

public class CardUtil {
    Map<String,MobileCard> card ;
    Map<String, List<ConsumInfo>> consumInfos;

    public CardUtil(Map<String, MobileCard> card, Map<String, List<ConsumInfo>> consumInfos) {
        this.card = card;
        this.consumInfos = consumInfos;
    }

    public  void InitScene()
    {

    }
    public boolean isExistCard(String number,String password)
    {
        Set<String> temp = this.card.keySet();
        Iterator<String> it = temp.iterator();
        while(it.hasNext())
        {
            String key = it.next();
            if(key.equals(number))
            {
                MobileCard mobileCard = this.card.get(key);
                if(mobileCard.getPassWord().equals(password))
                {
                    System.out.println("登录成功!");
                    return  true;
                }
                else
                {
                    System.out.println("密码错误");
                    return false;
                }
            }
        }
        System.out.println("无该手机号!");
        return false;
    }
    public boolean isExistCard(String number) {
        Set<String> temp = this.card.keySet();
        Iterator<String> it = temp.iterator();
        while (it.hasNext()) {
            String key = it.next();
            if (key.equals(number)) {
                System.out.println("该号已经存在!");
                return false;
            }
        }
        return true;
    }
    public  String [] getNewNumbers(){
        String numberlist[] = new String[9];
        String number = "139";
        Random random = new Random();
        for (int i = 0; i <9 ; i++) {
            number = "139";

            long number1 = random.nextInt(99999999-10000000)+10000000+1;
            number = number+number1;
            while(!isExistCard(number))
            {
                number1  = random.nextInt(99999999-10000000)+10000000+1;
                number = number+number1;
            }
            numberlist[i] = number;
        }
        return  numberlist;
    }
}
