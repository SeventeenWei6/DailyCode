package org.wdzl.first.Demo_2;


public class CommandTest {
    public static void main(String[] args) {
         Math.random();
        ProcessArry pa = new ProcessArry();
        int []target = {3,-4,6,4};
        pa.process(target,new PrintCommand());
        System.out.println("--------");
        pa.process(target,new AddCommand());
        Command sta = new PrintCommand();
    }
}
class ProcessArry
{
    public void process(int []target,Command cmd)
    {
        cmd.process(target);
    }
}
interface  Command
{
    void process(int []target);
}
class PrintCommand implements Command{
    @Override
    public void process(int[] target) {
        for(int tmp:target)
        {
            System.out.println("迭代输出目标数组的元素:"+tmp);
        }
    }
}class AddCommand implements  Command{
    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int tmp:target)
        {
            sum+=tmp;
        }
        System.out.println("数组元素的总和是:"+sum);
    }
}