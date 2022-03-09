package rip.crystal.practice.shop.menu;

import rip.crystal.practice.cPractice;
import rip.crystal.practice.profile.meta.option.button.DeathAnimationsOptionsButton;
import rip.crystal.practice.profile.meta.option.button.TrailsOptionsButton;
import rip.crystal.practice.shop.buttons.KillEffectsShopButton;
import rip.crystal.practice.shop.buttons.TrailsEffectsShopButton;
import rip.crystal.practice.utilities.ItemBuilder;
import rip.crystal.practice.utilities.menu.Button;
import rip.crystal.practice.utilities.menu.Menu;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;

public class ShopMenu extends Menu {

    @Override
    public String getTitle(Player player) {
        return "&9&lCosmetics Shop";
    }

    {
        setPlaceholder(true);
    }

    @Override
    public int getSize() {
        return 3 * 9;
    }

    @Override
    public Map<Integer, Button> getButtons(Player player) {
        Map<Integer, Button> buttons = new HashMap<>();
        ItemStack PLACEHOLDER_ITEM = new ItemBuilder(Material.valueOf(cPractice.get().getMainConfig().getString("QUEUES.PLACEHOLDER-ITEM-MATERIAL"))).durability(cPractice.get().getMainConfig().getInteger("QUEUES.PLACEHOLDER-ITEM-DATA")).name("&b").build();
        this.fillEmptySlots(buttons, PLACEHOLDER_ITEM);

        buttons.put(11, new KillEffectsShopButton());
        buttons.put(13, new TrailsEffectsShopButton());

        return buttons;
    }
}