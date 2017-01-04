package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by linoor on 12/30/16.
 */

fun <T> penultimate(list: List<T>): T {
    if (list.size == 2) {
        return list.first()
    } else if (list.size <= 1) {
        throw Exception("List too small")
    } else {
        return penultimate(list.drop(1))
    }
}

class P02Test {
    @Test fun `find the penultimate element of list`() {
        assertThat(penultimate(listOf(1, 1, 2, 3, 5, 8)), equalTo(5))
    }
}