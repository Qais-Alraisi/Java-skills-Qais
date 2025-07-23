public class Main {
    public static void main(String[] args) {
        double[] cart = {25.99, 45.50, 12.99, 89.99, 15.75};
        System.out.println("Regular customer total: $" + ShoppingCart.calculateTotal(cart,
                "REGULAR"));
        System.out.println("Premium customer total: $" + ShoppingCart.calculateTotal(cart,
                "PREMIUM"));
        System.out.println("VIP customer total: $" + ShoppingCart.calculateTotal(cart,
                "VIP"));
        System.out.println("The most expensive item is: "+ShoppingCart.findMostExpensive(cart));
        System.out.println("The number of items in cart over 30$ are: "+ShoppingCart.countExpensiveItems(cart,30));

        System.out.println("___________________________________");
        
        PatternMaker.printNumberTriangle(5);
        PatternMaker.printMultiplicationTable(7,10);
    }
}
