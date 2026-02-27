/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node reverseList(Node head) {
        // code here
        
        Node curr = head, prev = null,next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

static void printList(Node node){
    while(node != null){
        System.out.print(node.data);
    if(node.next != null){
        System.out.print("->");
    }
        node = node.next;
    }
}
}