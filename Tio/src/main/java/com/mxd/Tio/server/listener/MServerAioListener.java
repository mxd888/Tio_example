package com.mxd.Tio.server.listener;

import org.tio.core.ChannelContext;
import org.tio.core.intf.Packet;
import org.tio.server.intf.ServerAioListener;

/**
 * Created by DELL(mxd) on 2021/10/10 14:01
 */

public class MServerAioListener implements ServerAioListener {

    @Override
    public void onAfterConnected(ChannelContext channelContext, boolean b, boolean b1) throws Exception {

        System.out.println("onAfterConnected");
    }

    @Override
    public void onAfterDecoded(ChannelContext channelContext, Packet packet, int i) throws Exception {

        System.out.println("onAfterDecoded");
    }

    @Override
    public void onAfterReceivedBytes(ChannelContext channelContext, int i) throws Exception {

        System.out.println("onAfterReceivedBytes");
    }

    @Override
    public void onAfterSent(ChannelContext channelContext, Packet packet, boolean b) throws Exception {

        System.out.println("onAfterSent");
    }

    @Override
    public void onAfterHandled(ChannelContext channelContext, Packet packet, long l) throws Exception {

        System.out.println("onAfterHandled");
    }

    @Override
    public void onBeforeClose(ChannelContext channelContext, Throwable throwable, String s, boolean b) throws Exception {

        System.out.println("onBeforeClose");
    }
}

