import org.junit.Test;

import java.util.Arrays;

public class AnimalFactsTest {
    @Test
    public void getFactTest(){
        AnimalFacts animalFacts = new AnimalFacts();

        Arrays.asList("Cat", "Dog", "Snake", "Spider")
                .forEach(kind -> animalFacts.getFact(kind));

    }
}
