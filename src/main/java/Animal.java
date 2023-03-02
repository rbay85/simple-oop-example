import java.util.Map;
import java.util.Objects;

public class Animal {
    String kind;

    Animal(String kind) {
        this.kind = kind;
    }

    public static Animal createAnimal(String kind) {
        var amimalsMap =
            Map.of(
                "Cat", new Cat(),
                "Dog", new Dog(),
                "Snake", new Snake()
            );
        return Objects.requireNonNullElse( amimalsMap.get(kind), new Animal(kind) );
    }

    protected void getFact() {
        System.out.println(kind + " - This animal at least eats something!");
    }
}
