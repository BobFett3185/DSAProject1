public class Product implements IDedObject {
    private int productID;
    private String productName;
    private String supplierName;


    // these 2 constructor seem reasonable -- we cant have a constructor without an id or name
    public Product(int productID, String productName, String supplierName) {
        this.productID = productID;
        this.productName = productName;
        this.supplierName = supplierName;
    }   

    public Product(int productID, String productName) {
        this.productID = productID;
        this.productName = productName;
    }   


    // getters and setters
    public int getProductID(){
        return productID; 
    }
    
    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }


    // other methods
    public void printID(){ // function to print all variables in seperate lines
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Supplier Name: " + supplierName);
    }


    public int getID() { // function to return productID
        return productID;
    }


}


/* 
2.	Design a java class Product that implements IDedObject interface and has the following class variables:
int productID
String productName
String supplierName

Implement suitable constructors, a printID function that prints all the variable values in separate lines and getID() function 
that returns the productID.  
Add any access and other functions necessary.
Note all your data should be private and methods public inside the class

*/
