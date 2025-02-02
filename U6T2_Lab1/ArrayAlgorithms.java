package U6T2_Lab1;

public class ArrayAlgorithms {
    private ArrayAlgorithms(){}

    public static double average(int[] numList){
        int sum = 0;
        for (int i = 0; i < numList.length; i ++){
            sum += numList[i];
        }
        return sum/((double) numList.length);
    }

    public static int minimum(int[] numList){
        int min = numList[0];
        for(int i = 1; i < numList.length; i ++){
            if(numList[i] < min){
                min = numList[i];
            }
        }
        return min;
    }

    public static int howManyContain(String[] strList, String target) {
        int count = 0;
        for(int i = 0; i < strList.length; i ++){
            if (strList[i].indexOf(target) != -1){
                count ++;
            }
        }
        return count;
    }

    public static String[] stringToArray(String myStr) {
        String[] strings = new String[myStr.length()];

        for(int i = 0; i < myStr.length(); i++){
            strings[i] = myStr.substring(i, i+1);
        }
        return strings;
    }
    
    public static void introduceAdults(Person[] people) {
        for (int i = 0; i < people.length; i ++){
            if (people[i].getAge() >= 18){
                people[i].introduce();
            }
        }
    }

    public static void reversePrint(String[] wordList) {
        for (int i = wordList.length - 1; i >= 0; i-- ){
            for(int c = wordList[i].length() - 1; c >= 0; c --){
                System.out.print(wordList[i].substring(c, c+1));
            }
            System.out.println();
        }
    }

    
    public static int[] combine(int[] arr1, int[] arr2){
        int[] combinedArray = new int[arr1.length + arr2.length];
        for(int i = 0; i < arr1.length; i ++){
            combinedArray[i] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++){
            combinedArray[i + arr1.length] = arr2[i];
        }
        return combinedArray;
    }   

    /** Changes the first and last element of nums to be num
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: nums.length > 0
     */
    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length-1] = num;
    }

    /** Multiplies each number in numList by multiplier.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        for(int i = 0; i < numList.length; i ++){
            numList[i] *= multiplier;
        }
    }

    /** Returns an array of ints where each element is the product
     *  of the corresponding element in numList and multiplier.
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] returnList = new int[numList.length];
        for(int i = 0; i < numList.length; i ++){
            returnList[i] = numList[i] * multiplier;
        }
        return returnList;
    }

    /** Adds a "!" to the end of each String in wordList.  However, if a
     *  a string already ends in an exclamation point, do NOT add another.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: wordList.length > 0
     */
    public static void addExclamation(String[] wordList) {
        for (int i = 0; i < wordList.length; i ++){
            if (!wordList[i].substring(wordList[i].length()-1).equals("!")){
                wordList[i] += "!";
            }
        }
    }


    /** Returns an array of booleans where each element reflects whether
     *  the corresponding element in tempList is at or below the freezing
     *  temperature of 32 (true) or not (false).
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: tempList.length > 0
     */
    public static boolean[] isFreezing(int[] tempList) {
        boolean[] returnList = new boolean[tempList.length];
        for(int i = 0; i < tempList.length; i++){
            returnList[i] = tempList[i] <= 32;
        }
        return returnList;
    }

    /** Shifts all elements in numList to the LEFT one index
     *
     *  The first element in the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
     *  with the last element wrapping around to the back)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftLeft(int[] numList) {
        int first = numList[0];
        for (int i = 0; i < numList.length-1; i ++){
            numList[i] = numList[i+1];
        }
        numList[numList.length-1] = first;
    }

    /** Shifts all elements in numList to the RIGHT one index.
     *
     *  The last element in the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
     *  with the last element wrapping around to the front)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftRight(int[] numList) {
        int last = numList[numList.length -1];
        for (int i = numList.length -1; i > 0; i --){
            numList[i] = numList[i-1];
        }
        numList[0] = last;
    }

    /** Reverses all elements in an array.
     *
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  modifies the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void reverse(int[] numList) {
        for (int i = 0; i < numList.length/2; i ++){
            int temp = numList[i];
            numList[i] = numList[numList.length - 1 - i];
            numList[numList.length - 1 - i] = temp;
        }
    }


}
