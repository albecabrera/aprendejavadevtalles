package condicionales;

public class Condicional_if {
    public static void main(String[] args) {
        // haz un ejercicio sobre la calificación para entrar en el preuniversitario
        int age = 13;
        if (age>=15) {
            System.out.println("Du kannst bereits in die Oberstufe gehen");
        } else if (age>=13) {
            System.out.println("Du kannst fast hingehen!");
        } else
        System.out.println("Du musst noch älter werden und bessere Noten erzielen");
    }
}
