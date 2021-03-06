/**
 * JBoss, Home of Professional Open Source
 * Copyright Red Hat, Inc., and individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.aerogear.sync.push;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * Netty that handles full-duplex communications from clients enabling
 * updates to be pushed from the server to the client, and also allows
 * client changes to be sent of the same channel to the server.
 * <p>
 * Netty's SockJS support is used to allow fallbacks for clients that don't
 * support WebSockets.
 */
public class SyncHandler extends SimpleChannelInboundHandler<String>{

    @Override
    protected void messageReceived(final ChannelHandlerContext ctx, final String msg) throws Exception {
        ctx.writeAndFlush(msg);
    }
}
