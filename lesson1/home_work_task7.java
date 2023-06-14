package lesson1;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class home_work_task7 {
    public static void main(String[] args) {
        six();
    }
// 3. В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида:
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
    private static void six() {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Здравствуйте, введите ваше имя: ");
        String name = in.nextLine();
        LocalTime now = LocalTime.now();
        int hourDay = now.get(ChronoField.HOUR_OF_DAY); // 0 - 23

        if (hourDay > 5 && hourDay < 12) {
            System.out.println("Доброе утро, " + name + "!");
        if(hourDay > 12 && hourDay < 18)
            System.out.println("Добрый день, " + name + "!");
        if(hourDay > 18 && hourDay < 24)
            System.out.println("Добрый вечер, " + name + "!");
        if(hourDay > 0 && hourDay < 5)
            System.out.println("Доброй ночи, " + name + "!");
        }
        in.close();
    }
}
