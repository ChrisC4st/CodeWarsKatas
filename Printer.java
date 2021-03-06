public class Printer {

    public static String printerError(String s) {

        // Set initial variables
        char[] sArr = s.toCharArray();
        int num = 0;
        int den = s.length();

        // Loop through each char and determine its place
        for (int i = 0; i < s.length(); i++) {
            int curPos = (int) sArr[i];

            // if its between n and z then increment the numerator
            if (curPos >= 110 && curPos <= 122) {
                num++;
            }// end if
        }// end for

        // set s to the error ratio
        s = num + "/" + den;
        return s;
    }// end printerError
}// end class

Tests

import static org.junit.Assert.*;

import org.junit.Test;


public class PrinterTest {
    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s="aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", Printer.printerError(s));
    }// end test
}// end PrinterTest
