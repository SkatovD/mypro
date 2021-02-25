package online.online7;

public class Main {
    public static void main(String[] args) {

        Test endlishTest = new Test();
        Test findYourSelf = new Test();
        endlishTest.mainName = "Найди григория";
        findYourSelf.mainName = "Найди мою собаку";
        System.out.println();
Question question1 = new Question();

endlishTest.addQuestion(question1);
    }
}
