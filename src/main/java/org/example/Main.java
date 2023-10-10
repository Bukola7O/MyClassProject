package org.example;
import java.awt.*;
import java.math.BigDecimal;
import java.util.Objects;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public void addProduct(Product versaceShoe1) {

    }
    public static void main(String[] args) {
      User Jumia = new User();
      Jumia.setName("Jumia");
        System.out.println("The name of platform :" + Jumia.getName());
        Product versaceShoe =new Product();
        versaceShoe.setName("VersaceShoe");
        versaceShoe.setColour(Color.red);
        versaceShoe.setSize(34);
        versaceShoe.setWeight(3.09F);
        versaceShoe.setPrice(100000L);
      Product versaceShoe1 =new Product();
      versaceShoe1.setName("versaceShoe");
      versaceShoe1.setColour(Color.red);
      versaceShoe1.setSize(34);
      versaceShoe1.setWeight(3.09F);
      versaceShoe1.setPrice(100000L);
        System.out.println("Come and pick up your :" + versaceShoe.getName());
       // versaceShoe1.addProduct(versaceShoe1);
      System.out.println("Are they equal: " + Objects.equals(versaceShoe, versaceShoe1));
      System.out.println("My name is: " + versaceShoe.getName());

    }
}