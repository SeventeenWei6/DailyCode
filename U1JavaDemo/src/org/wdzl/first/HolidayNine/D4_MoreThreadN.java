package org.wdzl.first.HolidayNine;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class D4_MoreThreadN implements Runnable{
    @Override
    public void run() {
        String name;
        String Id;
        Scanner input =new Scanner(System.in);
        System.out.print("请输入用户名:");
        name = input.nextLine();
        System.out.print("请输入ID:");
        Id = input.nextLine();
        D4_User user = new D4_User(name,Id);
        try {
            Socket client = new Socket("192.168.254.1",9985);
            OutputStream os = client.getOutputStream();
            InputStream is = client.getInputStream();

            ObjectOutputStream oop = new ObjectOutputStream(os);
            BufferedReader br = new BufferedReader(new InputStreamReader(is));

            oop.writeObject(user);
            String temp ;
            StringBuffer str = new StringBuffer();
            while((temp = br.readLine())!=null)
            {
                str.append(temp);
            }
            System.out.println("服务端响应为:"+str);

            br.close();
            oop.close();
            is.close();
            os.close();
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
