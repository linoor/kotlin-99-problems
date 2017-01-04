package my.solutions.lists

import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.Test

/**
 * Created by linoor on 12/30/16.
 */

fun <T> isPalindrome(list: List<T>): Boolean {
    if (list.size == 1) return true
    else if (list.first() != list.last()) return false
    else return isPalindrome(list.drop(1).dropLast(1))
}

class P06Test {
    @Test fun `isPalindromes the list`() {
        assertThat(isPalindrome(listOf(1, 2, 3, 2, 1)), equalTo(true))
        assertThat(isPalindrome(listOf(1, 2, 3, 1, 1)), equalTo(false))
    }
}