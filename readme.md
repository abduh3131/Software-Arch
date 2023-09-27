# Grocery Product Factory


## Project Description
This project simulates a simple Grocery Product Factory using the Factory Method Design Pattern. The factory classes are responsible for creating instances of grocery products, such as, apple and banana. Prices of these products are read from a `prices.txt` data file by the `DataFileReader` class. 




## Repository Structure


src/ # Source directory containing the project's source files.

main/java # Directory for Java classes.

factories # Includes Factory classes implementing the GroceryProductFactory interface.

products # Contains individual Product classes like Banana and Apple.

DataFileReader.java # Class responsible for reading product prices from the data file.

test/ # Directory for Test files.

main/java # Java test classes directory.

prices.txt # Data file containing product prices.

README.md # This file, containing information about the project.


 

## Test Methods

### 1. testBananaProduc
This method tests the creation of a Banana product and the accurate retrieval of its price from the data file.

### 2. testAppleProduct
This method tests the instantiation of an Apple product and the correct retrieval of its price from the data file.


## How to Run Tests
To run tests, navigate to the `test/main/java` directory and execute the test classes.






## Authors
- [Abdullah_Hanoosh___100749026]