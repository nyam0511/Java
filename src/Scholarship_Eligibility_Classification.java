import java.util.Scanner;

public class Scholarship_Eligibility_Classification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // 점수에 따라 장학금 출력(75점 미만은 출력 X)
        if ( score >= 95 ) {
            System.out.println("전액 장학금");
        } else if ( score >= 85 ) {
            System.out.println("반액 장학금");
        } else if ( score >= 75 ) {
            System.out.println("기숙사 장학금");
        }
    }
}