package io.github.thebusybiscuit.hotbarpets.groups;

import io.github.thebusybiscuit.hotbarpets.PetTexture;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.CreeperPet;
import io.github.thebusybiscuit.hotbarpets.pets.EndermanPet;
import io.github.thebusybiscuit.hotbarpets.pets.GhastPet;
import io.github.thebusybiscuit.hotbarpets.pets.PhantomPet;
import io.github.thebusybiscuit.hotbarpets.pets.ShulkerPet;
import io.github.thebusybiscuit.hotbarpets.pets.SpiderPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public final class HostileMobs implements PetGroup {

    public HostileMobs(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return "&c怪物 (敌对)";
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        new SpiderPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_SPIDER", PetTexture.SPIDER_PET.getHash(), "&8蜘蛛 &f宠物", getName(), "&7喜欢的食物: 腐肉", "", "&f右键: &7获得跳跃提升"), new ItemStack(Material.ROTTEN_FLESH), new ItemStack[]{
                new ItemStack(Material.COAL), new ItemStack(Material.STRING), new ItemStack(Material.COAL),
                new ItemStack(Material.SPIDER_EYE), new ItemStack(Material.EMERALD), new ItemStack(Material.SPIDER_EYE),
                new ItemStack(Material.STRING), SlimefunItems.GOLD_16K, new ItemStack(Material.STRING)
        }).register(plugin);

        new GhastPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_GHAST", PetTexture.GHAST_PET.getHash(), "&f恶魂 &f宠物", getName(), "&7喜欢的食物: 火球", "", "&f右键: &7发射火球"), new ItemStack(Material.FIRE_CHARGE), new ItemStack[]{
                new ItemStack(Material.GHAST_TEAR), new ItemStack(Material.DIAMOND), new ItemStack(Material.GHAST_TEAR),
                new ItemStack(Material.QUARTZ_BLOCK), new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.QUARTZ_BLOCK),
                SlimefunItems.GOLD_24K, new ItemStack(Material.TNT), SlimefunItems.GOLD_24K
        }).register(plugin);

        new ShulkerPet(plugin, new SlimefunItemStack("HOTBAR_PET_SHULKER", PetTexture.SHULKER_PET.getHash(), "&d潜影贝 &f宠物", getName(), "&7喜欢的食物: 紫颂果", "", "&f右键: &7发射飘浮箭矢"), new ItemStack(Material.CHORUS_FRUIT), new ItemStack[]{
                new ItemStack(Material.NETHER_WART), new ItemStack(Material.SHULKER_SHELL), new ItemStack(Material.NETHER_WART),
                new ItemStack(Material.QUARTZ), new ItemStack(Material.GLOWSTONE_DUST), new ItemStack(Material.QUARTZ),
                new ItemStack(Material.FEATHER), new ItemStack(Material.SHULKER_SHELL), new ItemStack(Material.FEATHER)
        }).register(plugin);

        new PhantomPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_PHANTOM", PetTexture.PHANTOM_PET.getHash(), "&7幻翼 &f宠物", getName(), "&7喜欢的食物: 甜菜根", "", "&f右键: &7获得缓降"), new ItemStack(Material.BEETROOT), new ItemStack[]{
                new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.RABBIT_FOOT), new ItemStack(Material.PHANTOM_MEMBRANE),
                new ItemStack(Material.DIAMOND), SlimefunItems.GOLD_6K, new ItemStack(Material.DIAMOND),
                new ItemStack(Material.PHANTOM_MEMBRANE), new ItemStack(Material.RABBIT_FOOT), new ItemStack(Material.PHANTOM_MEMBRANE)
        }).register(plugin);

        new EndermanPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_ENDER_MAN", PetTexture.ENDERMAN_PET.getHash(), "&8末影人 &f宠物", getName(), "&7喜欢的食物: 末地石", "", "&f右键: &7发射末影珍珠"), new ItemStack(Material.END_STONE), new ItemStack[]{
                new ItemStack(Material.OBSIDIAN), new ItemStack(Material.ENDER_PEARL), new ItemStack(Material.OBSIDIAN),
                new ItemStack(Material.ENDER_EYE), new ItemStack(Material.EMERALD), new ItemStack(Material.ENDER_EYE),
                new ItemStack(Material.ENDER_PEARL), SlimefunItems.GOLD_16K, new ItemStack(Material.ENDER_PEARL)
        }).register(plugin);

        new CreeperPet(plugin, new SlimefunItemStack("HOTBAR_PET_CREEPER", Material.CREEPER_HEAD, "&2苦力怕 &f宠物", getName(), "&7喜欢的食物: 火药", "", "&f免疫爆炸", "&f右键: &7爆炸"), new ItemStack(Material.GUNPOWDER), new ItemStack[]{
                new ItemStack(Material.DIAMOND), new ItemStack(Material.CREEPER_HEAD), new ItemStack(Material.DIAMOND),
                new ItemStack(Material.GUNPOWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.GUNPOWDER),
                new ItemStack(Material.DIAMOND), SlimefunItems.GOLD_20K, new ItemStack(Material.DIAMOND)
        }).register(plugin);

        new HotbarPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_MAGMA_CUBE", PetTexture.MAGMA_CUBE_PET.getHash(), "&4岩浆怪 &f宠物", getName(), "&7喜欢的食物: 下界石英", "", "&f免疫岩浆", "&f快速饥饿"), new ItemStack(Material.QUARTZ), new ItemStack[]{
                new ItemStack(Material.REDSTONE), new ItemStack(Material.MAGMA_CREAM), new ItemStack(Material.REDSTONE),
                new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER),
                new ItemStack(Material.NETHERRACK), SlimefunItems.GOLD_20K, new ItemStack(Material.NETHERRACK)
        }).register(plugin);

        new HotbarPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_BLAZE", PetTexture.BLAZE_PET.getHash(), "&6烈焰人 &f宠物", getName(), "&7喜欢的食物: 下界石英", "", "&f免疫火焰"), new ItemStack(Material.QUARTZ), new ItemStack[]{
                new ItemStack(Material.GLOWSTONE_DUST), new ItemStack(Material.BLAZE_ROD), new ItemStack(Material.GLOWSTONE_DUST),
                new ItemStack(Material.BLAZE_POWDER), new ItemStack(Material.EMERALD), new ItemStack(Material.BLAZE_POWDER),
                SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
        }).register(plugin);

        new HotbarPet(plugin.getCategory(), new SlimefunItemStack("HOTBAR_PET_ZOMBIE", Material.ZOMBIE_HEAD, "&2僵尸 &f宠物", getName(), "", "&f你可以吃腐肉", "&f不会中毒饥饿"), new ItemStack(Material.ROTTEN_FLESH), new ItemStack[] {
                new ItemStack(Material.DIAMOND), new ItemStack(Material.ZOMBIE_HEAD), new ItemStack(Material.DIAMOND),
                new ItemStack(Material.MOSSY_COBBLESTONE), new ItemStack(Material.EMERALD), new ItemStack(Material.MOSSY_COBBLESTONE),
                new ItemStack(Material.ROTTEN_FLESH), SlimefunItems.NECROTIC_SKULL, new ItemStack(Material.ROTTEN_FLESH)
        }).register(plugin);
        // @formatter:on
    }
}
