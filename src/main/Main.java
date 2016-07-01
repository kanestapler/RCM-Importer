package main;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import com.healthmarketscience.jackcess.Database;
import com.healthmarketscience.jackcess.DatabaseBuilder;

public class Main {

	public static void main(String[] args) throws IOException {
		File backEnd = new File("C:/Users/Kane/Desktop/FileDepot/RCM_BE/RCM_BE.mdb");
		File frontEnd = new File("C:/Users/Kane/Desktop/FileDepot/RCM_FE/RCM_FE.mdb");
		Database db = DatabaseBuilder.open(backEnd);
		Set<String> allTableNames = db.getTableNames();
		for (String s : allTableNames) {
			System.out.println(s);
		}
	}

}
