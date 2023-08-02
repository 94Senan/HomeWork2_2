public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");;
        int a = 100; //сумма на счете
        int b = 1200; //сколько положили на счет
        int c =b/100; //бонусы
        int d = a+c; //общая сумма на счету

        if (b > 1000) {
            System.out.println("Вам начислен балл - ");
            System.out.println(c);
            System.out.println("У вас на счету ");
            System.out.println(d);
        } else {
            boolean b1 = b < 1000;
            System.out.println("Вам начислен балл - 0");
            System.out.println("У вас на счету " + a);
        }


    }
}
