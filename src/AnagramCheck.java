import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
   public static void main(String args[]){
	Scanner input=new Scanner(System.in);
	String s1=input.nextLine().toLowerCase();
	String s2=input.nextLine().toLowerCase();
	if(s1.length()!=s2.length()){
		System.out.println("false");
		return;
	}
	
	char[] arr1=s1.toCharArray();
	char[] arr2=s2.toCharArray();

	Arrays.sort(arr1);
	Arrays.sort(arr2);
	if (Arrays.equals(arr1, arr2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        // TODO: Read the two strings
        // TODO: Convert both to lowercase (to handle case-insensitivity)
        // TODO: Check if lengths are equal. If not, print "false" and return.
        // TODO: Convert strings to char arrays
        // TODO: Sort both char arrays
        // TODO: Compare the sorted arrays. Print "true" if equal, else "false".
  	}
}
