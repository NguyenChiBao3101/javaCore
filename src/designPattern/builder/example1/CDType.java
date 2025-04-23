package designPattern.builder.example1;

import java.util.ArrayList;

public class CDType  {
    private ArrayList<Packing> p = new ArrayList<>();
    public void addItems(Packing packs) {
        p.add(packs);
    }

    public void getCost() {
        for(Packing packing : p) {
            packing.price();
        }
    }

    public void showItems() {
        for(Packing packing : p) {
            System.out.print("CD name : " + packing.pack());
            System.out.println(", Price : " + packing.price());

        }
    }
}
