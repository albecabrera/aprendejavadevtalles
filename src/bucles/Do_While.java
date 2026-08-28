package bucles;

public class Do_While {
        public static void main(String[] args) {
            for (int i = 2; i <= 5 ; i+=2) {
                System.out.println("Valor: " + i);
            }
            System.out.println("sale");

            int counter = 0;
            int acumulador = 0;
            while (counter < 5){
                System.out.println(counter);
                counter++;
                acumulador = acumulador + counter;
            }
            System.out.println("Acumuldor: " + acumulador);

            int counter2 = 0;
            do {
                System.out.println("Counter 2: " + counter2);
                counter2++;
        }while (counter2<5);
    }
}
