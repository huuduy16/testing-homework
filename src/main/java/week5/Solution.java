package week5;

public class Solution {

    private static final int PRICE_A = 100;
    private static final int PRICE_B = 150;

    public static int calCharge(int age, double dist) {
        double price = 0;
        if (dist <= 10 && dist > 0) {
            //10km or less
            price = PRICE_A;
        } else {
            //more than 10km
            price = PRICE_B;
        }

        if (age < 3) {
            //infant
            price = 0;
        } else {
            if (age < 20) {
                //teenager
                price = price / 2;
            } else {
                if (age < 60) {
                    //adult
                } else {
                    price = price * 0.6;
                }
            }
        }
        return (int) price;
    }

    public static void main(String[] args) {
        System.out.println(calCharge(1,5));
        System.out.println(calCharge(10,20));
        System.out.println(calCharge(50,5));
        System.out.println(calCharge(100,5));

    }
}
