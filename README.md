# Unit Testing Practice – NOVI Backend Java Assignment

## About the Project

This repository contains my solution to the **Unit Testing** assignment from lesson 6 of the Backend Java module at [Novi University](https://www.novi.nl).

The focus of this assignment is to practice writing **JUnit tests** for simple Java classes like `Person` and `Calculator`. These tests help ensure that classes behave correctly when accessed via **getters**, **setters**, and custom logic methods.

---

## Table of Contents

- [Tech Stack](#tech-stack)
- [Key Features](#key-features)
- [How to Run Tests](#how-to-run-tests)
- [Credits](#credits)
- [License](#license)

---

## Tech Stack

- **IntelliJ IDEA**
- **Java 17+**
- **JUnit 5** for testing
- **Maven** for build and test execution

---

## Key Features

### `Calculator` Class Tests

- `canSumNormalInt`  
  Tests that two positive integers are summed correctly.

- `canSumNegativeInt`  
  Verifies that adding negative integers returns the correct result.

### `Person` Class Tests

- `canCreatePerson`  
  Confirms that a `Person` instance is created with the correct properties.

- tests for getters and setters like:
  `canGetName`  
  Checks whether the getter returns the correct name value.

  `canSetName`  
  Ensures the setter updates the name property properly.

---

## How to Run Tests

1. Open the project in IntelliJ IDEA.
2. Right-click on the `test` folder or any individual test class.
3. Choose **Run 'All Tests'** or **Run 'CalculatorTest'**, etc.
   or
   Open a terminal in the root of the project and run:

```bash
./mvnw test
```

## Credits
> "This assignment was developed as part of the Backend Java module in the NOVI Software Development program. All instructions, logic, and structure are part of the official coursework."

## License
> "This repository is intended for educational purposes only. You are welcome to use the code for learning, but not for commercial use."