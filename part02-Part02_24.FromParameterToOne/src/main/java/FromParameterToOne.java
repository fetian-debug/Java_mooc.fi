
public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(2);

    }

    public static void printFromNumberToOne(int n) {

        int j = n;
        for (int i = 0; i < n; i++) {
            System.out.println(j);
            j--;

        }

    }

}
