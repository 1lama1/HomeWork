import java.util.Scanner;

public class homeWork {
    public static void checkLeapyear(int year) {
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year+" год является високосным ");
        }else {
            System.out.println(year+"  год не является високосным");
        }


    }

    public static void checkAndroid() {

        String AndIso;
        int clientDeviceYear;
        System.out.println("Введите платформу (Android/iSO) :");
        Scanner rty;
        rty = new Scanner(System.in);
        AndIso = rty.next();
        System.out.println("Введите год выпуска телефона :");
        Scanner rtyy;
        rtyy = new Scanner(System.in);
        clientDeviceYear = rtyy.nextInt();
        if (AndIso.equals("Android") && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (AndIso.equals("iSO") && (clientDeviceYear >= 2015)) {
            System.out.println("Установите версию приложения для iSO по ссылке");
        }
        else if (AndIso.equals("iSO") && (clientDeviceYear <= 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if(AndIso.equals("Android") && (clientDeviceYear <= 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

    }

    public static void checkTranspCard(int deliveryDistance ) {
            Scanner scan = new Scanner(System.in);
        System.out.println("Введите кол-во км, до адреса :");
        deliveryDistance = scan.nextInt();
            if (deliveryDistance<20){
                System.out.println("Доставка 1 день ");
            }
            if (deliveryDistance>=20 && deliveryDistance<60) {
                System.out.println("Доставка 2 дня");
            }
            if (deliveryDistance>=60 && deliveryDistance<100){
                System.out.println("Доставка 3 дня ");
            }

    }




    public static void main(String[] args) {
        int  deliveryDistance = 0;
        int year = 2000;
        checkLeapyear(year);
        checkAndroid();
        checkTranspCard(deliveryDistance);
        // Во

    }
}
