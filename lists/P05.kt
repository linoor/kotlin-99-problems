package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test
import java.util.*

/**
 * Created by linoor on 12/30/16.
 */

fun <T> reverse(list: List<T>): List<T> {
    if (list.size <= 1) return list
    else return reverse(list.dropLast(1)) + list.first()
}

class P05Test {
    @Test fun `reverses the list`() {
        assertThat(reverse(listOf(1, 1, 2, 3, 5, 8)), equalTo(listOf(8, 5, 3, 2, 1, 1)))
    }
}