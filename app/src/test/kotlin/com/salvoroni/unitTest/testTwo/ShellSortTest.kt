package com.salvoroni.unitTest.testTwo

import com.salvoroni.unitTest.sort.*
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.Assert;

class ShellSortTest {
    @Test fun resultsTest() = assertAll(
        {
            val testArr: IntArray = intArrayOf(41,23,456,22,7,1,2,9)
            val expected: IntArray = intArrayOf(1,2,7,9,22,23,41,456)
            shellSort(testArr)
            Assert.assertArrayEquals(expected, testArr)
        },{
            val testArr: IntArray = intArrayOf(34,123,1,22,55,12,50,4)
            val expected: IntArray = intArrayOf(1,4,12,22,34,50,55,123)
            shellSort(testArr)
            Assert.assertArrayEquals(expected, testArr)
        },{
            val testArr: IntArray = intArrayOf(9,1,8,2,7,3,6,4)
            val expected: IntArray = intArrayOf(1,2,3,4,6,7,8,9)
            shellSort(testArr)
            Assert.assertArrayEquals(expected, testArr)
        },
    )

    val midTestArr: IntArray = intArrayOf(23, 12, 1, 8, 34, 54, 2, 3)

    @Test fun middleTest() = assertAll(
        {
            val expected: IntArray = intArrayOf(23, 12, 1, 3, 34, 54, 2, 8)
            stepShellSort(midTestArr, 4, 8)
            Assert.assertArrayEquals(expected, midTestArr)
        },{
            val expected: IntArray = intArrayOf(1, 3, 2, 8, 23, 12, 34, 54)
            stepShellSort(midTestArr, 2, 8)
            Assert.assertArrayEquals(expected, midTestArr)
        },{
            val expected: IntArray = intArrayOf(1, 2, 3, 8, 12, 23, 34, 54)
            stepShellSort(midTestArr, 1, 8)
            Assert.assertArrayEquals(expected, midTestArr)
        }
    )
}