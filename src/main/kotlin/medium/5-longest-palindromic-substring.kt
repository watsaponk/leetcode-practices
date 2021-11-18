package medium

fun main() {

}

fun longestPalindrome(s: String): String {
    if (s.isEmpty() || s.length > 1000) return ""

    return if (s == s.reversed()) {
        s
    } else if (s.length == 2) {
        s.first().toString()
    } else {
        val len = s.length - 1
        var index = 0
        while (index <= len) {
            val left = index
            
        }
        ""
    }
}