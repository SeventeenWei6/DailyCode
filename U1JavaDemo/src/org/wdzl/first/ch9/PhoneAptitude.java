package org.wdzl.first.ch9;

public class PhoneAptitude implements AptitudeHandset {
    private String brand;
    private String type;
    PhoneAptitude(String brand,String type){
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    @Override
    public void call() {
        System.out.println("智能手机打电话");
    }

    @Override
    public void sendInfo() {
        System.out.println("智能手机发信息");
    }

    @Override
    public void info() {
        System.out.println("智能手机品牌:"+this.getBrand()+" 智能手机类型:"+this.getType());
    }

    @Override
    public void Network() {
        System.out.println("智能手机联网");
    }

    @Override
    public void TheakePicture() {
        System.out.println("智能手机照相");
    }
}
