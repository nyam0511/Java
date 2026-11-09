import java.util.Scanner;

public class Pass_Fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();

        // 점수가 60점 이상이면 합격, 아니면 불합격
        if ( score >= 60 ) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
    }
}
