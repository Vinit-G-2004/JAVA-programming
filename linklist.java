public class linklist {
    public static class Node{
        int data;
        Node next;

        public Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        //step1= create new node
        Node newNode= new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        //step2= newNode next=head
        newNode.next=head;//link

        //step3= head=newNode
        head=newNode;

    }

    public void addLast(int data){
        //step1= create a new node
        Node newNode=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=newNode;
            return;
        }

        //step2 tail.next=newNode
        tail.next= newNode;

        //step3= tail=newnode;
        tail=newNode;
    } 

    public void addMiddle(int index,int data)
    {
        Node newNode= new Node(data);
        Node temp=head;
        int i=0;
        while(i<index-1)
        {
            temp=temp.next;
            i++;
        }
        //i=index-1-> prev
        newNode.next=temp.next;
        size++;
        temp.next=newNode;
    }

    public void print()
    {
        if(head==null)
        {
            System.out.println("linked list is empty!!");
        }
        Node temp= head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public int removeFirst()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
        }else if(size==1)
        {
            int val = head.data;
            head = tail=null;
            return val;
        }
        int val = head.data;
        head=head.next;
        return val;
    }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("LL is empty");
        }else if(size==1)
        {
            int val = head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++)
        {
            prev=prev.next;
        }
        int val= prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }
    public static void main(String[] args) {
        linklist ll=new linklist();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addMiddle(2, 5);
        ll.print();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
    }
}
