package com.mxd.Tio.client.packet;

import org.tio.core.intf.Packet;

/**
 * Created by DELL(mxd) on 2021/10/10 14:07
 */

public class ClientPacket extends Packet {

    public static final Integer PACKET_HEADER_LENGTH = 4;

    private byte[] body;

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }
}

