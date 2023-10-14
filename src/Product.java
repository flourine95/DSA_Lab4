public class Product implements Comparable<Product> {
    private String id;
    private String name;
    private double price;
    private String type;

    public Product(String id, String name, double price, String type) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
    }

    @Override
    public int compareTo(Product o) {
        int byID = this.id.compareTo(o.id);
        int byName = this.name.compareTo(o.name);
        int byPrice = Double.compare(this.price, o.price);
        int byType = this.type.compareTo(o.type);
        if (byID == 0) if (byName == 0) if (byPrice == 0) return byType;
        else return byPrice;
        else return byName;
        else return byID;
    }

    @Override
    public String toString() {
        return "Product{" + "id='" + id + '\'' + ", name='" + name + '\'' + ", price=" + price + ", type='" + type + '\'' + '}';
    }
}
