package add_two_numbers_0002

import spock.lang.Specification

class SolutionSpec extends Specification {
    def "AddTwoNumbers"() {
        expect:
        sum == toNum(new Solution().addTwoNumbers(toListNode(num1), toListNode(num2)))
        where: "不同数据:"
        num1 || num2    || sum
        0    || 0       || 0
        111  || 222     || 333
        9999 || 9999999 || 10009998
        1230 || 123     || 1353
    }

    def "GenerateListNode"() {
        def num = 123
        def numListNode = toListNode(num)
        expect:
        numListNode.val == 3
        numListNode.next.val == 2
        numListNode.next.next.val == 1
    }

    def "ToNum"() {
        expect:
        123 == toNum(toListNode(123))
    }

    int toNum(ListNode head) {
        int num = head.val
        head = head.next
        int scale = 10
        while (head != null) {
            num = head.val * scale + num
            scale = scale * 10
            head = head.next
        }
        return num
    }

    ListNode toListNode(int num) {
        // 用于存储链表的头部
        ListNode head = null
        // 用于追踪链表的当前位置
        ListNode current = null
        num.toString().reverse().each { String digit ->
            // 将字符转换为数字
            int val = digit as Integer
            // 创建新的节点
            ListNode newNode = new ListNode(val)
            if (head == null) {
                // 如果这是第一个节点，初始化头部
                head = newNode
                current = newNode
            } else {
                // 否则，添加到链表的末尾
                current.next = newNode
                current = newNode
            }
        }
        return head
    }
}
