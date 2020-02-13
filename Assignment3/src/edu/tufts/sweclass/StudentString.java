package edu.tufts.sweclass;

import java.lang.*;

public class StudentString implements StudentStringInterface {
    private String current;

    public String getString() {
        return this.current;
    }

    public void setString(String string) {
        this.current = string;
    }

    public int countNum() {
        boolean isNum = false;
        String string = this.current;
        int count = 0;

        if(string == null || string == "")
            return 0;

        for(int i = 0; i < this.current.length(); i++) {
            if(Character.isDigit(string.charAt(i))) {
                if(!isNum){
                    isNum = true;
                    count ++;
                }
            }
            else
                isNum = false;
        }

        return count;
    }

    private String rotateIndividual (int n, boolean right, String nsubstring) {
        if (right)
            return nsubstring.charAt(n - 1) + nsubstring.substring(0, n - 1);
        else
            return nsubstring.substring(1, n) + nsubstring.charAt(0);
    }

    public String rotateChar(int n, boolean right) {

        String string = this.current;

        if(string == null)
        {
            throw new NullPointerException("The current string is null");
        }

        if(string == "") {
            return "";
        }

        if(n <= 0)
        {
            throw new IllegalArgumentException("n is smalller than or equal to 0");
        }

        String rotatedString = "";
        String individualString = "";

        for (int i = 0; i < this.current.length(); i++) {
            individualString += string.charAt(i);
            if ((i % n == n - 1) && (i != 0)) {
                rotatedString += rotateIndividual(n, right, string.substring(i - (n - 1), i + 1));
                individualString = "";
            }
        }

        if(individualString.length() != n && individualString.length() != 0) {
            rotatedString += rotateIndividual(individualString.length(), right, individualString);
        }

        return rotatedString;
    }
}