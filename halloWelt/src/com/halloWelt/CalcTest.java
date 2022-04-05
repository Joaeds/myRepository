package com.halloWelt;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class CalcTest {

    Calc calc = new Calc();


    @BeforeAll
    static void beforeAll(TestInfo info){
            System.out.println("Starta foersta test" + info.getDisplayName());
    }


    @AfterAll
    static void afterAll(TestInfo info){
        System.out.println("Slut sista test" + info.getDisplayName());
    }



    @Test
    void plusTest1(){
        assertEquals(2, calc.plus(1, 1));
    }

    @Test
    void minusTest1(){
        assertEquals(7, calc.minus(9, 2));
    }

    @Test
    void randomArrayTest(){
        String str = "hej hej hej";
        String actual [] = str.split(" ");
        String [] expected = new String [] {"hej", "hej", "hej"};

        assertArrayEquals(expected, actual);
    }

    @Test
    void first_exception(){
        String str = null;
        assertThrows(NullPointerException.class,
                () -> {
            str.length();
        }
        );
    }


}