package io.github.thebusybiscuit.hotbarpets.groups;

import io.github.thebusybiscuit.hotbarpets.PetTexture;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.DolphinPet;
import io.github.thebusybiscuit.hotbarpets.pets.RabbitPet;
import io.github.thebusybiscuit.hotbarpets.pets.SquidPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public final class PeacefulAnimals implements PetGroup {

    public PeacefulAnimals(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return "&a动物 (和平)";
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_FISH", PetTexture.FISH_PET.getHash(), "&3鱼 &f宠物", getName(), "&7喜欢的食物: 小麦种子", "", "&f时不时获得生鳕鱼..."), new ItemStack(Material.WHEAT_SEEDS), new ItemStack[] {
                new ItemStack(Material.IRON_INGOT), new ItemStack(Material.COD), new ItemStack(Material.IRON_INGOT),
                new ItemStack(Material.COD), new ItemStack(Material.DIAMOND), new ItemStack(Material.COD),
                new ItemStack(Material.WATER_BUCKET), SlimefunItems.GOLD_18K, new ItemStack(Material.WATER_BUCKET)
        }).register(plugin);

        new SquidPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_SQUID", PetTexture.SQUID_PET.getHash(), "&b鱿鱼 &f宠物", getName(), "&7喜欢的食物: 生鳕鱼", "", "&f右键: &7获得水下呼吸"), new ItemStack(Material.COD), new ItemStack[] {
                new ItemStack(Material.COAL), new ItemStack(Material.COD), new ItemStack(Material.COAL),
                new ItemStack(Material.WATER_BUCKET), new ItemStack(Material.DIAMOND), new ItemStack(Material.WATER_BUCKET),
                new ItemStack(Material.COD), SlimefunItems.GOLD_16K, new ItemStack(Material.COD)
        }).register(plugin);

        new RabbitPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_RABBIT", PetTexture.RABBIT_PET.getHash(), "&e兔子 &f宠物", getName(), "&7喜欢的食物: 胡萝卜", "", "&f右键: &7获得30秒幸运效果"), new ItemStack(Material.CARROT), new ItemStack[] {
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.RABBIT_HIDE), new ItemStack(Material.GOLDEN_CARROT),
                new ItemStack(Material.RABBIT_HIDE), new ItemStack(Material.DIAMOND), new ItemStack(Material.RABBIT_HIDE),
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.RABBIT_FOOT), new ItemStack(Material.GOLDEN_CARROT)
        }).register(plugin);

        new DolphinPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_DOLPHIN", PetTexture.DOLPHIN_PET.getHash(), "&b海豚 &f宠物", getName(), "&7喜欢的食物: 墨囊", "", "&f右键: &7获得海豚的恩惠"), new ItemStack(Material.INK_SAC), new ItemStack[] {
                new ItemStack(Material.LAPIS_LAZULI), new ItemStack(Material.COD), new ItemStack(Material.LAPIS_LAZULI),
                new ItemStack(Material.SALMON), new ItemStack(Material.EMERALD), new ItemStack(Material.SALMON),
                new ItemStack(Material.LAPIS_LAZULI), new ItemStack(Material.COD), new ItemStack(Material.LAPIS_LAZULI)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_PANDA", PetTexture.PANDA_PET.getHash(), "&8熊猫 &f宠物", getName(), "&7喜欢的食物:  竹子", "", "&f你的周围不会自然生成幻翼"), new ItemStack(Material.BAMBOO), new ItemStack[] {
                new ItemStack(Material.BAMBOO), new ItemStack(Material.DIAMOND), new ItemStack(Material.BAMBOO),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
                new ItemStack(Material.ACACIA_LEAVES), new ItemStack(Material.BAMBOO), new ItemStack(Material.ACACIA_LEAVES)
        }).register(plugin);
        // @formatter:on
    }
}
