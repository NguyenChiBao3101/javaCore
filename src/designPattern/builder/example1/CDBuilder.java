package designPattern.builder.example1;

public class CDBuilder {
    public CDType buildSonyCD(){
        CDType cdt = new CDType();
        cdt.addItems(new Sony());
        return cdt;
    }
    public CDType buildSamSungCD(){
        CDType cdt = new CDType();
        cdt.addItems(new SamSung());
        return cdt;
    }
}
