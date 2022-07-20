package studio.twst.core;

import org.bukkit.plugin.java.JavaPlugin;

public final class Core extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Plugin now on");
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        System.out.println("Plugin now off");
        // Plugin shutdown logic
    }
}