public class Snake extends Animal{
    public Snake() {
        super("Snake");
    }

    protected void getFact(){
        System.out.println(kind + " - This animal may be venomous!");
    }
}
