package org.wdzl.first.HolidayOne;

import java.util.Scanner;

public class AnimalTest {
    public static void main(String[] args) {
        int key;
        AnimalModel Arraytemp[] =  new AnimalModel[3];
        Arraytemp[0] = new CatDemo("咖啡猫",4);
        Arraytemp[1] = new DuckDemo("唐老鸭",2);
        Arraytemp[2] = new DolphinDemo("海豚奇奇",0);

        System.out.println("动物名字\t\t\t\t\t\t腿的条数\t\t\t\t\t\t动物叫");
        for (AnimalModel temp:Arraytemp
             ) {
            if(temp instanceof CatDemo)
            {
                CatDemo temp1 = (CatDemo)temp;
                System.out.print(temp.getName()+"\t\t\t\t\t\t"+((CatDemo) temp).getLeg()+"\t\t\t\t\t\t\t");
                temp.shout();
            }
            else if (temp instanceof DuckDemo)
            {
                DuckDemo temp1 = (DuckDemo)temp;
                System.out.print(temp.getName()+"\t\t\t\t\t\t"+((DuckDemo) temp).getLeg()+"\t\t\t\t\t\t\t");
                temp.shout();
            }
            else
            {
                DolphinDemo temp1 = (DolphinDemo)temp;
                System.out.print(temp.getName()+"\t\t\t\t\t\t"+((DolphinDemo) temp).getLeg()+"\t\t\t\t\t\t\t");
                temp.shout();
            }
        }
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("是否要继续修改数据，若修改则 输入0→猫类  输入1→鸭类 输入2→海豚");
            key = input.nextInt();
            if(key == 0)
            {
                System.out.print("请输入猫的名字:");
                String name = input.next();
                Arraytemp[0].setName(name);
                System.out.print("请输入猫的腿的个数:");
                int leg = input.nextInt();
                try{
                    if(leg!=4)
                    {
                        throw new Exception();
                    }
                }
                catch (Exception a)
                {
                    System.err.println("猫只有四条腿");

                }
            }
            else if(key == 1)
            {
                System.out.print("请输入鸭的名字:");
                String name = input.next();
                Arraytemp[1].setName(name);
                System.out.print("请输入鸭的腿的个数:");
                int leg = input.nextInt();
                try{
                    if(leg!=2)
                    {
                        throw new Exception();
                    }
                }
                catch (Exception a)
                {
                    System.err.println("鸭只有两条腿");

                }
            }
            else
            {
                System.out.print("请输入海豚的名字:");
                String name = input.next();
                Arraytemp[2].setName(name);
                System.out.print("请输入海豚的腿的个数:");
                int leg = input.nextInt();
                try{
                    if(leg!=0)
                    {
                        throw new Exception();
                    }
                }
                catch (Exception a)
                {
                    System.err.println("海豚没有腿");

                }
            }
            for (AnimalModel temp:Arraytemp
            ) {
                if(temp instanceof CatDemo)
                {
                    CatDemo temp1 = (CatDemo)temp;
                    System.out.print(temp.getName()+"\t\t\t\t\t\t"+((CatDemo) temp).getLeg()+"\t\t\t\t\t\t\t");
                    temp.shout();
                }
                else if (temp instanceof DuckDemo)
                {
                    DuckDemo temp1 = (DuckDemo)temp;
                    System.out.print(temp.getName()+"\t\t\t\t\t\t"+((DuckDemo) temp).getLeg()+"\t\t\t\t\t\t\t");
                    temp.shout();
                }
                else
                {
                    DolphinDemo temp1 = (DolphinDemo)temp;
                    System.out.print(temp.getName()+"\t\t\t\t\t\t"+((DolphinDemo) temp).getLeg()+"\t\t\t\t\t\t\t");
                    temp.shout();
                }
            }
        }
    }
}
