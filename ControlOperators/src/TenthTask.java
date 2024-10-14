public class TenthTask {
    public static void main(String[] args) {
        //Используйте switch для создания калькулятора, выполняющего
        //базовые операции.
        String operation = "*";
        double x = 12;
        double y = 87;
        double res = 0;
        switch (operation){
            case "+":
                res = x + y;
                System.out.println(x + operation + y + " = " + res);
                break;
            case "-":
                res = x - y;
                System.out.println(x + operation + y + " = " + res);
                break;
            case "*":
                res = x * y;
                System.out.println(x + operation + y + " = " + res);
                break;
            case "/":
                res = x / y;
                System.out.println(x + operation + y + " = " + res);
                break;
            default:
                System.out.println("Неизвестная операция");
                break;
        }

        //System.out.println("Результат операции " + operation + " равен " + res);
    }
}
