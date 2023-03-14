import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;
        int bolen = 0;
        int ortalama;

        System.out.print("Matematik notunuz : ");
        matematik = input.nextInt();

        if((matematik > 0 ) && (matematik < 100)) {
            bolen++;
        }
        else {
            matematik = 0;
        }

        System.out.print("Fizik notunuz : ");
        fizik = input.nextInt();

        if((fizik > 0 ) && (fizik < 100)) {
            bolen++;
        }
        else{
            fizik = 0;
        }

        System.out.print("Türkçe notunuz : ");
        turkce = input.nextInt();

        if((turkce > 0 ) && (turkce < 100)) {
            bolen++;
        }
        else{
            turkce = 0;
        }

        System.out.print("Kimya notunuz : ");
        kimya = input.nextInt();

        if((kimya > 0 ) && (kimya < 100)) {
            bolen++;
        }
        else{
            kimya = 0;
        }

        System.out.print("Müzik notunuz : ");
        muzik = input.nextInt();

        if((muzik > 0 ) && (muzik < 100)) {
            bolen++;
        }
        else{
            muzik = 0;
        }

        ortalama = matematik + fizik + turkce + kimya + muzik;

        System.out.println("Ortalamanız : " + (ortalama/bolen));

        if((ortalama/bolen) >= 55){
            System.out.print("Geçtiniz.");
        }
        else if ((ortalama/bolen) < 55) {
            System.out.print("Kaldınız.");
        }
    }
}