# Array and ArrayList Converter

## Description
This Java program demonstrates the conversion between an `int` array and an `ArrayList<Integer>`, and vice versa. It's an illustrative example of manipulating Java collections and arrays, showcasing fundamental operations such as iteration and element addition.

## Classes and Methods

### `ArrayToArrayListConverter`
Converts a primitive `int` array to an `ArrayList<Integer>`.

- **Method: `convertToArraylist(int[] array)`**
  - **Parameters**: `array` - the `int` array to be converted.
  - **Returns**: An `ArrayList<Integer>` containing all elements from the input array.
  - **Algorithm**:
    1. Initialize a new `ArrayList<Integer>`.
    2. Iterate through each element of the input `int` array.
    3. Add each element to the `ArrayList<Integer>`.
    4. Return the populated `ArrayList<Integer>`.
  - **Description**: This method converts a given `int` array into an `ArrayList<Integer>` by iterating through the array and adding each element to a new `ArrayList<Integer>`.

### `ArrayListToArrayConverter`
Converts an `ArrayList<Integer>` to a primitive `int` array.

- **Method: `convertToarray(ArrayList<Integer> arrayList)`**
  - **Parameters**: `arrayList` - the `ArrayList<Integer>` to be converted.
  - **Returns**: An `int` array containing all elements from the input `ArrayList`.
  - **Algorithm**:
    1. Initialize an `int` array of the same size as the `ArrayList`.
    2. Iterate through each element of the `ArrayList`.
    3. Assign each `ArrayList` element to the corresponding position in the `int` array.
    4. Return the populated `int` array.
  - **Description**: This method transforms an `ArrayList<Integer>` back into a primitive `int` array by creating an array of the same size and populating it with the elements of the `ArrayList`.

### `Main` Class
Facilitates user interaction, performing conversions between array and `ArrayList`, and displays the results.

- **Functionality**:
  1. Collects user input for the size and elements of an `int` array.
  2. Uses `ArrayToArrayListConverter` to convert the `int` array to an `ArrayList<Integer>` and displays it.
  3. Converts the `ArrayList<Integer>` back into an `int` array using `ArrayListToArrayConverter` and displays the result.

## Usage

1. Compile the Java files.
2. Run the `main` class. Follow the prompts to enter the size and elements of the array.
3. Observe the conversion results displayed in the console.

## Compilation and Execution

```bash
javac main.java
java main
```
