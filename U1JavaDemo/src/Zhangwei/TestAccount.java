package Zhangwei;

public class TestAccount {
    public static void main(String[] args) {
        Account temp = new Account(1122,20000);
        temp.setAnnualInterestRate(0.045);
        temp.withdraw(2500);
        temp.deposit(3000);
        System.out.println("用户"+temp.getId()+"的账户情况如下:");
        System.out.println("账户余额："+temp.getBalance());

        System.out.println("每月利息："+temp.getMonthlyInterseterRate());

        System.out.println("账户创建日期："+temp.getDateCreated());
    }

}
