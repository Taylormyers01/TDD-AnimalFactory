package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void constructorTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void speakTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String dogSound = dog.speak();
        String expected = "bark!";


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, dogSound);
    }
    @Test
    public void birthDateTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Date newBirthDate = new Date(1997, 5,5);
        dog.setBirthDate(newBirthDate);

        // When (we retrieve data from the dog)
        Date retrievedBirthDate = dog.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newBirthDate, retrievedBirthDate);

    }
    @Test
    public void eatTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        int expected = 1;
        Food lasagna = new Food();
        dog.eat(lasagna);
        // When (we retrieve data from the dog)
        int retrievedFoodEated = dog.getNumberOfMealsEaten();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedFoodEated);

    }
    @Test
    public void getIdTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        int expected = 44;
        int retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected, retrievedId);
    }
    @Test
    public void animalInheritanceTest() {
        // Given (dog data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog= new Dog(givenName, givenBirthDate, givenId);


        // When (we retrieve data from the dog)


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(dog instanceof Dog);
    }
    @Test
    public void mamalInheritanceTest() {
        // Given (dog data)
        String givenName = "Otis";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertTrue(dog instanceof Mammal);
    }
}
