import java.util.Scanner;
public class two {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float pervoe = scan.nextFloat();

        System.out.println("Введите знак(оператор): ");
        char znak = scan.next().charAt(0);

        System.out.println("Введите второе число: ");
        float vtoroe = scan.nextFloat();

        float res = 0;

        if(znak=='+') {
            res = pervoe + vtoroe;
            System.out.println(pervoe+" + "+vtoroe+" = "+ res);
        } else if (znak=='-') {
            res = pervoe - vtoroe;
            System.out.println(pervoe+" - "+vtoroe+" = "+ res);
        } else if (znak=='*') {
            res = pervoe * vtoroe;
            System.out.println(pervoe+" * "+vtoroe+" = "+ res);
        }else if (znak=='/') {
            res = pervoe / vtoroe;
            System.out.println(pervoe+" / "+vtoroe+" = "+ res);
        }


    }
}