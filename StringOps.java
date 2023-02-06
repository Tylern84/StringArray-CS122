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
    //negative # = A.compareto(B) <0
//Positive # = B.compareto(A) >0
//0 = A.compareto(A)
    public int binarySearch(String[] sortedArray, String query, int l, int r) {
        if(r>=l){
            int mid = (l+r)/ 2;
            if(sortedArray[mid].equals(query)){
                System.out.println(mid);
                return mid;
            }
            if (sortedArray[mid].compareTo(query) < 0) {
                return binarySearch(sortedArray,query,mid+1,r);

            }
            else if (sortedArray[mid].compareTo(query)  > 0) {
                return binarySearch(sortedArray,query,l,r-1);
            }
        }
        return -1;
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
        boolean Sorted = false;
        while (!Sorted) {
            Sorted=true;
            for (int i = 1; i < array.length; i++) {
                if (array[i - 1].compareTo(array[i]) > 0) {
                    String placeHolder = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = placeHolder;
                    Sorted = false;
                }

            }
        }
//         TODO: implement this
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
        int lengthArray= array.length;
        for(int i = 1; i < lengthArray; i++){
            int ptr1 = i;
            int ptr2 = i - 1;
            while(ptr2>= 0 && array[ptr1].compareTo(array[ptr2]) < 0){
                String placeHolder = array[ptr1];
                array[ptr1] = array[ptr2];
                array[ptr2]= placeHolder;
                ptr2--;
                ptr1--;
            }
        }
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
