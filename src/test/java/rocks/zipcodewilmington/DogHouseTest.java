package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        int expected = 1;

        // Then
        int numOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, numOfDogs);
    }
    @Test
    public void removeIdTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);

        // When (we retrieve data from the dog)
        int expected = 0;
        DogHouse.remove(44);
        int numOfDogs = DogHouse.getNumberOfDogs();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected,numOfDogs);
    }
    @Test
    public void removeByDogTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);

        // When (we retrieve data from the dog)
        int expected = 0;
        DogHouse.remove(dog);
        int numOfDogs = DogHouse.getNumberOfDogs();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected,numOfDogs);
    }
    @Test
    public void getDogByIDTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);

        // When (we retrieve data from the dog)


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(dog,DogHouse.getDogById(givenId));
    }
    @Test
    public void numOfDogsTest(){
        // Given (dog data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        Dog dog2 = new Dog(null, null, null);
        DogHouse.add(dog2);

        // When (we retrieve data from the dog)
        int expected = 2;
        int numOfDogs = DogHouse.getNumberOfDogs();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected,numOfDogs);
    }
}
