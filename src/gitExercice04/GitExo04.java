package gitExercice04;

import java.util.*;

public class GitExo04 {
	// Inventaire
	static HashMap<String, ArrayList<Object>> inventory = new HashMap<>();

	// Liste des clients du jour et le montant de leur achat
	static HashMap<String, ArrayList<Object>> dayResume = new HashMap<>();

	// Panier client
	static HashMap<String, ArrayList<Object>> clientCart = new HashMap<>();

	// Méthode d'ajout de produit à l'inventaire
	public static void allProductInventory() {
		// Liste inventaire
		ArrayList<Object> clementineData = new ArrayList<>();
		clementineData.add(6);
		clementineData.add(2.90);
		clementineData.add("kg");
		inventory.put("clémentine", clementineData);

		ArrayList<Object> datteData = new ArrayList<>();
		datteData.add(4);
		datteData.add(7);
		datteData.add("kg");
		inventory.put("datte", datteData);

		ArrayList<Object> grenadeData = new ArrayList<>();
		grenadeData.add(3);
		grenadeData.add(3.5);
		grenadeData.add("kg");
		inventory.put("grenade", grenadeData);

		ArrayList<Object> kakiData = new ArrayList<>();
		kakiData.add(3);
		kakiData.add(4.5);
		kakiData.add("kg");
		inventory.put("kaki", kakiData);

		ArrayList<Object> kiwiData = new ArrayList<>();
		kiwiData.add(5);
		kiwiData.add(3.5);
		kiwiData.add("kg");
		inventory.put("kiwi", kiwiData);

		ArrayList<Object> mandarineData = new ArrayList<>();
		mandarineData.add(6);
		mandarineData.add(2.8);
		mandarineData.add("kg");
		inventory.put("mandarine", mandarineData);

		ArrayList<Object> orangeData = new ArrayList<>();
		orangeData.add(8);
		orangeData.add(1.5);
		orangeData.add("kg");
		inventory.put("orange", orangeData);

		ArrayList<Object> pamplemousseData = new ArrayList<>();
		pamplemousseData.add(8);
		pamplemousseData.add(2);
		pamplemousseData.add("pièce");
		inventory.put("pamplemousse", pamplemousseData);

		ArrayList<Object> poireData = new ArrayList<>();
		poireData.add(5);
		poireData.add(2.5);
		poireData.add("kg");
		inventory.put("poire", poireData);

		ArrayList<Object> pommeData = new ArrayList<>();
		pommeData.add(8);
		pommeData.add(1.5);
		pommeData.add("kg");
		inventory.put("pomme", pommeData);

		ArrayList<Object> carotteData = new ArrayList<>();
		carotteData.add(7);
		carotteData.add(1.3);
		carotteData.add("kg");
		inventory.put("carotte", carotteData);

		ArrayList<Object> chouxBruxellesData = new ArrayList<>();
		chouxBruxellesData.add(4);
		chouxBruxellesData.add(4);
		chouxBruxellesData.add("kg");
		inventory.put("choux de bruxelles", chouxBruxellesData);

		ArrayList<Object> chouxVertData = new ArrayList<>();
		chouxVertData.add(12);
		chouxVertData.add(2.5);
		chouxVertData.add("pièce");
		inventory.put("choux vert", chouxVertData);

		ArrayList<Object> courgeButternutData = new ArrayList<>();
		courgeButternutData.add(6);
		courgeButternutData.add(2.5);
		courgeButternutData.add("kg");
		inventory.put("courge butternut", courgeButternutData);

		ArrayList<Object> endiveData = new ArrayList<>();
		endiveData.add(5);
		endiveData.add(2.5);
		endiveData.add("kg");
		inventory.put("endive", endiveData);

		ArrayList<Object> epinardData = new ArrayList<>();
		epinardData.add(4);
		epinardData.add(2.6);
		epinardData.add("kg");
		inventory.put("epinard", epinardData);

		ArrayList<Object> poireauData = new ArrayList<>();
		poireauData.add(5);
		poireauData.add(1.2);
		poireauData.add("kg");
		inventory.put("poireau", poireauData);

		ArrayList<Object> potironData = new ArrayList<>();
		potironData.add(6);
		potironData.add(2.5);
		potironData.add("pièce");
		inventory.put("potiron", potironData);

		ArrayList<Object> radisNoirData = new ArrayList<>();
		radisNoirData.add(10);
		radisNoirData.add(5);
		radisNoirData.add("pièce");
		inventory.put("radis noir", radisNoirData);

		ArrayList<Object> salsifisData = new ArrayList<>();
		salsifisData.add(3);
		salsifisData.add(2.5);
		salsifisData.add("kg");
		inventory.put("salsifis", salsifisData);
	}

	// Méthode de visualisation de l'inventaire
	public static void showInventory() {

		for (String product : inventory.keySet()) {
			ArrayList<Object> values = inventory.get(product);
			System.out.println("===========================");
			System.out.println("Produit : " + product);
			System.out.println("Stock : " + values.get(0));
			System.out.println("Prix : " + values.get(1));
			System.out.println("Unité : " + values.get(2));
			System.out.println("===========================");

		}
	}

	// Méthode de visualisation du stock
	public static void showStock() {

		for (String product : inventory.keySet()) {
			ArrayList<Object> values = inventory.get(product);
			System.out.println("===========================");
			System.out.println("Produit : " + product);
			System.out.println("Stock : " + values.get(0));
			System.out.println("===========================");
		}
	}

	// Méthode d'achat d'un produit
	public static void buySomeThing(String productName, int quantityToBuy) {

		// Récupération des infos du produit
		ArrayList<Object> inventoryValues = inventory.get(productName);

		// Récupération du prix du produit et convertion en double
		double productPrice = (int) inventoryValues.get(0);
//		System.out.println("product price double : " + productPrice); 

		// Convertion quantité à acheter en double
		double quantityToBuyDouble = (int) quantityToBuy;
//		System.out.println("quantité à acheter double : " + quantityToBuyDouble); 

		// Calcul du prix total
		double totalPrice = (double) productPrice * quantityToBuyDouble;
//		System.out.println("Prix total double : " + totalPrice); 

		// Mise a jour de la quantité du stock
		double actualQuantity = (double) inventoryValues.get(1);
//		System.out.println("Quantité actuelle : " + actualQuantity);
		double updateQuantity = (double) actualQuantity - quantityToBuyDouble;
//		System.out.println("Quantité mise a jour : " + updateQuantity);

//		System.out.println("Before update" + inventoryValues);
		inventoryValues.set(0, updateQuantity);
		inventory.put(productName, inventoryValues);
//		System.out.println("Before update" + inventoryValues);
		System.out.println(quantityToBuy + " " + inventoryValues.get(2) + " " + productName.toLowerCase() + " = "
				+ totalPrice + " €");
	}

	// Méthode d'ajout d'un client et du montant des achats
	public static void addClient(String clientLastName, String clientFirstname) {
		ArrayList<Object> clientData = new ArrayList<>();
		clientData.add(clientFirstname);
		clientData.add(0);
		dayResume.put(clientLastName, clientData);
	}

	public static void main(String[] args) {

//Variables
		boolean rebuy = false;

		Scanner scan = new Scanner(System.in);

		// Remplissage de l'inventaire
		allProductInventory();

//		System.out.println("infos salsifis" + inventory.get("Salsifis"));
//		buySomeThing("Salsifis", 4);
//		System.out.println("infos salsifis" + inventory.get("Salsifis"));
//		showInventory();

		System.out.println("Bienvenue Au Bon Marché");
		System.out.println("Client (1) ou Voir le bilan (2)");
		int firstChoice = Integer.parseInt(scan.nextLine());
		if (firstChoice == 1) {
			System.out.println("Entrer nom du client: ");
			String clientLastName = scan.nextLine().toLowerCase();

			System.out.println("Entrer prénom du client: ");
			String clientFirstName = scan.nextLine().toLowerCase();
			addClient(clientLastName, clientFirstName);
			System.out.println(dayResume.get(clientLastName));
			while (!rebuy) {
				System.out.println("Que voulez vous acheter ?");
				String clientProduct = scan.nextLine();

				ArrayList<Object> clientProductChoice = inventory.get(clientProduct);
				System.out.println("clientProductChoice : " + clientProductChoice.get(0));

					System.out.println("Quel quantité ? " + "(" + clientProductChoice.get(2) + ")");
					double clientQuantity = Integer.parseInt(scan.nextLine());
					double actualProductStock = (int) clientProductChoice.get(0);
					while (actualProductStock < clientQuantity) {
						System.out.println("Stock insuffisant, veuillez modifier => Max:" + actualProductStock + "("
								+ clientProductChoice.get(2) + ")");
						clientQuantity = Integer.parseInt(scan.nextLine());
					}
					System.out.println("Ajouter un autre article ? Y/N");
					String anotherArticle = scan.nextLine().toLowerCase();
					 if (anotherArticle.equals("n")) {
						rebuy = !rebuy;
						System.out.println("Merci et a bientot");
					}
				}

			}

			// si choix 2
		 else if (firstChoice == 2) {
			showStock();
		}

	}

}
