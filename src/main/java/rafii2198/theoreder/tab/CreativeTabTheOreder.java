package rafii2198.theoreder.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

/**
 * Created by Rafii on 2017-05-14.
 */
public class CreativeTabTheOreder extends CreativeTabs
{

    public CreativeTabTheOreder(int index, String label)
    {
        super(index, label);
    }

    @Override
    public Item getTabIconItem() {
        return Items.IRON_PICKAXE;
    }
}
