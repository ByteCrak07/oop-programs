import java.util.Scanner;

class Node {
    int value;
    Node prev, next;

    Node() {
        prev = null;
        next = null;
    }
}

public class Doubly_linked_list {
    Scanner in = new Scanner(System.in);
    Node head = null;
    int val;

    void insert() {
        System.out.print("Enter no: ");
        val = in.nextInt();
        if (head == null) {
            head = new Node();
            head.value = val;
        } else {
            Node temp = new Node();
            temp.value = val;
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
        System.out.println(val + " inserted\n");
    }

    void delete() {
        Boolean flag = false;
        if (head == null) {
            System.out.println("Current list is empty\n");
        } else {
            System.out.print("Enter no to be deleted: ");
            val = in.nextInt();
            Node ptr = head;
            if (head.value == val) {
                head = head.next;
                flag = true;
            } else {
                while (ptr.next != null) {
                    if (ptr.value == val) {
                        ptr.prev.next = ptr.next;
                        ptr.next.prev = ptr.prev;
                        flag = true;
                        break;
                    }
                    ptr = ptr.next;
                }
                if (!flag) {
                    if (ptr.value == val) {
                        ptr.prev.next = null;
                        ptr = null;
                        flag = true;
                    }
                }
            }
            if (flag)
                System.out.println(val + " deleted");
            else
                System.out.println(val + " not found");
            print();
        }
    }

    void print() {
        if (head == null) {
            System.out.print("Current list is empty");
        } else {
            System.out.print("Current List: ");
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.value + " ");
                ptr = ptr.next;
            }
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Doubly_linked_list dll = new Doubly_linked_list();
        int choice;
        while (true) {
            System.out.println("1. Insert\n2. Delete\n3. Print list\n4. Exit");
            System.out.print("Enter choice: ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    dll.insert();
                    break;
                case 2:
                    dll.delete();
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    in.close();
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong entry!!\n");
            }
        }
    }
}