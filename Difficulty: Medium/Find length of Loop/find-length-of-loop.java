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
    public int lengthOfLoop(Node head) {
        // code here
      Node slow = head,fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return countNodeslnLoop(slow);
            }
        }
        return 0;
    }
    private static int countNodeslnLoop(Node nodelnLoop){
    int count = 1;
    Node temp = nodelnLoop.next;
    while(temp != nodelnLoop){
        count++;
        temp = temp.next;
    }
    return count;
}
}