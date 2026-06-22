public class SortingOrders {

    static void bubbleSort(Order[] orders) {

        for (int i = 0; i < orders.length - 1; i++) {

            for (int j = 0; j < orders.length - i - 1; j++) {

                if (orders[j].totalPrice > orders[j + 1].totalPrice) {

                    Order temp = orders[j];
                    orders[j] = orders[j + 1];
                    orders[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        Order[] orders = {
                new Order(1, "John", 5000),
                new Order(2, "David", 2000),
                new Order(3, "Sam", 7000)
        };

        bubbleSort(orders);

        for (Order o : orders) {
            System.out.println(o.orderId + " " +
                    o.customerName + " " +
                    o.totalPrice);
        }
    }
}