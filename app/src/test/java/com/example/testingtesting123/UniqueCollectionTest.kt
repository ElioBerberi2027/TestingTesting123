package com.example.testingtesting123

import junit.framework.TestCase.assertTrue
import org.junit.Before
import org.junit.Test

class UniqueCollectionTest {

    lateinit var collection: UniqueCollection

    @Before
    fun setUp() {
        collection = UniqueCollection()
    }


    // TODO 1: Write a test to ensure items can be added to the collection
    @Test
    fun addAnItem() {
        val item1 = Item("RAH RAH RAH")
        val item2 = Item("5")

        assertTrue(collection.size() == 0)

        collection.addItem(item1)
        collection.addItem(item2)

        assertTrue(collection.size() == 2)
        assertTrue(collection.get(0).name == "RAH RAH RAH")
        assertTrue(collection.get(1).name == "5")
    }

    // TODO 2: Write a test to ensure that only unique items can be added to the collection
    // Uniqueness is determined by the Item.name property, which is set via the constructor
    @Test
    fun addUniqueItem() {
        val item1 = Item("Duplicate")
        val item2 = Item("Duplicate")

        collection.addItem(item1)
        collection.addItem(item2)

        assertTrue(collection.size() == 1)
    }

    // Test Driven Development (TDD) test - complete specified function so that this test passes
    @Test
    fun clearAllItems() {
        collection.addItem(Item("item1"))
        collection.addItem(Item("Item2"))

        val originalSize = collection.size()
        collection.clear()
        val newSize = collection.size()

        assert(originalSize == 2 && newSize == 0) {"Items not cleared"}
    }
}