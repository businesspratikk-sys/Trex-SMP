package com.trexsmp;

import org.bukkit.*;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.EventHandler;

public class RitualManager implements Listener {

    public RitualManager(TrexSMP plugin) {
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }

    @EventHandler
    public void onItemDrop(PlayerDropItemEvent e) {
        Player p = e.getPlayer();
        Material item = e.getItemDrop().getItemStack().getType();

        if (item == Material.NETHER_STAR) {
            p.getWorld().strikeLightningEffect(p.getLocation());
            p.getWorld().spawnEntity(p.getLocation(), EntityType.ZOMBIE);
            p.sendMessage("§5⚡ Nether Star Ritual activated! Boss summoned.");
        }
        if (item == Material.TOTEM_OF_UNDYING) {
            p.addPotionEffect(new org.bukkit.potion.PotionEffect(org.bukkit.potion.PotionEffectType.REGENERATION, 20*20, 2));
            p.sendMessage("§a💖 Totem Ritual granted you Regeneration!");
        }
    }
}
