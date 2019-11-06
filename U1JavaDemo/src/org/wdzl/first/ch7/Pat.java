package org.wdzl.first.ch7;

public class Pat {

        private  String name;
        private  double health;
        private  int love;
        int age;

        public Pat(String name,double health, int love) {
            this.name = name;
            this.health = health;
            this.love = love;
        }
        public Pat(){

        }

        public String getName() {
            return name;
        }

        public double getHealth() {
            return health;
        }

        public int getLove() {
            return love;
        }
        public  void print(){
            System.out.print("大家好我的名字叫"+this.name+" 健康值:"+this.health+" 和主人亲密度:"+this.love);
        }
}
