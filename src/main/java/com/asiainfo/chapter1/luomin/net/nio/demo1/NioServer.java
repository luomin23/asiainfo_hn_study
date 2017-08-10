package com.asiainfo.chapter1.luomin.net.nio.demo1;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

public class NioServer {

    //通道管理器
    private Selector selector;

    public static void main(String[] args) {
        new NioServer().init(8000).listen();
    }

    //获取一个ServerSocket通道,并初始化通道
    public NioServer init(int port) {
        //获取一个ServerSocket通道
        ServerSocketChannel serverChannel = null;
        try {
            serverChannel = ServerSocketChannel.open();
            serverChannel.configureBlocking(false);
            serverChannel.socket().bind(new InetSocketAddress(port));
            //获取通道管理器
            selector = Selector.open();
            //将通道管理器与通道绑定,并为该通道注册SelectionKey.OP_ACCEPT事件
            //只有当改事件到达时,Selector.select()会返回,否则一直阻塞。
            serverChannel.register(selector, SelectionKey.OP_ACCEPT);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return this;
    }

    public void listen() {
        System.out.println("服务器端启动成功!");
        //使用轮询访问selector
        try {
            while (true) {
                //当有注册的事件到达时,方法返回，否则阻塞
                selector.select();
                //获取selector中的迭代器,选中项为注册事件
                Iterator<SelectionKey> it = selector.selectedKeys().iterator();
                while (it.hasNext()) {
                    SelectionKey key = it.next();
                    //删除已选的key,防止重复事件
                    it.remove();
                    //客户端请求连接事件
                    if (key.isAcceptable()) {
                        ServerSocketChannel server = (ServerSocketChannel) key.channel();
                        //获得客户端连接通道
                        SocketChannel channel = server.accept();
                        channel.configureBlocking(false);
                        //向客户端发消息
                        channel.write(ByteBuffer.wrap(new String("send messsage to client").getBytes()));
                        //在与客户端连接成功后,为客户端通道注册SelectionKey.OP_READ事件
                        channel.register(selector, SelectionKey.OP_READ);
                        System.out.println("客户端请求连接事件");
                        //有可读数据事件
                    } else if (key.isReadable()) {
                        //获取客户端传输数据可读取消息通道
                        SocketChannel channel = (SocketChannel) key.channel();
                        //创建读取数据缓冲区
                        ByteBuffer buffer = ByteBuffer.allocate(1024);
                        int read = channel.read(buffer);
                        byte[] data = buffer.array();
                        String message = new String(data);
                        System.out.println("recive message from client,size: " + buffer.position() + "msg:" + message);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}