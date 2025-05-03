# Dollar-Amount-Breakdown

# Dollar Amount Breakdown (Java)

This Java program takes a user-inputted dollar amount and breaks it down into the fewest number of U.S. currency denominations — from hundred-dollar bills all the way down to pennies.

## Features

- Accepts a dollar amount with cents (e.g., 187.36)
- Converts the amount into cents to ensure precision
- Calculates:
  - Bills: $100, $50, $20, $10, $5, $1
  - Coins: 25¢, 10¢, 5¢, 1¢
- Outputs a clean breakdown for the user

## How to Run

1. Make sure you have Java installed.
2. Clone this repo or copy the `HW1.java` file.
3. Compile and run the program:

```bash
javac HW1.java
java HW1
```

4. Enter a dollar amount when prompted.

## Example Output

```
Enter your dollar amount: 187.36

You have:

    -   1 hundred(s)
    -   1 fifty(s)
    -   1 twenty(s)
    -   1 ten(s)
    -   1 five(s)
    -   2 one(s)
    -   1 quarter(s)
    -   1 dime(s)
    -   0 nickel(s)
    -   1 cent(s)

Goodbye!
```

## Concepts Used

- Type casting and rounding (`Math.round`)
- Integer division and modulus operations
- Input via `Scanner`
- Clean console formatting

## Author

Made by Kamilla Mamatova practicing Java I/O and arithmetic.
