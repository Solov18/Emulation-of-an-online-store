package com.javacurse.ce.internetMagazin;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static ArrayList<Customer> customers = new ArrayList<>();
    public static List<Product>products = new ArrayList<>();
    public  static  List<Order>orders = new ArrayList<>();



    public static Order getBy (Customer customer, Product product, int quantity) {
        Order order = new Order(customer, product, quantity);
        try {


            if (!customers.contains(customer)) {
                throw new CustomerException();
            }
            if (!products.contains(product)) {
                throw new ProductException();
            }
            if ((quantity <= 0) || (quantity > products.size())) {
                throw new AmountException();
            }
            return new Order(customer,product,quantity);
        }catch (CustomerException e){
            System.err.println(e.getMessage());
        }catch (ProductException e){
            System.out.println("передан несуществующий товар");
        }catch (AmountException e){
            System.out.println("передано отрицательное или слишком большое значение");
        }


        return null;
    }



}
