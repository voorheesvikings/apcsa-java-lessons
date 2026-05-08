public class Recursion {
    public static void main(String[] args) {
        RecursionAlgos r = new RecursionAlgos();
        r.countDown(5);

    }
}

class RecursionAlgos {
    //infinite recursion
    public void infiniteRecursion() {
        System.out.println("This is an infinite recursion");
        infiniteRecursion();
    }

    public void countDown(int n) {

        //base case:
        if (n <= 0) 
        {
            System.out.println("Hit base case.");
            return;
        }

        System.out.println("stacking up n: " + n);
        countDown(n - 1);
        System.out.println("unstacking n: " + n);
    }

    public int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    
}