package Zhangwei;

class BeanMachine
{
    int numOfSlots;
    int numOfBean;
    int[] slots ;


    public BeanMachine(int numOfBean,int numOfSlots)
    {
        this.numOfBean = numOfBean;
        this.numOfSlots = numOfSlots;
        slots = new int[numOfSlots];
        for(int i = 0;i<slots.length;i++)
        {
            slots[i] = 0;
        }

    }

    public void oneBeanRun()
    {
        int num = 0;
        for(int i = 0;i<numOfSlots - 1;i++)
        {
            double r = Math.random();
            if(r >= 0.5) num++;
        }
        slots[num]++;
    }

    public void runAllBeans()
    {
        for(int i = 0;i < numOfBean;i++)
        {
            this.oneBeanRun();
        }
    }
    public void showBeans()
    {
        for(int i = 0;i < slots.length;i++)
        {
            for(int j = 0;j < slots[i];j++)

                System.out.print("o");
            System.out.println();


        }
    }

    public int maxOfSlots()
    {
        int max = 0;
        for(int i = 0;i < slots.length; i++)
        {
            if(max < slots[i])
                max = slots[i];
        }
        return max;

    }
    public void showHorizontalBeans()
    {
        int max = maxOfSlots();
        for(int i = max;i>0;i--)
        {
            for(int j = 0;j < slots.length;j++)
            {
                if(slots[j] == i)
                {
                    System.out.print("|o");
                    slots[j]--;
                }
                else System.out.print("| ");
            }
            System.out.println("|");
        }


    }



    public void test()
    {

        runAllBeans();
		//owBeans();
        System.out.println("--------------------------------");
        showHorizontalBeans();
    }

}

public class Bean_Machine {

    public static void main(String[] args) {
        // TODO 自动生成的方法存根

        BeanMachine bml = new BeanMachine(200,20);
        bml.test();
    }

}
