package Zhangwei;

public class Fan {
    private int speed;
    boolean on ;
    private double radius;
    String color;
    public int getSpeed() {
        return speed;
    }
    public double getRadius() {
        return radius;
    }
    public Fan(){
        speed=1;on =false;radius=5;color="blue";
    }
    public Fan(int sp,boolean on,double ra,String col) {
        speed=sp;this.on=on;
        radius=ra;color=col;
    }
    public void toString1() {
        System.out.println("----------------------");
        if(on==true) {
            char sp;
            if(getSpeed()==1)sp='慢';
            if(getSpeed()==2)sp='中';
            if(getSpeed()==3)sp='快';
            System.out.println("风扇速度:"+speed);
            System.out.println("风扇颜色:"+color);
            System.out.println("风扇半径:"+getRadius());

        }
        else System.out.println("fan is off");
    }

    public static void main(String[] args) {
        Fan fan1=new Fan(3,true,10,"yellow");
        fan1.toString1();
        Fan fan2=new Fan(2,false,5,"blue");
        fan2.toString1();


    }

}
