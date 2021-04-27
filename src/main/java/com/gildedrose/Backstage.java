package com.gildedrose;

public class Backstage extends ItemBuilder
{

    public static final String BACKSTAGE_NAME = "Backstage passes to a TAFKAL80ETC concert";
    public int backstageSellIn ;
    public int backstageQuality ;

    public Backstage(int sellIn, int quality)
    {
        super(BACKSTAGE_NAME, sellIn, quality);
        backstageSellIn = sellIn;
        backstageQuality = quality;
    }

    public void update()
    {

        if(backstageSellIn > 10 ) backstageQuality = Math.min(50 ,backstageQuality + 1);
        else if(backstageSellIn > 5) backstageQuality = Math.min(50 ,backstageQuality + 2);
        else if(backstageSellIn > 0) backstageQuality = Math.min(50 ,backstageQuality + 3);
        else backstageQuality = 0;
        backstageSellIn = backstageSellIn - 1;
    }


}
