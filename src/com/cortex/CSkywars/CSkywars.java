package com.cortex.CSkywars;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandException;
import org.bukkit.command.CommandSender;
import org.bukkit.command.PluginCommand;
import org.bukkit.permissions.Permission;
import org.bukkit.plugin.java.JavaPlugin;

public class CSkywars extends JavaPlugin {
	private static CSkywars instance;
	private static Permission permission;
    //private static Economy economy;
	
	@Override
	public void onEnable() {
		
		setUpConfig();
		setInstance(this);
		
		Bukkit.getLogger().info(new String[] {
				"+ ------------------------------------ +\n",
				"|      Running CSkywars [DEV] v0.1.3   |\n",
				"|   © Chris Cotton - CommanderCortex   |\n",
				"|         CommanderCortex#7796         |\n",
				"+ ------------------------------------ +\n"
		}.toString());	
		
	}
	
	@Override
	public void onDisable() {
		
	}

	public static CSkywars getInstance() {
		return instance;
	}

	public static void setInstance(CSkywars instance) {
		CSkywars.instance = instance;
	}
	private void setUpConfig() {
		getConfig().options().header("Time is in seconds");
		getConfig().options().copyDefaults(true);
		saveConfig();
	}
	public static PluginCommand getPluginCommand(String name) {
        return getPluginCommand(name);
    }
	public static boolean dispatchCommand(CommandSender sender, String commandLine) throws CommandException {
        return dispatchCommand(sender, commandLine);
    }

	public static Permission getPermission() {
		return permission;
	}

	public static void setPermission(Permission permission) {
		CSkywars.permission = permission;
	}

}
