public class FifthTask {
    public static void main(String[] args) {
        //Напишите программу для вычисления факториала числа с
        //использованием while.
        int x = 8;
        int i = 1;
        int fact = 1;
        while (i <= x){
            fact = fact * i;
            i++;
        }
        System.out.println("Фактериал числа " + x + " равен " + fact);
    }
}
