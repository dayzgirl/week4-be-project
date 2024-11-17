package vergne.daisy;

import java.util.Arrays;

public class wk4app {

	public static void main(String[] args) {
		// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

        // 1a. Programmatically subtract the value of the first element in the array from the value in the last element of the array
        System.out.println("1a. First-last difference: " + (ages[ages.length - 1] - ages[0]));

        // 1b. Create a new array of int called ages2 with 9 elements
        int[] ages2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("1b. First-last difference (ages2): " + (ages2[ages2.length - 1] - ages2[0]));

        // 1c. Use a loop to iterate through the array and calculate the average age.
        double avgAge = Arrays.stream(ages).average().orElse(0);
        System.out.println("1c. Average age: " + avgAge);

        // 2. Create an array of String called names that contains the following values: 
        //“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // 2a. Use a loop to iterate through the array and calculate the average number of letters per name.
        double avgLetters = Arrays.stream(names).mapToInt(String::length).average().orElse(0);
        System.out.println("2a. Average letters per name: " + avgLetters);

        // 2b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces
        String concatenatedNames = String.join(" ", names);
        System.out.println("2b. Concatenated names: " + concatenatedNames);

        // 3. How do you access the last element of any array?
        System.out.println("3. Last element: " + ages[ages.length - 1]);

        // 4. How do you access the first element of any array?
        System.out.println("4. First element: " + ages[0]);

        // 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
        //and add the length of each name to the nameLengths array
        int[] nameLengths = Arrays.stream(names).mapToInt(String::length).toArray();

        // 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array.
        int sumNameLengths = Arrays.stream(nameLengths).sum();
        System.out.println("6. Sum of name lengths: " + sumNameLengths);

        // 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to 
        //itself n number of times.
        System.out.println("7. Repeated word: " + repeatWord("HO!", 3));

        // 8. Write a method that takes two Strings, firstName and lastName, and returns a full name
        System.out.println("8. Full name: " + getFullName("James", "Vergne"));

        // 9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
        System.out.println("9. Sum > 100: " + isSumGreaterThan100(new int[]{34, 44, 78}));

        // 10. Write a method that takes an array of double and returns the average of all the elements in the array.
        System.out.println("10. Average of doubles: " + getAverage(new double[]{11, 32, 43}));

        // 11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is 
        //greater than the average of the elements in the second array.
        System.out.println("11. First array avg > Second array avg: " + 
            isFirstArrayAvgGreater(new double[]{1, 2, 3}, new double[]{0.5, 1, 1.5}));

        // 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true 
        //if it is hot outside and if moneyInPocket is greater than 10.50.
        System.out.println("12. Will buy drink: " + willBuyDrink(true, 15.0));

        // 13. Create a method of your own that solves a problem.
        // This checks if a string is a palindrome.
        //Why? Because I just found out that aibohphobia is the fear of palindromes and it itself is a palindrome and if 
        //writing for someone with this, it would be good to not include any. ;-D
        System.out.println("13. Is palindrome: " + isPalindrome("aibohphobia"));
    }

    // 7. Repeat word n times
    public static String repeatWord(String word, int n) {
        return word.repeat(n);
    }

    // 8. Combine first and last name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Check if sum of array is greater than 100
    public static boolean isSumGreaterThan100(int[] arr) {
        return Arrays.stream(arr).sum() > 100;
    }

    // 10. Calculate average of double array
    public static double getAverage(double[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }

    // 11. Compare averages of two double arrays
    public static boolean isFirstArrayAvgGreater(double[] arr1, double[] arr2) {
        return getAverage(arr1) > getAverage(arr2);
    }

    // 12. Determine if conditions for buying a drink are met
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13. Custom method to check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());


	}

}
