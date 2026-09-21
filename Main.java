public class Main {
    public static void main(String[] args) {
        Item[] items = {
            new PercentDiscountItem(
                    "Phone", 450000, 2, 5
            ),

            new NoDiscountItem(
                    "Charger", 15000
            ),

            new FlatDiscountItem(
                    "Earphones", 20000, 4, 3000
            ),

            new PercentDiscountItem(
                    "Power Bank", 60000, 3, 10
            )
        };

        int[] quantities = {1, 2, 3, 3};

        double total = 0;

        System.out.println("===== BYTE ELECTRONICS =====");

        for (int i = 0; i < items.length; i++) {
            double lineTotal =
                    items[i].calculateTotal(quantities[i]);

            System.out.println(
                    items[i].getName()
                    + " x" + quantities[i]
                    + " = UGX " + lineTotal
            );

            total += lineTotal;
        }

        System.out.println("TOTAL = UGX " + total);
    }
}
