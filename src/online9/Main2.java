package online9;

public class Main2 {
    public static void main(String[] args) {
        Elephant1 elephant1 = new Elephant1();
        Elephant1 elephant11 = new Elephant1();
        Elephant1 elephant12 = new Elephant1();
        Monkey monkey = new Monkey();
        Monkey monkey1 = new Monkey();
        Monkey monkey2 = new Monkey();
        ZooAnimal[] animals = new ZooAnimal[6];
        animals[0] = elephant1;
        animals[1] = elephant11;
        animals[2] = elephant12;
        animals[3] = monkey;
        animals[4] = monkey1;
        animals[5] = monkey2;
        for (ZooAnimal cerent : animals) {
            cerent.voice(); // Здесь появление полиморфизма
        }


    }
}
