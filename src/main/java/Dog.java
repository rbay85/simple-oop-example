public class Dog extends Animal{
    public Dog() {
        super("Dog");
    }

    protected void getFact(){
        System.out.println(kind + " - This animal barks!");
    }
}
