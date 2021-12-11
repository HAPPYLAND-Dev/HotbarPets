package io.github.thebusybiscuit.hotbarpets.groups;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.PetTexture;
import io.github.thebusybiscuit.hotbarpets.pets.CowPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public final class FarmAnimals implements PetGroup {

    public FarmAnimals(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return "&2动物 (和平)";
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        SlimefunItemStack cow = new SlimefunItemStack("HOTBAR_PET_COW", PetTexture.COW_PET.getHash(), "&6牛 &f宠物", getName(), "&7喜欢的食物: 小麦", "", "&f右键: &7移除负面药水效果");

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_PIG", PetTexture.PIG_PET.getHash(), "&d猪 &f宠物", getName(), "&7喜欢的食物: 胡萝卜", "", "&f吃东西额外获得饱食度", "&f吃东西不会中毒"), new ItemStack(Material.CARROT), new ItemStack[] {
                new ItemStack(Material.REDSTONE), new ItemStack(Material.CARROT), new ItemStack(Material.REDSTONE),
                new ItemStack(Material.PORKCHOP), new ItemStack(Material.DIAMOND), new ItemStack(Material.PORKCHOP),
                new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_16K, new ItemStack(Material.REDSTONE)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_CHICKEN", PetTexture.CHICKEN_PET.getHash(), "&f鸡 &f宠物", getName(), "&7喜欢的食物: 小麦种子", "", "&f时不时获得鸡蛋..."), new ItemStack(Material.WHEAT_SEEDS), new ItemStack[] {
                new ItemStack(Material.REDSTONE), new ItemStack(Material.FEATHER), new ItemStack(Material.REDSTONE),
                new ItemStack(Material.COOKED_CHICKEN), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_CHICKEN),
                new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_16K, new ItemStack(Material.REDSTONE)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_MOOSHROOM", PetTexture.MOOSHROOM_PET.getHash(), "&d哞菇 &f宠物", getName(), "&7喜欢的食物: 红色蘑菇", "", "&f时不时获得蘑菇煲..."), new ItemStack(Material.RED_MUSHROOM), new ItemStack[] {
                new ItemStack(Material.LAPIS_LAZULI), new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.LAPIS_LAZULI),
                new ItemStack(Material.RED_MUSHROOM), new ItemStack(Material.DIAMOND), new ItemStack(Material.BROWN_MUSHROOM),
                new ItemStack(Material.LAPIS_LAZULI), SlimefunItems.GOLD_16K, new ItemStack(Material.LAPIS_LAZULI)
        }).register(plugin);

        new CowPet(plugin.getItemGroup(), cow, new ItemStack(Material.WHEAT), new ItemStack[] {
                new ItemStack(Material.COAL), new ItemStack(Material.WHEAT), new ItemStack(Material.COAL),
                new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_BEEF),
                new ItemStack(Material.COAL), SlimefunItems.GOLD_16K, new ItemStack(Material.COAL)
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_GOLDEN_COW", PetTexture.GOLDEN_COW_PET.getHash(), "&6金牛 &f宠物", getName(), "&7喜欢的食物: 金胡萝卜", "", "&f时不时获得金锭...", "&f(这意味着你有一个金粒的净收益)"), new ItemStack(Material.GOLDEN_CARROT), new ItemStack[] {
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLDEN_CARROT),
                new ItemStack(Material.GOLD_NUGGET), cow, new ItemStack(Material.GOLD_NUGGET),
                new ItemStack(Material.GOLDEN_CARROT), new ItemStack(Material.GOLD_NUGGET), new ItemStack(Material.GOLDEN_CARROT)
        }).register(plugin);
        // @formatter:on
    }

}
