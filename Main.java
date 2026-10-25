import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {5, 3, -1, 9, 11, 3};
        /* System.out.println(Sorter.smallest(array));
        System.out.println(Sorter.smallest(array));
        System.out.println(Sorter.indexOfSmallestFrom(array,3)); */
        Sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}