public class ShoppingCart {

    public static double calculateTotal (double[] prices, String customerType){
        double total = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>0){
                total += prices[i];
            }
        }
        switch(customerType){
            case "REGULAR":
                break;
            case "PREMIUM":
                total = total*0.9;
                break;
            case "VIP":
                total = total*0.8;
                break;
            default:
                System.out.println("invalid customer type"); //ensure only accepted customer types
        }
        return total;
    }

    public static double findMostExpensive (double[] prices){
        if (prices.length==0){
            System.out.println("invalid prices"); //handle non-zero
            return 0;
        }
        double mostExpensive = prices[0];
        for (int i=0;i<prices.length;i++){
            if (prices[i]>mostExpensive){
                mostExpensive = prices[i];
            }
        }
        return mostExpensive;
    }

    public static int countExpensiveItems(double[] prices, double threshold){
        int count = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>threshold){ //increment any time a price crosses the threshold
                count++;
            }
        }
        return count;
    }
}