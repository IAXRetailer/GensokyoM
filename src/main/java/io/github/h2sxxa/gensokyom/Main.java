package io.github.h2sxxa.gensokyom;

import io.github.h2sxxa.gensokyom.events.ModReg;
import io.github.h2sxxa.gensokyom.proxy.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = Main.MODID,
        name = Main.NAME,
        version = Main.VERSION,
        dependencies = "required-after:mirror@[0.4.0,);required-after:danmakucore"
)
public class Main
{
    public static final String MODID = "gensokyom";
    public static final String NAME = "Gensokyo M";
    public static final String VERSION = "1.0";

    public static Logger logger;

    @SidedProxy(clientSide = "io.github.h2sxxa.gensokyom.proxy.ClientProxy", serverSide = "io.github.h2sxxa.gensokyom.proxy.CommonProxy")
    public static CommonProxy proxy;
    @EventHandler
    public static void PreInit(FMLPreInitializationEvent event)
    {
        logger=event.getModLog();
        ModReg.preInitRegistries();
    }

}
