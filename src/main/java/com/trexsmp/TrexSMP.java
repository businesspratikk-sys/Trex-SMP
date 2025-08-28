package com.trexsmp;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class TrexSMP extends JavaPlugin {

    private static TrexSMP instance;

    @Override
    public void onEnable() {
        instance = this;
        getLogger().info("🔥 Trex SMP Plugin Enabled!");

        new RitualManager(this);
        new RecipeManager(this);
        new EffectsManager(this);

        getCommand("trexsmp").setExecutor((sender, cmd, label, args) -> {
            sender.sendMessage("§c§l🔥 Welcome to Trex SMP 🔥");
            return true;
        });
    }

    @Override
    public void onDisable() {
        getLogger().info("👋 Trex SMP Plugin Disabled.");
    }

    public static TrexSMP getInstance() {
        return instance;
    }
}
