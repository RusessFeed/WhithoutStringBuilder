public class StringBuilder {
    public static void main(String[] args) {
        String peps = "hello";
        peps.toUpperCase();
        System.out.println(peps + " - не сработает");

        String pups = "Hello";
        pups = pups.toUpperCase();
        System.out.println(pups + " - сработает");
        Stringous stringous = new Stringous();
        stringous.bark();

    }
}

class Stringous {
    String string1 = "Hello";
    String string2 = "\tmy";
    String string3 = "\tfriend";
    String string4 = string1 + string2 + string3;

    void bark() {
        System.out.println(string4);
    }
}