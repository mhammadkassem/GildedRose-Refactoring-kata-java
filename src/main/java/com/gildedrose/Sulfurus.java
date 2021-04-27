package com.gildedrose;

public class Sulfurus extends ItemBuilder
{
    public static final String SULFURUS_NAME = "Sulfuras, Hand of Ragnaros";

    public int sulfurusSellIn;

    public static final int SULFURUS_QUALITY = 80;

    public Sulfurus(int sellIn)
    {
        super(SULFURUS_NAME, sellIn, SULFURUS_QUALITY);
        sulfurusSellIn = sellIn;
        //SULFURUS_QUALITY = quality;
    }

    public void update()
    {
        //SULFURUS_QUALITY = SULFURUS_QUALITY;
        sulfurusSellIn = sulfurusSellIn;

    }
}
