import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayToArrayListConverter arrayToArrayListConverter = new ArrayToArrayListConverter();
        ArrayList<Integer> arrayList = arrayToArrayListConverter.convertToArraylist(array);

        System.out.println("Array converted to ArrayList: " + arrayList);

        ArrayListToArrayConverter arrayListToArrayConverter = new ArrayListToArrayConverter();
        int[] newArray = arrayListToArrayConverter.convertToarray(arrayList);

        System.out.println("ArrayList converted to array: " + java.util.Arrays.toString(newArray));
    }
}
