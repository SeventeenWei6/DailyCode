package org.wdzl.first.HolidayEleven;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static  int sum =0;
    public static int panduan(int i,int j,int k ,int l,int[]c,int []d)
    {
        d[0] = i;
        d[1] = j;
        d[2] = k;
        d[3] = l;
        for(int p = 0;p <=3;p++)
        {
            if(d[p] == 2)
            {
                c[0]++;
            }
             if(d[p] == 8)
            {
                c[1]++;
            }
            if(d[p] == 3)
            {
                c[2]++;
            }
        }
        if(c[0]>2 || c[1]>1 || c[2]>1)
        {
            c[0] = 0;
            c[1] = 0;
            c[2] = 0;
            return 0;
        }
        else
        {
            c[0] = 0;
            c[1] = 0;
            c[2] = 0;
            return 1;
        }

    }
    public static void panduan_New(int i,int j,int k,int l,int []f)
    {
        int n = i*1000+j*100+k*10+l;
        if(f[0]==0)
        {
           f[0] = n;
            sum++;
            return ;
        }
        for(int m=0;m<sum;m++)
        {
            if(n == f[m])
            {
                return;
            }
        }
        System.out.println(n+"   ");
        f[sum] = n;
        sum++;
        return ;
    }
    public static void main(String[] args) {
//        int []b = {2,2,8,3};
//        int []c =new int[3];
//        int []d = new int[4];
//        int []f = new int[20];
//        int flag;
//        int n =0;
//        for(int i = 0;i  <= 3;i++)
//        {
//            for(int j = 0;j <= 3;j++)
//            {
//                for(int k = 0; k <=3;k++)
//                {
//                    for(int l = 0;l <= 3;l++)
//                    {
//                        flag = panduan(b[i],b[j],b[k],b[l],c,d);
//                        if(flag==0)
//                        {
//                            continue;
//                        }
//                        else
//                        {
//                            panduan_New(b[i],b[j],b[k],b[l],f);
//
//                        }
//
//                    }
//                }
//            }
//
//        }

//        System.out.println("sum = "+sum);
        int []a = new int[100];
        int sum = 0;
        int n = 0;
        boolean flag =true;
        for(int i = 1;i<=4;i++) {
            for (int j = 1; j < 4; j++) {
                for (int k = 1;k < 4; k++) {
                    for (int l = 1; l < 4; l++) {
                        if(i!=j && j!=k && k!=l && l!=k)
                        {
                            if(a[0]==0)
                            {
                                a[0] = i*1000+j*100+k*10+l;
                                sum++;
                                continue;
                            }
                            else
                            {
                                n = i*1000+j*100+k*10+l;
                                for(int m = 0;m <sum;m++)
                                {
                                    if(a[m]==n)
                                    {
                                        flag =false;
                                        break;
                                    }
                                }
                                if(flag)
                                {
                                    a[sum] = n;
                                    sum++;
                                }
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < sum; i++) {
            System.out.println(a[i]);
        }




    }
}
