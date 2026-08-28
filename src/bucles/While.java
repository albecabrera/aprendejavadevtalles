package bucles;

public class While {
    public static void main(String[] args) {
        for (int i = 2; i <= 5 ; i+=2) {
            System.out.println("Valor: " + i);
        }
        System.out.println("sale");

        int counter = 4;
        int acumulador = 0;
        while (counter < 5){
            System.out.println(counter);
            counter++;
            acumulador = acumulador + counter;
        }
        System.out.println("Acumuldor: " + acumulador);
    }
}
