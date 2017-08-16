package com.asiainfo.chapter1.luomin.net.demo3;

import com.alibaba.fastjson.JSONReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Luoo
 * @create 2017-08-14 17:11
 */

public class AddressList4Json implements AddressListTransferInter {
    private static final String ADDRESS_LIST_NAME = "addresslist.json";

    public static void main(String[] args) throws IOException {
        AddressList4Json addressList4Json = new AddressList4Json();
        addressList4Json.transferData();
    }


    @Override
    public String transferData() throws IOException {
        String path = AddressList4Json.class.getResource("").getPath() + ADDRESS_LIST_NAME;

        JSONReader reader = new JSONReader(new BufferedReader(new FileReader(path)));
        reader.startObject();
        System.out.print("start fastjson");
        while (reader.hasNext()) {
            String key = reader.readString();
            System.out.println("key " + key);
            if (key.equals("addresslist")) {
                reader.startArray();
                System.out.println("start " + key);
                while (reader.hasNext()) {
                    String item = reader.readString();
                    System.out.println(item);
                }
                reader.endArray();
                System.out.println("end " + key);
            }

        }
        reader.endObject();
        System.out.println("start fastjson");

        return null;
    }
}
