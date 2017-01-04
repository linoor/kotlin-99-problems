package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by linoor on 12/30/16.
 */

fun <T> pack(list: List<T>): List<List<T>> {
    if (list.isEmpty()) return emptyList()
    else {
        val packed = list.takeWhile { it == list.first() }
        return listOf(packed) + pack(list.drop(packed.size))
    }
}

class P09Test {
    @Test fun `packes the list`() {
        assertThat(pack("aaaabccaadeeee".toList()),
                equalTo(listOf(
                        listOf('a', 'a', 'a', 'a'),
                        listOf('b'),
                        listOf('c', 'c'),
                        listOf('a', 'a'),
                        listOf('d'),
                        listOf('e', 'e', 'e', 'e'))))
    }
}