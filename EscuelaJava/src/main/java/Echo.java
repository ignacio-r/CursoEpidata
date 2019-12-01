import java.util.Scanner;

public class Echo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Integer num1 = input.nextInt();
        Double num2 = input.nextDouble();
        Double sum = num1 + num2;

        System.out.println(sum);
    }
}
