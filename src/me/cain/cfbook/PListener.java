package me.cain.cfbook;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerListener;

public class PListener extends PlayerListener { 

	public void onPlayerInteract(PlayerInteractEvent e) {
		if(CFBook.LightningAxe == true) {
			if(e.getPlayer().getItemInHand().getType() == Material.GOLD_AXE) {
			if(e.getAction() == Action.LEFT_CLICK_BLOCK) {
			Block loc = (Block) e.getClickedBlock();
			e.getPlayer().getWorld().strikeLightningEffect(loc.getLocation());
		} else {
			return;
		}} else { return; }
}
}
	
	public void onPlayerJoin(PlayerJoinEvent e) {
		if(CFBook.LockDown == true) {
		if(!e.getPlayer().isOp()) {
			e.getPlayer().kickPlayer("This server is in lockdown.");
		} else { return; }
	}
	}
}