public class Cat extends Pet implements Meowable{
    private String color;

    public Cat(int age, boolean isRescue, String name, String color) {
        super(age, isRescue, name);
        this.color = color;
    }

    @Override
    public void meow() {
        System.out.println("This is a meow!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
