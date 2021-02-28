package leetcode;

public class question_92 {
    /**
     * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
     *
     * 说明:
     * 1 ≤ m ≤ n ≤ 链表长度。
     *
     * 示例:
     *
     * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
     * 输出: 1->4->3->2->5->NULL
     *
     */
    public static void main(String[] args) {
        ListNode test = new ListNode() ;
        ListNode res = reverseBetween(test,2,4);
    }

    static ListNode successor = null;
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (left==1) {
            // 相当于反转前n个
            return reverseN(head, right);
        }
        head.next = reverseBetween(head, left-1,right-1);
        return head;
    }

    public static ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }
        ListNode last = reverseN(head, n-1);
        // 1->2->1
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
