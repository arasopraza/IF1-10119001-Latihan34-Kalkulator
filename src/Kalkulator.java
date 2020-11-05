import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Arsy Opraza Akma
 * KELAS    : IF1
 * NIM      : 10119001
 * Deskripsi Program: Program kalkulator OOP
 * dimana angkanya diinput oleh user
 *
 */

public class Kalkulator {
    public double value1, value2;

    public double tambahBilangan() {
        return value1 + value2;
    }

    public double kurangBilangan() {
        return value1 - value2;
    }

    public double kaliBilangan() {
        return value1 * value2;
    }

    public double bagiBilangan() {
        return value1 / value2;
    }

    public double sisaBilangan() {
        return value1 % value2;
    }

    public static void main(String[] args) {

        Kalkulator kalkulator = new Kalkulator();
        Scanner scanner = new Scanner(System.in);
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();

        System.out.println("Hasil Pertambahan : " + kalkulator.tambahBilangan());
        System.out.println("Hasil Pengurangan : " + kalkulator.kurangBilangan());
        System.out.println("Hasil Perkalian : " + kalkulator.kaliBilangan());
        System.out.println("Hasil Pembagian : " + kalkulator.bagiBilangan());
        System.out.println("Hasil Sisa : " + kalkulator.sisaBilangan());
    }
}
