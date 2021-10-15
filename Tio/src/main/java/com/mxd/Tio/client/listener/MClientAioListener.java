package com.mxd.Tio.client.listener;

import com.mxd.Tio.client.packet.ClientPacket;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tio.client.intf.ClientAioListener;
import org.tio.core.ChannelContext;
import org.tio.core.Tio;
import org.tio.core.intf.Packet;

/**
 * Created by DELL(mxd) on 2021/10/10 14:06
 */
public class MClientAioListener implements ClientAioListener {
    Logger logger = LoggerFactory.getLogger(MClientAioListener.class);
    private static Integer count = 0;

    @Override
    public void onAfterConnected(ChannelContext channelContext, boolean b, boolean b1) throws Exception {
        logger.info("onAfterConnected!");
    }

    @Override
    public void onAfterDecoded(ChannelContext channelContext, Packet packet, int i) throws Exception {
        logger.info("onAfterDecoded...");
    }

    @Override
    public void onAfterReceivedBytes(ChannelContext channelContext, int i) throws Exception {
        logger.info("onAfterReceivedBytes-------------------" + i);
    }

    @Override
    public void onAfterSent(ChannelContext channelContext, Packet packet, boolean b) throws Exception {
        logger.info("onAfterSent...");

    }

    @Override
    public void onAfterHandled(ChannelContext channelContext, Packet packet, long l) throws Exception {
        System.out.println("onAfterHandled...");

        ClientPacket clientPacket = (ClientPacket) packet;
        String resData = new String(clientPacket.getBody(), "utf-8");

        logger.info("[" + channelContext.getServerNode() + "]: " + resData);

        count++;

        ((ClientPacket) packet).setBody(("[" + channelContext.getServerNode() + "]: " + count).getBytes());

        Thread.sleep(5000);

        Tio.send(channelContext, packet);
    }

    @Override
    public void onBeforeClose(ChannelContext channelContext, Throwable throwable, String s, boolean b) throws Exception {

        logger.error(throwable.getMessage());
        logger.info(s);

    }
}

