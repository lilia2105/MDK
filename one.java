import java.util.Scanner;

public class one{

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print ("Введите имя: ");
        String name = in.nextLine();
        System.out.print("Введите возраст: ");
        int age = in.nextInt();
        System.out.print("Введите вес: ");
        float height = in.nextFloat();
        System.out.printf("Имя:%s Возраст:%d Вес: %.2f \n", name, age, height);
        in.close();
    }
}