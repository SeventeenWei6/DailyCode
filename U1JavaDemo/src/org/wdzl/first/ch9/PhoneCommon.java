package org.wdzl.first.ch9;

public class PhoneCommon implements  CommonHandset {
    private String brand;
    private String type;
    PhoneCommon(String brand,String type){
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
        System.out.println("普通手机打电话");
    }

    @Override
    public void sendInfo() {
        System.out.println("普通手机发信息");
    }

    @Override
    public void info() {
        System.out.println("手机品牌:"+this.getBrand()+" 手机类型:"+this.getType());
    }

    @Override
    public void Wiring() {
        System.out.println("手机播放");
    }
}
