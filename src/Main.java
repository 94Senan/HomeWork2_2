public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");;
        int InitialMoney = 100; //изначальная сумма на счете
        int money = 1200; //сколько денег положили на счет
        int bonus =money/100; //бонусы
        int sum = InitialMoney+bonus; //общая сумма на счету

        if (money > 1000) {
            System.out.println("Вам начислен балл - ");
            System.out.println(bonus);
            System.out.println("У вас на счету ");
            System.out.println(sum);
        } else {
            boolean b1 = money < 1000;
            System.out.println("Вам начислен балл - 0");
            System.out.println("У вас на счету " + InitialMoney);
        }


    }
}
