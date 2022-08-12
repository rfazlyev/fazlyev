// Добрый день, все задания с вашего позволения буду делать на Kotlin

import org.junit.Assert
import org.junit.Test

class MainClassTest : MainClass() {

    //Задание 1

    @Test
    fun testGetLocalNumber() {
        Assert.assertTrue("Number ${getLocalNumber()} != 14", getLocalNumber() == 14)
    }

    //Задание 2

    @Test
    fun testGetClassNumber() {
        Assert.assertTrue("Number ${getClassNumber()} < 45 ", getClassNumber() > 45)
    }

    //Задание 3

    @Test
    fun testGetClassString() {
        Assert.assertTrue("Word Hello not found", getClassString().contains(Regex("[hH]ello")))
    }
}
