package main.chomsky_classificator;

public class Type2 extends ChomskyClassificationType {
    public Type2(String[] grammarByRow) {
        super(grammarByRow);
    }

    @Override
    public int determine(String s) {
        String[] grammarRow = s.split("->");

        if (grammarRow[0].trim().length() == 1 && Character.isUpperCase(grammarRow[0].charAt(0))){
            return 1;
        }
        return 0;
    }
}
