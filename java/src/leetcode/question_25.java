package leetcode;

public class question_25 {
    public static void main(String[] args) {

    }
    public static ListNode reverseKGroup(ListNode head, int k) {
        if (head == null) return head;
        ListNode a, b;
        a=b=head;
        for (int i = 0; i < k; i++) {
            if (b==null) return head;
            b = b.next;
        }
        ListNode newHead = reverse(a, b);
        a.next = reverseKGroup(b,k);
        return newHead;
    }

    public static ListNode reverse(ListNode a, ListNode b) {
        ListNode pre, cur, nxt;
        pre = null; cur = a; nxt = a;
        while (cur != b) {
            nxt = cur.next;
            // 指针反向
            cur.next = pre;
            // 更新指针位置
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
