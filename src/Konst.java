import java.util.Scanner;

public class Konst {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите любое число:");
        int T = scanner.nextInt();

        int x = 20;
        int y = 3243;
        int z = 4533246;

        if (T==x||T==y||T==z)
        {
            System.out.println("Данное значение имеется в константах");
        }

        else
        {
            System.out.println("Такой константы нет!");
        }
    }
}
