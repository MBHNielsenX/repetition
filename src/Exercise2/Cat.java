package Exercise2;

public class Cat extends Animal{
    private String furColor;

    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }

    public String getFurColor() {
        return furColor;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "furColor='" + furColor + '\'' +
                '}';
    }

    public void miauw() {
        System.out.println("Miauw");
    }
}
