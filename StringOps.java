import java.awt.*;

public class StringOps {
    int counts;

    /**
     * _Part 1: Implement this method._
     *
     * Approach:
     * Walk through the specified String array from the index l,
     * upto, but not including the index r
     *
     * @param array - the array of Strings to search
     * @param query - a String to search for in 'array'
     * @param l     - the first index of the search range
     * @param r     - the end (exclusive) of the search range
     * @return the index of the query in the array or -1 if not found.
     */
    public int linearSearch(String[] array, String query, int l, int r) {
        for(int i=l; i<r; i++){
            if(array[i].equals(query)){
                System.out.println(i);
                return i;
            }
        }
        // TODO: implement this

        return -1;
    }

    /**
     * _Part 2: Implement this method._
     *
     * Approach:
     * Perform binary search on the specified String array between the index l,
     * upto, but not including the index r
     *
     * @param sortedArray - the array of Strings to search
     * @param query       - a String to search for in 'array'
     * @param l           - the first index of the search range
     * @param r           - the end (exclusive) of the search range
     * @return the index of the query in the array or -1 if not found.
     */
    public int binarySearch(String[] sortedArray, String query, int l, int r) {
        // TODO: implement this
        return 0;
    }

    /**
     * _Part 3: Implement this method._
     *
     * Approach:
     * Sort the array in-place.
     * Walk over the array, if a pair of items is "out of order",
     * swap the items. If any pair was swapped, repeat the walk.
     *
     * @param array - the array of Strings to sort
     */
    public void swapemSort(String[] array) {
//        for(int i= array.length-1; i > 0;i--){
//            int j=i;
//            while (array[j-1].compareTo(array[j]) < 0){
//                String placeHolder= array[j];
//                array[j]=array[j-1];
//                array[j-1]= placeHolder;
//            }
//        }
        boolean Sorted = false;
        while (!Sorted) {
            Sorted=true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    String temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    Sorted = false;
                }

            }
        }
        // TODO: implement this
        return;
    }


    /**
     * _Part 4: Implement this method._
     *
     * Approach:
     * Sort the array in-place using 'insertion sort'.
     *
     * @param array - the array of Strings to sort
     */
    public void insertSort(String[] array) {
        // TODO: implement this
        return;
    }

    /**
     * _ Part 5: Implement this method _
     *
     * Approach:
     * Do this in two stages.
     *
     * For the first stage, create an array big enough to hold all
     * items in both array1 and array2, and fill it with unique items
     * from array1 and array2.
     *
     * For the second stage, create an array just big enough for the
     * unique items and copy them from the array created in the previous
     * step
     *
     * Hint: should you generally use equals() or == with Strings?
     *
     * NOTE:
     * You should only use String arrays and primitive types
     * for your implementation.
     *
     * @param array1 - the first array of Strings
     * @param array2 - the second array of Strings
     * @return a new array holding all unique items in array1 and array2
     */
    public String[] union(String[] array1, String[] array2) {
        // TODO: implement this
        return null;
    }

    /**
     * _ Part 6: Implement this method _
     *
     * Approach:
     * Do this in two stages.
     *
     * For the first stage, create an array big enough to hold all
     * items in the smaller of array1 or array2, and fill it items that
     * occur in both arrays. However, the resulting array should be
     * a set (only contain unique items) even if array1 or array2 is
     * not a set.
     *
     * For the second stage, create an array just big enough for the
     * items above and copy them from the array created in the previous
     * step
     *
     * Hint: should you generally use equals() or == with Strings?
     * Hint: use Math.min
     *
     * NOTE:
     * You should only use String arrays and primitive types
     * for your implementation.
     *
     * @param array1 - the first array of Strings
     * @param array2 - the second array of Strings
     * @return a new array holding items that occur in both array1 and array2
     */
    public String[] intersection(String[] array1, String[] array2) {
        // TODO: implement this
        return null;
    }

}
