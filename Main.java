import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {3, 9, -5, 2, 84, 35, -27, 99, 1210, -789, -60, -70, 56};
        /* System.out.println(Sorter.smallest(array));
        System.out.println(Sorter.smallest(array));
        System.out.println(Sorter.indexOfSmallestFrom(array,3)); */
        Sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }
}