import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int r;
        double cevre;
        double alan;
        System.out.print("Lutfen yaricapi 'r' giriniz: ");
        r=input.nextByte();

        cevre=2*Math.PI*r;

        alan=Math.PI*r*r;





        System.out.println("Yaricapini girdiginiz dairenin alani: "+ alan+ " m2'dir.");
        System.out.println("Yaricapini girdiginiz dairenin cevresi: "+ cevre+ " m'dir.");
    }
}