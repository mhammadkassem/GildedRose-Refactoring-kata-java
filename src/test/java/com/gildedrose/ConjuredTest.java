package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConjuredTest
{

    @Test
    void conjuredQualityDegradesTwiceFaster()
    {

        Conjured conjured = new Conjured(0,5); // 5 degrades to 1 since sellin = 0
        conjured.update();
        assertEquals(1,conjured.conjuredQuality);

        Conjured conjured2 = new Conjured(1,5);// 5 degrades to 3 since sellin > 0
        conjured2.update();
        assertEquals(3,conjured2.conjuredQuality);
    }
}
