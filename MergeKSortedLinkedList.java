class Solution {

    // Function to merge two sorted lists
    public Node mergeTwoLists(Node head1, Node head2) {
        if (head1 == null) return head2;
        if (head2 == null) return head1;

        Node dummy = new Node(-1);
        Node current = dummy;

        Node temp1 = head1;
        Node temp2 = head2;

        while (temp1 != null && temp2 != null) {
            if (temp1.data <= temp2.data) {
                current.next = temp1;
                temp1 = temp1.next;
            } else {
                current.next = temp2;
                temp2 = temp2.next;
            }
            current = current.next;
        }

        if (temp1 != null) current.next = temp1;
        if (temp2 != null) current.next = temp2;

        return dummy.next;
    }

    // Function to merge k sorted linked lists
    public Node mergeKLists(List<Node> arr) {
        if (arr == null || arr.size() == 0) return null;

        Node head = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            head = mergeTwoLists(head, arr.get(i)); // Correctly update the outer head
        }

        return head;
    }
}
