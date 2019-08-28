/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author imhakr
 */
public class Product {
    
   private double price;
   private String item;
    private int amount;
    
    public Product(String nameAtStart, double priceAtStart, int amountAtStart){
        
        this.price = priceAtStart;
        this.item = nameAtStart;
        this.amount = amountAtStart;
        
     }
    
    public void printProduct()
    {
     
 
        System.out.println(this.item);
        
        
        System.out.println(price);
        
        
        System.out.println(amount);
    }
    
    
}
