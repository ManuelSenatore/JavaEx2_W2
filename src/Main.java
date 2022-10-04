import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Ex3 c1 = new Ex3();
        Scanner input = new Scanner(System.in);
        

        System.out.println("inserisci nome");
        String name = input.next();
        System.out.println("inserisci numero");
        int number = input.nextInt();
        c1.setContatto(name, number);
        System.out.println("Cerca un numero nella rubrica");
        int numberSq = input.nextInt();
        c1.findContattoByNumber(numberSq);
        System.out.println("Ecco la tua rubrica");
        c1.getRubrica();

    }
}