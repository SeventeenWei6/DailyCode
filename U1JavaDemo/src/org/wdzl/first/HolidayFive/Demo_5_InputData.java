package org.wdzl.first.HolidayFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Optional;

public class Demo_5_InputData {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public String getString(String info) throws IOException {
        String temp = null;
        System.out.println(info);
        temp = br.readLine();
        return temp;
    }
    public int getInt(String info,String err) throws IOException {
        int temp = 0;
        String str = null;
        boolean flag = true;
        while(flag) {
            str = this.getString(info);//
            if(str.matches("^\\d+$")) {//校验str是否是数字   ab
                temp = Integer.parseInt(str);
                flag = false;
            }else {
                System.out.println(err);
            }
        }
        return temp;
    }
    public  float getFloat(String info,String err)throws  IOException{
        float temp = 0;
        String str = null;
        boolean flag = true;
        while(flag){
            str = this.getString(info);
            if(str.matches("^\\d+.?\\d*+$"))
            {
                temp = Float.parseFloat(str);
                flag = false;
            }
            else
            {
                System.out.println(err);
            }
        }
        return temp;
    }
    public Date getDate(String info,String err)throws IOException, ParseException {
        Date d = null;
        String str = null;
        boolean flag = true;
        while (flag) {
            str = this.getString(info);
            if (str.matches("^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                d = sdf.parse(str);
                flag = false;

            } else {
                System.out.println(err);
            }
        }
        return d;
    }
    public static void main(String[] args) throws IOException {
//        float a = 0;
//        float b = 0;
//        Demo_5_InputData  id = new Demo_5_InputData();
//        a = id.getFloat("请输入第一个数字：", "输入的必须是数字，请重新输入...");
//        b = id.getFloat("请输入第二个数字：", "输入的必须是数字，请重新输入...");
//        System.out.println(a+"+"+b+"="+(a+b));

        Date d = null;
        Demo_5_InputData  id = new Demo_5_InputData();
        try
        {
            d = id.getDate("请输入日期：", "输入的必须是合理日期，请重新输入...");
        }
        catch (ParseException e)
        {
            e.getErrorOffset();
        }
    }
}
