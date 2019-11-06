package Zhangwei;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Account {
    private  int id;
    private  double balance;
    private  double annualInterestRate;//当前利率
    private  Date dateCreated;

    public Account(){
        this.dateCreated=new Date();
    }
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated=new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        String date;

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式

        date=df.format(dateCreated);
        return date;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getMonthlyInterseterRate(){

        return this.annualInterestRate/12;

    }



    public void withdraw(double out_money){

        this.balance-=out_money;

    }



    public void deposit(double in_money){

        this.balance+=in_money;

    }

}
