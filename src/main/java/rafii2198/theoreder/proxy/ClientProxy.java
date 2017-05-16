package rafii2198.theoreder.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.model.obj.OBJLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import rafii2198.theoreder.TheOreder;
import rafii2198.theoreder.item.ModItems;

/**
 * Created by Rafii on 2017-05-14.
 */
public class ClientProxy extends CommonProxy
{

    @Override
    public void preInit(FMLPreInitializationEvent event)
    {

        OBJLoader.INSTANCE.addDomain(TheOreder.MODID);
        registerModel(ModItems.OreCore);

    }

    public void registerModel(Item item)
    {
        ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(TheOreder.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

    @Override
    public void init(FMLInitializationEvent event)
    {

        ModItems.registerRenders();

    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {



    }
}
