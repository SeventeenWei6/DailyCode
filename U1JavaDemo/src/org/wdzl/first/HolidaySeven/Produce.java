package org.wdzl.first.HolidaySeven;

public class Produce implements Runnable {
    private Info info = null;
    public Produce(Info info) {
        // TODO Auto-generated constructor stub
        this.info= info;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        boolean flag = false;
        System.out.println("aa");
        for (int i = 0; i < 20; i++) {
            if(flag) {
                this.info.set("张三", "java教员");
                System.out.println("bb");
                flag = false;
            }else {
                this.info.set("hzit", "java edu****");
                System.out.println("cc");
                flag = true;
            }
        }
    }

}
