public class ArrayOps {
    public static void main(String[] args) {

    }

    /**
     * Returns the missing int from 0 to array.length.
     * Returns -1 if no int is missing
     */
    public static int findMissingInt(int[] array) {
        int[] expectedNumbersArr = new int[array.length + 1];
        for (int i = 0; i <= array.length; i++) {
            expectedNumbersArr[i] = i;
        }

        for (int i = 0; i < expectedNumbersArr.length; i++) {
            if (!isNumberInArray(expectedNumbersArr[i], array)) {
                return expectedNumbersArr[i];
            }
        }
        return -1;
    }

    public static int secondMaxValue(int[] array) {
        int max = array[0];
        int secondMax = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                secondMax = max;
                max = array[i];
            } else if (array[i] > secondMax) {
                secondMax = array[i];
            }
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!isNumberInArray(array1[i], array2)) {
                return false;
            }
        }

        for (int i = 0; i < array2.length; i++) {
            if (!isNumberInArray(array2[i], array1)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSorted(int[] array) {
        boolean isIncreasing = false;
        boolean isDecreasing = false;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                isDecreasing = true;
            } else if (array[i] < array[i + 1]) {
                isIncreasing = true;
            }

            if (isIncreasing && isDecreasing)
                return false;
        }
        return true;
    }

    public static boolean isNumberInArray(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }
        }

        return false;
    }

}
