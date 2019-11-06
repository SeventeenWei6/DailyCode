package org.wdzl.first.Java_300pra.OldTest;

public class ZwMap {
    ZwEnery[] arr = new ZwEnery[900];
    int size;
    public  void put(Object key,Object value)
    {
        ZwEnery t = new ZwEnery(key,value);
        arr[size++] = t;
    }
    public  Object get(Object key)
    {
        for(int i = 0; i< size;i++)
        {
            if(arr[i].key.equals(key))
            {
                return  arr[i];
            }
        }
        return  null;
    }

    public static void main(String[] args) {
        NewMap m = new NewMap();
        m.put("张三","李四");
        m.put("王麻子","王文");
        Object temp =  m.get("王麻子");
        System.out.println(temp.toString());
//        System.out.println(temp.value);
    }
}
class ZwEnery{
    Object key;
    Object value;

    public ZwEnery(Object key, Object value) {
        this.key = key;
        this.value = value;
    }
}
