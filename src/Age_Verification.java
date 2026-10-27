import java.util.Scanner;

public class Age_Verification {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        // age가 18세 이상이면 "성인입니다" 출력
        if ( age >= 18 ) {
            System.out.println("성인입니다");
        }
    }
}
