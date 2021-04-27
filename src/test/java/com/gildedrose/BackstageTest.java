package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackstageTest
{

    @Test
    void backstageQualityIncrease()
    {
        Backstage backstage = new Backstage(11,10);
        backstage.update();
        assertEquals(11,backstage.backstageQuality);

    }

    @Test
    void backstageQualityIncreaseTwice()
    {
        Backstage backstage = new Backstage(9,10);
        backstage.update();
        assertEquals(12,backstage.backstageQuality);

    }

    @Test
    void backstageQualityIncreaseThrice()
    {
        Backstage backstage = new Backstage(4,10);
        backstage.update();
        assertEquals(13,backstage.backstageQuality);
    }

    @Test
    void backstageQualityDropsToZero()
    {
        Backstage backstage = new Backstage(0,10);
        backstage.update();
        assertEquals(0,backstage.backstageQuality);

    }


}
