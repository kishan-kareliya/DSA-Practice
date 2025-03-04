package LinkedList.DoublyLinkedList;
import java.util.Scanner;

class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedLists {
    Node head = null;
    Scanner s = new Scanner(System.in);
    int data;

    public void create(int n){
        Node newNode;
        Node ptr = null;

        for(int i=0;i<n;i++){
            System.out.println("Enter data for node " + (i+1) + ":");
            data = s.nextInt();
            newNode = new Node(data);

            if(head == null){
                head = newNode;
            }
            else{
                newNode.prev = ptr;
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

    public void displayBackword(){
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        System.out.println();
        while(temp != null){
            System.out.print(temp.data + ">>");
            temp = temp.prev;
        }
        System.out.println();
    }

    public void insertAtBeg(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    public void insertAtBetween(int pos,int data){
        Node p = head;
        Node newNode = new Node(data);

        for(int i=1;i<pos-1;i++){
            p = p.next;
        }
        Node q = p.next;
        p.next = newNode;
        newNode.prev = p;
        q.prev = newNode;
        newNode.next = q;
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
        Node p = head;
        if(pos == 1) {
            deleteAtBeg();
            return;
        }
        for(int i=1;i<pos-1;i++){
            p = p.next;
        }
        if(p.next.next != null) {
            p.next = p.next.next;
            p.next.next.prev = p;
        }
        else{
            p.next = null;
        }
    }

    public void sort(){
        Node p,q;
        int temp;

        for(p=head;p!=null;p=p.next){
            for(q=p;q!=null;q=q.next){
                if(p.data > q.data){
                    temp = p.data;
                    p.data = q.data;
                    q.data = temp;
                }
            }
        }
    }

    public int search(int data){
        Node temp = head;
        int i = 0;
        while(temp != null){
            i++;
            if(temp.data == data){
                return i;
            }
            temp = temp.next;
        }
        return 0;
    }

    public static void main(String[] args) {
        DoublyLinkedLists list = new DoublyLinkedLists();
        Scanner s = new Scanner(System.in);
        int choice,n,data,pos;

        do{
            System.out.println("1. Create a linkedlist");
            System.out.println("2. Display linkedlist forward");
            System.out.println("3. Display linkedlist backword");
            System.out.println("4. Insert At Beginning");
            System.out.println("5. Insert At End");
            System.out.println("6. Insert At Between");
            System.out.println("7. Delete At Beginning");
            System.out.println("8. Delete At End");
            System.out.println("9. Delete At Between");
            System.out.println("10. Sort Linkedlist");
            System.out.println("11. Search in Linkedlist");
            System.out.println("12. Exit");
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
                    list.displayBackword();
                    break;
                case 4:
                    System.out.println("Enter data: ");
                    data = s.nextInt();
                    list.insertAtBeg(data);
                    break;
                case 5:
                    System.out.println("Enter data: ");
                    data = s.nextInt();
                    list.insertAtEnd(data);
                    break;
                case 6:
                    System.out.println("Enter Position: ");
                    pos = s.nextInt();
                    System.out.println("Enter data: ");
                    data = s.nextInt();
                    list.insertAtBetween(pos,data);
                    break;
                case 7:
                    list.deleteAtBeg();
                    list.display();
                    break;
                case 8:
                    list.deleteAtEnd();
                    list.display();
                    break;
                case 9:
                    System.out.println("Enter Position: ");
                    pos = s.nextInt();
                    list.deleteAtPos(pos);
                    list.display();
                    break;
                case 10:
                    list.sort();
                    list.display();
                    break;
                case 11:
                    System.out.println("Enter Data: ");
                    data = s.nextInt();
                    System.out.println("Position: " + list.search(data));
                    break;
                case 12:
                    System.out.println("Thankyou");
                    break;
            }
        }while(choice!=12);
    }
}
