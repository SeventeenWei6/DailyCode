package org.wdzl.first.Demo_1;

public class TestAbstract implements  MyInterface  {
    private String sex;
    private String password;

    public TestAbstract(String sex, String password) {
        this.sex = sex;
        this.password = password;
    }

    @Override
    public int test() {
        System.out.println("This is the temp,don't worry");
        return 0;
    }

    @Override
    public void Thout() {
        System.out.print("个人信息为:");
        System.out.println(this.name+" "+this.age+" "+this.id+" "+this.password+" "+this.sex);
    }

    public static void main(String[] args) {

    }
}

/*class test{
    public static void main(String[] args) {
        TestAbstract temp1 = new TestAbstract("男","123456");
        temp1.Thout();
        temp1.test();
        //Temp3 a1 = new TestAbstract("女","1515151");
    }
}*/
interface Temp{
    public  String  phone = "741852963";
    void print_Phone();
    void test_Person();
}
interface  Temp2{
      String animalName = "皮皮";
    void print_Animal();
}
interface Temp3 extends Temp,Temp2{
    void print_All();
}
