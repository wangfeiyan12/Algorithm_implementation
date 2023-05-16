package xju.algorithm;

public class ReverseList {
    public static void main(String[] args) {
        ListNode l5 = new ListNode(5, null);
        ListNode l4 = new ListNode(4, l5);
        ListNode l3 = new ListNode(3, l4);
        ListNode l2 = new ListNode(2, l3);
        ListNode l1 = new ListNode(1, l2);
        ListNode ans = reverseList3(l1);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x, ListNode next) {
            this.val = x;
            this.next = next;
        }
    }

    // 以下两种实现都是迭代算法
    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode reverseList2(ListNode head) {
        // 首先定义出口条件,
        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null, next = null, curr = head;
        // 注意这里的循环退出条件不能设置为 next == null，因为 next的初始值设置为null
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // 算法reverseList3采用的是递归算法
    // 递归算法的核心就是给出递归函数 准确、明确的定义
    // 该函数的定义为：对于给定head的链表，对进行翻转
    public static ListNode reverseList3(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 注意下面这个函数执行完毕后，虽然以head.next为头的链表完成的翻转，但head.next所指向的ListNode对象并没有改变
        ListNode newHead = reverseList3(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

}
