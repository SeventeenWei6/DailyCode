package Zhangwei;

import java.util.*;

class MinStack {
    static List<Integer> arr = new ArrayList<>();
    static Stack<Integer> stack = new Stack<>();
     public static void push(int a)
     {
         stack.push(a);
         arr.add(a);

     }
     public  static  void pop()
     {
         int index = stack.pop();
        index = arr.indexOf(index);
        arr.remove(index);

     }
     public  static  int getmin()
     {

         Collections.sort(arr);
         return arr.get(0);
     }

}
public  class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();
        String temp = null;
        int key;
        int min = 0;
        temp = input.nextLine();
        for (int i = 0; i <time ; i++) {
            temp = input.nextLine();
            if(temp.substring(0,3).equals("pop"))
            {
                MinStack.pop();
            }
            else if(temp.substring(0,4).equals("push"))
            {
                key =  Integer.parseInt(temp.substring(5)) ;
                MinStack.push(key);

            }
            else
            {
                System.out.println(MinStack.getmin());
            }
        }
}
}
