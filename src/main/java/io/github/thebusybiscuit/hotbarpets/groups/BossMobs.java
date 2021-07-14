package io.github.thebusybiscuit.hotbarpets.groups;

import io.github.thebusybiscuit.hotbarpets.PetTexture;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.EnderDragonPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public final class BossMobs implements PetGroup {

    public BossMobs(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return "&4Boss (敌对)";
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        new EnderDragonPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_DRAGON", Material.DRAGON_HEAD, "&5末影龙 &f宠物", getName(), "&7喜欢的食物: 末影之眼", "", "&f右键: &7发射末影龙火球 & 获得抗性提升"), new ItemStack(Material.ENDER_EYE), new ItemStack[]{
                new ItemStack(Material.PRISMARINE_CRYSTALS), new ItemStack(Material.DRAGON_BREATH), new ItemStack(Material.PRISMARINE_CRYSTALS),
                SlimefunItems.ENDER_LUMP_3, new ItemStack(Material.DRAGON_HEAD), SlimefunItems.ENDER_LUMP_3,
                new ItemStack(Material.PRISMARINE_CRYSTALS), new ItemStack(Material.DRAGON_BREATH), new ItemStack(Material.PRISMARINE_CRYSTALS)
        }).register(plugin);

        new HotbarPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_WITHER", PetTexture.WITHER_PET.getHash(), "&8凋零 &f宠物", getName(), "&7喜欢的食物: 灵魂沙", "", "&f免疫凋零"), new ItemStack(Material.SOUL_SAND), new ItemStack[]{
                new ItemStack(Material.COAL), new ItemStack(Material.WITHER_SKELETON_SKULL), new ItemStack(Material.COAL),
                new ItemStack(Material.SOUL_SAND), new ItemStack(Material.NETHER_STAR), new ItemStack(Material.SOUL_SAND),
                new ItemStack(Material.SOUL_SAND), SlimefunItems.GOLD_24K, new ItemStack(Material.SOUL_SAND)
        }).register(plugin);
        // @formatter:on
    }

}
