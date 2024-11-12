package com.driver;

public class Main {

   static class Product {

        // Task 3: Create a method with the following definition
        public int product(int x, int y) {
            return x * y;
        }

        // Task 4: Create an overloaded method with the following definition
        public int product(int x, int y, int z) {
            return x * y * z;
        }

        // Task 5: Create an overloaded method with the following definition
        public double product(double x, double y) {
            return x * y;
        }
    }

    public static void main(String[] args) {
        // Task 2: Create an object of Product in Main function called p
        Product p = new Product();

        // Call the first method
        System.out.println("Product of 3 and 5: " + p.product(3, 5));

        // Call the second overloaded method
        System.out.println("Product of 3, 5, and 2: " + p.product(3, 5, 2));

        // Call the third overloaded method
        System.out.println("Product of 2.5 and 4.5: " + p.product(2.5, 4.5));
    }

}
