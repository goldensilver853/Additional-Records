package com.goldensilver853.records;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.block.BlockJukebox;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class Record
  extends ItemRecord
{
  private static final Map records = new HashMap();
  public final String recordName;
  
  public Record(int par1, String par0Str)
  {
    super(par0Str);
    this.recordName = par0Str;
    this.maxStackSize = 1;
    this.setCreativeTab(Records.recordsTab);
    records.put(par0Str, this);
  }
  
  @SideOnly(Side.CLIENT)
  public IIcon getIconFromDamage(int par1)
  {
    return this.itemIcon;
  }
  
  public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
  {
    if ((par3World.getBlock(par4, par5, par6) == Blocks.jukebox) && (par3World.getBlockMetadata(par4, par5, par6) == 0))
    {
      if (par3World.isRemote) {
        return true;
      }
      ((BlockJukebox)Blocks.jukebox).func_149926_b(par3World, par4, par5, par6, par1ItemStack);
      par3World.playAuxSFXAtEntity((EntityPlayer)null, 1005, par4, par5, par6, Item.getIdFromItem(this));
      par1ItemStack.stackSize -= 1;
      return true;
    }
    return false;
  }
  
  @SideOnly(Side.CLIENT)
  public void func_77624_a(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
  {
    par3List.add(getRecordTitle());
  }
  
  @SideOnly(Side.CLIENT)
  public String getRecordTitle()
  {
    return this.recordName;
  }
  
  @SideOnly(Side.CLIENT)
  public EnumRarity func_77613_e(ItemStack par1ItemStack)
  {
    return EnumRarity.rare;
  }
  
  @SideOnly(Side.CLIENT)
  public static Record getRecord(String par0Str)
  {
    return (Record)records.get(par0Str);
  }
  
  public ResourceLocation getRecordResource(String name)
  {
    return new ResourceLocation("records:" + name);
  }
  
  @SideOnly(Side.CLIENT)
  public void registerIcons(IIconRegister iconRegister)
  {
    this.itemIcon = iconRegister.registerIcon("records:" + this.getUnlocalizedName().substring(5));
  }
}