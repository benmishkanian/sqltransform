package antlrsqlite;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class InvariantFinder {
	/**
	 * Maps database table names to a list of invariants which reference 
	 * columns in that table.
	 */
	private HashMap<Character, ArrayList<String>> invariantTable;
	
	private Random rng;
	
	public InvariantFinder(String invariantFilePath) throws IOException {
		// Initialize table of invariants
		invariantTable = new HashMap<Character, ArrayList<String>>();
		rng = new Random();
		BufferedReader reader = Files.newBufferedReader(Paths.get(invariantFilePath));
		String line;
		while ((line = reader.readLine()) != null) {
			char dbTableName = line.charAt(0);
			if (invariantTable.containsKey(dbTableName)) {
				invariantTable.get(dbTableName).add(line);
			}
			else {
				ArrayList<String> initialInvariantList = new ArrayList<String>();
				initialInvariantList.add(line);
				invariantTable.put(dbTableName, initialInvariantList);
			}
		}
	}
	
	public String getRandomInvariant(Character dbTableName) {
		ArrayList<String> validInvariants = invariantTable.get(dbTableName);
		return validInvariants.get(rng.nextInt(validInvariants.size()));
	}
}
