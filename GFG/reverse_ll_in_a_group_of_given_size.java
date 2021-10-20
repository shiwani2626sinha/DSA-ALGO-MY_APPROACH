/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}
*/
class GfG
{
    public static Node reverse(Node node, int k)
    {
        //Your code here
        Node curr=node,prv=null,next=null;int cnt=0;
        while(curr!=null && cnt<k)
        {
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
            cnt++;
        }
        if(curr!=null)
        {
            node.next=reverse(curr,k);
        }
        return prv;
    }
}
