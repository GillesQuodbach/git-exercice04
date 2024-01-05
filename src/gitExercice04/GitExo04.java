package gitExercice04;

import java.util.ArrayList;
import java.util.HashMap;

public class GitExo04 {

	public static void main(String[] args) {
		// Inventaire
		HashMap<String, ArrayList<Object>> inventory = new HashMap<>();

		// Liste inventaire
		ArrayList<Object> clementineData = new ArrayList<>();
		clementineData.add(6);
		clementineData.add(2.90);
		clementineData.add("kg");
		inventory.put("Clémentine", clementineData);
		
		ArrayList<Object> datteData = new ArrayList<>();
		datteData.add(4);
		datteData.add(7);
		datteData.add("kg");
		inventory.put("Datte", datteData);
		
		ArrayList<Object> grenadeData = new ArrayList<>();
		grenadeData.add(3);
		grenadeData.add(3.5);
		grenadeData.add("kg");
		inventory.put("Grenade", grenadeData);
		
		ArrayList<Object> kakiData = new ArrayList<>();
		kakiData.add(3);
		kakiData.add(4.5);
		kakiData.add("kg");
		inventory.put("Kaki", kakiData);
		
		ArrayList<Object> kiwiData = new ArrayList<>();
		kiwiData.add(5);
		kiwiData.add(3.5);
		kiwiData.add("kg");
		inventory.put("Kiwi", kiwiData);
		
		ArrayList<Object> mandarineData = new ArrayList<>();
		mandarineData.add(6);
		mandarineData.add(2.8);
		mandarineData.add("kg");
		inventory.put("Mandarine", mandarineData);
		
		ArrayList<Object> orangeData = new ArrayList<>();
		orangeData.add(8);
		orangeData.add(1.5);
		orangeData.add("kg");
		inventory.put("Orange", orangeData);
		
		ArrayList<Object> pamplemousseData = new ArrayList<>();
		pamplemousseData.add(8);
		pamplemousseData.add(2);
		pamplemousseData.add("pièce");
		inventory.put("Pamplemousse", pamplemousseData);
		
		ArrayList<Object> poireData = new ArrayList<>();
		poireData.add(5);
		poireData.add(2.5);
		poireData.add("kg");
		inventory.put("Poire", poireData);
		
		ArrayList<Object> pommeData = new ArrayList<>();
		pommeData.add(8);
		pommeData.add(1.5);
		pommeData.add("kg");
		inventory.put("Pomme", pommeData);
		
		ArrayList<Object> carotteData = new ArrayList<>();
		carotteData.add(7);
		carotteData.add(1.3);
		carotteData.add("kg");
		inventory.put("Carotte", carotteData);
		
		ArrayList<Object> chouxBruxellesData = new ArrayList<>();
		chouxBruxellesData.add(4);
		chouxBruxellesData.add(4);
		chouxBruxellesData.add("kg");
		inventory.put("Choux de Bruxelles", chouxBruxellesData);
		
		ArrayList<Object> chouxVertData = new ArrayList<>();
		chouxVertData.add(12);
		chouxVertData.add(2.5);
		chouxVertData.add("pièce");
		inventory.put("Choux vert", chouxVertData);
		
		ArrayList<Object> courgeButternutData = new ArrayList<>();
		courgeButternutData.add(6);
		courgeButternutData.add(2.5);
		courgeButternutData.add("kg");
		inventory.put("Courge butternut", courgeButternutData);
		
		ArrayList<Object> endiveData = new ArrayList<>();
		endiveData.add(5);
		endiveData.add(2.5);
		endiveData.add("kg");
		inventory.put("Endive", endiveData);
		
		ArrayList<Object> epinardData = new ArrayList<>();
		epinardData.add(4);
		epinardData.add(2.6);
		epinardData.add("kg");
		inventory.put("Epinard", epinardData);
		
		ArrayList<Object> poireauData = new ArrayList<>();
		poireauData.add(5);
		poireauData.add(1.2);
		poireauData.add("kg");
		inventory.put("Poireau", poireauData);
		
		ArrayList<Object> potironData = new ArrayList<>();
		potironData.add(6);
		potironData.add(2.5);
		potironData.add("pièce");
		inventory.put("Potiron", potironData);
		
		ArrayList<Object> radisNoirData = new ArrayList<>();
		radisNoirData.add(10);
		radisNoirData.add(5);
		radisNoirData.add("pièce");
		inventory.put("Radis noir", radisNoirData);
		
		ArrayList<Object> salsifisData = new ArrayList<>();
		salsifisData.add(3);
		salsifisData.add(2.5);
		salsifisData.add("kg");
		inventory.put("Salsifis", salsifisData);
		
		
		for (String product : inventory.keySet()) {
			ArrayList<Object> values = inventory.get(product);
			System.out.println("===========================");
			System.out.println("Produit : " + product);
			System.out.println("Stock : " + values.get(0));
			System.out.println("Prix : " + values.get(1));
			System.out.println("Unité : " + values.get(2));
			System.out.println("===========================");
			
		}
		
//		System.out.println(inventory.get("Clémentine"));

	}

}
