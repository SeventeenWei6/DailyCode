package org.wdzl.first.Java_300pra.OldTest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class TCPClientTwo {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("222.24.34.101",9922);
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());
        dos.writeUTF("hello my friend i'm two");
        dos.flush();
        dos.close();
        client.close();
    }
}
