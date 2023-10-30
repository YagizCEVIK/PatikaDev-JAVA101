package KullaniciGirisi;

import java.util.Scanner;
public class KullaniciGirisi {
        public static void main(String[] args){
            String username, password,passwordChange, npassword;
            Scanner giris = new Scanner(System.in);

            System.out.println("Kulanıcı adı: ");
            username = giris.nextLine();

            if(username.equals("yagiz")){

                System.out.println("Şifre: ");
                password = giris.nextLine();

                if(username.equals("yagiz") &&  password.equals("yagiz123") ){
                    System.out.println("Başarılı bir şekilde giriş yapıldı.");

                }else{
                    System.out.println("Şifre hatalı. Şifrenizi Değiştirmek için y değiştirmemek için n tuşuna basınız.");
                    passwordChange = giris.nextLine();
                    if(passwordChange.equals("y")){
                        System.out.println("Yeni şifrenizi giriniz");
                        npassword = giris.nextLine();

                        switch (npassword){
                            case("yagiz123"):
                                System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                                break;
                            default:
                                password = npassword;
                                System.out.println("Şifre oluşturuldu");
                                System.out.println("Parolanız: "+ password);

                        }

                    }else{
                        System.out.println("Şifreniz değiştirilmedi.");
                    }


                }
            }else{
                System.out.println("Kullanıcı adı yanlış, tekrar deneyiniz.");
            }
        }

    }
