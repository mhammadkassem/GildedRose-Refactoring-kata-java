package com.gildedrose;

public class Conjured extends ItemBuilder
{

    public static final String CONJURED_NAME = "Conjured Mana Cake";

    public int conjuredSellIn;

    public int conjuredQuality;

    public Conjured(int sellIn, int quality)
    {
        super(CONJURED_NAME, sellIn, quality);
        conjuredSellIn = sellIn;
        conjuredQuality = quality;

    }

    public void update()
    {
        if(conjuredSellIn == 0) conjuredQuality = Math.max(0,conjuredQuality - 4);
        else conjuredQuality = Math.max(0,conjuredQuality - 2);
        conjuredSellIn = conjuredSellIn - 1;

    }
}
