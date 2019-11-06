package org.wdzl.first.Java_300pra.OldTest;



import java.util.LinkedList;

public class NewMap {
    LinkedList []arr = new LinkedList[999];
    int size;
    public void put(Object key,Object value)
    {
        ZwEnery e = new ZwEnery(key, value);
        int a = key.hashCode()%999;
        if(arr[a]==null)
        {
            LinkedList list = new LinkedList();
            arr[a] = list;
            list.add(e);

        }
        else
        {
            LinkedList list = arr[a];
            for(int i = 0;i < list.size();i++)
            {
                ZwEnery e2 = (ZwEnery) list.get(i);
                if(e.key.equals(key))
                {
                    e2.value = value; //键值重复直接覆盖
                    return;
                }
            }
            arr[a].add(e);
        }

    }
    public  Object get(Object key)
    {
        int a  = key.hashCode()%999;
        if(arr[a] != null)
        {
            LinkedList list = arr[a];
            for(int i = 0;i < list.size();i++)
            {
                ZwEnery e = (ZwEnery) list.get(i);
                if(e.key.equals(key))
                {
                    return e.value;
                }
            }
        }
        return null;
    }


}
