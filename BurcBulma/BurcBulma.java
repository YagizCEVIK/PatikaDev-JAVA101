package BurcBulma;

import java.util.Scanner;
public class BurcBulma {
     public static void main(String[] args) {
            int month, day;
            Scanner inp = new Scanner(System.in);
            System.out.println("Doğum ayınız 1'den 12'ye kadar bir sayı kullanarak belirtiniz");
            month = inp.nextInt();
            System.out.println("Doğum gününüzü belirtiniz");
            day = inp.nextInt();
            if (month == 1 && day <= 31 && day >= 1) {
                if (day <= 21) {
                    System.out.println("Burcunuz oğlak");
                } else {
                    System.out.println("Burcunuz kova");
                }
            } else if (month == 2 && day <= 28 && day >= 1) {
                if (day <= 19) {
                    System.out.println("Burcunuz kova");
                } else {
                    System.out.println("Burcunuz balık");
                }
            } else if (month == 3 && day <= 31 && day >= 1) {
                if (day <= 20) {
                    System.out.println("Burcunuz balık");
                } else {
                    System.out.println("Burcunuz koç");
                }

            } else if (month == 4 && day <= 30 && day >= 1) {
                if (day <= 20) {
                    System.out.println("Burcunuz koç");
                } else {
                    System.out.println("Burcunuz boğa");
                }
            } else if (month == 5 && day <= 31 && day >= 1) {
                if (day <= 21) {
                    System.out.println("Burcunuz boğa");
                } else {
                    System.out.println("Burcunuz ikizler");
                }

            } else if (month == 6 && day <= 30 && day >= 1) {
                if (day <= 22) {
                    System.out.println("Burcunuz ikizler");
                } else {
                    System.out.println("Burcunuz yengeç");
                }

            } else if (month == 7 && day <= 31 && day >= 1) {
                if (day <= 22) {
                    System.out.println("Burcunuz yengeç");
                } else {
                    System.out.println("Burcunuz aslan");
                }

            } else if (month == 8 && day <= 31 && day >= 1) {
                if (day <= 23) {
                    System.out.println("Burcunuz aslan");
                } else {
                    System.out.println("Burcunuz başak");
                }
            } else if (month == 9 && day <= 30 && day >= 1) {
                if (day <= 22) {
                    System.out.println("Burcunuz başak");
                } else {
                    System.out.println("Burcunuz terazi");
                }

            }else if (month == 10 && day <= 31 && day >= 1) {
                if (day <= 22) {
                    System.out.println("Burcunuz terazi");
                } else {
                    System.out.println("Burcunuz akrep");
                }
            }else if (month == 11 && day <= 30 && day >= 1) {
                if (day <= 21) {
                    System.out.println("Burcunuz akrep");
                } else {
                    System.out.println("Burcunuz yay");
                }
            }else if (month == 12 && day <= 31 && day >= 1) {
                if (day <= 21) {
                    System.out.println("Burcunuz yay");
                } else {
                    System.out.println("Burcunuz oğlak");
                }
            }
        }
}
