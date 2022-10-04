import java.util.Scanner;

public class CurrencyCnt {
    public static void main(String[] args) {

        int[] currencyType = new int[] {50000, 10000, 5000, 1000, 500, 100};

        int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;


        int refund = 25000;

        // 25,000원을 5만원으로 남았을 때의 몫, 나머지
        // 25,000원을 각 화폐 단위로 나누었을 때 몫과 나머지 출력
        // 각 화폐 단위는 위와 같이 각각 변수로 선언 해주세요.
        System.out.printf("5만원권 %d장\n", refund / curr50000, refund % curr50000);
        System.out.printf("1만원권 %d장\n", refund / curr10000, refund % curr10000);
        System.out.printf("5천원권 %d장\n", refund / curr5000, refund % curr5000);
        System.out.printf("1천원권 %d장\n", refund / curr1000, refund % curr1000);
        System.out.printf("5백원 %d개\n", refund / curr500, refund % curr500);
    }
}