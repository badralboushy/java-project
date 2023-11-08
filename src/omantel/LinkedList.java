package omantel;

public class LinkedList {

    Node head;

    public static class Node {

        String number;
        String name;
        Node next;

        //constructor to create a new node
        Node(String number, String name) {
            this.number = number;
            this.name = name;
        }
    }

    //Method to insert a new node
    public static LinkedList insert(LinkedList list, String number, String name) {
        //create a new node
        Node new_node = new Node(number, name);
        new_node.next = null;

        //if the linked list is empty make the new node as head
        if (list.head == null) {
            list.head = new_node;
        } else {
            //put it in the last node
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            //inset the new_node in at last node
            last.next = new_node;

        }
        return list;
    }

    // Method to delete a node in the LinkedList by Number 
    public static LinkedList deleteByNumber(LinkedList list, String number) {
        // Store head node 
        Node currNode = list.head, prev = null;

        // case 1: 
        // If head node itself have the number to be deleted 
        if (currNode != null && currNode.number == number) {
            list.head = currNode.next; // Changed head 

            // Display the message 
            System.out.println(number + " found and deleted");

            // Return the updated List 
            return list;
        }
        
        // case 2: 
        // If the number is somewhere other than at head 
        // 

        // Search for the number to be deleted, 
        // keep track of the previous node 
        // as it is needed to change currNode.next 
        while (currNode != null && currNode.number != number) {
            // If currNode does not hold number 
            // continue to next node 
            prev = currNode;
            currNode = currNode.next;
        }

        // If the number was present, it should be at currNode 
        // Therefore the currNode shall not be null 
        if (currNode != null) {
            // Since the number is at currNode 
            // Unlink currNode from linked list 
            prev.next = currNode.next;

            // Display the message 
            System.out.println(number + " found and deleted");
        }

        // 
        // CASE 3: The number is not present 
        // 
        // If number was not present in linked list 
        // currNode should be null 
        if (currNode == null) {
            // Display the message 
            System.out.println(number + " not found");
        }

        // return the List 
        return list;
    }

    //Method to pritn Linked list
    public static void printList(LinkedList list) {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList 
        while (currNode != null) {
            // Print the data at current node 
            System.out.println(currNode.number + " " + currNode.name);

            // Go to next node 
            currNode = currNode.next;
        }
    }
    
    public static void searchByNumber(LinkedList list,String number)
    {
        Node currNode=list.head;
        
        //Search for the number
        while(currNode != null)
        {
            if(currNode.number == number){
                System.out.println(number + " found and belong to "+ currNode.name);
                return;
            }
            currNode=currNode.next;
        }
        System.out.println(number + " is not found");
    }
}
