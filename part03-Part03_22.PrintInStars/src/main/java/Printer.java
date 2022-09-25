
public class Printer {

    public static void main(String[] args) {
        // You can test the method here
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        // Write some code in here

        for (int index = 0; index < array.length; index++) {
            int number = array[index];

            for (int star = 1; star <= number; star++) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }

}
