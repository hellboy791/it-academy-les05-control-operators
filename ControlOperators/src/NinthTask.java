public class NinthTask {
    public static void main(String[] args) {
        //Используя switch, выводите название дня недели по введённому
        int i = 2;
        switch (i){
            case 1:
                System.out.println("Понедельника");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("Допускаются только цифры от 1 до 7");
                break;
        }

    }
}
