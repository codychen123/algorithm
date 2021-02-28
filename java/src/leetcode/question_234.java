package leetcode;

public class question_234 {
    static ListNode left;
    public boolean isPalindrome(ListNode head) {
        left = head;
        return reverse(left);
    }
    public boolean reverse(ListNode right) {
        if (right==null) return true;
        boolean res = reverse(right.next);
        res = res && (right.val == left.val);
        left = left.next;
        return res;
    }
}
