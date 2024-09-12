/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calc;
import java.util.*;
/**
 *
 * @author vinhnguyen
 */

public class Calc 
{
    public int countCharacter(String str)
    {
        int count = 0;
        int len = str.length();
        
        for (int i = 0; i < len; i++)
        {
            if(str.charAt(i) != ' ')
                count++;
        }
        return count;
    }
       
    public int countVowels(String str)
    {
        int count = 0;
        int len = str.length();
        char temp;
        for (int i = 0; i < len; i++)
        {
            temp = str.charAt(i);
            
            if (temp == 'a' || temp == 'A' ||
                temp == 'e' || temp == 'E' ||
                temp == 'i' || temp == 'I' ||
                temp == 'o' || temp == 'O' ||
                temp == 'u' || temp == 'U')
            {
                count++;
            }     
        }
        
        return count;      
    }
    
    public int countNum(String str)
    {
        int count = 0;
        int len = str.length();
        int temp;
        
        for (int i = 0; i < len; i++)
        {
            temp = str.charAt(i);
            if (temp >= 48 && temp <= 57)
            {
                count ++;
            }
        }
        
        return count;
    }
    
    /*
    public static void main(String[] args) 
    {
        System.out.println("Hello World!");
        System.out.println(countCharacter("fss"));
        System.out.println(countVowels("hello"));
        System.out.println(countNum(""));
    }
    */
}
