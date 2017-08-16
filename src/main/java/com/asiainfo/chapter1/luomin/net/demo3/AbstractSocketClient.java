package com.asiainfo.chapter1.luomin.net.demo3;

import java.io.*;
import java.net.Socket;

/**
 * @author Luoo
 * @create 2017-08-14 17:23
 */

public abstract class AbstractSocketClient {

    public void writeData(BufferedWriter bw,String addressList) throws IOException {

        bw.write(addressList + "\n");
        bw.flush();
    }


    public abstract void paseData();

    public void startTransfer(AddressListTransferInter addresslist ) throws IOException {
        Socket socket = new Socket("127.0.0.1", 4007);

        String addressList =addresslist.transferData();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        writeData(bw,addressList);
        paseData();
        socket.shutdownOutput(); //告诉服务端数据已经写完

        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String data = null;
        while ((data = br.readLine()) != null) {
            System.out.println(data);
        }

        br.close();
        bw.close();
        socket.close();

    }

}
