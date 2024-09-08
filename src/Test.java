import java.util.Scanner;
public class Test{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker();
        while (true) {
            printMenu();
            int commands = scanner.nextInt();
            if (commands == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (commands == 2) {
                stepTracker.changeStepGoal();
            } else if (commands == 3) {
                stepTracker.printStatistic();
            } else if (commands == 4) {
                System.out.println("Пока!");
                break;
            } else {
                System.out.println("Такой команды не существует");
            }
        }
    }
    public static void printMenu() {
        System.out.println("1. Ввести количество шагов за определённый день");
        System.out.println("2. Изменить цель по количеству шагов в день");
        System.out.println("3. Напечатать статистику за определённый месяц");
        System.out.println("4. Выйти из приложения.");
    }
}