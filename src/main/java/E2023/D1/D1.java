package E2023.D1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class D1 {

	public static void main(String[] args) throws IOException {

		String input = "src/main/java/E2023/D1/input.txt";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input))) {
			String chaineString;

			long sum = 0;

			while ((chaineString = bufferedReader.readLine()) != null) {
				StringBuilder stringBuilder = new StringBuilder();

				for (int i = 0; i < chaineString.length(); i++) {

					if (Character.isDigit(chaineString.charAt(i))) {

						stringBuilder.append(chaineString.charAt(i));
					}

				}

				if (stringBuilder.length() > 0) {
					// Prendre le premier et le dernier chiffre de la chaîne
					char premierChiffre = stringBuilder.charAt(0);
					char dernierChiffre = stringBuilder.charAt(stringBuilder.length() - 1);

					// Concaténer et transformer en int
					String concatDigits = Character.toString(premierChiffre) + dernierChiffre;
					int resultat = Integer.parseInt(concatDigits);

					sum = sum + resultat;

				}

			}

			System.out.println("Resultat : " + sum);

		}

	}

}
