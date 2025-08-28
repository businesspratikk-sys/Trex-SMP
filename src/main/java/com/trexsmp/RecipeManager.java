package com.trexsmp;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.ShapedRecipe;

public class RecipeManager {

    public RecipeManager(TrexSMP plugin) {
        createTrexBlade(plugin);
    }

    private void createTrexBlade(TrexSMP plugin) {
        ItemStack trexBlade = new ItemStack(Material.NETHERITE_SWORD);
        ItemMeta meta = trexBlade.getItemMeta();
        meta.setDisplayName("§cTrex Blade");
        trexBlade.setItemMeta(meta);

        ShapedRecipe recipe = new ShapedRecipe(new NamespacedKey(plugin, "trex_blade"), trexBlade);
        recipe.shape(" T ", " N ", " B ");
        recipe.setIngredient('T', Material.TOTEM_OF_UNDYING);
        recipe.setIngredient('N', Material.NETHERITE_SWORD);
        recipe.setIngredient('B', Material.BLAZE_POWDER);

        Bukkit.addRecipe(recipe);
    }
}
