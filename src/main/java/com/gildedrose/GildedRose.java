package com.gildedrose;

class GildedRose
{
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES_TO_CONCERT = "Backstage passes to a TAFKAL80ETC concert";
    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String CONJURED = "Conjured Mana Cake";
    Item[] items;
    public GildedRose(Item[] items)
    {
        this.items = items;
    }

    public void updateQuality()
    {

        for (int i = 0; i < items.length; i++)
        {
            String itemName = items[i].name;
            //int items[i].quality = items[i].quality;
            //int items[i].sellIn = items[i].sellIn;


            if (!itemName.equals(AGED_BRIE) && !itemName.equals(BACKSTAGE_PASSES_TO_CONCERT))
            {
                if (items[i].quality > 0)
                {
                    if (!itemName.equals(SULFURAS))
                    {
                        if(!itemName.equals(CONJURED))
                        {
                            items[i].quality = items[i].quality - 1;
                        }
                        else items[i].quality = items[i].quality - 2;

                    }
                }
            } 
            else
            {
                if (items[i].quality < 50)
                {
                    items[i].quality = items[i].quality + 1;
                    if (itemName.equals(BACKSTAGE_PASSES_TO_CONCERT))
                    {
                        if (items[i].sellIn < 11)
                        {
                            if (items[i].quality < 50)
                            {
                                items[i].quality = items[i].quality + 1;
                            }
                        }

                        if (items[i].sellIn < 6)
                        {
                            if (items[i].quality < 50)
                            {
                                items[i].quality = items[i].quality + 1;
                            }
                        }
                    }
                }
            }

            if (!itemName.equals(SULFURAS))
            {
                items[i].sellIn = items[i].sellIn - 1;
            }

            if (items[i].sellIn < 0)
            {
                if (!itemName.equals(AGED_BRIE))
                {
                    if (!itemName.equals(BACKSTAGE_PASSES_TO_CONCERT))
                    {
                        if (items[i].quality > 0)
                        {
                            if (!itemName.equals(SULFURAS))
                            {
                                items[i].quality = items[i].quality - 1;
                            }
                        }
                    } else
                    {
                        items[i].quality = items[i].quality - items[i].quality;
                    }
                }
                else
                {
                    if (items[i].quality < 50)
                    {
                        items[i].quality = items[i].quality + 1;
                    }
                }
            }
        }
    }
}