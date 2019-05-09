import java.util.Scanner;
import java.lang.Math;

public class Main {
 public static void main (String [] args) {
 Scanner scnr = new Scanner(System.in);

String string1;
String string2;
int sum1 = 0;
int sum2 = 0;
int result = 0;

System.out.println("Please enter the first string:");
string1 = scnr.next();

System.out.println("Please enter the second string:");
string2 = scnr.next();


for (int i = 0; i < string1.length(); ++i) {
 sum1 += charToUnicode(string1.charAt(i));
}
for (int i = 0; i < string2.length(); ++i) {
 sum2 += charToUnicode(string2.charAt(i));
}

result = Math.abs(sum1 - sum2);

System.out.print("Result: ");
System.out.println(result);

 }
public static Integer charToUnicode (char actualLetter) {
   String convertedString;
   int unicode;
   convertedString = Integer.toHexString(actualLetter);
   unicode = Integer.parseInt(convertedString,16);
   return unicode;
 }
}


