package com.asiainfo.chapter1.luomin.rmi.demo2;

/**
 * @author Luoo
 * @create 2017-08-23 14:28
 */

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Person_Stub implements Person {
    private Socket socket;

    public Person_Stub() throws Throwable {
        // connect to skeleton
        socket = new Socket("127.0.0.1", 9000);
    }

    public int getAge() throws Throwable {
        // pass method name to skeleton
        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        outStream.writeObject("age");
        outStream.flush();
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
        return inStream.readInt();
    }

    public String getName() throws Throwable {
        // pass method name to skeleton
        ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
        outStream.writeObject("name");
        outStream.flush();
        ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
        return (String) inStream.readObject();
    }
}
