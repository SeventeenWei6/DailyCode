package org.wdzl.first.ch9;

public interface FangDoor extends Door,Lock,DoorLing {

}
class AllFangdoor implements FangDoor{
    String doorname;
    int price;
    AllFangdoor(String name,int price)
    {
        this.doorname = name;
        this.price = price;
    }

    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }
    @Override
    public void openLock() {
        System.out.println("开锁");
    }

    @Override
    public void closeLock() {
        System.out.println("关锁");
    }

    @Override
    public void Picture() {
        System.out.println("咔嚓 照片已拍！");
    }
}
class TestDoor{
    public static void main(String[] args) {
        AllFangdoor temp = new AllFangdoor("防盗门",1000);
        temp.openDoor();
        temp.closeDoor();
        temp.openLock();
        temp.closeLock();
        temp.Picture();
    }
}