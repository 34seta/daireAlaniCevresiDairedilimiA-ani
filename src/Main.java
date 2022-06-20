import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r;
        double cevre;
        double alan;
        //alfa; daire dilimi açısı
        double alfa;
        System.out.print("Lutfen yaricapi 'r' giriniz: ");
        r = input.nextByte();
        alfa = input.nextDouble();

        cevre = 2 * Math.PI * r;

        alan = Math.PI * r * r;

        double daireDilimiAlani = (alan * alfa) / 360;

        System.out.println("Yaricapini girdiginiz dairenin alani: " + alan + " m2'dir.");
        System.out.println("Yaricapini girdiginiz dairenin cevresi: " + cevre + " m'dir.");
        System.out.println("Yaricapini ve ALFA açisini girdiginiz dairenin diliminin: " + daireDilimiAlani + " m2'dir.");
    }
}