package designPattern.builder.example2;

import java.util.ArrayList;

public class OrderItems  {
    private ArrayList<Item> oi = new ArrayList<>();

    public void addItems(Item item) {
        oi.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for(Item i : oi) {
            cost += i.price();
        }
        return cost;
    }

    public void showItems() {
        for(Item i : oi) {
            System.out.println("Item is : " + i.name());
            System.out.println("Size is : " + i.size());
            System.out.println("Price is : " + i.price());
        }
    }
}
