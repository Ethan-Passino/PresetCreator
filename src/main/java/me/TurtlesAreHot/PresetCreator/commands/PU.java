package me.TurtlesAreHot.PresetCreator.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PU implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.getServer().getLogger().info("Only players can run this command.");
            return false;
        }
        Player p = (Player) sender;
        int slot = p.getInventory().getHeldItemSlot();
        p.getServer().dispatchCommand(sender, "b p c " + slot);
        return false;
    }
}
