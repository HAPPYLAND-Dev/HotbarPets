package io.github.thebusybiscuit.hotbarpets.groups;

import io.github.thebusybiscuit.hotbarpets.PetTexture;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import io.github.thebusybiscuit.hotbarpets.HotbarPet;
import io.github.thebusybiscuit.hotbarpets.HotbarPets;
import io.github.thebusybiscuit.hotbarpets.PetGroup;
import io.github.thebusybiscuit.hotbarpets.pets.special.CookieSlimePet;
import io.github.thebusybiscuit.hotbarpets.pets.special.PatriotPet;
import io.github.thebusybiscuit.hotbarpets.pets.special.PurpliciousCowPet;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;

public final class SpecialPets implements PetGroup {

    public SpecialPets(HotbarPets plugin) {
        load(plugin);
    }

    @Override
    public String getName() {
        return "&9特殊";
    }

    @Override
    public void load(HotbarPets plugin) {
        // @formatter:off
        new PurpliciousCowPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_PURPLICIOUS_COW", PetTexture.PURPLICIOUS_COW_PET.getHash(), "&5紫斑牛 &f宠物", getName(), "&7喜欢的食物: 金苹果", "", "&f右键: &7获得生命恢复"), new ItemStack(Material.GOLDEN_APPLE), new ItemStack[] {
                new ItemStack(Material.COOKED_BEEF), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKED_BEEF),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
                SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
        }).register(plugin);

        new CookieSlimePet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_MRCOOKIESLIME", PetTexture.MR_COOKIE_SLIME_PET.getHash(), "&a饼干 &f宠物", getName(), "&7喜欢的食物: 饼干", "", "&f免疫掉落伤害", "&f右键: &7获得生命恢复"), new ItemStack(Material.COOKIE), new ItemStack[] {
                new ItemStack(Material.COOKIE), new ItemStack(Material.DIAMOND), new ItemStack(Material.COOKIE),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
                SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
        }).register(plugin);

        new PatriotPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_PATRIOT", PetTexture.PATRIOT_PET.getHash(), "&5爱国者 &f宠物", getName(), "&7喜欢的食物: 下界疣", "", "&f获得抗性提升, 生命恢复, 力量, ", "&f和饱食"), new ItemStack(Material.NETHER_WART), new ItemStack[] {
                new ItemStack(Material.REDSTONE), SlimefunItems.MAGIC_LUMP_1, new ItemStack(Material.REDSTONE),
                SlimefunItems.MAGIC_LUMP_1, SlimefunItems.RAW_CARBONADO, SlimefunItems.MAGIC_LUMP_1,
                SlimefunItems.GOLD_4K, new ItemStack(Material.REDSTONE), SlimefunItems.GOLD_4K
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_WALSHRUS", PetTexture.WALSHRUS_PET.getHash(), "&b海象 &f宠物", getName(), "&7喜欢的食物: 生鳕鱼", "", "&f周围不会自然生成溺尸"), new ItemStack(Material.COD), new ItemStack[] {
                new ItemStack(Material.COD), new ItemStack(Material.DIAMOND), new ItemStack(Material.COD),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
                SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
        }).register(plugin);

        new HotbarPet(plugin.getItemGroup(), new SlimefunItemStack("HOTBAR_PET_EYAMAZ", PetTexture.EYAMAZ_PET.getHash(), "&4灵魂 &f宠物", getName(), "&7喜欢的食物: 灵魂沙", "", "&f每当你击杀一个生物或玩家", "&f你就会获得一个灵魂派食物"), new ItemStack(Material.SOUL_SAND), new ItemStack[] {
                new ItemStack(Material.SOUL_SAND), new ItemStack(Material.DIAMOND), new ItemStack(Material.SOUL_SAND),
                new ItemStack(Material.DIAMOND), new ItemStack(Material.EMERALD), new ItemStack(Material.DIAMOND),
                SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K, SlimefunItems.GOLD_20K
        }).register(plugin);
        // @formatter:on
    }

}
