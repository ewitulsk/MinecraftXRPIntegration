package com.evanwitulski.xrp_integration.xrp_integration;

import com.google.inject.Inject;
import io.xpring.xrpl.XpringKitException;
import org.slf4j.Logger;
import org.spongepowered.api.event.game.state.GameStartedServerEvent;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.plugin.Plugin;
import io.xpring.xrpl.Wallet;

@Plugin(
        id = "xrp_integration",
        name = "Xrp_integration",
        description = "Integrates XRP Crypto with Minecraft"
)
public class Xrp_integration {

    @Inject
    private Logger logger;

    @Listener
    public void onServerStart(GameStartedServerEvent event) throws XpringKitException {
        Wallet wallet = new Wallet("greeiningg", null);
        logger.info("XRP Integration Starting!");
        logger.info(wallet.getAddress());
    }
}
