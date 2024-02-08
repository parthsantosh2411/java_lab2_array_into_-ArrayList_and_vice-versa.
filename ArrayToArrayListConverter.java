import java.util.ArrayList;

public class ArrayToArrayListConverter {

    public ArrayList<Integer> convertToArraylist(int[] array) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int num : array) {
            arrayList.add(num);
        }
        return arrayList;
    }
}
