//Copyright 2014 goldensilver853
//If you downloaded this mod without this comment, delete it and get a fresh copy from the author!

package com.goldensilver853.records;

import java.io.File;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@Mod(modid = Records.MODID, version = Records.VERSION)
public class Records
{
	
	public static CreativeTabs recordsTab = new CreativeTabs("RecordsTab") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem(){
                return Records.CD_1;
        }
    };
	
	public static Item CD_1;
	public static Item CD_2;
	public static Item CD_3;
	public static Item CD_4;
	public static Item CD_5;
	public static Item CD_6;
	public static Item CD_7;
	public static Item CD_8;
	public static Item CD_9;
	public static Item CD_10;
	public static Item CD_11;
	public static Item CD_12;
	public static Item CD_13;
	public static Item CD_14;
	public static Item CD_15;
	public static Item CD_16;
	public static Item CD_17;
	public static Item CD_18;
	public static Item CD_19;
	public static Item CD_20;
	public static Item CD_21;
	public static Item CD_22;
	public static Item CD_23;
	public static Item CD_24;
	public static Item CD_25;
	public static Item CD_26;
	public static Item CD_27;
	public static Item CD_28;
	public static Item CD_29;
	public static Item CD_30;
	public static Item CD_31;
	public static Item CD_32;
	public static Item CD_33;
	public static Item CD_34;
	public static Item CD_35;
	public static Item CD_36;
	public static Item CD_37;
	public static Item CD_38;
	public static Item CD_39;
	public static Item CD_40;
	public static Item CD_41;
	public static Item CD_42;
	public static Item CD_43;
	public static Item CD_44;
	public static Item CD_45;
	public static Item CD_46;
	public static Item CD_47;
	public static Item CD_48;
	
	
    public static final String MODID = "Records";
    public static final String VERSION = "0.1.0";
    public static boolean RecordSet1;
    public static boolean RecordSet2;
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
		Configuration config = new Configuration(new File(event.getModConfigurationDirectory().getAbsolutePath() + "/AdditionalRecords.cfg"));
		config.load();
		RecordSet1 = config.get(Configuration.CATEGORY_GENERAL, "Add 16 more records so you have a total of 32?", false).getBoolean(false);
		RecordSet2 = config.get(Configuration.CATEGORY_GENERAL, "Enabling this one first will give you 16 records, but the tooltips will not be correct.", false).getBoolean(false);
		config.save();

		if (RecordSet1) {
	    	CD_17 = new Record(0, "cd17") .setTextureName("records:1") .setUnlocalizedName("1");
	    	CD_18 = new Record(0, "cd18") .setTextureName("records:2") .setUnlocalizedName("2");
	    	CD_19 = new Record(0, "cd19") .setTextureName("records:3") .setUnlocalizedName("3");
	    	CD_20 = new Record(0, "cd20") .setTextureName("records:4") .setUnlocalizedName("4");
	    	CD_21 = new Record(0, "cd21") .setTextureName("records:5") .setUnlocalizedName("5");
	    	CD_22 = new Record(0, "cd22") .setTextureName("records:6") .setUnlocalizedName("6");
	    	CD_23 = new Record(0, "cd23") .setTextureName("records:7") .setUnlocalizedName("7");
	    	CD_24 = new Record(0, "cd24") .setTextureName("records:8") .setUnlocalizedName("8");
	    	CD_25 = new Record(0, "cd25") .setTextureName("records:9") .setUnlocalizedName("9");
	    	CD_26 = new Record(0, "cd26") .setTextureName("records:10") .setUnlocalizedName("10");
	    	CD_27 = new Record(0, "cd27") .setTextureName("records:11") .setUnlocalizedName("11");
	    	CD_28 = new Record(0, "cd28") .setTextureName("records:12") .setUnlocalizedName("12");
	    	CD_29 = new Record(0, "cd29") .setTextureName("records:13") .setUnlocalizedName("13");
	    	CD_30 = new Record(0, "cd30") .setTextureName("records:14") .setUnlocalizedName("14");
	    	CD_31 = new Record(0, "cd31") .setTextureName("records:15") .setUnlocalizedName("15");
	    	CD_32 = new Record(0, "cd32") .setTextureName("records:16") .setUnlocalizedName("16");
	    	
	    	GameRegistry.registerItem(CD_17, "CD_17");
	    	GameRegistry.registerItem(CD_18, "CD_18");
	    	GameRegistry.registerItem(CD_19, "CD_19");
	    	GameRegistry.registerItem(CD_20, "CD_20");
	    	GameRegistry.registerItem(CD_21, "CD_21");
	    	GameRegistry.registerItem(CD_22, "CD_22");
	    	GameRegistry.registerItem(CD_23, "CD_23");
	    	GameRegistry.registerItem(CD_24, "CD_24");
	    	GameRegistry.registerItem(CD_25, "CD_25");
	    	GameRegistry.registerItem(CD_26, "CD_26");
	    	GameRegistry.registerItem(CD_27, "CD_27");
	    	GameRegistry.registerItem(CD_28, "CD_28");
	    	GameRegistry.registerItem(CD_29, "CD_29");
	    	GameRegistry.registerItem(CD_30, "CD_30");
	    	GameRegistry.registerItem(CD_31, "CD_31");
	    	GameRegistry.registerItem(CD_32, "CD_32");
	    	
		}
	   if (RecordSet2){
		   
	    	CD_33 = new Record(0, "cd33") .setTextureName("records:1") .setUnlocalizedName("1");
	    	CD_34 = new Record(0, "cd34") .setTextureName("records:2") .setUnlocalizedName("2");
	    	CD_35 = new Record(0, "cd35") .setTextureName("records:3") .setUnlocalizedName("3");
	    	CD_36 = new Record(0, "cd36") .setTextureName("records:4") .setUnlocalizedName("4");
	    	CD_37 = new Record(0, "cd37") .setTextureName("records:5") .setUnlocalizedName("5");
	    	CD_38 = new Record(0, "cd38") .setTextureName("records:6") .setUnlocalizedName("6");
	    	CD_39 = new Record(0, "cd39") .setTextureName("records:7") .setUnlocalizedName("7");
	    	CD_40 = new Record(0, "cd40") .setTextureName("records:8") .setUnlocalizedName("8");
	    	CD_41 = new Record(0, "cd41") .setTextureName("records:9") .setUnlocalizedName("9");
	    	CD_42 = new Record(0, "cd42") .setTextureName("records:10") .setUnlocalizedName("10");
	    	CD_43 = new Record(0, "cd43") .setTextureName("records:11") .setUnlocalizedName("11");
	    	CD_44 = new Record(0, "cd44") .setTextureName("records:12") .setUnlocalizedName("12");
	    	CD_45 = new Record(0, "cd45") .setTextureName("records:13") .setUnlocalizedName("13");
	    	CD_46 = new Record(0, "cd46") .setTextureName("records:14") .setUnlocalizedName("14");
	    	CD_47 = new Record(0, "cd47") .setTextureName("records:15") .setUnlocalizedName("15");
	    	CD_48 = new Record(0, "cd48") .setTextureName("records:16") .setUnlocalizedName("16");
	    	
	    	GameRegistry.registerItem(CD_33, "CD_33");
	    	GameRegistry.registerItem(CD_34, "CD_34");
	    	GameRegistry.registerItem(CD_35, "CD_35");
	    	GameRegistry.registerItem(CD_36, "CD_36");
	    	GameRegistry.registerItem(CD_37, "CD_37");
	    	GameRegistry.registerItem(CD_38, "CD_38");
	    	GameRegistry.registerItem(CD_39, "CD_39");
	    	GameRegistry.registerItem(CD_40, "CD_40");
	    	GameRegistry.registerItem(CD_41, "CD_41");
	    	GameRegistry.registerItem(CD_42, "CD_42");
	    	GameRegistry.registerItem(CD_43, "CD_43");
	    	GameRegistry.registerItem(CD_44, "CD_44");
	    	GameRegistry.registerItem(CD_45, "CD_45");
	    	GameRegistry.registerItem(CD_46, "CD_46");
	    	GameRegistry.registerItem(CD_47, "CD_47");
	    	GameRegistry.registerItem(CD_48, "CD_48");
	    	
		   
	   }
	
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	
    	CD_1 = new Record(0, "cd1") .setTextureName("records:1") .setUnlocalizedName("1");
    	CD_2 = new Record(0, "cd2") .setTextureName("records:2") .setUnlocalizedName("2");
    	CD_3 = new Record(0, "cd3") .setTextureName("records:3") .setUnlocalizedName("3");
    	CD_4 = new Record(0, "cd4") .setTextureName("records:4") .setUnlocalizedName("4");
    	CD_5 = new Record(0, "cd5") .setTextureName("records:5") .setUnlocalizedName("5");
    	CD_6 = new Record(0, "cd6") .setTextureName("records:6") .setUnlocalizedName("6");
    	CD_7 = new Record(0, "cd7") .setTextureName("records:7") .setUnlocalizedName("7");
    	CD_8 = new Record(0, "cd8") .setTextureName("records:8") .setUnlocalizedName("8");
    	CD_9 = new Record(0, "cd9") .setTextureName("records:9") .setUnlocalizedName("9");
    	CD_10 = new Record(0, "cd10") .setTextureName("records:10") .setUnlocalizedName("10");
    	CD_11 = new Record(0, "cd11") .setTextureName("records:11") .setUnlocalizedName("11");
    	CD_12 = new Record(0, "cd12") .setTextureName("records:12") .setUnlocalizedName("12");
    	CD_13 = new Record(0, "cd13") .setTextureName("records:13") .setUnlocalizedName("13");
    	CD_14 = new Record(0, "cd14") .setTextureName("records:14") .setUnlocalizedName("14");
    	CD_15 = new Record(0, "cd15") .setTextureName("records:15") .setUnlocalizedName("15");
    	CD_16 = new Record(0, "cd16") .setTextureName("records:16") .setUnlocalizedName("16");
    	
    	GameRegistry.registerItem(CD_1, "CD_1");
    	GameRegistry.registerItem(CD_3, "CD_3");
    	GameRegistry.registerItem(CD_2, "CD_2");
    	GameRegistry.registerItem(CD_4, "CD_4");
    	GameRegistry.registerItem(CD_5, "CD_5");
    	GameRegistry.registerItem(CD_6, "CD_6");
    	GameRegistry.registerItem(CD_7, "CD_7");
    	GameRegistry.registerItem(CD_8, "CD_8");
    	GameRegistry.registerItem(CD_9, "CD_9");
    	GameRegistry.registerItem(CD_10, "CD_10");
    	GameRegistry.registerItem(CD_11, "CD_11");
    	GameRegistry.registerItem(CD_12, "CD_12");
    	GameRegistry.registerItem(CD_13, "CD_13");
    	GameRegistry.registerItem(CD_14, "CD_14");
    	GameRegistry.registerItem(CD_15, "CD_15");
    	GameRegistry.registerItem(CD_16, "CD_16");
 

    	
    	
    }
}
