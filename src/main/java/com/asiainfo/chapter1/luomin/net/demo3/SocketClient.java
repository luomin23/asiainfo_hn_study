package com.asiainfo.chapter1.luomin.net.demo3;

import java.io.*;
import java.net.Socket;

/**
 * @author Luoo2
 * @create 2017-08-14 0:09
 */

public class SocketClient {

    public static void startTransfer(AddressListTransferInter addresslist ) throws IOException{
        Socket socket = new Socket("127.0.0.1", 4007);

        String addressList =addresslist.transferData();

        BufferedWriter rw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        rw.write(addressList + "\n");
        rw.flush();
        socket.shutdownOutput(); //告诉服务端数据已经写完

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String data = null;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
        rw.close();
        socket.close();

    }

    public static void main(String[] args) throws IOException {
        SocketClient.startTransfer(new AddressList4Txt());
    }
}
