package org.wdzl.first.HolidayProject1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class StudentTicket extends Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    private double discount;

    public StudentTicket(String name, String time, String seat,double price, double discount)
    {
        super(name,time,seat,price);
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void calPrice() {
        this.setPrice(this.getPrice()*this.discount);
    }

    @Override
    public void Printticket() throws IOException {
        this.calPrice();
        String s = this.getTime();
        char [] temp =s.toCharArray();//String 转化为char 数组
        for (int j = 0; j <temp.length ; j++) {
            if(temp[j]==':')
            {
                temp[j] = '-';
            }
        }
        String s1 = String.valueOf(temp);
        String name = this.getName()+"_"+this.getSeat();
        String filename = "F:\\"+name+"_"+s1+".txt";
        File file = new File(filename);
        if(!file.exists())
        {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(filename);
        fw.write("***************************");
        fw.write("\r\n");
        fw.write("\t恒智影院(学生)");
        fw.write("\r\n");
        fw.write("---------------------------");
        fw.write("\r\n");
        fw.write("电影名:\t"+this.getName());
        fw.write("\r\n");
        fw.write("时间:\t"+this.getTime());
        fw.write("\r\n");
        fw.write("座位号:\t"+this.getSeat());
        fw.write("\r\n");
        fw.write("价格:\t"+this.getPrice());
        fw.write("\r\n");
        fw.write("***************************");
        fw.close();
    }
}
