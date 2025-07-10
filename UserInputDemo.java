package yenipabka;

import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zehmet Olmasa Adinizi Daxil Edin");
        String name = sc.nextLine();
        System.out.println("Zehmet Olmasa Yasinizi Daxil Edin");
        int age = sc.nextInt();
        System.out.println(name + ' ' + age);
    }
}
// Tapşırıq 3: Scanner istifadə edərək İstifadəçi Daxilini Oxumaq
// UserInputDemo adlı bir sinif yaradın.
// İstifadəçinin adını və yaşını oxumaq üçün Scanner sinifindən istifadə edin.
// İstifadəçiyə onun adı və yaşı ilə bir salamlamanı çap edin.
// Tapsiriq yerine Yetirildi✅