import java.util.Arrays;

public class Sorter {
    public static int smallest(int[] array) {
       int smallest = array[0];
       for(int i: array) {
        if(i<smallest) {
            smallest = i;
        }
       }
       return smallest;
    }
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for(int i = 0; i<array.length; i++) {
            if (array[i]<smallest) {
                smallest = array[i];
                index = i;
            }
        } 
        return index;
    }
    public static int indexOfSmallestFrom(int[] array, int from) {
        int smallest = array[from];
        int index = from;
        for(int i = from; i<array.length; i++) {
            if (array[i]<smallest) {
                smallest = array[i];
                index = i;
            }
        } 
        return index;
    }
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void sort(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println(Arrays.toString(array));
            int temp = indexOfSmallestFrom(array, i);
            swap(array, i, temp);
        }
    }
}