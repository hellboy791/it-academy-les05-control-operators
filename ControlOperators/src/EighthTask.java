public class EighthTask {
    public static void main(String[] args) {
        //Используя while, переведите число из десятичной в двоичную систему.
        int i = 375;
        int k;
        int bin;
        while (i > 0){
            k = i % 2;
            i = i / 2;
            System.out.print(k);
        }
    }
}
