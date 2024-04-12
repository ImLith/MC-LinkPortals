package com.lith.linkportals;

import com.lith.linkportals.config.ConfigManager;
import com.lith.lithcore.abstractClasses.MainPlugin;

public class Plugin extends MainPlugin<ConfigManager> {
    public static Plugin plugin;

    public void onEnable() {
        Plugin.plugin = this;

        registerConfigs();

        Static.log.info("Plugin enabled");
    }

    public void onDisable() {
        Static.log.info("Plugin disabled");
    }

    @Override
    public void registerConfigs() {
        new ConfigManager(this);
    }

}
