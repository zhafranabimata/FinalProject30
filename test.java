import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jarak, liter, hargaPerLiter, biaya;

        System.out.print("Masukkan jarak tempuh (km): ");
        jarak = input.nextDouble();

        liter = jarak / 2.0;
        hargaPerLiter = 10000;
        biaya = liter * hargaPerLiter;
        
        System.out.println("Biaya bensin untuk perjalanan = Rp " + biaya);
        input.close();
    }
}
