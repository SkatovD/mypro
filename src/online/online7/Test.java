package online.online7;

public class Test {
    // 1- Поля классов переменые (характеристики объекта) описываю состояния объекта
    // 2 конструктор методов
    // 3 методы

    String mainName;
String descroption;
String PathToImage;
Question[] questions = new Question[20];
public void addQuestion (Question question){
    for (int i = 0; i < questions.length; i++) {
        if (questions[i] == null){
            questions[i] = question;
            break;
        }
        
    }

}


}
