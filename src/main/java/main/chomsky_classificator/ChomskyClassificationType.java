package main.chomsky_classificator;

public abstract class ChomskyClassificationType {
    protected String[] grammarByRow;
    protected int count;

    public ChomskyClassificationType(String[] grammarByRow) {
        this.grammarByRow = grammarByRow;
        count = 0;
    }

    public boolean getResult(){
        for (String s : grammarByRow){
            count += determine(s);
        }

        return Math.abs(count) == grammarByRow.length;
    }

    public abstract int determine(String s);
}