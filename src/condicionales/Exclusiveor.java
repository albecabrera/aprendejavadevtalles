package condicionales;

public class Exclusiveor {
    public static void main(String[] args) {
        // exclusive or
        boolean jan_gewonnen = true;
        boolean tim_gewonnen = true;

        if (jan_gewonnen ^ tim_gewonnen) {
            System.out.println("richtiges Ergebnis!");
        } else {
            System.out.println("Da stimmt was nicht...");
        }
    }
}
