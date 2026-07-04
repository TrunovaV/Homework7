//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        System.out.println("Задание 1");

        int firstFriday = 5;
        int i = 1;
        for (; i <= 31; i++) {
            if ((i - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + i + "-у число. Необходимо подготовить отчет");
            }
        }
        System.out.println("Задание 2");

        int distance = 42195;
        int distanceCovered = 0;
        do {
            System.out.println("Держитесь! Осталось " + distance + " метров");
            distanceCovered = distanceCovered + 500;
            distance = distance - 500;
        }
        while (distance > 0 && distanceCovered < 42195);

        int distance1 = 42195;
        for( int distanceCovered1 = 0; distanceCovered1 < 42195; distanceCovered1 = distanceCovered1 + 500) {
            distance1 = distance1 - 500;
            System.out.println("Держитесь! Осталось " + distance1  + " метров");
            if (distance1 < 500) {
                break;
            }

        }
        System.out.println("Задание 3");

        int balance = 1900;
        int parkingDays = 0;
        while (true) {
            if (parkingDays % 5 == 0) {
                parkingDays++;
                continue;
            }
            System.out.println("Ты можешь оставить автомобиль на " + parkingDays + " дней");
            balance = balance - 100;
            if (balance < 100) {
                break;
            }
            parkingDays++;
        }

        int balance1 = 1900;
        int parkingDays1 = 0;
        for (; balance1 >= 100; parkingDays1++) {

            if (parkingDays1 % 5 == 0) {
                continue;
            }
            balance1 = balance1 - 100;
            System.out.println("Ты можешь оставить автомобиль на " + parkingDays1 + " дней");
        }

        System.out.println("Задание 4");

        int month = 0;
        int total = 0;
        while (true) {
            month++;
            if (month % 6 == 0) {
                total = total * 7 / 100 + total;
            }
            total = total + 15000;
            System.out.println("За " + month + " месяцев накоплено " + total + " рублей");
            if (total >= 12_000_000) {
                System.out.println("Чтобы накопить 12 000 000 тебе понадобиться " + month + " месяцев!");
                break;
            }
        }

        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheats = 0;
        while (charge < 100 && overheats <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                minute++;
                continue;
            }
            charge = charge + 2;
            System.out.println("Через " + minute + " минут, зарядка " + charge);
            if (overheats == 3){
                System.out.println("Время зарядки составило " + minute + " минут");
                break;
            }

        }

    }
}