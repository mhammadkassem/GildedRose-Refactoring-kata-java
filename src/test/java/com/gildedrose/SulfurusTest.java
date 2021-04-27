package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SulfurusTest
{


    @Test
    public void SulfurusQualityIsFixed()
    {
        Sulfurus sulfurus = new Sulfurus(10);
        sulfurus.update();
        assertEquals(80,sulfurus.SULFURUS_QUALITY);

    }

}
