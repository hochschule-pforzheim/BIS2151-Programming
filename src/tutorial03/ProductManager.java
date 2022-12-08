/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutorial03;

import java.util.ArrayList;

/**
 *
 * @author Pfäfflin
 */
public class ProductManager {

    private static ProductManager theProductManager;    // Instancevariable of type Product Manager for the Singleton
    private ArrayList<Product> productList = new ArrayList<>();

    /**
     * Private Constructor, so no one can create an instance of this class,
     * except the class itself.
     */
    private ProductManager() {

    }

    /**
     * Singleton: If there is not Instance of the class ProductManager we create
     * one. If one is already given, return it.
     *
     * @return a unique instance of the class ProductManager.
     */
    public static ProductManager getInstance() {
        if (theProductManager == null) {
            theProductManager = new ProductManager();
        }
        return theProductManager;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    /**
     * Add a Product to the ArrayList.
     *
     * @param p Product to be added to the ArrayList
     */
    public void addProduct(Product p) {
        this.productList.add(p);
    }

    /**
     * Search a specific Product from the ArrayList via the ID.
     *
     * @param id via which we search the Product.
     * @return the searched for Product.
     */
    public Product searchProduct(int id) {
        for (Product p : productList) {
            if (p.getProductID() == id) {
                return p;
            }
        }
        return null;
    }

    /**
     * Delete a specific Product from the ArrayList via the ID.
     *
     * @param id via which we delete the Product.
     */
    public void deleteProductID(int id) {
        Product toDelete = searchProduct(id);
        if (toDelete != null) {
            this.productList.remove(toDelete);
        }
    }

    /**
     * Delete a specific Product from the ArrayList via the Product itself.
     *
     * @param toDelete Product we want to delete from the ArrayList.
     */
    public void deleteProduct(Product toDelete) {
        this.productList.remove(toDelete);
    }

    /**
     * Update an existing Product with the given values.
     *
     * @param oldProduct Product to be updated.
     * @param name New Name for the old Product.
     * @param category New Category for the old Product.
     */
    public void updateProduct(Product oldProduct, String name, String category) {
        oldProduct.setName(name);
        oldProduct.setCategory(category);
    }
}
