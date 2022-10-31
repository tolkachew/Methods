public class Recursion {
    static int sum = 0;
    static int index = 1;

    public static void main(String[] args) {
        // recursion(10);
        // sum();
        // System.out.println( sum2(1));
        System.out.println(factorial(4));
    }


    static void recursion(int count) {
        if (count <= 0) return;
        recursion(--count);
        System.out.println("hi: " + count);
    }

    static void sum() {
        if (index > 5) {
            System.out.println(sum);
            return;
        }
        sum += index++;
        sum();
    }

    static int sum2(int index) {
        if (index > 5) return 0;
        return index + sum2(++index);
    }

    //24
    static int factorial(int number) {
        if (number == 0 || number == 1) return 1;
        return number * factorial(number - 1);
    }
}
