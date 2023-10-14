public class TestSortReferenceType {
    public static void main(String[] args) {
        SortAlgo sortAlgo = new SortAlgo();
        // testcase byID
        Product sach0 = new Product("000", "Dau Thai Kiep Nguoi", 5000, "Sach");
        Product sach1 = new Product("001", "Lap Trinh Nang Cao", 2000, "Truyen");
        Product sach2 = new Product("002", "Sach Hoa Nang Cao", 1000, "Tap Chi");
        OrderItem orderItem0 = new OrderItem(sach0, 2);
        OrderItem orderItem1 = new OrderItem(sach1, 2);
        OrderItem orderItem2 = new OrderItem(sach2, 1);
        Order orderByID = new Order(new OrderItem[]{orderItem1, orderItem0, orderItem2});
        System.out.println("Testcase byID");
        System.out.println("Before Selection Sort: \n" + orderByID);
        sortAlgo.selectionSort(orderByID);
        System.out.println("After Selection Sort: \n" + orderByID);

        // testcase byName
        Product sach3 = new Product("000", "Toi Tai Gioi Ban Tai Xiu", 5000, "Truyen");
        Product sach4 = new Product("000", "An Uong Nhu Mot Con Nguoi Binh Thuong", 6000, "Tap Chi");
        Product sach5 = new Product("000", "Dark Nhan Tam", 7000, "Sach");
        OrderItem orderItem3 = new OrderItem(sach3, 6);
        OrderItem orderItem4 = new OrderItem(sach4, 72);
        OrderItem orderItem5 = new OrderItem(sach5, 61);
        Order orderByName = new Order(new OrderItem[]{orderItem3, orderItem4, orderItem5});
        System.out.println("Testcase byName");
        System.out.println("Before BubbleSort Sort: \n" + orderByName);
        sortAlgo.bubbleSort(orderByName);
        System.out.println("After BubbleSort Sort: \n" + orderByName);

        // testcase byPrice
        Product sach6 = new Product("000", "Toi Tai Gioi Ban Tai Xiu", 7000, "Truyen");
        Product sach7 = new Product("000", "Toi Tai Gioi Ban Tai Xiu", 5400, "Tap Chi");
        Product sach8 = new Product("000", "Toi Tai Gioi Ban Tai Xiu", 1000, "Sach");
        OrderItem orderItem6 = new OrderItem(sach6, 1);
        OrderItem orderItem7 = new OrderItem(sach7, 4);
        OrderItem orderItem8 = new OrderItem(sach8, 5);
        Order orderByPrice = new Order(new OrderItem[]{orderItem6, orderItem7, orderItem8});
        System.out.println("Testcase byPrice");
        System.out.println("Before InsertSort Sort: \n" + orderByPrice);
        sortAlgo.insertSort(orderByPrice);
        System.out.println("After InsertSort Sort: \n" + orderByPrice);

        // testcase byQuantity
        Product sach9 = new Product("000", "Toi Tai Gioi Ban Tai Xiu", 145, "Truyen");
        Product sach10 = new Product("000", "Toi Tai Gioi Ban Tai Xiu", 145, "Truyen");
        Product sach11 = new Product("000", "Toi Tai Gioi Ban Tai Xiu", 145, "Truyen");
        OrderItem orderItem9 = new OrderItem(sach9, 1);
        OrderItem orderItem10 = new OrderItem(sach10, 43);
        OrderItem orderItem11 = new OrderItem(sach11, 5);
        Order orderByQuantity = new Order(new OrderItem[]{orderItem9, orderItem10, orderItem11});
        System.out.println("Before Sort: \n" + orderByQuantity);
        sortAlgo.selectionSort(orderByQuantity);
        System.out.println("After Sort: \n" + orderByQuantity);
    }
}
