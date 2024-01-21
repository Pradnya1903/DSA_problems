import java.util.*;

class LL {
  Node head;
    class Node
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    void addFirst(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
          head=newnode;
          return ;
        }
      newnode.next=head;
      head=newnode;


    }

    void addLast(String data)
    {
    Node currnode=new Node(data);
    if(head==null)
    {
   head=currnode;
   return;
    }

    Node last=head;
   while(last.next!=null)
    {
    last=last.next;
    }
    last.next=currnode;
    }


    void printList()
        {
            Node traverse=head;
            if(head==null)
            {
                System.out.println("linked list is empty");
                return ;
            }
           
              while(traverse!=null)
                {
                    System.out.print(traverse.data +"-> ");
               traverse=traverse.next;
                }
               System.out.println("null");
        }
    

  public static void main(String args[])
  {
    LL list=new LL();
    list.addFirst("name");
    list.addLast("is");
    list.printList();
  }
}