package nl.novi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void canSumNormalInt() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        int testSum = calculator.sum(1, 2);
        //assert
        Assertions.assertEquals(3, testSum);
    }

    @Test
    void canSumNegativeInt() {
        //arrange
        Calculator calculator = new Calculator();
        //act
        int testSum = calculator.sum(-1, 2);
        //assert
        Assertions.assertEquals(1, testSum);
    }
}