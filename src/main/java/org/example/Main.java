package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started application");
        int[] numbers = {5,7,2,6,8,3};

        System.out.println("Max number: " + getMaxNumberFromArray(numbers));
        System.out.println("Min number: " + getMinNumberFromArray(numbers));
        System.out.print("Enter number:");
        Scanner sc= new Scanner(System.in);
        int maxNumberForEvenRange = sc.nextInt();
        System.out.println("Even numbers");
        printEvenNumbers(maxNumberForEvenRange);
        System.out.println("Second Max number: " +getSecondLargestElementFromArray(numbers));
        System.out.println("Factorial of 5 is : " +getFactorial(5));
        int armstrongNumber = 153;
        boolean isArmstrongNumber = checkArmstrongNumber(armstrongNumber);
        System.out.println(armstrongNumber + " is" + (isArmstrongNumber ? "": " not") + " an Armstrong number");
        int perfectNumber = 28;
        boolean isPerfectNumber = checkPerfectNumber(perfectNumber);
        System.out.println(perfectNumber + " is" + (isPerfectNumber ? "": " not") + " Perfect number");

        printFibonacciValues(144);

        int primeNumber = 1;
        boolean isPrimeNumber = checkPrimeNumber(primeNumber);
        System.out.println(primeNumber + " is" + (isPrimeNumber ? "": " not") + " Prime number");

        printNumberPattern(5);

        int numberToReverse = 157;
        System.out.println("reverse of "+numberToReverse+" is: "+reverseNumber(numberToReverse));

        System.out.println("Enter string to reverse");
        String stringToReverse = sc.next();
        stringToReverse += sc.nextLine();
        System.out.println("reverse of "+stringToReverse+" is: "+reverseString(stringToReverse));

        int[] arrayToReverse = {4,2,8,1,3,0,6};
        System.out.print("reverse of array is: ");
        var reversedArray = reverseArray(arrayToReverse);
        for(var n: reversedArray){
            System.out.print(n);
        }
        System.out.println();

        System.out.print("sorted array is: ");
        var sortedArray = sortArray(arrayToReverse);
        for(var n: sortedArray){
            System.out.print(n);
        }
        System.out.println();

        int[] duplicateNumbers = {3,6,7,3,2,3,1,7,2,7};
        printDuplicateNumbers(duplicateNumbers);
    }

    /**
     * @param numbers array of numbers
     * @return maximum number
     */
    public static int getMaxNumberFromArray(int[] numbers) {
        if(numbers.length == 0) {
            return 0;
        }
        int maxNum = numbers[0];
        for(int num: numbers){
            if(num > maxNum){
                maxNum = num;
            }
        }
        return maxNum;
    }

    /**
     * @param numbers array of numbers
     * @return minimum number
     */
    public static int getMinNumberFromArray(int[] numbers) {
        if(numbers.length == 0) {
            return 0;
        }
        int minNum = numbers[0];
        for(int num: numbers){
            if(num < minNum){
                minNum = num;
            }
        }
        return minNum;
    }

    /**
     * @param maxNumber prints all even number from 0 to maxNumber
     */
    public static void printEvenNumbers(int maxNumber) {
        for(int number=0; number < maxNumber; number++) {
            if(number%2 == 0) {
                System.out.println(number);
            }
        }

    }

    /**
     * @param numbers array of numbers
     * @return second-largest number
     */
    public static int getSecondLargestElementFromArray(int[] numbers) {
        if(numbers.length == 0) return 0;
        if(numbers.length == 1) return numbers[0];
        int maxNum = numbers[0];
        int secondMaxNum = 0;
        for(int num: numbers){
            if(num > maxNum){
                secondMaxNum = maxNum;
                maxNum = num;
            }
        }
        return secondMaxNum;
    }

    /**
     * @param number get factorial of number
     * @return factorial of number
     */
    public static int getFactorial(int number) {
        if(number == 0) return 0;
        int result = 1;
        for(int i = 1;i<=number;i++){
            result *= i;
        }
        return result;
    }

    /**
     * @param number check Armstrong number
     * @return given number is Armstrong or not
     */
    public static boolean checkArmstrongNumber(int number) {
        int numberOfDigits = (number+"").length();
        int originalNumber = number;
        int result = 0;
        while(number > 0){
            int remainder = number % 10;
            result += (int)Math.pow(remainder, numberOfDigits);
            number /= 10;
        }
        return result == originalNumber;
    }

    /**
     * @param number Perfect number
     * @return given number is Perfect or not
     */
    public static boolean checkPerfectNumber(int number) {
        int result = 0;
        for(int i=1;i<=number/2;i++){
           if(number%i == 0) {
               result += i;
           }
       }
        return number == result;
    }

    /**
     * @param number Prints fibonacci sequence
     */
    public static void printFibonacciValues(int number) {
        int incrementNumber = 0;
        int result = 1;
        while(result <= number){
            System.out.print(result+" ");
            int lastResultNum = result;
            result = result + incrementNumber;
            incrementNumber = lastResultNum;
        }
        System.out.println();
    }

    /**
     * @param number Prime number
     * @return given number is Prime or not
     */
    public static boolean checkPrimeNumber(int number) {
        boolean isPrime = number != 1;
        for(int i=2;i<=number/2;i++){
            if(number%i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    /**
     * @param number Prints number pattern 1 22 333 4444 && 1 23 456 789
     */
    public static void printNumberPattern(int number) {
       for(int i=1;i<=number;i++) {
           for(int j=1;j<=i;j++) {
               System.out.print(i);
           }
           System.out.println();
       }
        int c=1;
        for(int i=1;i<=number;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }

    /**
     * @param number to be reversed
     * @return reverse the given number
     */
    public static int reverseNumber(int number) {
        int result = 0;
        while(number > 0) {
            int remainder = number % 10;
            result = (result*10)+remainder;
            number /= 10;
        }
        return result;
    }
    /**
     * @param value to be reversed
     * @return reverse the given string
     */
    public static String reverseString(String value) {
        String result = "";
        char [] values = value.toCharArray();
        for(var i: values){
            result = i+result;
        }
        return result;
    }

    /**
     * @param numbers to be reversed
     * @return reverse the given string
     */
    public static int[] reverseArray(int[] numbers) {
        int arrayLength = numbers.length;
        int [] result = new int[arrayLength];
        for(int i = 0;i<arrayLength;i++){
            result[i] = numbers[arrayLength-1-i];
        }
        return result;
    }

    /**
     * @param numbers to be sorted
     * @return sort the given array
     */
    public static int[] sortArray(int[] numbers) {
        int arrayLength = numbers.length;
        for(int i = 0;i<arrayLength;i++){
            for(int j=i+1;j<arrayLength;j++){
                if(numbers[i]>numbers[j]){
                    var temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
    /**
     * @param numbers prints duplicate numbers
     */
    public static void printDuplicateNumbers(int[] numbers) {
        var sortedNumbers = sortArray(numbers);
        int arrayLength = sortedNumbers.length;
        String duplicateNumbers = "";
        int previousValue=-1;
        int nextDuplicateCount=0;
        for (int sortedNumber : sortedNumbers) {
            if (sortedNumber == previousValue) {
                nextDuplicateCount++;
                if (nextDuplicateCount == 1) {
                    duplicateNumbers = duplicateNumbers + sortedNumber + " ";
                }
            } else {
                previousValue = sortedNumber;
                nextDuplicateCount = 0;
            }
        }
        System.out.println("Duplicate numbers: "+duplicateNumbers);
    }
}