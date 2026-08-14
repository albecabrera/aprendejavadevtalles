package bediendungen;

public class Switch {
    public static void main(String[] args) {
        int tag = 9;
        switch (tag) {
            case 1:
                System.out.println("Heute ist Montag");
                break;
            case 2:
                System.out.println("Heute ist Dienstag");
                break;
            case 3:
                System.out.println("Heute ist Mittwoch");
                break;
            case 4:
                System.out.println("Heute ist Donnerstag");
                break;
            case 5:
                System.out.println("Heute ist Freitag");
                break;
            case 6:
                System.out.println("Heute ist Samstag");
                break;
            case 7:
                System.out.println("Heute ist Sonntag");
            default:
                System.out.println("Der eingegebene Tag ist nicht gültig!");
        }
    }
}
