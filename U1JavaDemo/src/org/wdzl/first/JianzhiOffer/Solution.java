package org.wdzl.first.JianzhiOffer;

import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int i = 0;
        int n = array.length;
        int j = n-1;
        ArrayList<Integer> temp = new ArrayList<>();
        while(array[i]+array[j] != sum) {
            if ((array[i]+array[j])>sum)
            {
                j--;
            }
            else{
               i++;
            }
            if(array[i]+array[j] == sum)
            {
                temp.add(0,i);
                temp.add(1,j);
            }
            return  temp;

        }


        return null;
    }
}