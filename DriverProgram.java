public class DriverProgram {
    public static void main(String[] args) {
        DoubleDimensionArray array = new DoubleDimensionArray(3, 3);
        // Insert elements
        array.insert(0, 0, 1);
        array.insert(0, 1, 2);
        array.insert(0, 2, 3);
        array.insert(1, 0, 4);
        array.insert(1, 1, 5);
        array.insert(1, 2, 6);
        array.insert(2, 0, 7);
        array.insert(2, 1, 8);
        array.insert(2, 2, 9);
        // Traversing the array
        System.out.println("Array elements:");
        array.traverse();
        // Searching for an element
        int searchValue = 5;
        boolean found = array.search(searchValue);
        System.out.println("Element " + searchValue + " found: " + found);
        // Deleting an element
        array.delete(1, 1);
        System.out.println("Array after deleting element at (1, 1):");
        array.traverse();
        // Searching for deleted element
        found = array.search(5);
        System.out.println("Element 5 found after deletion: " + found);
    }
 }
