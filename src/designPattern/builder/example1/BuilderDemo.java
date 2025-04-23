package designPattern.builder.example1;

import java.lang.constant.ClassDesc;

public class BuilderDemo {
    public static void main(String [] args) {
        CDBuilder cdb = new CDBuilder();
        CDType cdt1 = cdb.buildSonyCD();
        cdt1.showItems();

        CDType cdt2 = cdb.buildSamSungCD();
        cdt2.showItems();
    }
}
