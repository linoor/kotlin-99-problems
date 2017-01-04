package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

/**
 * Created by linoor on 12/30/16.
 */

fun <T> nth(i: Int, list: List<T>): T {
    if (i == 0) return list.first()
    else return nth(i-1, list.dropLast(1))
}

class P03Test {
    @Test fun `find the nth element of list`() {
        assertThat(nth(2, listOf(1, 1, 2, 3, 5, 8)), equalTo(2))
    }

    @Test(expected = NoSuchElementException::class)
    fun `Nth element outside of list size`() {
        nth(100, listOf<Int>(1,1,2,3,5,8))
    }
}