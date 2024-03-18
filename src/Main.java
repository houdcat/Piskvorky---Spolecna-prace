public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pole[][] plocha = new Pole[3][3];
        plocha[2][2] = new Pole(Obsah.NIC);
        ArrayChecker.check(plocha);
    }
}