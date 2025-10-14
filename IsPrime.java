package week1.day2;

public class IsPrime {

    public static void main(String[] args) {
        int number = 200;
        boolean a = true;

       
        if (number <= 1) {
            a = false;
        } else {
           
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    a = false;
                    break;
                }
            }
        }

        if (a) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}


