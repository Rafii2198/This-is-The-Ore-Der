package rafii2198.theoreder.item;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import rafii2198.theoreder.TheOreder;

/**
 * Created by Rafii on 2017-05-14.
 */
public class ModItems
{
    public static Item OreCore;
    public static void preInit()
    {

      OreCore = new Item().setUnlocalizedName("Ore_core").setCreativeTab(TheOreder.tabTheOreder);

      registerItems();

    }

    public static void registerItems()
    {

        GameRegistry.register(OreCore, new ResourceLocation(TheOreder.MODID, "Ore_core"));

    }

    public static void registerRenders()
    {

        //registerRender(OreCore);

    }

    public static void registerRender(Item item)
    {

        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(TheOreder.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));

    }

}
