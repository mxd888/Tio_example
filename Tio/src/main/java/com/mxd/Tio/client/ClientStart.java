package com.mxd.Tio.client;

import com.mxd.Tio.client.hander.MClientAioHandler;
import com.mxd.Tio.client.listener.MClientAioListener;
import com.mxd.Tio.client.packet.ClientPacket;
import org.tio.client.ClientChannelContext;
import org.tio.client.ClientGroupContext;
import org.tio.client.TioClient;
import org.tio.core.Node;
import org.tio.core.Tio;

/**
 * Created by DELL(mxd) on 2021/10/10 13:54
 */
public class ClientStart {
    public static void main(String[] args) throws Exception {
        ClientGroupContext clientGroupContext = new ClientGroupContext(new MClientAioHandler(), new MClientAioListener());

        TioClient tioClient = new TioClient(clientGroupContext);

        ClientChannelContext clientChannelContext = tioClient.connect(new Node("127.0.0.1", 8999));

        ClientPacket clientPacket = new ClientPacket();
        clientPacket.setBody("hello,t-tio".getBytes("utf-8"));

        System.out.println("创建消息");
        Tio.send(clientChannelContext, clientPacket);
        System.out.println("发送消息");

    }
}
