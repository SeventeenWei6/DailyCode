package org.wdzl.first.HolidaySeven;

public class Info {
    private String name = "张三";
    private String content = "java教员";
    private boolean flag = false;

    public Info(String name, String content) {
        super();
        this.name = name;
        this.content = content;
    }
    public Info() {

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public boolean isFlag() {
        return flag;
    }
    public void setFlag(boolean flag) {
        this.flag = flag;
    }
    //同步方法
    public synchronized void set(String name,String content) {
        if(!flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        this.setName(name);//设置名称
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        this.setContent(content);//设置内容
        flag  = false;//该变标志位，表示可以去走
        super.notify();
    }
    public synchronized void get() {
        if(flag) {
            try {
                super.wait();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(this.getName()+"---->"+this.getContent());
        flag = true;
        super.notify();
    }

}

