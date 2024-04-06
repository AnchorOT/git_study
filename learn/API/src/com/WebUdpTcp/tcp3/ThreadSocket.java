package com.WebUdpTcp.tcp3;

import java.io.*;
import java.net.Socket;
import java.util.UUID;

public class ThreadSocket implements Runnable{
    private  Socket acceptSocket;
    public ThreadSocket(Socket accept) {
        this.acceptSocket= accept;
    }

    @Override
    public void run() {
        BufferedOutputStream bos = null;
        try {
            BufferedInputStream bis = new BufferedInputStream(acceptSocket.getInputStream());
             bos = new BufferedOutputStream(new FileOutputStream("API\\"+ UUID.randomUUID().toString().replace("-","")+".jpg"));
            int len;
            while ((len = bis.read()) != -1) {
                bos.write( len);
            }
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(acceptSocket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
            bos.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bos!= null){
                try {
                    bos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (acceptSocket!= null){
                try {
                    acceptSocket.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }


        }
    }
}
