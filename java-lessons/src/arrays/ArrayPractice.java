package arrays;
public class ArrayPractice { 
    public static void main(String args[]) {
        int[] array = {-20, 19, 5, -1, 27, 19, 5};
        int min = array[0];
        for (int i= 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Minimum value in the array is: " + min);


        int target = 6;
        int[] numbers = {0, 2, 4, 6, 8};
        boolean targetFound = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                targetFound = true;
                break;
            }
        }

        int[] numbers2 = {0, 0, 0, 1, 0};
        boolean allSame = true;
        for( int index=1; index < numbers2.length; index++ ){
            if( numbers2[0] != numbers2[index] ) {
                allSame = false;
                break;
            }
        }
        System.out.println("All elements the same? " + allSame );


        String names[] = {"Tom", "David", "Mike"};
        for (String name: names) {
            System.out.println(name);
        }
        


    }
}
