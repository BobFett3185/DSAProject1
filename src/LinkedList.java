public class LinkedList <AnyType extends IDedObject> {

    private Node head; // head of the list

    private class Node{
        AnyType data;  // has data and reference to next node
        Node next; 

        public Node(AnyType data){// constructor for node
            this.data = data;
            this.next = null;
        }

    }

    public LinkedList(){ // constructor to create empty list
        head = null;
    }

    public void makeEmpty(){
        head = null;  // this makes list empty by removing references to nodes 
    }
     

    public AnyType findID(int id){ // get type to get id and return type
        Node current = head; 

        while(current!=null){
            if(id == current.data.getID()){
                return current.data; 
            }
            current = current.next; 
        }

        return null; 
    }

    public boolean insertAtFront(AnyType x){
        int id = x.getID();
        if(findID(id)!=null){ // if id already exists return false
            return false; 
        }

        Node newNode = new Node(x); // create new node with data x
        newNode.next = head; // point new node to current head
        head = newNode; // update head to new node

        return true; 
    }


    public AnyType deleteFromFront(){
        if(head == null){
            return null; 
        }

        AnyType data = head.data; 
        head = head.next;// skip over our first element 
        return data;
    }

    public AnyType delete(int id){
        if(head == null){
            return null; 
        }

        if(head.data.getID() == id){ // if head is the one to delete
            return deleteFromFront(); 
        }

        Node current = head; 

        while(current.next!=null){
            if(current.next.data.getID() == id){ // if next node is the one to delete
                AnyType data = current.next.data; 
                current.next = current.next.next; // skip over the node to delete
                return data; 
            }
            current = current.next; 
        }

        return null; // if we reach end of list without finding id
    }

    public void printAllRecords(){
        if(head == null){
            System.out.println("List is empty.");
            return; 
        }

        Node current = head; 

        while(current!=null){
            current.data.printID(); // print data of current node
            System.out.println(); // print blank line for separation
            current = current.next; 
        }
    }




}

/*
3.	Design a generic singly linked list java class (Give an appropriate name) to hold objects of the generic type <AnyType>. 
This AnyType should implement IDedObject. You have to design your own class that does not use any other Java collection ApI. 
The linked list class must implement following member functions: 
A constructor which generates an empty list .
void makeEmpty();			 //empties the linked list 
AnyType  findID(int ID);	 // Get the generic type to get the particular id and returns AnyType.  Don’t remove the object from the list. returns null if the list is empty or ID not found.  
boolean insertAtFront(AnyType x); 	// insert at front of list or return false if that ID already exists 
AnyType deleteFromFront();	 // delete and return the record at the front of  the list or return       null if the list is empty 
AnyType delete(int ID); 	// find and delete the record with the given ID or returns null if it isn’t found 
void printAllRecords(); 	// print all elements in the order they appear in the linked list. if list is empty print appropriate message. 
 */
