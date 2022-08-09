import java.util.Scanner;

public class homeWork {
    public void isLeapyear(int year) {
        if(year%4==0 && year%100 !=0 || year%400==0){
            System.out.println(year+"  год является високосным");
        }else {
            System.out.println(year+"  год не является високосным");
        }


    }

    public  void checkActualOs(int year, int clientOs) {


        if (clientOs == 0 && year == 2022) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOs ==0 && year<= 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if (clientOs ==1 && year == 2022) {
            System.out.println("Установите версию приложения для iSO по ссылке");
        } else if(clientOs ==1 && year <= 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Система не обслуживается");
        }
        }


    public  int  calculateDeliveryDays(int distance ) {

            if (distance<20){
                return 1;
            }
            if (distance>=20 && distance<60) {
                return 2;
            }
            if (distance>=60 && distance<100){
                return 3;
            }else {
                throw new RuntimeException("Неверное значение");
            }

    }





    public static void main(String[] args) {
        int  deliveryDistance = 0;
        int year = 2011;
        int clientOs = 0;
        homeWork homeWork = new homeWork();
        homeWork.isLeapyear(year);
        homeWork.checkActualOs( clientOs,year );

        int distanceDelivery = 20;
        homeWork.calculateDeliveryDays(distanceDelivery);
        System.out.println(homeWork.calculateDeliveryDays(distanceDelivery) + " days");
        // Во

    }
}
