package main;

public class Main {
    public static void main(String[] args) {
        String[] grammar = Reader.read();
        ChomskyClassificator chomskyClassificator = new ChomskyClassificator();
        System.out.println(chomskyClassificator.getType(grammar));
    }
}