package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void dogCreationTest(){
        Assert.assertNotNull(AnimalFactory.createDog("Otis",null ));
    }
    @Test
    public void catCreationTest(){
        Assert.assertNotNull((AnimalFactory.createCat("Norma", null)));
    }
}
