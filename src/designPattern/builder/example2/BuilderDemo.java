package designPattern.builder.example2;

import java.io.IOException;

public class BuilderDemo {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here

        OrderBuilder builder=new OrderBuilder();

        OrderItems orderedItems=builder.preparedPizza();

        orderedItems.showItems();

        System.out.println("\n");
        System.out.println("Total Cost : "+ orderedItems.getCost());

    }
}
