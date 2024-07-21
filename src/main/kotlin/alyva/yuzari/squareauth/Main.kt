package alyva.yuzari.squareauth

import org.bukkit.plugin.java.JavaPlugin
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

class Main : JavaPlugin() {

    override fun onEnable() {
        Bukkit.getPluginManager().registerEvents(this, this);
    }

    override fun onDisable() {
        // Plugin shutdown logic
    }
}
