public class Example {

    public static void main(String[] args) {

        Pair<String> stringPair = new Pair<>("Alice", "Bob");
        System.out.println("Original string pair: " + stringPair);
        stringPair.swap();
        System.out.println("Swapped string pair: " + stringPair);

        Pair<Integer> intPair = new Pair<>(1, 2);
        System.out.println("Original integer pair: " + intPair);
        intPair.swap();
        System.out.println("Swapped integer pair: " + intPair);
    }
}
