package com.johnson.listener;

import com.johnson.MkiiEconomy;
import net.milkbowl.vault.economy.Economy;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class BlackBreakListener extends MyListener{
    public BlackBreakListener(MkiiEconomy instance) {super(instance);}
    Economy economy = MkiiEconomy.getEconomy();
    @EventHandler
    public void onDiamondBreak(BlockBreakEvent event){
        Player player = event.getPlayer();
        int level = player.getLevel();
        double levelNo = level/4;
        double money = 0.0;

        Block block = event.getBlock();
        ItemStack item = player.getItemInHand();
        if (item.hasItemMeta()&& item.getItemMeta().hasEnchant(Enchantment.SILK_TOUCH)){
            if (
                block.getType() == Material.DIAMOND_ORE ||
                block.getType() == Material.EMERALD_ORE ||
                block.getType() == Material.REDSTONE_ORE ||
                block.getType() == Material.LAPIS_ORE ||
                block.getType() == Material.COAL_ORE
               ){
                player.sendMessage("您使用的工具有絲綢! 無法掉落金錢");
            }
        }
        else{

            if(block.getType() == Material.DIAMOND_ORE ){
                if (item.hasItemMeta()&& item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)){
                    int fortune = player.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
                    if (fortune == 1){
                        money = (20*1.1)+levelNo;

                        //player.sendMessage("幸運I 機率性獲得金錢$$ 鑽石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 2){
                        money = (20*1.3)+levelNo;

                        //player.sendMessage("幸運II 機率性獲得金錢$$ 鑽石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 3){
                        money = (20*1.5)+levelNo;

                        //player.sendMessage("幸運III 機率性獲得金錢$$ 鑽石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                }
                else {
                    money = (20*1)+levelNo;

                    //player.sendMessage("無幸運附魔!! 機率性獲得金錢$$ 鑽石");
                    economy.depositPlayer(player, money);
                    player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                }
            }
            else if (block.getType() == Material.EMERALD_ORE){
                if (item.hasItemMeta()&& item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)){
                    int fortune = player.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
                    if (fortune == 1){
                        money = (30*1.1)+levelNo;

                        //player.sendMessage("幸運I 機率性獲得金錢$$ 綠寶石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 2){
                        money = (30*1.3)+levelNo;

                        //player.sendMessage("幸運II 機率性獲得金錢$$ 綠寶石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 3){
                        money = (30*1.5)+levelNo;

                        //player.sendMessage("幸運III 機率性獲得金錢$$ 綠寶石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                }
                else {
                    money = (30*1)+levelNo;

                    //player.sendMessage("無幸運附魔!! 機率性獲得金錢$$ 綠寶石");
                    economy.depositPlayer(player, money);
                    player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                }

            }
            else if (block.getType() == Material.REDSTONE_ORE){
                if (item.hasItemMeta()&& item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)){
                    int fortune = player.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
                    if (fortune == 1){
                        money = (5*1.1)+levelNo;

                        //player.sendMessage("幸運I 機率性獲得金錢$$ 紅石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 2){
                        money = (5*1.3)+levelNo;

                        //player.sendMessage("幸運II 機率性獲得金錢$$ 紅石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 3){
                        money = (5*1.5)+levelNo;

                        //player.sendMessage("幸運III 機率性獲得金錢$$ 紅石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                }
                else {
                    money = (5*1)+levelNo;

                    //player.sendMessage("無幸運附魔!! 機率性獲得金錢$$ 紅石");
                    economy.depositPlayer(player, money);
                    player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                }

            }
            else if (block.getType() == Material.LAPIS_ORE){
                if (item.hasItemMeta()&& item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)){
                    int fortune = player.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
                    if (fortune == 1){
                        money = (8*1.1)+levelNo;

                        //player.sendMessage("幸運I 機率性獲得金錢$$ 青金石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 2){
                        money = (8*1.3)+levelNo;

                        //player.sendMessage("幸運II 機率性獲得金錢$$ 青金石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 3){
                        money = (8*1.5)+levelNo;

                        //player.sendMessage("幸運III 機率性獲得金錢$$ 青金石");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                }
                else {
                    money = (8*1)+levelNo;

                    //player.sendMessage("無幸運附魔!! 機率性獲得金錢$$ 青金石");
                    economy.depositPlayer(player, money);
                    player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                }
            }
            else if (block.getType() == Material.COAL_ORE){

                if (item.hasItemMeta()&& item.getItemMeta().hasEnchant(Enchantment.LOOT_BONUS_BLOCKS)){
                    int fortune = player.getItemInHand().getEnchantmentLevel(Enchantment.LOOT_BONUS_BLOCKS);
                    if (fortune == 1){
                        money = (3*1.1)+levelNo;

                        //player.sendMessage("幸運I 機率性獲得金錢$$ 煤炭");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 2){
                        money = (3*1.3)+levelNo;

                        //player.sendMessage("幸運II 機率性獲得金錢$$ 煤炭");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                    else if (fortune == 3){
                        money = (3*1.5)+levelNo;

                        //player.sendMessage("幸運III 機率性獲得金錢$$ 煤炭");
                        economy.depositPlayer(player, money);
                        player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                    }
                }
                else {
                    money = (3*1)+levelNo;

                    //player.sendMessage("無幸運附魔!! 機率性獲得金錢$$ 煤炭");
                    economy.depositPlayer(player, money);
                    player.sendMessage("掉落: " + economy.format(money) + " 經驗加成: $" + levelNo);
                }
            }
        }
    }
}
