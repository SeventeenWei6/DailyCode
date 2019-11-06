package org.wdzl.first.HolidayProject1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Serializable;

public class SendTicket extends Ticket implements Serializable {
    private static final long serialVersionUID = 1L;
    private String sendname;

    public SendTicket(String name, String time, String seat, double price, String sendname) {
        super(name, time, seat, price);
        this.sendname = sendname;
    }

    public String getSendname() {
        return sendname;
    }

    public void setSendname(String sendname) {
        this.sendname = sendname;
    }
    public void Printticket() throws IOException {
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
        fw.write("\t恒智影院");
        fw.write("\r\n");
        fw.write("---------------------------");
        fw.write("\r\n");
        fw.write("电影名:\t"+this.getName());
        fw.write("\r\n");
        fw.write("时间:\t"+this.getTime());
        fw.write("\r\n");
        fw.write("座位号:\t"+this.getSeat());
        fw.write("\r\n");
        fw.write("姓名(赠者):"+this.getSendname());
        fw.write("\r\n");
        fw.write("***************************");
        fw.close();
    }
}
