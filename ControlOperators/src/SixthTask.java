public class SixthTask {
    public static void main(String[] args) {
        //Используя do-while, выведите первые N чисел Фибоначчи.
        int n = 10000;
        int first = 0;
        int second = 1;

        do {
            first = first + second;
            System.out.println(first);
            second = second + first;
            System.out.println(second);
        } while (second <= n);


    }
}
