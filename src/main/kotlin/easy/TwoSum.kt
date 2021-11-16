package easy

fun main() {
    println("Input: nums = [2,7,11,15], target = 9")
    println("Output: ${twoSum(intArrayOf(2, 7, 11, 15), 9).toList()}")
    println("------------------------------------------")
    println("Input: nums = [3,2,4], target = 6")
    println("Output: ${twoSum(intArrayOf(3, 2, 4), 6).toList()}")
    println("------------------------------------------")
    println("Input: nums = [3,3], target = 6")
    println("Output: ${twoSum(intArrayOf(3, 3), 6).toList()}")
    println("------------------------------------------")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    var index = 0
    var additionalNumIndex = 0
    var currentResult: Int? = null
    val inputLen = nums.count() - 1
    while (index <= inputLen) {
        if (index == additionalNumIndex) {
            additionalNumIndex = index + 1
        }

        currentResult = nums[index] + nums[additionalNumIndex]

        if (currentResult == target)
            break

        if (additionalNumIndex == inputLen) {
            index++
            additionalNumIndex = 0
        } else {
            additionalNumIndex++
        }
    }

    return if (currentResult == target) {
        intArrayOf(index, additionalNumIndex)
    } else {
        intArrayOf()
    }
}