package com.company;

import com.company.Player;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {

    @Test
    public void testAddPlayerCoins() {
        Player player = new Player("test");
        player.addPlayerCoins(-1001);
        Assert.assertEquals(0, player.getPlayerCoins());
        System.out.println(player.getPlayerCoins());
    }
}