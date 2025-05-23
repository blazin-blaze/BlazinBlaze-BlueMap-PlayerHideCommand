package net.blazinblaze.bbbmphc;

import org.bukkit.plugin.java.JavaPlugin;

public final class BlueMapPlayerHideCommand extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        this.getLogger().info("Enabling BlueMapPlayerHideCommand!");
        this.getCommand("toggleplayermapicon").setExecutor(new CommandTogglePlayer());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
