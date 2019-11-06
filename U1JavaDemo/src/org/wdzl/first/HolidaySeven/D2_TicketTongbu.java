package org.wdzl.first.HolidaySeven;

public class D2_TicketTongbu extends Thread{
    static   int tickets = 10;
    public void run() {
        while (true) {
            this.sale();
        }
    }
    public synchronized void sale() {
        if (tickets > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("买票：tickets=" + (tickets--));
        }
    }

}
