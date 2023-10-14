public class OrderItem implements Comparable<OrderItem> {

    private Product p;
    private int quantity;

    public OrderItem(Product p, int quantity) {
        this.p = p;
        this.quantity = quantity;
    }

    @Override
    public int compareTo(OrderItem o) {
        int byProduct = this.p.compareTo(o.p);
        return byProduct == 0 ? this.quantity - o.quantity : byProduct;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "p=" + p +
                ", quantity=" + quantity +
                '}';
    }
}
