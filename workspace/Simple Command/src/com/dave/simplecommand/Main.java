package com.dave.simplecommand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class Main extends JavaPlugin implements Listener {
	
	@Override
	public void onEnable() {
		System.out.println("Simple Command plugin is enabled!!!!");
		
		this.getConfig().options().copyDefaults();
		saveDefaultConfig();
		
		
		Bukkit.getPluginManager().registerEvents(this, this);
		
	}
	
	@Override
	public void onDisable() {
		System.out.println("Simple Command plugin is DISabled!!!!");
	}
	
	@EventHandler
	public void onMove(PlayerMoveEvent e) {
		Player player = e.getPlayer();
		double health = player.getHealth();
		if (health < 5 ) {
			player.setHealth(20.0);
		}
		
		
		
		
		if (!player.hasPermission("simplecommand.allowmove")) {
			
			//e.setCancelled(true);
			
		}
		
		
	}
	
	@EventHandler
	public void onPickUp(PlayerPickupItemEvent e) {
		Player player = e.getPlayer();
		
		if(e.getItem().getItemStack().getType().equals(Material.COAL) ||
				e.getItem().getItemStack().getType().equals(Material.IRON_ORE) ||
				e.getItem().getItemStack().getType().equals(Material.DIAMOND) ||
				e.getItem().getItemStack().getType().equals(Material.EMERALD)  ||
				e.getItem().getItemStack().getType().equals(Material.GOLD_ORE) ) {
					
			player.sendMessage(ChatColor.DARK_RED +  player.getName() + ChatColor.GRAY + " Has mined ");
					
								}
		
	}
	
	
	
	@EventHandler
	public void onThrow(PlayerEggThrowEvent e) {
		Player player = e.getPlayer();
		
		player.sendMessage(ChatColor.DARK_RED +  player.getName() + ChatColor.GRAY + " Has thown egg!!!!!");
		
		
	}
	
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		
		Player player = (Player) sender;
		// config
		if (cmd.getName().equals("config")) {
			
			String word = this.getConfig().getString("Word");
			int number = this.getConfig().getInt("Number");
			
			player.sendMessage(ChatColor.DARK_RED + "Hello " + ChatColor.GREEN + player.getName() + ChatColor.GRAY + " The word is "+ ChatColor.RED + word + ChatColor.GRAY + " and the number is "+ ChatColor.RED + number);
			
			
			Random rand = new Random();
			number = rand.nextInt(100);
			
			this.getConfig().set("Number", number);
			
			
			
		}
		// Hello	
		if (cmd.getName().equals("Hello")) {
			if (sender instanceof Player ) {
				
				player.sendMessage(ChatColor.DARK_RED + "Hello " + ChatColor.GREEN + player.getName() + ChatColor.GRAY + " your health has been restored.");
				
				
				
				player.setHealth(20.0);
				
			} else {
				System.out.println("This command is not accessable via console!!!!");
			}
				
		}
		
		
		// onCommand
		return false;
	}

	
}
