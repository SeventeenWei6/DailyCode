package org.wdzl.first.HolidayProject2;

public class SuperPackage extends ServicePackage implements  CallService,SendService,NetService {

    private int talkTime;
    private int smsCount;
    private int flow;

    public SuperPackage(int price, int talkTime, int smsCount, int flow) {
        super(price);
        this.talkTime = talkTime;
        this.smsCount = smsCount;
        this.flow = flow;
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

    public int getFlow() {
        return flow;
    }

    public void setFlow(int flow) {
        this.flow = flow;
    }
    public  void showInfo()
    {
        System.out.println("套餐类型：超人套餐\t\t通话时长：200分钟 \t\t短信条数：100条\t\t上网流量：1GB\t\t上网流量：1GB");
    }

    @Override
    public int call( MobileCard card) {
        return this.getTalkTime()-card.getRealTalkTime();
    }
    @Override
    public int send( MobileCard card) {
        return this.getSmsCount()-card.getRealSMSCount();
    }
    @Override
    public int netPlay( MobileCard card) {
        return this.getFlow()-card.getRealFlow();
    }
}
