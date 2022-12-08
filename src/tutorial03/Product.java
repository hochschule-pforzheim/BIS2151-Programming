/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial03;

/**
 *
 * @author Pfäfflin
 */
public class Product {

    // Define the Products Attributes
    private int productID;
    private String name;
    private String category;
    private static int counter = 0;

    public Product(String name, String category) {
        this.productID = counter++;
        this.name = name;
        this.category = category;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Override the toString() method, so when we print out the ArrayList, the
     * values are readable.
     *
     * @return a line of text containing every attribute of Object Product.
     */
    @Override
    public String toString() {
        return "Product{" + "productID=" + productID + ", name=" + name + ", category=" + category + '}';
    }

}
