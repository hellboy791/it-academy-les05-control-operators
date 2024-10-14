public class FirstTask {
    public static void main(String[] args) {
        //С помощью if определите минимальное из пяти введённых чисел.
        int a = 4;
        int b = 1;
        int c = 12;
        int i = 8;
        int k = 0;
        int min;
        min = a;
        if (b < min){
            min = b;
        }
        if (c < min) {
            min = c;
        }
        if (i < min) {
            min = i;
        }
        if (k < min) {
            min = k;
        }
        System.out.println("Минимальное число из введенных равно " + min);
    }
}
