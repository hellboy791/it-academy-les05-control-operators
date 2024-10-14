public class SeventhTask {
    public static void main(String[] args) {
        //С помощью while, посчитайте количество цифр в числе.

        int num = 890879876;
        int count = 0;
        while (num != 0){
            num /= 10;
            count++;
        }
        System.out.println("В числе " + num + " " + +count + " чисел");
    }
}
