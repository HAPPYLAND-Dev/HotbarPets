package io.github.thebusybiscuit.hotbarpets;

import org.bstats.bukkit.Metrics;
import org.bukkit.NamespacedKey;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import io.github.thebusybiscuit.hotbarpets.groups.BossMobs;
import io.github.thebusybiscuit.hotbarpets.groups.FarmAnimals;
import io.github.thebusybiscuit.hotbarpets.groups.HostileMobs;
import io.github.thebusybiscuit.hotbarpets.groups.PassiveMobs;
import io.github.thebusybiscuit.hotbarpets.groups.PeacefulAnimals;
import io.github.thebusybiscuit.hotbarpets.groups.SpecialPets;
import io.github.thebusybiscuit.hotbarpets.groups.UtilityPets;
import io.github.thebusybiscuit.hotbarpets.listeners.DamageListener;
import io.github.thebusybiscuit.hotbarpets.listeners.FoodListener;
import io.github.thebusybiscuit.hotbarpets.listeners.GeneralListener;
import io.github.thebusybiscuit.hotbarpets.listeners.PhantomListener;
import io.github.thebusybiscuit.hotbarpets.listeners.ProjectileListener;
import io.github.thebusybiscuit.hotbarpets.listeners.SoulPieListener;
import io.github.thebusybiscuit.hotbarpets.listeners.TNTListener;
import io.github.thebusybiscuit.slimefun4.api.SlimefunAddon;
import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.config.Config;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;

import net.guizhanss.guizhanlib.updater.GuizhanBuildsUpdater;

public class HotbarPets extends JavaPlugin implements Listener, SlimefunAddon {

    private ItemGroup itemGroup;

    public static String prefix = "§8[§x§4§F§B§3§B§F宠物§8]";

    @Override
    public void onEnable() {
        Config cfg = new Config(this);

        // Setting up bStats
        new Metrics(this, 4859);

        if (cfg.getBoolean("options.auto-update") && getDescription().getVersion().startsWith("Build")) {
            new GuizhanBuildsUpdater(this, getFile(), "ybw0014", "HotbarPets-CN", "master", false, "zh-CN").start();
        }

        itemGroup = new ItemGroup(new NamespacedKey(this, "pets"), new CustomItemStack(PetTexture.CATEGORY.getAsItem(), "&d背包宠物", "", "&a> 点击打开"));

        // Add all the Pets via their Group class
        new FarmAnimals(this);
        new PeacefulAnimals(this);
        new PassiveMobs(this);
        new HostileMobs(this);
        new BossMobs(this);
        new UtilityPets(this);
        new SpecialPets(this);

        // Registering the Listeners
        new DamageListener(this);
        new FoodListener(this);
        new GeneralListener(this);
        new PhantomListener(this);
        new ProjectileListener(this);
        new SoulPieListener(this);
        new TNTListener(this);

        // Registering our task
        getServer().getScheduler().scheduleSyncRepeatingTask(this, new HotbarPetsRunnable(), 0L, 2000L);
    }

    public ItemGroup getItemGroup() {
        return itemGroup;
    }

    @Override
    public String getBugTrackerURL() {
        return "https://github.com/SlimefunGuguProject/HotbarPets/issues";
    }

    @Override
    public JavaPlugin getJavaPlugin() {
        return this;
    }
}
