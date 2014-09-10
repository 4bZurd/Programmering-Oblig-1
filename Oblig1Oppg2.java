//Oppgave 2

//Lag et applikasjonsprogram som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
//Programmet skal starte med å lese inn nedre og øvre grense for summen. Dersom innlest øvre grense er mindre enn eller lik nedre grense,
//skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing. Når godkjente grenser er lest inn,
//skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum. Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives
//ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
//Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10. tall i summen.


import javax.swing.JOptionPane;//importerer JOptionPane.

public class Obligoppgave2
{
	public static void main(String[] args)
	{

		String nedregrense;
		String øvregrense;

		int x;
		int y;
		int sum;


		nedregrense =
			JOptionPane.showInput( "Skriv inn nedre grense:" );

		øvregrense =
			JOptionPane.showInput( "Skriv inn øvre grense:" );

		x = Integer.parseInt( nedregrense );
		y = Integer.parseInt( øvregrense );


		while( x <= 100 )
		{
			sum = sum + x;
			x = x + 1;
		}











		JOptionPane.showMessageDialog(null,
		"Summen av tallene fra 1 til 100 er " + sum);
	}

}
