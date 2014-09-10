/*
Gruppemedlemmer: Stian Hvidsten (236619), Aleksander Foss Vold (236608) og Thomas Löfstedt (236612).
Informasjonsteknolgi (Kullklassekode: INFORMATIK14HA).

Oppgave 2

Lag et applikasjonsprogram som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
Programmet skal starte med å lese inn nedre og øvre grense for summen. Dersom innlest øvre grense er mindre enn eller lik nedre grense,
skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing. Når godkjente grenser er lest inn,
skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum. Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives
ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10. tall i summen.
*/

import javax.swing.JOptionPane;//importerer JOptionPane funksjonene som vi trenger.

public class Utregning
{
	public static void main(String[] args)
	{

		int nedregrense; // Her legger vi inn variablene som programmet skal bruke.
		int øvregrense;
		String resultat= "";
		int teller=1;
		int sum=0;



		do // Do-while avgjør om programmet er true eller false. Og har betingelsen på slutten av løkka.
		{
			resultat ="";

			nedregrense =  Integer.parseInt(JOptionPane.showInputDialog( "Skriv inn nedre grense:" ));

			øvregrense = Integer.parseInt(JOptionPane.showInputDialog( "Skriv inn øvre grense:" ));

			if( øvregrense > nedregrense)
			{
				for ( int i= nedregrense; i <= øvregrense; i++)  // Vi lar "i" være et tall som er lik nedregrense i utgangspunktet,
															     // så lenge "i" er mindre enn nedregrensa så gjør vi utregningen
				{
					sum = i + sum;

					if( i == øvregrense)					     // Dette skjer når "i" er lik øvregrensen

					{
						resultat = resultat + i;
					}

					else									    /* Dette skjer hvis "i" ikke er lik øvregrensen, det er her skjer helt til nedregrense er lik
															    øvregrense*/

					{
						resultat = resultat + i + "+";
					}

					if( teller % 10==0)						    /*Dette er funksjonen som teller antall tall som er telt til nå, så det er her vi vet hvor
															    mange tall som er telt. Derfor vet programmet at vi skal sette linjeskift*/

					{
						resultat = resultat + "\n";
					}

					teller++;
				}

				resultat = resultat + "=" +sum;

			}

			else													/* Her har vi utskrift funksjonen som sier ifra om du har satt inn ugyldig
																   tall i programmet*/

			{
				resultat="øvregrense er mindre enn nedregrense!";

				JOptionPane.showMessageDialog(null,resultat,"Feil inntasting",JOptionPane.ERROR_MESSAGE);
			}

		} while(!(øvregrense>nedregrense));							/* Dette er funksjonen som enten avslutter programmet, eller starter det på nytt hvis
																	   du har satt noe feil.*/

				JOptionPane.showMessageDialog(null,resultat,"Utregning",JOptionPane.PLAIN_MESSAGE);
	}

}
