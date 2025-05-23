package net.blazinblaze.bbbmphc;

import org.bukkit.plugin.java.JavaPlugin;

public final class BlueMapPlayerHideCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getCommand("togglePlayerMapIcon").setExecutor(new CommandTogglePlayer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
