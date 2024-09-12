/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author vinhnguyen
 */
public class CalcTest 
{
    @org.junit.jupiter.api.Test
    public void testCountCharacter() 
    {
        System.out.println("Testing countCharacter() with normal string");
        Calc instance = new Calc();
        int expResult = 4;
        int result = instance.countCharacter("vinh");
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testCountCharacterWithSpecialChar() 
    {
        System.out.println("Testing countCharacter() with special characters");
        Calc instance = new Calc();
        int expResult = 11; 
        int result = instance.countCharacter("vinh# nguyen");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountCharacterWithNumbersAndSpaces() 
    {
        System.out.println("Testing countCharacter() with numbers and spaces");
        Calc instance = new Calc();
        int expResult = 9;
        int result = instance.countCharacter("123 456 789");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountCharacterWithEmptyString() 
    {
        System.out.println("Testing countCharacter() with empty string");
        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.countCharacter("");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountCharacterWithNull() 
    {
        Calc instance = new Calc();
        System.out.println("Testing countCharacter() with null input");
        assertThrows(NullPointerException.class, () -> {
            instance.countCharacter(null);
        });
    }
    
    @org.junit.jupiter.api.Test
    public void testCountVowels() 
    {
        System.out.println("Testing countVowels() with normal string");
        Calc instance = new Calc();
        int expResult = 3; // 
        int result = instance.countVowels("hello vinh");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountVowelsWithUppercase() 
    {
        System.out.println("Testing countVowels() with uppercase and lowercase vowels");
        Calc instance = new Calc();
        int expResult = 3; 
        int result = instance.countVowels("hEllo vInh");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountVowelsWithEmptyString() 
    {
        System.out.println("Testing countVowels() with empty string");
        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.countVowels("");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountVowelsWithNull() 
    {
        Calc instance = new Calc();
        System.out.println("Testing countVowels() with null input");
        assertThrows(NullPointerException.class, () -> {
            instance.countVowels(null);
        });
    }
    
    @org.junit.jupiter.api.Test
    public void testCountVowelsWithNoVowels() 
    {
        System.out.println("Testing countVowels() with no vowels");
        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.countVowels("vvvvv");
        assertEquals(expResult, result);
    }

    @org.junit.jupiter.api.Test
    public void testCountNum() 
    {
        System.out.println("Testing countNum() with string having digits");
        Calc instance = new Calc();
        int expResult = 3; 
        int result = instance.countNum("vinh123");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountNumWithEmptyString() 
    {
        System.out.println("Testing countNum() with empty string");
        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.countNum("");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountNumWithNull() 
    {
        Calc instance = new Calc();
        System.out.println("Testing countNum() with null input");
        assertThrows(NullPointerException.class, () -> {
            instance.countNum(null);
        });
    }
    
    @org.junit.jupiter.api.Test
    public void testCountNumWithSpecialCharacters() 
    {
        System.out.println("Testing countNum() with special characters");
        Calc instance = new Calc();
        int expResult = 6; 
        int result = instance.countNum("123# @#456");
        assertEquals(expResult, result);
    }
    
    @org.junit.jupiter.api.Test
    public void testCountNumWithNoDigits() 
    {
        System.out.println("Testing countNum() with no digits");
        Calc instance = new Calc();
        int expResult = 0;
        int result = instance.countNum("vinh");
        assertEquals(expResult, result);
    }

}
