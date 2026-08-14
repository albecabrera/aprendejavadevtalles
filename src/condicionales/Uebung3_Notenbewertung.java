package condicionales;

public class Uebung3_Notenbewertung {
    public static void main(String[] args) {
        int note = 5;
        if (note == 1) {
            System.out.println("Sehr gut!");

        } else if (note > 1 && note <= 3) {
            System.out.println("Gut gemacht!");

        } if (note == 4) {
            System.out.println("Bestanden.");
        } else
            System.out.println("Nicht bestanden oder ungültige Note");
        {

        }
    }
}
/*
 * Übung: Notenbewertung
 *
 * Schreibe ein Java-Programm, das eine Schulnote bewertet.
 *
 * Lege eine Variable an:
 *
 * int note = 3;
 *
 * Anforderungen:
 *
 * 1. Wenn die note 1 ist,
 *    soll ausgegeben werden:
 *    "Sehr gut!"
 *
* 2. Wenn die note 2 oder 3 ist,
         *    soll ausgegeben werden:
         *    "Gut gemacht!"
         *
         * 3. Wenn die note 4 ist,
         *    soll ausgegeben werden:
         *    "Bestanden."
         *
         * 4. In allen anderen Fällen soll ausgegeben werden:
         *    "Nicht bestanden oder ungültige Note."
         *
         * Zusatzaufgabe:
         * Ändere den Wert von note mehrmals und teste,
         * ob dein Programm richtig reagiert.
         */