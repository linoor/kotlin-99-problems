package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

/**
 * Created by linoor on 12/30/16.
 */

fun <T> length(list: List<T>): Int {
    if (list.size == 1) return 1
    else return 1 + length(list.dropLast(1))
}

class P04Test {
    @Test fun `find the length of the list`() {
        assertThat(length(listOf(1, 1, 2, 3, 5, 8)), equalTo(6))
    }

    @Test(expected = NoSuchElementException::class)
    fun `Nth element outside of list size`() {
        nth(100, listOf<Int>(1,1,2,3,5,8))
    }
}