package org.wdzl.first.ch9;

public class DaYing {
    void Print(FinishMohe mohe,FinishPaper paper) {
        System.out.println("使用" + mohe.getColor() + "打印机，打印" + paper.getType() + "类型的纸");

    }
}
class TestPrint{
    public static void main(String[] args) {
        DaYing temp = new DaYing();
        temp.Print(new FinishMohe("彩色"),new FinishPaper("A4"));
    }
}
