package org.example.MyWitcher.pattern.creational.builder.ex1.bad;

public class Website {
    private String name;
    private String cms;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(String cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms='" + cms + '\'' +
                ", price=" + price +
                '}';
    }
}
