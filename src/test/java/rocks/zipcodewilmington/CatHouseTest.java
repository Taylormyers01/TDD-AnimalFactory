package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testAddCats() {
        // Given (some Cat
        String name = "Otis";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);
        int expected = 1;

        // Then
        int numOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, numOfCats);
    }
    @Test
    public void removeIdTest(){
        // Given (Cat data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;
        CatHouse.clear();

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        // When (we retrieve data from the cat)
        int expected = 0;
        CatHouse.remove(44);
        int numOfCat = CatHouse.getNumberOfCats();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected,numOfCat);
    }
    @Test
    public void removeByCatTest(){
        // Given (cat data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;
        CatHouse.clear();

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        // When (we retrieve data from the cat)
        int expected = 0;
        CatHouse.remove(cat);
        int numOfCats = CatHouse.getNumberOfCats();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected,numOfCats);
    }
    @Test
    public void getCatByIDTest(){
        // Given (cat data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;
        CatHouse.clear();

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        // When (we retrieve data from the cat)


        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(cat,CatHouse.getCatById(givenId));
    }
    @Test
    public void numOfCatsTest(){
        // Given (cat data)
        String givenName = "Pheonix";
        Date givenBirthDate = new Date();
        Integer givenId = 44;
        CatHouse.clear();

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        Cat cat2 = new Cat(null, null, null);
        CatHouse.add(cat2);

        // When (we retrieve data from the cat)
        int expected = 2;
        int numOfCats = CatHouse.getNumberOfCats();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(expected,numOfCats);
    }
}
