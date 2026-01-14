package arrays;

public class ArrPractice {
    public static void main(String[] args) {
        int[] price = new int[10];

        int[] number = new int[20];
        for (int i = 0; i < number.length; i++) {
            number[i] = 4;
        }

        int[] arr = {2, 4, 6, 8, 10, 12}; 
        if (arr.length % 2 == 1) {  
            System.out.println(arr[arr.length / 2]);
        } else {
            System.out.println(arr[(arr.length / 2)]);
            System.out.println(arr[((arr.length / 2) - 1)]);
        }
    }
}
