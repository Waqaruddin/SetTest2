package com.example.settest3

import junit.framework.Assert
import junit.framework.Assert.assertEquals
import org.junit.Test

//Set Implementation using array
//TDD pair programming

//Test MySet
//requirements:

//Sprint 1
//MySet should be be empty if no elements are added
//MySet should be be NOT empty if elements are added
//MySet should be able to add elements
//MySet should not add duplicate elements

//Sprint 2
//MySet should be able to remove an element



//add to Jira backlog
//better to have addAll to MySet
class MySetTest {
    @Test
    fun test() {

        //aaa pattern

        //arrange
        //act
        //assert

        //arrange
        val mySet = MySet()

        //act
        val actual = mySet.isEmpty()
        val expected = true

        //assert
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val mySet = MySet()
        mySet.add(10)
        val actual = mySet.isEmpty()
        val expected = false
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val mySet = MySet()
        val actual = mySet.add(10)
        val expected = true
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val mySet = MySet()
        val actual1 = mySet.add(10)
        val actual2 = mySet.add(20)
        val expected1 = true
        val expected2 = true
        Assert.assertEquals(expected1, actual1)
        Assert.assertEquals(expected2, actual2)
    }

    @Test
    fun test5() {
        val mySet = MySet()
        mySet.add(10)
        mySet.add(20)
        val actual = mySet.isEmpty()
        val expected = false
        Assert.assertEquals(expected, actual)
    }

    //size
    @Test
    fun test6() {
        val mySet = MySet()
        mySet.add(10)
        mySet.add(20)
        val actual = mySet.size()
        val expected = 2
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test7() {
        val mySet = MySet()
        mySet.add(10)
        mySet.add(20)
        mySet.add(30)
        val actual = mySet.size()
        val expected = 3
        Assert.assertEquals(expected, actual)
    }

    //addAll
    //added to backlog


    //test to check duplicates
    @Test
    fun test8() {
        val mySet = MySet()
        mySet.add(10)
        mySet.add(10)
        val actual = mySet.size()
        val expected = 1
        Assert.assertEquals(expected, actual)
    }

    @Test
    fun test9() {
        val mySet = MySet()
        mySet.add(10)
        val actual = mySet.contains(10)
        val expected = true
        assertEquals(expected, actual)
    }

    @Test
    fun test10() {
        val mySet = MySet()
        val actual = mySet.contains(10)
        val expected = false
        assertEquals(expected, actual)
    }

    @Test
    fun test11() {
        val mySet = MySet()
        mySet.add(10)
        val actual = mySet.contains(20)
        val expected = false
        assertEquals(expected, actual)
    }

    @Test
    fun test12() {
        val mySet = MySet()
        val actual = mySet.remove(10)
        val expected = false
        assertEquals(expected, actual)
    }



    @Test
    fun test13() {
        val mySet = MySet()

        val actual = mySet.addAll()
        val expected = false
        assertEquals(expected, actual)
    }


    //todo
    //remove
    //addAll
    //removeAll

}