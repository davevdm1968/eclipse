package com.dave.simplecommand;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		System.out.println("Simple Command plugin is enabled!!!!");
		
	
		getCommand("heal").setExecutor(new HealCommand());
		
		
	}
	
	
	
	
}
