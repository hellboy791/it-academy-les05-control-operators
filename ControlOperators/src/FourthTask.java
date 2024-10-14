public class FourthTask {
    public static void main(String[] args) {
        //Используйте for и break для проверки, является ли число простым.
        int num = 114;
        boolean isPrime;
        isPrime = false;
        if (num == 2){
            isPrime = true;
        }
        if (num > 1 && !isPrime ){
            for (int i = 2; i <= num / 2; i++){
                if (num % i == 0){
                    isPrime = false;
                    break;
                } else {
                    isPrime = true;
                }
            }
        }
        if (isPrime){
            System.out.println("Число является простым");
        } else {
            System.out.println("Число является составным");
        }
    }
}
