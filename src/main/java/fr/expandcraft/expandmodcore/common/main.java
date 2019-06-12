package fr.expandcraft.expandmodcore.common;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import fr.expandcraft.expandmodcore.common.Block.DecoBlock;
import fr.expandcraft.expandmodcore.common.Block.Expandiume_ores;
import fr.expandcraft.expandmodcore.common.Block.Fluorites_ores;
import fr.expandcraft.expandmodcore.common.Block.Magma_ores;
import fr.expandcraft.expandmodcore.common.items.Expandiume_ingots;
import fr.expandcraft.expandmodcore.common.items.Fluorites_ingots;
import fr.expandcraft.expandmodcore.common.items.Magma_ingots;
import fr.expandcraft.expandmodcore.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

@Mod(modid = "expandmodcore", name = "Expandmod Core", version = "1.0.0")

public class main 
{
	@Instance("expandmodcore")
	public static main instance;
	
	@SidedProxy(clientSide = "fr.expandcraft.expandmodcore.proxy.Clientproxy", serverSide = "fr.expandcraft.expandmodcore.proxy.CommonProxy ")
	public static CommonProxy proxy;
	
	
	public static Item helmetfluorites, chestPlatefluorites, leggingsfluorites, bootsfluortites; //Armures en Fluorites (les items)
	public static ArmorMaterial armorfluortites = EnumHelper.addArmorMaterial("armorfluortites", 25, new int[] {4, 6, 5, 4}, 20); //Armures en Fluorites Le stuff
	public static Item paysafecard; // les autres items 
	public static Item magma_ingots, fluorites_ingots, expandiume_ingots, magma_block, fluorites_block, expandiume_block;  //les items concernants les minerais 
	public static Block magma_ores, fluorites_ores, expandiume_ores; // les block de minerais 
	public static Block dark_prismarine, prismarine_bricks, prismarine; //Les block de deco 
	
	public static Item helmetexpandium, chestPlateexpandium, leggingsexpandium, bootsexpandium; //Armures en expandium (les items)
	public static ArmorMaterial armorexpandium = EnumHelper.addArmorMaterial("armorexpandium", 25, new int[] {4, 6, 5, 4}, 20); //Armures en expandium Le stuff
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		magma_ingots = new Magma_ingots().setUnlocalizedName("magma_ingots").setTextureName("expandmodcore:magma_ingots").setCreativeTab(CreativeTabs.tabMaterials);
		fluorites_ingots = new Fluorites_ingots().setUnlocalizedName("fluorites_ingots").setTextureName("expandmodcore:fluorites_ingots").setCreativeTab(CreativeTabs.tabMaterials);
		expandiume_ingots = new Expandiume_ingots().setUnlocalizedName("expandiume_ingots").setTextureName("expandmodcore:expandiume_ingots").setCreativeTab(CreativeTabs.tabMaterials);
		
		
		paysafecard = new Paysafecard().setUnlocalizedName("paysafecard").setTextureName("expandmodcore:pay_safecard").setCreativeTab(CreativeTabs.tabMaterials);
		
		GameRegistry.registerItem(paysafecard, "pay_safecard");
		
		GameRegistry.registerItem(magma_ingots, "magma_ingots");
		GameRegistry.registerItem(fluorites_ingots, "fluorites_ingots");
		GameRegistry.registerItem(expandiume_ingots, "expandiume_ingots");
		
		
		magma_ores = new Magma_ores().setBlockName("magma_ores").setBlockTextureName("expandmodcore:magma_ores").setCreativeTab(CreativeTabs.tabBlock).setHardness(25);
		fluorites_ores = new Fluorites_ores().setBlockName("fluorites_ores").setBlockTextureName("expandmodcore:fluorites_ores").setCreativeTab(CreativeTabs.tabBlock).setHardness(25);
		expandiume_ores = new Expandiume_ores().setBlockName("expandiume_ores").setBlockTextureName("expandmodcore:expandiume_ores").setCreativeTab(CreativeTabs.tabBlock).setHardness(25);
		
		//Block de Décoratiosn
		dark_prismarine = new DecoBlock().setBlockName("dark_prismarine").setBlockTextureName("expandmodcore:dark_prismarine").setCreativeTab(CreativeTabs.tabDecorations).setHardness(10);
		prismarine_bricks = new DecoBlock().setBlockName("prismarine_bricks").setBlockTextureName("expandmodcore:prismarine_bricks").setCreativeTab(CreativeTabs.tabDecorations).setHardness(10);
		prismarine = new DecoBlock().setBlockName("prismarine").setBlockTextureName("expandmodcore:prismarine").setCreativeTab(CreativeTabs.tabDecorations).setHardness(10);
		
		GameRegistry.registerBlock(magma_ores, "magma_ores");
		GameRegistry.registerBlock(fluorites_ores, "fluorites_ores");
		GameRegistry.registerBlock(expandiume_ores, "expandiume_ores");
		
		//Block de déco
		GameRegistry.registerBlock(dark_prismarine, "dark_prismarine");
		GameRegistry.registerBlock(prismarine_bricks, "prismarine_bricks");
		GameRegistry.registerBlock(prismarine, "prismarine");
		
		
		
		
		//les armures 
		
		//En fluorites
		
		helmetfluorites = new Itemfluortitesarmors(armorfluortites, 0).setUnlocalizedName("helmet_fluorites").setTextureName("expandmodcore:helmet_fluortites");
		chestPlatefluorites = new Itemfluortitesarmors(armorfluortites, 1).setUnlocalizedName("chestPlate_fluorites").setTextureName("expandmodcore:chestplate_fluortites");
		leggingsfluorites = new Itemfluortitesarmors(armorfluortites, 2).setUnlocalizedName("leggings_fluorites").setTextureName("expandmodcore:leggings_fluortites");
        bootsfluortites = new Itemfluortitesarmors(armorfluortites, 3).setUnlocalizedName("boots_fluortites").setTextureName("expandmodcore:boots_fluortites");

        GameRegistry.registerItem(helmetfluorites, "helmetfluorites");
        GameRegistry.registerItem(chestPlatefluorites, "chestPlatefluorites");
        GameRegistry.registerItem(leggingsfluorites, "leggingsfluorites");
        GameRegistry.registerItem(bootsfluortites, "bootsfluortites");
        
        //En Expandium
        
		helmetexpandium = new Itemexpandiumarmors(armorexpandium, 0).setUnlocalizedName("helmet_expandium").setTextureName("expandmodcore:helmet_expandium");
		chestPlateexpandium = new Itemexpandiumarmors(armorexpandium, 1).setUnlocalizedName("chestPlate_expandium").setTextureName("expandmodcore:chestplate_expandium");
		leggingsexpandium = new Itemexpandiumarmors(armorexpandium, 2).setUnlocalizedName("leggings_expandium").setTextureName("expandmodcore:leggings_expandium");
        bootsexpandium = new Itemexpandiumarmors(armorexpandium, 3).setUnlocalizedName("boots_expandium").setTextureName("expandmodcore:boots_expandium");

        GameRegistry.registerItem(helmetexpandium, "helmetexpandium");
        GameRegistry.registerItem(chestPlateexpandium, "chestPlateexpandium");
        GameRegistry.registerItem(leggingsexpandium, "leggingsexpandium");
        GameRegistry.registerItem(bootsexpandium, "bootsexpandium"); 
        

        
	}
	
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{

		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{

	}
	
}