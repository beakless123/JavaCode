package com.itheima.dome1.test1;

import com.itheima.dome1.test1.GFriend;

public class GFriendTest {
    public static void main(String[] args) {
        GFriend gFriend = new GFriend();
        gFriend.setName("lili");
        gFriend.setHigh(163.7);
        gFriend.setWeight(110.9);
        gFriend.show();
        gFriend.wash();
        gFriend.cook();
    }
}
