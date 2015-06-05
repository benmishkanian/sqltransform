package antlrsqlite;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;
import java.nio.charset.StandardCharsets;

public class InvariantFinder {
	/**
	 * Maps database table names to a list of invariants which reference 
	 * columns in that table.
	 */
	private HashMap<String, ArrayList<String>> invariantTable;
	
	private Random rng;
	
	public InvariantFinder(String invariantFilePath) throws IOException {
		// Initialize table of invariants
		invariantTable = new HashMap<String, ArrayList<String>>();
		rng = new Random();
		BufferedReader reader = Files.newBufferedReader(Paths.get(invariantFilePath), StandardCharsets.US_ASCII);
		String line;
		while ((line = reader.readLine()) != null) {
			String dbTableName = line.substring(0, line.indexOf('.'));
			String clause = line.substring(line.indexOf('.'));
			if (invariantTable.containsKey(dbTableName)) {
				invariantTable.get(dbTableName).add(clause);
			}
			else {
				ArrayList<String> initialInvariantList = new ArrayList<String>();
				initialInvariantList.add(clause);
				invariantTable.put(dbTableName, initialInvariantList);
			}
		}
	}
	
	public String getRandomInvariant(String dbTableName) {
		ArrayList<String> validInvariants = invariantTable.get(dbTableName);
		return 'X' + validInvariants.get(rng.nextInt(validInvariants.size()));
	}
}
