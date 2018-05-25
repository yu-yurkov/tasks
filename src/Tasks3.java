import java.time.LocalDate;
import java.util.Scanner;

public class Tasks3 {
    public static void main(String[] args) {

    runner();


    }

    public static void runner(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите расстояние км: ");
        long km = sc.nextInt();

        System.out.println("Введите скорость м/с: ");
        int v = sc.nextInt();

        // переводим КМ в метры
        long meters = km * 1000;

        // вычисляем время бега в секундах
        long s = meters / v;

        long hours = s / 3600;
        long minutes = (s % 3600) / 60;
        long seconds = s % 60;

        System.out.println("Часов: " + hours);
        System.out.println("Минут: " + minutes);
        System.out.println("Секунд: " + seconds);

    }


}