package main;

public class Program {

    public static void main(String[] args) {

        // Ex 1
        ListNode l1 = buildList(new int[]{2, 4, 3});
        ListNode l2 = buildList(new int[]{5, 6, 4});
        ListNode result = Solution.addTwoNumbers(l1, l2);
        printList(result);
        
        // Ex 2
        l1 = buildList(new int[]{0});
        l2 = buildList(new int[]{0});
        result = Solution.addTwoNumbers(l1, l2);
        printList(result);

        // Ex 3
        l1 = buildList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = buildList(new int[]{9, 9, 9, 9});
        result = Solution.addTwoNumbers(l1, l2);
        printList(result);
        
    }

    private static ListNode buildList(int[] values) {
    	
        ListNode head = null;
        ListNode current = null;

        for (int i = 0; i < values.length; i++) {
        	
            if (head == null) {
                head = new ListNode(values[i]);
                current = head;
            } else {
                current.next = new ListNode(values[i]);
                current = current.next;
            }
        }
        
        return head;
    }

    private static void printList(ListNode node) {
    	
        System.out.print("[");
        
        while (node != null) {
            System.out.print(node.val);
            
            if (node.next != null) {
            	System.out.print(",");
            }
            
            node = node.next;
        }
        
        System.out.println("]");
    }
    
}
