import java.util.Scanner; // Needed for the Scanner class
import java.io.*;
public class ReadingAFile
{
   public static void main(String[] args) throws IOException{
      //Initialize a count
      int count = 1;

      //Scanner
      Scanner keyboard = new Scanner(System.in);

      //Ask for file name
      System.out.print("Provide the file's name: ");
      String filename = keyboard.nextLine();

      //Open file
      File file = new File(filename);
      Scanner inputFile = new Scanner(file);

      //Keep reading for lines until there isn't any remaining
      while (inputFile.hasNext())
      {
         String friendName = inputFile.nextLine();

         //Print the text
         System.out.println("Line " + count + ": " + friendName);
         count++;
      }

      //Close file
      inputFile.close();
   }
}
