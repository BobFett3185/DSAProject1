public class program {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        LinkedList <Product> ourList = new LinkedList<Product>();  // our linked list containing products

        int input = -1; // variable to get user input

        do {
            printMenu(); 
            input = scanner.nextInt();
            switch(input){
                case 1:
                    ourList.makeEmpty();
                    break;
                case 2:
                    System.out.println("Enter ID to find: ");
                    int idToFind = scanner.nextInt();
                    Product foundProduct = ourList.findID(idToFind);
                    if(foundProduct != null)
                        foundProduct.printID();
                    else
                        System.out.println("Product not found.");
                
                    break;
                case 3:
                    System.out.println("Enter product ID: ");
                    int newID = scanner.nextInt();
                    System.out.println("Enter product name: ");
                    String newName = scanner.next();    
                    System.out.println("Enter supplier name: ");
                    String newSupplier = scanner.next();
                    Product newProduct = new Product(newID, newName, newSupplier);
                    ourList.insertAtFront(newProduct);
                    break;  
                case 4:
                    Product deletedProduct = ourList.deleteFromFront();
                    if(deletedProduct != null)
                        deletedProduct.printID();
                    else
                        System.out.println("List is empty.");
                    break;
                case 5:
                    System.out.println("Enter ID to delete: ");
                    int idToDelete = scanner.nextInt();
                    Product deletedByID = ourList.delete(idToDelete);
                    if(deletedByID != null)
                        deletedByID.printID();
                    else
                        System.out.println("Product not found.");
                    break;
                case 6:
                    ourList.printAllRecords();  
                    break; 
                case 7:
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid input. Please try again.");
            }
        } 
        while(input != 7); // loop to get user input until they want to exit

        scanner.close(); // close scanner when done

    }

    public static void printMenu(){
        System.out.println("i. Make Empty ");
        System.out.println("ii.	Find ID");
        System.out.println("iii. Insert Product at front");
        System.out.println("iv. Delete From Front");
        System.out.println("v. Delete ID");
        System.out.println("vi. Print All Records");
        System.out.println("vii. Done");
    }


}


/*i.	
Make Empty                     
 /// This Option makes the Linked list empty
ii.	Find ID			
/// print all details of the product ID, if it is in the list , if not print appropriate message
iii.	Insert At Front	
/// Get the product magazine details from the user and add it to the front of the list
iv.	Delete From Front
///Print the first item on the list and then delete it.
v.	Delete ID
/// Print particular IDed item and then delete it.
vi.	Print All Records
// Print all the records in the list
vii.	Done
///Quit the program. For every other option after task completion display menu again.  */
