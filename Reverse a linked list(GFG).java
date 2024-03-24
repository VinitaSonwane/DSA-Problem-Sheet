
class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
       Node prev = null;
       Node current = head ;
        while(current != null){
            Node temp = current.next;
            current.next = prev ;
            prev = current ;
            current = temp ; 
        }
        head = prev ; 
        return head ;
    }
}
