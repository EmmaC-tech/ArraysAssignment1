
/**
 * 
 * This program demonstrates how to work with arrays, loops, and methods in Java.
 * Each numbered section corresponds to a specific task from the assignment.
 */

public class main {

    public static void main(String[] args) {

        // ----------------------------- //
        // 1. Working with int arrays    //
        // ----------------------------- //

        // 1. Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1.a Subtract first element from last element dynamically
        int result1 = ages[ages.length - 1] - ages[0];
        System.out.println("1.a Result of subtraction (ages): " + result1);

        // 1.b Create a new array ages2 with 9 elements
        int[] ages2 = {4, 12, 22, 33, 45, 56, 67, 78, 89};

        // 1.b.ii Subtract first element from last (works dynamically)
        int result2 = ages2[ages2.length - 1] - ages2[0];
        System.out.println("1.b Result of subtraction (ages2): " + result2);

        // 1.c Use a loop to calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double average = (double) sum / ages.length;
        System.out.println("1.c Average age: " + average);

        // ------------------------------------------- //
        // 2. Working with String arrays ("names")     //
        // ------------------------------------------- //

        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // 2.a Calculate average number of letters per name
        int totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = (double) totalLetters / names.length;
        System.out.println("2.a Average number of letters per name: " + averageLetters);

        // 2.b Concatenate all names separated by spaces
        String allNames = "";
        for (String name : names) {
            allNames += name + " ";
        }
        System.out.println("2.b All names concatenated: " + allNames.trim());

        // 3. Accessing the last element of any array
        System.out.println("3. Last element in names: " + names[names.length - 1]);

        // 4. Accessing the first element of any array
        System.out.println("4. First element in names: " + names[0]);

        // ------------------------------------------- //
        // 5–6. Working with nameLengths array         //
        // ------------------------------------------- //

        // 5. Create nameLengths array using names.length
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // 6. Sum all elements in nameLengths
        int sumOfLengths = 0;
        for (int length : nameLengths) {
            sumOfLengths += length;
        }
        System.out.println("6. Sum of all name lengths: " + sumOfLengths);

        // ------------------------------------------- //
        // 7–13. Methods and Logic Implementation      //
        // ------------------------------------------- //

        // 7. Repeat a word n times
        System.out.println("7. Repeat word example: " + repeatWord("Hello", 3));

        // 8. Combine first and last name
        System.out.println("8. Full name: " + fullName("Emma", "Corado"));

        // 9. Check if sum of array elements > 100
        int[] testNums = {20, 30, 40, 15};
        System.out.println("9. Is sum greater than 100? " + sumGreaterThan100(testNums));

        // 10. Calculate average of double array
        double[] nums = {10.0, 20.0, 30.0, 40.0};
        System.out.println("10. Average of array: " + averageOfArray(nums));

        // 11. Compare averages of two double arrays
        double[] nums1 = {10, 20, 30};
        double[] nums2 = {5, 10, 15};
        System.out.println("11. Is first array's average greater? " + compareAverages(nums1, nums2));

        // 12. Determine if willBuyDrink returns true
        System.out.println("12. Will buy drink? " + willBuyDrink(true, 11.00));

        // 13. Custom method example
        // This method counts how many even numbers exist in an integer array.
        // I created it to practice using loops and conditionals.
        int[] numbers = {2, 5, 8, 11, 14, 20};
        System.out.println("13. Number of even values: " + countEvenNumbers(numbers));
    }

    // ----------------------------- //
    // METHOD DEFINITIONS BELOW     //
    // ----------------------------- //

    public static String repeatWord(String word, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += word;
        }
        return result;
    }

    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static boolean sumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    public static double averageOfArray(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    public static boolean compareAverages(double[] array1, double[] array2) {
        return averageOfArray(array1) > averageOfArray(array2);
    }

    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    public static int countEvenNumbers(int[] array) {
        int count = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}

