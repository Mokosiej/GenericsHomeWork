import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вы хотите положить в Message строку или число? Введите 'строку' или 'число':");
        String choice = scanner.nextLine().toLowerCase();

        if (choice.equals("строку")) {
            System.out.println("Введите строку:");
            String input = scanner.nextLine();
            Message<String> message = new Message<>(input);
            System.out.println("Вы создали Message с содержимым: " + message);
        } else if (choice.equals("число")) {
            System.out.println("Введите число:");
            int input = scanner.nextInt();
            Message<Integer> message = new Message<>(input);
            System.out.println("Вы создали Message с содержимым: " + message);
        } else {
            System.out.println("Некорректный ввод. Пожалуйста, введите 'строку' или 'число'.");
        }
    }
}
