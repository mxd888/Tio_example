package com.mxd.Tio.server.packet;

import org.tio.core.intf.Packet;

/**
 * Created by DELL(mxd) on 2021/10/10 14:02
 */
public class ServerPacket extends Packet {

    public static final Integer PACKET_HEADER_LENGTH = 4;
    public static final Integer PORT = 8999;

    byte[] body;//数据

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}

