package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgedBrieTest
{
    @Test
    void agedBriesQualityIncreases()
    {
        AgedBrie agedBrie = new AgedBrie(10,10);
        agedBrie.update();
        assertEquals(11,agedBrie.agedBrieQuality);
    }

    @Test
    void agedBriesQualityIncreasesTwiceIfSellinZero()
    {
        AgedBrie agedBrie = new AgedBrie(1,49);
        agedBrie.update();
        assertEquals(50,agedBrie.agedBrieQuality);
    }


}
