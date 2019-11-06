package Zhangwei;

import java.io.*;

public class FileOperate {
    ObjectOutputStream os = null;
    ObjectInputStream oi = null;
    FileOperate(File f)
    {
        try
        {
            os = new ObjectOutputStream(new FileOutputStream(f));
            oi = new ObjectInputStream(new FileInputStream(f));
        }
        catch (IOException e )
        {
            e.printStackTrace();
        }
    }
    //序列化
    public  void save(Object o)
    {
      try{
          os.writeObject(o);
      }catch (IOException e)
      {
          e.printStackTrace();
      }finally {
          if(os != null)
          {
              try{
                  os.close();
              }
              catch (IOException e)
              {
                  e.printStackTrace();
              }
          }
      }
    }
    //反序列化
    public  Person load()
    {
        Object obj = null;
        try
        {
           obj =  oi.readObject();
        }catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        finally {
            if(oi !=null)
            {
                try {
                    oi.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }

        }
        return  (Person)obj;

    }


}
