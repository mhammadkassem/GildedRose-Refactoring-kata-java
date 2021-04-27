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
//        for(int i =0; i<items.length; i++)
//        {
//            this.items[i] = ItemBuilder.buildItem(items[i]);
//            //ItemBuilder.buildItem(items[i]);
//        }
        this.items = items;

    }


    public void updateQuality()
    {
        for(int i =0; i < items.length; i++)
        {
            //items[i].update();
            String itemName = items[i].name;
            int itemSellIn = items[i].sellIn;
            int itemQuality = items[i].quality;
            //ItemBuilder itemBuilder = new ItemBuilder(itemName,itemSellIn,itemQuality);

            if(itemName == AGED_BRIE)
            {
                //ItemBuilder agedBrie2 = new AgedBrie(itemSellIn,itemQuality);
                AgedBrie agedBrie = new AgedBrie(itemSellIn,itemQuality);
                agedBrie.update();
                items[i].sellIn = agedBrie.agedBrieSellIn;
                items[i].quality = agedBrie.agedBrieQuality;

            }
            else if(itemName == SULFURAS)
            {
                Sulfurus sulfurus = new Sulfurus(itemSellIn);
                sulfurus.update();
                items[i].sellIn = sulfurus.sulfurusSellIn;
            }
            else if(itemName == BACKSTAGE_PASSES_TO_CONCERT)
            {
                Backstage backstage = new Backstage(itemSellIn,itemQuality);
                backstage.update();
                items[i].sellIn = backstage.backstageSellIn;
                items[i].quality = backstage.backstageQuality;
            }

            else if(itemName == CONJURED)
            {
                Conjured conjured = new Conjured(itemSellIn,itemQuality);
                conjured.update();
                items[i].sellIn = conjured.conjuredSellIn;
                items[i].quality = conjured.conjuredQuality;
            }

            else
            {
                ItemBuilder differentItem = new ItemBuilder(items[i].name,itemSellIn,itemQuality);
                differentItem.update();
                items[i].sellIn = differentItem.sellIn;
                items[i].quality = differentItem.quality;
            }
        }
    }
}