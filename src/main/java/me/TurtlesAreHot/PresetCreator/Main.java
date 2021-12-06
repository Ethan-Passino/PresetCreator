package me.TurtlesAreHot.PresetCreator;

import me.TurtlesAreHot.PresetCreator.commands.PU;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("pu").setExecutor(new PU());
    }

    @Override
    public void onDisable() {

    }
}
