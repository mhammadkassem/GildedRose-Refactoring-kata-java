package com.gildedrose;

public class ItemBuilder extends Item
{

    public String name;

    public int sellIn;

    public int quality;

    //Item item;
    //ItemBuilder itemBuilder = new Item(name,sellIn,quality);

    public ItemBuilder(String name, int sellIn, int quality)
    {
        super(name, sellIn, quality);
        this.name= name;
        this.sellIn = sellIn;
        this.quality = quality;

    }


    public void update()
    {
        if(sellIn == 0) quality = Math.max(0,quality -2);
        else quality = Math.max(0,quality -1);
        sellIn = sellIn - 1;
    }

//    static ItemBuilder buildItem(Item item){
//        if(item.name.equals("Aged Brie"))
//        {
//            return new AgedBrie(item.sellIn, item.quality);
//        }
//        else if(item.name.equals(("Sulfuras, Hand of Ragnaros")))
//        {
//            return new Sulfurus(item.sellIn);
//        }
//        else if(item.name.equals(("Backstage passes to a TAFKAL80ETC concert")))
//        {
//            return new Backstage(item.sellIn,item.quality);
//        }
//        else if(item.name.equals(("Conjured Mana Cake")))
//        {
//            return new Conjured(item.sellIn, item.quality);
//        }
//        else return new ItemBuilder(item.name, item.sellIn, item.quality);
//    }
}
