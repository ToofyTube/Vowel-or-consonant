import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a letter:");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        if (input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u") ||input.equals("A") || input.equals("E") || input.equals("I") || input.equals("O") || input.equals("u") ) {
            System.out.println(input + " is a vowel");
        }
      else if (input.equals("B") || input.equals("b") || input.equals("C") || input.equals("c") || input.equals("D") || input.equals("d") || input.equals("F") || input.equals("f") || input.equals("G") || input.equals("g") || input.equals("H") || input.equals("h") || input.equals("J") || input.equals("j") || input.equals("K") || input.equals("k") || input.equals("L") || input.equals("l") || input.equals("M") || input.equals("m") || input.equals("N") || input.equals("n") || input.equals("P") || input.equals("p") || input.equals("Q") || input.equals("q") || input.equals("R") || input.equals("r") || input.equals("S") || input.equals("s") || input.equals("T") || input.equals("t") || input.equals("V") || input.equals("v") || input.equals("W") || input.equals("w") || input.equals("X") || input.equals("x") || input.equals("Y") || input.equals("y") || input.equals("Z") || input.equals("z") ) {
          System.out.println(input + " is a consonant");
      }
     else 
        System.out.println(input + " is an invalid input");
    }
}
//print "enter a letter"
//create a scanner
//create a string variable
//check if the letter is a vowel print input + " is a vowel"
//else if the sting is a consonat print input + " is a vonstant"
//else print input + " is an invalid input