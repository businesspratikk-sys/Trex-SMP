package com.trexsmp;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class EffectsManager {

    public EffectsManager(TrexSMP plugin) {}

    public static void giveShadowStep(Player player) {
        player.addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, 100, 1));
        player.sendMessage("§7👣 You used Shadow Step!");
    }
}
