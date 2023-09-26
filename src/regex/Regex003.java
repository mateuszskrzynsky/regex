package regex;

public class Regex003 {
    public static void main(String[] args) {


        RegexTester firstNameTester = new RegexTester("[A-Z][a-z]*");
        firstNameTester.validate("Urszula");
        firstNameTester.validate("Tomek");
        firstNameTester.validate("Janusz");
        firstNameTester.validate("Janusz");

        RegexTester surnameTester = new RegexTester("([a-zA-Z][a-zA-Z]*[-\\s]?)+[A-Z][a-zA-Z]*");
        surnameTester.validate("Kowalski");
        surnameTester.validate("von der Leyen");
        surnameTester.validate("von der Leyen Aasd");
        surnameTester.validate("von der Leyen-Kowalska");
        surnameTester.validate("Bachleda-Curus");
        surnameTester.validate("de Silva");
        surnameTester.validate("De Silva");
        surnameTester.validate("123123123");
        surnameTester.validate("12312-3123");
        surnameTester.validate("de 12312-3123");
    }
}
