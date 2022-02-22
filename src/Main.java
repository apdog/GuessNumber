import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        gameLaunch();
    }

    public static void gameLaunch () {
        Scanner in = new Scanner(System.in);
        Random numb = new Random();
        int randInt;
        randInt = numb.nextInt(11) + 1;
        System.out.println("Попробуйте отгадать заданное компьютером число от 1 до 10. Введите вашу догадку: ");

        while (true) {
            int yourNumb = in.nextInt();
            if (yourNumb == randInt) {
                System.out.println("Совершенно верно! Это и есть загаданное мною число!");
                break;
            }
            else if (yourNumb > randInt)
            {
                System.out.println ("Загаданное мною число меньше.");
            }
            else
            {
                System.out.println ("Загаданное мною число больше.");
            }
        }
    }
}
