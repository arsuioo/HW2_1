import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        int price = 26148; // стоимость билета
        int bonus = 20; // одна бонусная миля
        int bonusMile = price / bonus; //бонусные мили
        System.out.println("Кол-во бонусных миль: " + bonusMile);
    }
}