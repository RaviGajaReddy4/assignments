package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Started application");
        int[] numbers = {5,7,2,6,8,3};
        int num = 8;

        System.out.println("Max number: " + getMaxNumberFromArray(numbers));
        System.out.println("Min number: " + getMinNumberFromArray(numbers));
        System.out.println("Even numbers");
        printEvenNumbers(8);
        System.out.println("Second Max number: " +getSecondLargestElementFromArray(numbers));
        System.out.println("Factorial of a number: " +getFactorial(5));
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


}