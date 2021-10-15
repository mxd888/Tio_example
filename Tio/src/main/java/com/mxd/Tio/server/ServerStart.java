package com.mxd.Tio.server;

import com.mxd.Tio.server.handler.MServerAioHandler;
import com.mxd.Tio.server.listener.MServerAioListener;
import org.tio.server.ServerGroupContext;
import org.tio.server.TioServer;

import java.io.IOException;


/**
 * Created by DELL(mxd) on 2021/10/10 13:53
 */
public class ServerStart {

    public static void main(String[] args) throws IOException {
        ServerGroupContext serverGroupContext = new ServerGroupContext("tio-server", new MServerAioHandler(), new MServerAioListener());

        TioServer server = new TioServer(serverGroupContext);

        TioServer tioServer = new TioServer(serverGroupContext);

        server.start("127.0.0.1", 8999);

    }


}
