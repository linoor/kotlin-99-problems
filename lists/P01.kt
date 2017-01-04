package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by linoor on 12/30/16.
 */

fun <T> last(list: List<T>): T {
    if (list.size == 1) {
        return list.first()
    } else {
        return last(list.drop(1))
    }
}

class P01Test {
    @Test fun `find the last element of list`() {
        assertThat(last(listOf(1, 1, 2, 3, 5, 8)), equalTo(8))
    }
}