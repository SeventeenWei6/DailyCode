package org.wdzl.first.HolidayProject2;

public class TalkPackage extends ServicePackage implements  CallService,SendService{

    private int talkTime;
    private int smsCount;

    public TalkPackage(int price, int talkTime, int smsCount) {
        super(price);
        this.talkTime = talkTime;
        this.smsCount = smsCount;
    }

    public int getTalkTime() {
        return talkTime;
    }

    public void setTalkTime(int talkTime) {
        this.talkTime = talkTime;
    }

    public int getSmsCount() {
        return smsCount;
    }

    public void setSmsCount(int smsCount) {
        this.smsCount = smsCount;
    }

    @Override
    public int send( MobileCard card) {
        return this.smsCount-card.getRealSMSCount();
    }

    @Override
    public int call( MobileCard card) {


        return this.getTalkTime()- card.getRealTalkTime();
    }

    @Override
    public void showInfo() {
        System.out.println("套餐类型:超人套餐\t\t通话时常:200分钟\t\t短信条数:50条\t\t月资费:68元");
    }
}
