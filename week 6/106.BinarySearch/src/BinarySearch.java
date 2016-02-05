
public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int beginning = 0;
        int end = array.length - 1;

        while (beginning <= end) {
            int middle = (beginning + end) / 2;
            if (array[middle] == searchedValue
                    || array[end] == searchedValue
                    || array[beginning] == searchedValue) {
                return true;
            } else if (array[middle] > searchedValue) {
                end = middle;
            } else {
                beginning = middle;
            }
            if (beginning + 1 == end || beginning == end) {
                break;
            }

            // restrict the search area 
        }
        return false;
    }
}
