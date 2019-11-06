package org.wdzl.first.HolidaySeven;

public class Consumer implements Runnable{
    private Info info = null;
    public Consumer(Info info) {
        this.info=info;
    }
    @Override
    public void run() {
        // TODO Auto-generated method stub
        for (int i = 0; i < 20; i++) {
            this.info.get();
        }
    }

}
