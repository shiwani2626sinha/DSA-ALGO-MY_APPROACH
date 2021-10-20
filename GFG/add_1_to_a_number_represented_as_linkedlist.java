/*Complete the given Function
Node is as follows
class Node{
int data;
Node next;
Node(int d){
data=d;
next=null;
} 
}*/
class GfG{
	public Node addOne(Node head){
            //add code here.
            Node temp=head;
            Node prv=null,next=null;
           /* while(temp!=null)
            {
                next=temp.next;
                temp.next=prv;
                prv=temp;
                temp=next;
            }
            head=prv;*/
            Node k=head;int carry=1;
            while(k!=null)
            {
                if(k.data+carry<10)
                {
                    k.data=k.data+carry;
                    carry=0;
                    break;
                }
                else
                {   int n=(k.data+carry)/10;
                    k.data=(k.data+carry)%10;
                    carry=n;
                    k=k.next;
                }   
                
            }
            temp=head;
            prv=null;next=null;
            while(temp!=null)
            {
                next=temp.next;
                temp.next=prv;
                prv=temp;
                temp=next;
            }
            head=prv;
            return head;
            
         }
}
