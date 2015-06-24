package org.mage.network.model;

import io.netty.channel.ChannelHandlerContext;
import mage.view.UserDataView;
import org.mage.network.interfaces.MageServer;

/**
 *
 * @author BetaSteward
 */
public class SetPreferencesRequest extends ServerRequest {
    private final UserDataView view;

    public SetPreferencesRequest(UserDataView view) {
        this.view = view;
    }

    @Override
    public void handleMessage(MageServer server, ChannelHandlerContext ctx) {
        server.setPreferences(ctx.channel().id().asLongText(), view);
    }
    
}
