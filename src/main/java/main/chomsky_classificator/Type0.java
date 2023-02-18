package main.chomsky_classificator;

public class Type0 extends ChomskyClassificationType {
    public Type0(String[] grammarByRow) {
        super(grammarByRow);
    }

    @Override
    public int determine(String s) {
        return 1;
    }
}