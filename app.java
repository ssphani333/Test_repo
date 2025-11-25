public class CheckEvenOdd {
    public static void main(String[] args) {
        int number = 7;
        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }
    }
}

// Below code is Pushed by developer 2//

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 15, b = 25, c = 10;
        int largest = a;

        if (b > largest) {
            largest = b;
        }
        if (c > largest) {
            largest = c;
        }
        System.out.println("The largest number is: " + largest);
    }
}
