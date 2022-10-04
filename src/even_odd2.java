import java.util.Scanner;

public class even_odd2 {
    public static void main(String[] args) {
// 용준이와 봉찬이는 공기 놀이로 내기를 하였다.
// 만약 홀수개의 돌을 쥐게 되면 용준이가 이기게 되고, 짝수돌을 쥐게 되면 봉찬이가 이기는 것이 룰
// 어떤 자연수가 입력되면 홀수이면 odd출력, 짝수이면 even을 출력

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

    }
}