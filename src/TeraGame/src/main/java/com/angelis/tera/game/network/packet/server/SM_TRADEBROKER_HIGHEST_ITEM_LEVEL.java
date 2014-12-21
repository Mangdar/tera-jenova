package com.angelis.tera.game.network.packet.server;

import java.nio.ByteBuffer;

import com.angelis.tera.game.network.connection.TeraGameConnection;
import com.angelis.tera.game.network.packet.TeraServerPacket;

public class SM_TRADEBROKER_HIGHEST_ITEM_LEVEL extends TeraServerPacket {

    @Override
    protected void writeImpl(final TeraGameConnection connection, final ByteBuffer byteBuffer) {
        // TODO
        writeB(byteBuffer, "C7000000");
    }
}
