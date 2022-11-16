import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the number you want to convert? ");
    String num = sc.next();
    System.out.println("What is the original base of the number? ");
    int base = sc.nextInt();
    System.out.println("What is the base you want to convert to? ");
    int new_base = sc.nextInt();
    System.out.println("The conversion of " + num + " in base " + base + " is " + base_converter(num, base, new_base) + " in the new base of " + new_base);
  }
  public static String base_converter(String num, int base, int new_base) {
    int numValue = 0;
    for (int i = 0; i < num.length(); i++) {
      int place_value;
      if (num.charAt(i) == 'A'|| num.charAt(i) == 'a') {
        place_value = 10;
      } else if (num.charAt(i) == 'B' || num.charAt(i) == 'b') {
        place_value = 11;
      } else if (num.charAt(i) == 'C'|| num.charAt(i) == 'c') {
        place_value = 12;
      } else if (num.charAt(i) == 'D'|| num.charAt(i) == 'd') {
        place_value = 13;
      } else if (num.charAt(i) == 'E'|| num.charAt(i) == 'e') {
        place_value = 14;
        System.out.println(place_value);
      } else if (num.charAt(i) == 'F'|| num.charAt(i) == 'f') {
        place_value = 15;
      } else {
        place_value = (int) num.charAt(i) - '0';
      }
      numValue += place_value * Math.pow(base, num.length() - 1 - i);
    }
    String new_num = "";
    while (numValue > 0) {
      char new_char;
      if (numValue % new_base == 10) {
        new_char = 'A';
      }
      else if (numValue % new_base == 11) {
        new_char = 'B';
      }
      else if (numValue % new_base == 12) {
        new_char = 'C';
      }
      else if (numValue % new_base == 13) {
        new_char = 'D';
      }
      else if (numValue % new_base == 14) {
        new_char = 'E';
      }
      else if (numValue % new_base == 15) {
        new_char = 'F';
      } else {
        new_char = (char)((numValue % new_base) + '0');
      }
      new_num = new_char + new_num;
      numValue /= new_base;
    }
    return new_num;
  }
}