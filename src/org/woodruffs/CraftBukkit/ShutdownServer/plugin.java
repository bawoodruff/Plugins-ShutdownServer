package org.woodruffs.CraftBukkit.ShutdownServer;

import org.bukkit.event.Event.Priority;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin 
{
	public void onEnable() 
	{
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("[ShutdownServer] v" + pdfFile.getVersion() + " enabled.");		        
	}

	public void onDisable() 
	{
		System.out.println("[ShutdownServer] Plugin disabled.");
	}
	
	static public void shutdown()
	{
		getServer().getLogger().info("[ShutdownServer] shutting down server.");
		
		this.getServer().safeShutdown();
	}
}


