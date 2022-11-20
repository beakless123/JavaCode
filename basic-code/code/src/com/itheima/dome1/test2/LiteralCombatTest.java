package com.itheima.dome1.test2;

import com.itheima.dome1.test2.LiteralCombat;

public class LiteralCombatTest {
    public static void main(String[] args) {
        LiteralCombat player1 = new LiteralCombat("乔峰",100,'男');
        LiteralCombat player2 = new LiteralCombat("鸠智摩",100,'男');
        System.out.println("玩家1信息：");
        player1.show();
        System.out.println("玩家2信息：");
        player2.show();
        while (true){
            player1.attack(player2);
            if (player2.getBlood()<=10){
                break;
            }
            player2.attack(player1);
            if (player1.getBlood()<=10){
                break;
            }
        }


    }
}
