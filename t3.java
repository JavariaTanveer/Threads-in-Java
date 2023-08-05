package lab12;
public class t3 {
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            sum += square;
        }
        System.out.println("Sum of squares: " + sum);
    }
}