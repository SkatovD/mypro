package online.online6;

public class Saper {
    public static void main(String[] args) {
        char[][] field = InitSaper.createField();
        String lvl = InitSaper.getYourLvl();
       InitSaper.FieldMines(field,lvl);
        InitSaper.printGameField(field);

    }
}
