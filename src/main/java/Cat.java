public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    protected void getFact(){
        System.out.println(kind + " - This animal has whisker!");
    }
}
