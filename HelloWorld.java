import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Add meg a neved: ");
        String nev = scanner.nextLine();

        System.out.println("Add meg a nyelvet (magyar/angol/francia):");
        String nyelv = scanner.nextLine();

        String udvozles = udvozol(nev, nyelv);
        System.out.println(udvozles);

        scanner.close();
    }

    public static String udvozol(String nev, String nyelv) {
        String udvozlet = "";

        switch (nyelv.toLowerCase()) {
            case "angol":
                udvozlet = "Hello, " + nev + "!";
                break;
            case "francia":
                udvozlet = "Bonjour, " + nev + "!";
                break;
            case "magyar":
                udvozlet = "Helló, " + nev + "!";
                break;
            default:
                udvozlet = "Ismeretlen nyelvet választottál.";
                break;
        }

        return udvozlet;
    }
}
