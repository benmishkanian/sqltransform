package antlrsqlite;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class InvariantFinder {
	/**
	 * Maps database table names to a list of invariants which reference 
	 * columns in that table.
	 */
	private HashMap<String, ArrayList<String>> invariantTable;
	
	public InvariantFinder(String invariantFilePath) throws IOException {
		// Initialize table of invariants
		Files.newBufferedReader(Paths.get(invariantFilePath)).lines();
	}
}
