public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {

    }

    public static String capVowelsLowRest(String string) {
        String newString = "";

        for (int i = 0; i < string.length(); i++) {
            char originalChar = string.charAt(i);
            char newChar;

            if ("aieouAIEOU".indexOf(originalChar) != -1) {
                newChar = convertCharToUpperCase(originalChar);
            } else {
                newChar = convertCharToLowerCase(originalChar);
            }

            newString += newChar;
        }

        return newString;
    }

    public static String camelCase(String string) {
        String newString = "";
        boolean isNewWord = true;

        for (int i = 0; i < string.length(); i++) {
            char originalChar = string.charAt(i);
            char newChar;

            if (originalChar == ' ') {
                isNewWord = true;
            } else {
                if (isNewWord) {
                    if (newString.length() == 0) {
                        newChar = convertCharToLowerCase(originalChar); // Change the first letter of first word to lower case
                    } else {
                        newChar = convertCharToUpperCase(originalChar); // Change the first letter of new word to upper case
                    }

                    isNewWord = false;
                } else {
                    newChar = convertCharToLowerCase(originalChar); // Change all non-first letters to lower case
                }

                newString += newChar;
            }
        }

        return newString;
    }

    public static int[] allIndexOf(String string, char chr) {
        int charCountInString = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                charCountInString++;
            }
        }

        int[] allIndexOfChar = new int[charCountInString];

        charCountInString = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == chr) {
                allIndexOfChar[charCountInString] = i;
                charCountInString++;
            }
        }

        return allIndexOfChar;
    }

    public static char convertCharToUpperCase(char character) {
        if (character >= 'a' && character <= 'z') {
            return (char) (character - 32);
        }

        return character;
    }

    public static char convertCharToLowerCase(char character) {
        if (character >= 'A' && character <= 'Z') {
            return (char) (character + 32);
        }

        return character;
    }
}
