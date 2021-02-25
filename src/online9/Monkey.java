package online9;

public class Monkey implements ZooAnimal{
    @Override
    public void voice() {
        System.out.println("Ау");
    }

    @Override
    public void jumping() {
        System.out.println("Прыгает");
    }

    @Override
    public void running() {
        System.out.println("Бежит");

    }
}
