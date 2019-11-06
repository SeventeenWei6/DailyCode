package org.wdzl.first.Java_300pra.OldTest;

public class PraLinkedlist {
    private Node first;
    private Node last;
    private  int size;

    public  void add(Object obj){
        Node n = new Node();
        if(first == null){

            n.setPrevious(null);
            n.setObj(obj);
            n.setNext(null);
            first = n;
            last = n;
        }else
        {

            n.setPrevious(last);
            n.setObj(obj);
            n.setNext(null);

            last.setNext(n);
            last = n;
        }
        size++;
    }
    public  int size(){
        return  size;
    }
    public void rangeCheck(int index)
    {
        if(index <0 || index >=size)
        {
            try{
                throw  new Exception();
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
    public Object get(int index)  //遍历
    {
        rangeCheck(index);
        Node temp = node(index);
        if(temp !=null)
        {
            return  temp.getObj();
        }
        return null;
    }
    public Node node(int index)
    {
        Node temp = null;
        if(first!=null)
        {
            if(index < (size>>1))
            {
                temp = first;
                for(int i = 0;i <index;i++)
                {
                    temp = temp.getNext();
                }
            }
            else
            {
                temp = last;
                for(int i = size-1;i >index;i--)
                {
                    temp = temp.getPrevious();
                }
            }

        }
     return temp;
    }
    public static void main(String[] args) {
        PraLinkedlist list = new PraLinkedlist();
        list.add("aaa");
        list.add("bbb");
        System.out.println(list.get(1));
    }
}
