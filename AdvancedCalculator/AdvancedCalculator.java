package AdvancedCalculator;
import java.util.Scanner;
public class AdvancedCalculator
{
    static void sum()
    {
    int ncount;
    double result = 0;
    Scanner inp = new Scanner(System.in);
    System.out.println("How many numbers will you enter: ");
    ncount = inp.nextInt();
    for(int i = 1; i <= ncount; i++)
    {
        if (ncount == 0)
        {
            break;
        }
        System.out.println("Enter the " +i+". number: ");
        double sumn = inp.nextDouble();
        result += sumn;
    }
    System.out.println("Sum of the numbers is "+result);
    }

    static void minus()
    {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many numbers will you enter: ");
    int counter = scan.nextInt();
    int number, result = 0;

    for (int i = 1; i <= counter; i++)
    {
        System.out.print(i + ". number :");
        number = scan.nextInt();
        if (i == 1)
        {
            result += number;
            continue;
        }
        result -= number;
    }

    System.out.println("The substraction result : " + result);
    }

    static void times()
    {
    int ncount;
    double result = 0;
    Scanner inp = new Scanner(System.in);
    System.out.println("How many numbers will you enter: ");
    ncount = inp.nextInt();
    for(int i = 1; i <= ncount; i++)
    {

        System.out.println("Enter the " +i+". number: ");
        double timesn = inp.nextDouble();
        result *= timesn;
    }
    System.out.println("Product of the numbers is "+result);
    }


    static void divided() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Kaç adet sayı gireceksiniz :");
    int counter = scan.nextInt();
    double number, result = 0.0;

    for (int i = 1; i <= counter; i++) {
        System.out.print(i + ". sayı :");
        number = scan.nextDouble();
        if (i != 1 && number == 0) {
            System.out.println("Böleni 0 giremezsiniz.");
            continue;
        }
        if (i == 1) {
            result = number;
            continue;
        }
        result /= number;
    }

    System.out.println("Sonuç : " + result);
    }
    static void power() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Taban değeri giriniz :");
    int base = scan.nextInt();
    System.out.print("Üs değeri giriniz :");
    int exponent = scan.nextInt();
    int result = 1;

    for (int i = 1; i <= exponent; i++) {
        result *= base;
    }

    System.out.println("Sonuç : " + result);
    }

    static void factorial() {
    Scanner scan = new Scanner(System.in);
    System.out.print("Sayı giriniz :");
    int n = scan.nextInt();
    int result = 1;

    for (int i = 1; i <= n; i++) {
        result *= i;
    }

    System.out.println("Sonuç : " + result);
    }

    static void mod(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bölünenin değerini giriniz : ");
        int bolunen = scan.nextInt();
        System.out.println("Böleni giriniz : ");
        int bolen = scan.nextInt();
        double kalan = bolunen % bolen;
        System.out.println("Sayıların modu : " + kalan);
    }

    static void dikdortgen(){
        Scanner scan = new Scanner(System.in);
        System.out.println("1- Dikdörtgen Alan Hesaplama\n2- Dikdörtgen Çevre Hesaplama");
        int nu = scan.nextInt();
        System.out.println("Kısa kenarı giriniz: ");
        double kisak = scan.nextDouble();
        System.out.println("Uzun kenarı giriniz: ");
        double uzunk = scan.nextDouble();

        switch (nu){
            case(1):
                double alan = kisak * uzunk;
                System.out.println("Dikdörtgen alanı : " + alan);
                break;
            case(2):
                double cevre = (kisak+uzunk)*2;
                System.out.println("Dikdörtgen çevresi : "+ cevre);
        }

    }


    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int select;
    String menu = "1- Toplama İşlemi\n"
            + "2- Çıkarma İşlemi\n"
            + "3- Çarpma İşlemi\n"
            + "4- Bölme işlemi\n"
            + "5- Üslü Sayı Hesaplama\n"
            + "6- Faktoriyel Hesaplama\n"
            + "7- Mod Alma\n"
            + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
            + "0- Çıkış Yap";

    do {
        System.out.println(menu);
        System.out.print("Lütfen bir işlem seçiniz :");
        select = scan.nextInt();
        switch (select) {
            case 1:
                sum();
                break;
            case 2:
                minus();
                break;
            case 3:
                times();
                break;
            case 4:
                divided();
                break;
            case 5:
                power();
                break;
            case 6:
                factorial();
                break;
            case 7:
                mod();
                break;
            case 8:
                dikdortgen();
                break;
            case 0:
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
        }
    } while (select != 0);


    }
}
