package LinkedList.SinglyLinkedList;
import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLInkedLists {
    Node head = null;
    Scanner s = new Scanner(System.in);

    public void create(int n){
        int data;
        Node newNode;
        Node ptr = null;

        for(int i=0;i<n;i++){
            System.out.println("Enter data for Node "+(i+1)+":");
            data = s.nextInt();
            newNode = new Node(data);

            if(head == null){
                head = newNode;
            }
            else{
                ptr.next = newNode;
            }
            ptr = newNode;
        }
    }

    public void display(){
        Node temp = head;
        System.out.println();
        while(temp!=null){
            System.out.print(temp.data + ">>");
            temp = temp.next;
        }
        System.out.println();
    }

    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void insertAtBetween(int pos,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteAtBeg(){
        if(head.next == null) {
            return;
        }
        head = head.next;
    }

    public void deleteAtEnd(){
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void deleteAtPos(int pos){
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void sort(){
        Node p,q;
        int temp;

        for(p=head;p!=null;p=p.next){
            for(q=p;q!=null;q=q.next){
                if(p.data>q.data){
                    temp = p.data;
                    p.data = q.data;
                    q.data = temp;
                }
            }
        }
    }

    public int search(int data){
        Node temp = head;
        int i =0;
        while(temp!=null){
            i++;
            if(temp.data == data){
                return i;
            }
            temp = temp.next;
        }
        return 0;
    }

    public void removeDuplicates(){
        Node p = head;
        while(p.next != null){
            if(p.data == p.next.data){
                p.next = p.next.next;
            }
            else{
                p = p.next;
            }
        }
    }

    public void removeElement(int data){
        if(head == null || head.data == data){
            head = head.next;
        }

        Node p = head;

        while(p.next != null){
            if(p.next.data == data){
                p.next = p.next.next;
            }
            else{
                p = p.next;
            }
        }
    }

    public void removeMiddle(){
        Node prevSlowPointer = head;
        Node slowPointer = head;
        Node fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){
            if(slowPointer != head){
                prevSlowPointer = prevSlowPointer.next;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }
        prevSlowPointer.next = slowPointer.next;
        System.out.println("Middle Element Removed: "+slowPointer.data);
    }

    public static void main(String[] args) {
        SinglyLInkedLists list = new SinglyLInkedLists();
        Scanner s = new Scanner(System.in);
        int choice,n,data,pos;

        do{
            System.out.println("1. Create a linkedlist");
            System.out.println("2. Display linkedlist");
            System.out.println("3. Insert At Beginning");
            System.out.println("4. Insert At End");
            System.out.println("5. Insert At Between");
            System.out.println("6. Delete At Beginning");
            System.out.println("7. Delete At End");
            System.out.println("8. Delete At Between");
            System.out.println("9. Sort Linkedlist");
            System.out.println("10. Search in Linkedlist");
            System.out.println("11. Exit");
            System.out.println("Enter your choice: ");
            choice = s.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter no of element you want to insert");
                    n = s.nextInt();
                    list.create(n);
                    break;
                case 2:
                    list.display();
                    break;
                case 3:
                    System.out.println("Enter data: ");
                    data = s.nextInt();
                    list.insertAtBeg(data);
                    break;
                case 4:
                    System.out.println("Enter data: ");
                    data = s.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 5:
                    System.out.println("Enter Position: ");
                    pos = s.nextInt();
                    System.out.println("Enter data: ");
                    data = s.nextInt();
                    list.insertAtBetween(pos,data);
                    break;
                case 6:
                    list.deleteAtBeg();
                    list.display();
                    break;
                case 7:
                    list.deleteAtEnd();
                    list.display();
                    break;
                case 8:
                    System.out.println("Enter Position: ");
                    pos = s.nextInt();
                    list.deleteAtPos(pos);
                    list.display();
                    break;
                case 9:
                    list.sort();
                    list.display();
                    break;
                case 10:
                    System.out.println("Enter Data: ");
                    data = s.nextInt();
                    System.out.println("Position: " + list.search(data));
                    break;
                case 11:
                    System.out.println("Thankyou");
                    break;
            }
        }while(choice!=11);
    }

}


