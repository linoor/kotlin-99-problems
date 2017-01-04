package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by linoor on 12/30/16.
 */

@Suppress("UNCHECKED_CAST")
fun flatten(list: List<Any>): List<Any> {
    return list.flatMap {
        if (it is List<*>) flatten(it as List<Any>) else listOf(it)
    }
}

class P07Test {
    @Test fun `flattens the list`() {
        assertThat(flatten(listOf(listOf(1, 1), 2, listOf(3, listOf(5, 8)))), equalTo(listOf<Any>(1,1,2,3,5,8)))
    }
}