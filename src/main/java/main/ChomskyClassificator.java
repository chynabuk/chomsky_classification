package main;

import main.chomsky_classificator.*;

public class ChomskyClassificator {
    private ChomskyClassificationType chomskyClassificationType;

    public String getType(String[] grammar){
        chomskyClassificationType = new Type3(grammar);
        if (!chomskyClassificationType.getResult()){
            chomskyClassificationType = new Type2(grammar);

            if (!chomskyClassificationType.getResult()){
                chomskyClassificationType = new Type1(grammar);

                if (!chomskyClassificationType.getResult()){
                    chomskyClassificationType = new Type0(grammar);

                    return "Тип 0";
                }
                return "Тип 1(Контекстно-зависимая грамматика)";
            }
            return "Тип 2(Контекстно-свободная грамматика)";
        }

        return "Тип 3(Регулярная грамматика, " + chomskyClassificationType.toString() + ")";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}