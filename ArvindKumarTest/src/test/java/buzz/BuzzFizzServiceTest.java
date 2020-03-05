package buzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuzzFizzServiceTest {

    @Test
    public void NumberDivisibleBy5NotBy3MustReturnFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(3);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(6);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(9);
        assertEquals("Fizz", retVal1);
        assertEquals("Fizz", retVal2);
        assertEquals("Fizz", retVal3);
    }

    @Test
    public void NumberDivisibleBy3NotBy5MustReturnBuzzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(5);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(10);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(20);
        assertEquals("Buzz", retVal1);
        assertEquals("Buzz", retVal2);
        assertEquals("Buzz", retVal3);
    }

    @Test
    public void NumberDivisibleBy5And3MustReturnBuzzFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(15);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(45);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(60);
        assertEquals("BuzzFizz", retVal1);
        assertEquals("BuzzFizz", retVal2);
        assertEquals("BuzzFizz", retVal3);
    }

    @Test
    public void NumberHaving3Not5MustReturnFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(31);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(32);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(34);
        assertEquals("Fizz", retVal1);
        assertEquals("Fizz", retVal2);
        assertEquals("Fizz", retVal3);
    }

    @Test
    public void NumberHaving5Not3MustReturnFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(56);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(58);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(59);
        assertEquals("Buzz", retVal1);
        assertEquals("Buzz", retVal2);
        assertEquals("Buzz", retVal3);
    }

    @Test
    public void NumberHaving5And3MustReturnBuzzFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(35);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(53);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(325);
        assertEquals("BuzzFizz", retVal1);
        assertEquals("BuzzFizz", retVal2);
        assertEquals("BuzzFizz", retVal3);
    }

    @Test
    public void HavingAndDivisibleBy5MustReturnBuzzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(5);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(10);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(20);
        assertEquals("Buzz", retVal1);
        assertEquals("Buzz", retVal2);
        assertEquals("Buzz", retVal3);
    }

    @Test
    public void HavingAndDivisibleBy3MustReturnFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(12);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(18);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(21);
        assertEquals("Fizz", retVal1);
        assertEquals("Fizz", retVal2);
        assertEquals("Fizz", retVal3);
    }

    @Test
    public void NumberHavingAndDivisibleBy5And3MustReturnBuzzFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(135);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(315);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(345);
        assertEquals("BuzzFizz", retVal1);
        assertEquals("BuzzFizz", retVal2);
        assertEquals("BuzzFizz", retVal3);
    }

    @Test
    public void NumberHavingAndDivisibleBy3Not5MustReturnFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(33);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(36);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(39);
        assertEquals("Fizz", retVal1);
        assertEquals("Fizz", retVal2);
        assertEquals("Fizz", retVal3);
    }

    @Test
    public void NumberHavingAndDivisibleBy3AndHaving5MustReturnBuzzFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(51);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(54);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(57);
        assertEquals("BuzzFizz", retVal1);
        assertEquals("BuzzFizz", retVal2);
        assertEquals("BuzzFizz", retVal3);
    }

    @Test
    public void NumberHavingAndDivisibleBy5Not3MustReturnFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(31);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(32);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(34);
        assertEquals("Fizz", retVal1);
        assertEquals("Fizz", retVal2);
        assertEquals("Fizz", retVal3);
    }

    @Test
    public void NumberHavingAndDivisibleBy5AndHaving3MustReturnBuzzFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(35);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(135);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(335);
        assertEquals("BuzzFizz", retVal1);
        assertEquals("BuzzFizz", retVal2);
        assertEquals("BuzzFizz", retVal3);
    }

    @Test
    public void NumberHavingAndDivisibleBy5AndHavingDivisibleBy3MustReturnBuzzFizzTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(135);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(315);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(345);
        assertEquals("BuzzFizz", retVal1);
        assertEquals("BuzzFizz", retVal2);
        assertEquals("BuzzFizz", retVal3);
    }

    @Test
    public void NumberNotHavingNotDivisible5Or3MustReturnNumberTest(){
        String retVal1 = BuzzFizzService.getTheNumberPhrase(11);
        String retVal2 = BuzzFizzService.getTheNumberPhrase(14);
        String retVal3 = BuzzFizzService.getTheNumberPhrase(16);
        assertEquals("11", retVal1);
        assertEquals("14", retVal2);
        assertEquals("16", retVal3);
    }
}
