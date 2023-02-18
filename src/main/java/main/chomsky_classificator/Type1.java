package main.chomsky_classificator;

public class Type1 extends ChomskyClassificationType {
    public Type1(String[] grammarByRow) {
        super(grammarByRow);
    }

    @Override
    public int determine(String s) {
        String[] grammarRow = s.split("->");
        if (grammarRow[0].length() <= grammarRow[1].length()){
            return 1;
        }
        return 0;
    }
}
