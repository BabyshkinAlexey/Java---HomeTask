public class Sem_1 {
    public static void main(String[] args) {
    System.out.println("Введите свое имя: ");
    Scanner iScanner = new Scanner(System.in, "Cp866");
    String name = iScanner.nextLine();
    System.out.printf("Привет! %s ", name);
    }
    }