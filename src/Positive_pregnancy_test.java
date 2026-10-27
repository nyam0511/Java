import java.util.Scanner;

public class Positive_pregnancy_test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // n이 양수이면 "양수입니다" 출력
        if ( n > 0 ) {
            System.out.println("양수입니다");
        }
    }
}
