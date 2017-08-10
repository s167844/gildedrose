package net.praqma.codeacademy.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {
//Dette er en test
    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

}
