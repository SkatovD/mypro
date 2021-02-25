package online9;

public class Main {
    public static void main(String[] args) {
        Animal animalMonkey = new Animal(10,"Слон");
         // to sting образовывает объект в текст в дачернем класе переписываем логику дочернего метода переобразование
        System.out.println(animalMonkey);
        Animal animalElephant = new Animal(10,"папва");
        boolean equelsAnimal = animalElephant.equals(animalMonkey);
        System.out.println(equelsAnimal);
        Animal elephant = new Elephant();
        elephant.voice();


    }
}
