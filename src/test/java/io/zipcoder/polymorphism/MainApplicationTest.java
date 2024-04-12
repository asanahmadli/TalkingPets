package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
    @Test
    public void testDog() {

        //Given
        String ecpected = "Rock";

        //When
        Dog dog = new Dog(ecpected);
        String actual = dog.getName();

        //Then
        Assert.assertEquals(ecpected, actual);
    }


    @Test
    public void testCat(){
        //Given
        String expected = "Meow";

        //When
        Cat cat = new Cat(expected);
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testBird(){

        //Given
        String expectedName = "Sunny";
        String expectedVoice = "Quack";

        //When
        Bird bird = new Bird(expectedName);
        String actualName = bird.getName();
        String actualVoice = bird.speak();

        //Then
        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedVoice,actualVoice);
    }
}
