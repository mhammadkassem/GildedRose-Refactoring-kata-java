package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OtherItemsTest
{
    @Test
    void qualityIsNeverNegative()
    {
        ItemBuilder foo = new ItemBuilder("foo",0,1);
        foo.update();
        assertEquals(0,foo.quality);

        Conjured conjured = new Conjured(0,3);
        conjured.update();
        assertEquals(0,conjured.conjuredQuality);
    }

    @Test
    void ifSellInBecomesZeroQualityDegradesTwice()
    {
        ItemBuilder foo = new ItemBuilder("foo",0,2);
        foo.update();
        assertEquals(0,foo.quality);
    }



}
