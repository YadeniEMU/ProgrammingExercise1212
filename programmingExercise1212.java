import java.util.*;
import java.io.*;

public class programmingExercise1212 {

	/** Main method */
	public static void main(String[] args) throws Exception {
		if (args.length != 1) {
			System.out.println("Usage: java Exercise_12_12 file");
			System.exit(1);
		}
		chechIfFileExists();
		convertToNextLine();
		writeTextToFile();
	}

	public static void checkIfFIleExists(){
		File file = new File(args[0]);
		if (!file.exists()) {
			System.out.println("File " + args[0] + " does not exist");
			System.exit(1);
		}
	}
	
	public static void writeTextToFile(){
				// Write text to file
				try (
					// Create an output file
					PrintWriter output = new PrintWriter(file);
				) {
					for (int i = 0; i < list.size(); i++) {
						output.println(list.get(i));
					}
				}
			}

	public static void convertToNextLine(){
		// Create an ArrayList
		ArrayList<String> list = new ArrayList<>();
		String string1 = "";
		String string2 = "";

		// Read text from file
		try (
			// Create an input file
			Scanner input = new Scanner(file);
		) {
			// Convert java source code from next-line 
			// brace style to the end-of-line brace style
			string1 = input.nextLine();
			while (input.hasNext()) {
				string2 = input.nextLine();
				if (string2.length() > 0 && 
					 string2.charAt(string2.length() - 1) == '{') {
					list.add(string1.concat(" {"));
					string1 = input.nextLine();
				}
				else {
					list.add(string1);
					string1 = string2;
				}
			}
			list.add(string1);
		}
	}
}
