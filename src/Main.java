public class Main {
    public static void main(String[] args) {
        int account = 200; //Начальная сумма
        int deposit = 900; // Пополнение
        int bonus;
        if (deposit > 1000) {
            bonus = deposit/100;
            System.out.println("Кол-во бонусных рублей:" + bonus);
        } else bonus = 0; {
            System.out.println("Кол-во бонусных рублей:" + bonus);
        }
    }
}