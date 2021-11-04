package Exercise2;

public class main {
    public static void main(String[] args) {
        //Dog has been instantiated and it can be seen that you have to type name and age
        //You cannot create a dog object without typing these two variables. This is because dog extends Animal
        Dog danny = new Dog("Danny", 10, "Golden retriever");

        System.out.println(danny.getBreed());
        System.out.println();
        //Here it can be seen that methods can be put in the child class that is native to that class that cant be
        //accessed by the parentclass
        danny.bark();
        System.out.println();



        Cat didi = new Cat("Didi", 2 , "Brown");
        //The same happens in the cat class. Both dog and cat extends animal, but both of the classes have different methods
        //and one extra variable
        System.out.println(didi.getFurColor());
        System.out.println(didi.getName());
        System.out.println(didi.getAge());
        didi.miauw();
    }



}
