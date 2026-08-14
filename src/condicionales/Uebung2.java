package condicionales;

public class Uebung2 {
    public static void main(String[] args) {

         int alter = 11;
         int mindesalter = 16;
         if (alter >= mindesalter) {
             System.out.println("Du darfst den Film sehen");
         } else if (alter < mindesalter && alter >= 12) {
             System.out.println("Du darfst den Film nur mit Begleitung sehen.");
         } else
             System.out.println("Du darfst den Film nicht sehen.");
        /*
         * Übung: Alterskontrolle im Kino
         *
         * Schreibe ein Java-Programm, das prüft, ob eine Person
         * einen bestimmten Film sehen darf.
         *
         * Lege zwei Variablen an:
         *
         * int alter = 15;
         * int mindestalter = 16;

         *
         * Anforderungen:
         *
         * 1. Wenn alter größer oder gleich mindestalter ist,
         *    soll ausgegeben werden:
         *    "Du darfst den Film sehen."
         *
         * 2. Wenn alter kleiner als mindestalter ist,
         *    aber mindestens 12 Jahre alt ist,
         *    soll ausgegeben werden:
         *    "Du darfst den Film nur mit Begleitung sehen."
         *
         * 3. In allen anderen Fällen soll ausgegeben werden:
         *    "Du darfst den Film nicht sehen."
         *
         * Zusatzaufgabe:
         * Ändere den Wert von alter mehrmals und teste,
         * ob dein Programm richtig reagiert.
         */
    }
}
