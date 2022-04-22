import java.util.Scanner;
public class Vucut_Kitle_Indeksi {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double boy, kilo, indeks;
        System.out.print("Boyunuzu(metre cinsinden) Giriniz: ");
        boy= inp.nextDouble();
        System.out.print("Kilonuzu Giriniz: ");
        kilo= inp.nextDouble();

        indeks = kilo / (boy * boy);
        System.out.println("Vucut Kitle Indeksiniz: " + indeks);
    }
}
