package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


    @Test
    void ifSellInBecomesZeroQualityDegradesTwice() //done
    {
        //Item item = new Item("foo",1,1);
        Item[] items = {new Item("Conjured Mana Cake", 1, 5)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(3, app.items[0].quality);
    }

    @Test
    void qualityIsNeverNegative()   //done
    {
        Item[] items = {new Item("foo", 100, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    void agedBriesQualityIncreases() //done
    {
        Item[] items = {new Item("Aged Brie", 1, 10)}; //
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(11, app.items[0].quality);
    }

    @Test
    void agedBriesQualityIncreasesTwiceIfSellinZero() //done
    {
        Item[] items = {new Item("Aged Brie", 0, 10)}; //
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
    }

    @Test
    void qualityNotMoreThanFifty() //done
    {
        Item[] items = {new Item("Aged Brie", 10, 50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    void sulfurusQualityIsFixed()
    {
        Item[] items = {new Item("Sulfuras, Hand of Ragnaros", 10, 10),
                new Item("Sulfuras, Hand of Ragnaros", -1, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(10, app.items[0].quality);
        assertEquals(10, app.items[1].quality);

    }

    @Test
    void backstagePassesQuality()
    {
        Item[] items = {new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(12, app.items[0].quality);
        assertEquals(13,app.items[1].quality);
        assertEquals(0,app.items[2].quality);
    }

    @Test
    void conjuredQualityDegradesTwiceFaster()
    {
        Item[] items = {new Item("Conjured Mana Cake", 10, 10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(8, app.items[0].quality);

    }
    //......................................... TEST FOR REFACTORING .............................../


}
