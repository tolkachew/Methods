public class Main {

    static int i;
    public static void main(String[] args) {
        hello();
        double s = calcArea(1.0);
        System.out.println(s);
        System.out.println(factorial(0));
        System.out.println(isOddNumber(2));
        System.out.println(sum(1,2000_000_000L));
        System.out.println(sum(1,2,3,4));
        int[] arr={1,2,3,4};
        System.out.println(sumArr(arr));
    }

    static void hello(){
        System.out.println("hello");
    }

    static void printName(String name){
        System.out.println(name);
    }

    //Вычислить площадь круга
    static double calcArea(double r){
        return Math.PI*r*r;
    }

    //Вычислить факториал числа
    static int factorial(int n){
        int result = 1;
        for (int i=2; i<=n; i++)
            result*=i;
        return result;
    }

    //Дано: номер дня недели. Найти: название дня недели
    static String getDayOfWeek(int number){
        //switch
        return null;
    }

    //Дано: номер дня недели. Напечатать название дня недели
    static void printDayOfWeek(int number){

    }

    //Определить, является ли число нечетным
    static boolean isOddNumber(int number){
        return number%2==1?true:false;
    }

    //Определить, больше ли первое число второго
    static boolean isFirstBigger(int a, int b){
        return false;
    }

    //Определить максимальное из двух чисел
    static int max(int a, int b){
        return 0;
    }

    //Проверить правильность написания e-mail
    static boolean isEmailCorrect(String e){
        return false;
    }

    //Перегрузка методов (overloading)
    /*
    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }
     */

    public  static <T extends Number> double sum(T a, T b){
        return a.doubleValue()+b.doubleValue();
    }

    public static String sum(String s1,String s2){
        return s1+s2;
    }

    public static int sum(int... args) {
        int result = 0;
        for (int arg : args) {
            result+=arg;
        }
        return result;
    }

    public static int sumArr(int[] args) {
        int result = 0;
        for (int arg : args) {
            result+=arg;
        }
        return result;
    }
}