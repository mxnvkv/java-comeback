package com.java_comeback.getting_started_programming_in_java.variables_and_operators;

public class PrimitiveDataTypes {
  public static void main(String[] args) {

    // *** Integer types ***
    byte numberOfEnglishLetters = 26;        // 8 bits,  from -128 to 127
    short feetInAMile = 5280;                // 16 bits, from -32,768 to 32,768
    int milesToSun = 92960000;               // 32 bits, from -2,147,483,648 to 2,147,483,647
    long milesInALightYear = 5879000000000L; // 64 bits, from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807


    // *** Floating point types ***
    float kilometersInAMarathon = 42.195f;
    double absoluteZeroInCelsius = -273.15;


    // *** Character types ***
    char regularU = 'U';
    char accentedU = '\u00DA';


    // *** Boolean types ***
    boolean iLoveJava = true;


    // Primitive types are stored by value
    int firstValue = 100;
    int otherValue = firstValue; // copy value of the firstValue variables and assign it
    firstValue = 50; // otherValue is not affected
    otherValue = 70;

  }
}
