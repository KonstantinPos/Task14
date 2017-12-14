import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        double m = scanner.nextDouble();
        double n = scanner.nextDouble();
        if ((10 - m) > (10 - n)) {
            System.out.println("Ближайшее число к 10 будет "+n);
        } else {
            System.out.println("Ближайшее число к 10 будет "+m);
        }
    }
}
