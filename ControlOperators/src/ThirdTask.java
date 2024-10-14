public class ThirdTask {
    public static void main(String[] args) {
        int n = 55;
        for (int i = 0; i <= n; i++){
            if ((i % 2) == 0) {
                System.out.println(i);
            } else {
                continue;
            }
        }
    }
}
