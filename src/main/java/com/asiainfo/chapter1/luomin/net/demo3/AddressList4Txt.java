package com.asiainfo.chapter1.luomin.net.demo3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Luoo
 * @create 2017-08-14 17:10
 */

public class AddressList4Txt extends AbstractSocketClient implements AddressListTransferInter {
    private static final String ADDRESS_LIST_NAME = "addresslist.txt";

    public static String txt2String(File file) {
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
            String s = null;
            while ((s = br.readLine()) != null) {//使用readLine方法，一次读一行
                result.append(s).append("|");
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    @Override
    public String transferData() throws IOException {
        String path = AddressList4Txt.class.getResource("").getPath() + ADDRESS_LIST_NAME;

        return txt2String(new File(path));
    }

    @Override
    public void paseData() {

    }
}
