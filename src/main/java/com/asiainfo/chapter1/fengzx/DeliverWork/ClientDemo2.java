package com.asiainfo.chapter1.fengzx.DeliverWork;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Created by fengzx on 2017/8/13.
 */
public class ClientDemo2 {
    public static void main(String[] args) {
        try {
            Socket s2 = new Socket("localhost",5555);

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s2.getOutputStream()));

            String line = null;
            while ((line = br.readLine()) != null) {
                if ("over".equals(line)) {
                    break;
                }
                bw.write(line);
                bw.newLine();
                bw.flush();
            }

//            BufferedReader reader = new BufferedReader(new InputStreamReader(s2.getInputStream()));
//            String data = reader.readLine();
//            System.out.println("client:"+data);
//
//            reader.close();
//            bw.close();

            InputStream is = s2.getInputStream();
            BufferedReader re = new BufferedReader(new InputStreamReader(is));
            //System.out.println(re.readLine());
            String str = re.readLine();
            System.out.println(str);
            FileWriter fw = new FileWriter("G:\\Git\\fzxworkspace\\asiainfo_hn_study\\src\\main\\java\\com\\asiainfo\\chapter1\\fengzx\\DeliverWork\\return.txt");
            fw.write(str);
            fw.flush();
            fw.close();

            re.close();
            is.close();

            br.close();
            s2.close();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
