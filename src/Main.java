import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> products = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Добавить\n" + "2. Показать\n" + "3. Удалить\n" + "4. Поиск");
            String input = scanner.nextLine();

            int entered = Integer.parseInt(input);

            switch (entered) {
                case 1:
                    System.out.println("\nКакую покупку хотите добавить?");

                    String prod = scanner.nextLine();
                    products.add(prod);
                    System.out.println("Итого в списке покупок: " + products.size());
                    break;
                case 2:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Список покупок:");
                    for (int i = 0; i < products.size(); i++) {
                        System.out.println((i + 1) + ". " + products.get(i));
                    }
                    System.out.println("Какую хотите удалить? Введите номер или название");


                    String delete = scanner.nextLine();
                    if (products.contains(delete)) {
                        products.remove(delete);
                        System.out.println("Покупка " + delete + " удалена, список покупок:");
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println((i + 1) + ". " + products.get(i));
                        }
                    } else {
                        int delInteger = Integer.parseInt(delete);
                        System.out.println("Покупка " + products.get(delInteger - 1) + " удалена, список покупок:");
                        products.remove(delInteger - 1);

                    }
                    if (products.size() == 0) {
                        System.out.println("Список покупок:" + 0);
                    }
                case 4:
                    String search = scanner.nextLine();
                    String queryLower = search.toLowerCase();
                    for (int i = 0; i < products.size(); i++) {
                        String itemLower = products.get(i).toLowerCase();
                        if (itemLower.contains(queryLower)) {
                            System.out.println(itemLower);
                        }
                    }
            }
        }
    }
}
