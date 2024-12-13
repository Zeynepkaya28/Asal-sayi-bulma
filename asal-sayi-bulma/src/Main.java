import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Yazdığınız sayının asal olup olmadığını bulan uygulama
        System.out.println("Asal sayı bulma uygulaması");
        System.out.println("bir sayı giriniz:");

        Scanner klavye = new Scanner(System.in);
        int sayi = klavye.nextInt();

        boolean asalMi=false;

        for (int i = 2; i < sayi; i++) {
            if(sayi%i==0) {
                asalMi=true;
                break; }
                else {
                    asalMi=false;}}

        if (asalMi=true) {
                    System.out.println("girdiğiniz"+" "+sayi+" "+"sayıyı asal değil.");}
                else {
                    System.out.println("girdiğiniz"+" "+sayi+" "+" "+"sayısı asaldır.");}
    }
}