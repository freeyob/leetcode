package add_two_numbers_0002

/**
 * Example:
 * var li = two_sum_0001.ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: two_sum_0001.ListNode? = null
 * }
 */
class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode {
        var l1Pos: ListNode? = l1
        var l2Pos: ListNode? = l2
        var end = false
        var bit = 0
        val result = ListNode(0)
        var resultPos = result
        while (!end) {
            val sum = (l1Pos?.`val` ?: 0) + (l2Pos?.`val` ?: 0) + bit
            if (sum > 9) {
                resultPos.`val` = sum - 10
                bit = 1
            }else{
                resultPos.`val` = sum
                bit = 0
            }
            l1Pos = l1Pos?.next
            l2Pos = l2Pos?.next
            if (l1Pos == null && l2Pos == null && bit == 0) {
                end = true
            } else {
                end = false
                resultPos.next = ListNode(0)
                resultPos = resultPos.next!!
            }
        }
        return result
    }
}
class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
