// Q55: Generic method to print any type of array

class GenericArrayPrint {

    // generic method
    public static <T> void printArray(T[] arr) {
        for (T element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArr = {1, 2, 3, 4};
        String[] strArr = {"Java", "MCA", "OOP"};

        printArray(intArr); // integer array
        printArray(strArr); // string array
    }
}