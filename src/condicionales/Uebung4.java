package condicionales;

public class Uebung4 {
    public static void main(String[] args) {
        int alter = 80;
        if (alter < 6) {
            System.out.println("Eintritt frei.");
        } else if (alter > 6 && alter < 17) {
            System.out.println("Kindertarif: 5 Euro.");
        } else if (alter > 17 && alter < 64) {
            System.out.println("Normaltarif: 10 Euro.");
        } else
            System.out.println( "Seniorentarif: 7 Euro.");
    }
}
/*
 * Übung: Eintrittspreis berechnen
 *
 * Schreibe ein Java-Programm, das den Eintrittspreis für ein Kino
 * anhand des Alters berechnet.
 *
 * Lege eine Variable an:
 *
 * int alter = 25;
 *
 * Anforderungen:
 *
 * 1. Wenn das alter kleiner als 6 ist,
 *    soll ausgegeben werden:
 *    "Eintritt frei."
 *
 * 2. Wenn das alter zwischen 6 und 17 ist (einschließlich),
 *    soll ausgegeben werden:
 *    "Kindertarif: 5 Euro."
 *
 * 3. Wenn das alter zwischen 18 und 64 ist (einschließlich),
 *    soll ausgegeben werden:
 *    "Normaltarif: 10 Euro."
 *
 * 4. In allen anderen Fällen (65 oder älter) soll ausgegeben werden:
 *    "Seniorentarif: 7 Euro."
 *
 * Zusatzaufgabe:
 * Ändere den Wert von alter mehrmals und teste,
 * ob dein Programm richtig reagiert.
 */
