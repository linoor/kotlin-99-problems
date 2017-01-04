package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by linoor on 12/30/16.
 */

fun <T> compress(list: List<T>): List<T> {
    return list.fold(emptyList()) { acc, next ->
        if (acc.isEmpty() || acc.last() != next) acc + next
        else acc
    }
}

class P08Test {
    @Test fun `compresses the list`() {
        assertThat(compress(compress("aaaabccaadeeee".toList())), equalTo("abcade".toList()))
    }
}