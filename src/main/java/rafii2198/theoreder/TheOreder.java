package rafii2198.theoreder;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import rafii2198.theoreder.item.ModItems;
import rafii2198.theoreder.proxy.CommonProxy;
import rafii2198.theoreder.tab.CreativeTabTheOreder;

@Mod(modid = TheOreder.MODID, version = TheOreder.VERSION, name = TheOreder.NAME)
public class TheOreder
{
    public static final String MODID = "thisistheoreder";
    public static final String VERSION = "1.0";
    public static final String NAME = "This is The Ore-der";

    @SidedProxy(clientSide = "rafii2198.theoreder.proxy.ClientProxy", serverSide = "rafii2198.theoreder.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static TheOreder instance;

    public static CreativeTabTheOreder tabTheOreder;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
       tabTheOreder = new CreativeTabTheOreder(CreativeTabs.getNextID(), "tab_oreder");
        ModItems.preInit();
       proxy.preInit(event);

    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

        proxy.postInit(event);

    }
}
