package regex;
/*
Napisz program, który pobiera od użytkownika tekst i sprawdza,
 czy w podanym tekście wystąpiła data w formacie YYYY-MM-DD.
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadź date: ");
        String text = scanner.nextLine();
        String regex = "(\\d\\d-(?:0[1-9]|1[0-2])-(?:0[1-9]|1\\d|2[0-9]|3[0-1])\n";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
            System.out.println("W tekście znaleziono datę w formacie YYYY-MM-DD: " + matcher.group());
        } else {
            System.out.println("W tekście nie znaleziono daty w formacie YYYY-MM-DD.");
        }
    }
}
