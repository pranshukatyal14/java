public class questions{
    public class Node{
        int data;
        Node next;
    }
    Node head=null;
    Node tail=null;

    public int mid(){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow.data;
    }
    public int secondMid(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return slow.data
    }
    public void reversePI(){
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            Node forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        tail=head;
        head=prev;
    }
    public Node getNodeAt(int idx){
        Node curr=head;
        while(idx-->0){
            curr=curr.next;
        }
        return curr;
    }
    public int length(){
        int len=0;
        Node curr=head;
        while(curr!=null){
            curr=curr.next;
            len++;
        }
        return len;
    }
    public void reverseDI(){
        int i=0;
        int j=length()-1;
        while(i<j){
            Node in=getNodeAt(i);
            Node jn=getNodeAt(j);
            int temp=in.data;
            in.data=jn.data;
            jn.data=temp;
            i++;
            j--;

        }
    }
    public void displayReverseHelper(Node node){
        if(node==null){
            return;
        }
        displayReverseHelper(node.next);
        System.out.print(node.data+" ");
    }
    private void reversePRHelper(Node node){
        if(node.next==null){
            Node temp=head;
            head=tail;
            tail=temp;
            return;
        }
        reversePRHelper(node.next);

        Node forw=node.next;
        forw.next=node;
    }
    public void reversePR(){
        reversePrHelper(head);
        tail.next=null;
        
    }
    private Node reversePRHelper2(Node node){
        if(node.next==null){
            Node temp=head;
            head=tail;
            tail=temp;
            return node;
        }
        Node rNode=reversePRHelper2(node.next);
        rnode.next=node;
        node.next=null;
        return node;
    }
    public int kthFromLast(int k){
        Node slow=head;
        Node fast=head;
        while(k-->0){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow.data;
    }
    public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2){
        Node c1=l1.head;
        Node c2=l2.head;
        LinkedList ans=new LinkedList();
        while(c1!=null && c2!=null){
            if(c1.data<c2.data){
                ans.addLast(c1.data);
                c1=c1.next;
            }else{
                ans.addLast(c2.data);
                c2=c2.next;
            }
        }
        while(c1!=null){
            ans.addLast(c1.data);
            c1=c1.next;
        }
        while(c2!=null){
            ans.addLast(c2.data);
            c2=c2.next;
        }
        return ans;
    }
    public static Node midNode(Node head){
        Node slow=head;
        Node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public static LinkedList mergeSort(Node head,Node tail){
        if(head==tail){
            LinkedList base=new LinkedList();
            base.addLast(head.data);
            return base;
        }
        Node mid=midNode(head);
        Node head1=head;
        Node tail1=mid;
        Node head2=mid.next;
        Node tail2=tail;
        mid.next=null;
        LinkedList fistHalf=mergeSort(Node head1,Node tail1);
        LinkedList secondHalf=mergeSort(Node head2,Node tail2);
        mid.next=head2;
        return mergeTwoSortedLists(fistHalf,secondHalf);
    }
    public static LinkedList addTwoLists(LinkedList one,LinkedList two){
        one.reversePI();
        two.reversePI();

        LinkedList ans=new LinkedList();
        Node c1=one.head;
        Node c2=two.head;
        int carry=0;
        while(c1!=null || c2!=null || carry!=0){
            int sum=(c1!=null? c1.data:0)+ (c2!=null?c2.data:0)+carry;
            carry=sum/10;
            sum=sum%10;
            ans.addFirst(sum);
            if(c1!=null){
                c1=c1.next;
            }
            if(c2!=null){
                c2=c2.next;
            }
        }
        one.reversePI();
        two.reversePI();
        return ans;
    }
    public static int addTwoLists(Node node1,Node node2,int s1,int s2,LinkedList ans){
        if(s1==0 && s2==0){
            return 0;
        }
        if(s1>s2){
            int carry=addTwoLists(node1.next,node2,s1-1,s2,ans);
            int sum=carry+node1.data+0;
            carry=sum/10;
            sum=sum%10;
            ans.addFirst(sum);
            return carry;
        }else{
            int carry=addTwoLists(node1.next,node2.next,s1-1,s2-1,ans);
            int sum=carry+node1.data+node2.data;
            carry=sum/10;
            ans.addFirst(sum%10);
            return carry;
        }

    }
    public static LinkedList addTwoLists(LinkedList one,LinkedList two){
        LinkedList ans=new LinkedList();
        int carry=0;
        if(one.size()>two.size()){
            carry=addTwoLists(one.head,two.head,one.size(),two.size(),ans);
        }else{
            carry=addTwoLists(two.head,one.head,two.size(),one.size(),ans);
        }
        if(carry==1){
            ans.addFirst(1);
        }
        return ans;
    }
    
}