# Days In Month Calculator

This Java code is a simple program that determines how many days are in a specific month. It prompts the user to input the year and month (1-12) and then uses the '**getDaysInMonth()**' function to calculate the number of days in the specified month. The program displays the result on the screen.

## How it works

The method '**getDaysInMonth()**' takes in two parameters, an '**int**' called '**year**' and an '**int**' called '**month**'.

```java
private static int getDaysInMonth(int year, int month) {}
```

The first thing the method does is check if the value of the '**month**' parameter is equal to 2. If it is, then it checks if the value of the '**year**' parameter is a leap year. A leap year is a year that is evenly divisible by 4, except for end-of-century years which must be divisible by 400. 

```java
if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
    return 29;
} else {
    return 28;
}
```

The '**if**' statement checks if '**year % 4 == 0 && year % 100 != 0**' is true, or if '**year % 400 == 0**' is true, if any of these conditions are met, then the method returns 29, as February has 29 days in a leap year. If the year is not a leap year, then the method returns 28, as February has 28 days in a non-leap year.

If the '**month**' parameter is not equal to 2, the method proceeds to use the mathematical formula to determine the number of days in the month based on the "**Knuckle Trick**".

```java
return 31 - (((month - 1) % 7) % 2);
```

This formula uses the modulo operator (%), which returns the remainder of a division operation.

The '**month - 1**' part of the formula is used to adjust for the fact that the "**Knuckle Trick**" starts counting with the index finger, which corresponds to January, but the code starts counting with 0 for January.

- The '**((month - 1) % 7)**' calculates the remainder of the division of '**month-1**' by 7, this function will return a number between 0 and 6, which corresponds to the position of the knuckle of the finger when counting the months using the "**Knuckle Trick**".
- Then the value obtained before is divided by 2 using the modulo operator (%), this operation returns a remainder of 0 or 1
- Finally, the code subtracts the result obtained from the value 31, which represents the maximum number of days in a month. This calculation gives us the number of days in the specified month.
