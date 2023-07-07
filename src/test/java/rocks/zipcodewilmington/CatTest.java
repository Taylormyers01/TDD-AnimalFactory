package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setNameTest(){
        // Given (cat data)
        String givenName = "Kat";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String expected = "Norma";
        cat.setName(expected);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedName);
    }
    @Test
    public void setDateTest() {
        // Given (cat data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Date newBirthDate = new Date(2021,12,1);
        cat.setBirthDate(newBirthDate);
        // When (we retrieve data from the cat)
        Date catBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newBirthDate, catBirthDate);
    }
    @Test
    public void eatTest() {
        // Given (cat data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        int expected = 1;
        Food lasagna = new Food();
        cat.eat(lasagna);

        // When (we retrieve data from the cat)
        int thingsEaten = cat.getNumberOfMealsEaten();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, thingsEaten);
    }
    @Test
    public void speakTest() {
        // Given (cat data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 46;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        int expected = 46;

        // When (we retrieve data from the cat)
        int id = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, id);
    }
    @Test
    public void animalInheritanceTest() {
        // Given (cat data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);


        // When (we retrieve data from the cat)
        String catSound = cat.speak();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(cat instanceof Cat);
    }
    @Test
    public void mamalInheritanceTest() {
        // Given (cat data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(cat instanceof Mammal);
    }


}
