package main.chomsky_classificator;

public class Type3 extends ChomskyClassificationType {
    public Type3(String[] grammarByRow) {
        super(grammarByRow);
    }

    @Override
    public int determine(String s) {
        String[] grammarRow = s.split("->");
        if (Character.isUpperCase(grammarRow[0].charAt(0))){
            boolean isFirstUpper = Character.isUpperCase(grammarRow[1].charAt(0));
            boolean isLastUpper = Character.isUpperCase(grammarRow[1].charAt(grammarRow[1].length() - 1));
            boolean isMiddleElementsUpper = false;

            for (int i = 1; i < grammarRow[1].length() - 1; i++){
                if (Character.isUpperCase(grammarRow[1].charAt(i))){
                    isMiddleElementsUpper = true;
                    break;
                }
            }

            if (isFirstUpper && !(isFirstUpper && isLastUpper) && !isMiddleElementsUpper){
                return 1;
            }
            else if (isLastUpper && !(isFirstUpper && isLastUpper) && !isMiddleElementsUpper){
                return -1;
            }
        }
        return 0;
    }

    @Override
    public String toString() {
        if (count > 0){
            return "выровненная влево";
        }
        else if (count < 0){
            return "выровненная вправо";
        }
        return "";
    }
}
