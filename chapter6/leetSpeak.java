/* Write a method leetSpeak that accepts two parameters: a Scanner 
 * representing an input file, and a PrintStream representing an output file. 
 * Your method should convert the input file's text to "leet speak" (aka 1337 
 * speak), an internet dialect where various letters are replaced by other 
 * letters/numbers. Output the leet version of the text to the given output 
 * file. Preserve the original line breaks from the input. Also wrap each word 
 * of input in parentheses. Perform the following replacements:
 *
 *   Original character      'Leet' character
 *       o                               0
 *       l (lowercase L)                 1
 *       e                               3
 *       a                               4
 *       t                               7
 *       s (at the end of a word only)   Z
 */

/*
 * If you haven't learned about "StringBuilder", here is another wayout!
 */
  public static void leetSpeak(Scanner input, PrintStream output) {
      while (input.hasNext()) {
      Scanner line = new Scanner(input.nextLine());
         while (line.hasNext()) {
            String token = line.next();
            if (token.endsWith("s")) {
               token = token.substring(0,token.length()-1) + "Z";
            }
            token = token.replace('o', '0')
                         .replace('l', '1')
                         .replace('e', '3')
                         .replace('a', '4')
                         .replace('t', '7');
            token = "(" + token + ")";
            output.print(token + " ");
            //System.out.print(token + " ");
         }
         output.println();
         //System.out.println();
      }
  }
