package net.blazinblaze.bbbmphc;

import de.bluecolored.bluemap.api.BlueMapAPI;
import de.bluecolored.bluemap.api.WebApp;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CommandTogglePlayer implements CommandExecutor {
    // This method is called, when somebody uses our command
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            // Directly using the API if it is enabled
            BlueMapAPI.getInstance().ifPresent(api -> {
                WebApp webApp = BlueMapAPI.getInstance().get().getWebApp();
                boolean isVisible = webApp.getPlayerVisibility(player.getUniqueId());
                if(isVisible) {
                    webApp.setPlayerVisibility(player.getUniqueId(), false);
                    player.sendMessage("§a§lSuccessfully hidden player icon on server map!");
                } else {
                    webApp.setPlayerVisibility(player.getUniqueId(), true);
                    player.sendMessage("§a§lSuccessfully revealed player icon on server map!");
                }
            });
        }

        return true;
    }
}
