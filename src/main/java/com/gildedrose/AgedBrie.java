package com.gildedrose;

public class AgedBrie extends ItemBuilder
{
    public static final String AGEDBRIE_NAME = "Aged Brie";

    //public String brname;

    public int agedBrieSellIn;

    public int agedBrieQuality;


    public AgedBrie(int sellIn, int quality)
    {
        super(AGEDBRIE_NAME, sellIn, quality);
        agedBrieSellIn = sellIn;
        agedBrieQuality = quality;

    }

    public void update()
    {
        if(agedBrieSellIn < 1) agedBrieQuality = Math.min(50 , agedBrieQuality + 2);
        else agedBrieQuality = Math.min(50 , agedBrieQuality + 1);
        agedBrieSellIn = agedBrieSellIn - 1;
    }

}
