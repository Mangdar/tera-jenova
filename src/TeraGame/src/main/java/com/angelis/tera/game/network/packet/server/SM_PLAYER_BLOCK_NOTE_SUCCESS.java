package com.angelis.tera.game.network.packet.server;

import java.nio.ByteBuffer;

import com.angelis.tera.game.network.connection.TeraGameConnection;
import com.angelis.tera.game.network.packet.TeraServerPacket;
import com.angelis.tera.game.process.model.player.Player;

public class SM_PLAYER_BLOCK_NOTE_SUCCESS extends TeraServerPacket {

    public SM_PLAYER_BLOCK_NOTE_SUCCESS(final Player player, final String note) {
    }

    @Override
    protected void writeImpl(final TeraGameConnection connection, final ByteBuffer byteBuffer) {
        
    }

}
