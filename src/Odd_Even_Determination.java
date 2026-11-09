import java.util.Scanner;

public class Odd_Even_Determination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n을 2로 나누었을 때 0이면 짝수, 아니면 홀수
        if ( n % 2 == 0 ) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }
    }
}