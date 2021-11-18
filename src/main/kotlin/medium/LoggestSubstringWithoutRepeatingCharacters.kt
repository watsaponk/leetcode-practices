package medium

fun main() {
    println("Input: s = \"abcabcbb\"")
    println("Output: ${lengthOfLongestSubstring("abcabcbb")}")
    println("----------------------------------")
    println("Input: s = \"bbbbb\"")
    println("Output: ${lengthOfLongestSubstring("bbbbb")}")
    println("----------------------------------")
    println("Input: s = \"pwwkew\"")
    println("Output: ${lengthOfLongestSubstring("pwwkew")}")
    println("----------------------------------")
    println("Input: s = \"au\"")
    println("Output: ${lengthOfLongestSubstring("au")}")
    println("----------------------------------")
    println("Input: s = \"dvdf\"")
    println("Output: ${lengthOfLongestSubstring("dvdf")}")
    println("----------------------------------")
}

fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty() || s.length >= 50_000) return 0

    var longest = 1
    var count = 0
    val current = mutableListOf<Char>()
    for (i in s.indices) {
        if (!current.contains(s[i])) {
            current.add(s[i])
            count++
        } else {
            current.clear()
            current.add(s[i])
            count = 1
        }

        longest = count.coerceAtLeast(longest)
    }

    return longest
}
