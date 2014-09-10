//Oppgave 2

//Lag et applikasjonsprogram som beregner og skriver ut summen av alle tall mellom to grenser som brukeren skriver inn.
//Programmet skal starte med å lese inn nedre og øvre grense for summen. Dersom innlest øvre grense er mindre enn eller lik nedre grense,
//skal programmet skrive ut en melding til brukeren om dette og foreta ny innlesing. Når godkjente grenser er lest inn,
//skal programmet beregne nevnte sum og summen skal så skrive den ut som en sum. Hvis f. eks. nedre grense er 2 og øvre grense er 8 skal det skrives
//ut følgende tekst: "2 + 3 + 4 + 5 + 6 + 7 + 8 = 35".
//Test ut programmet med nedre grense lik 1 og øvre grense lik 100. Legg inn et linjeskift for hvert 10. tall i summen.


import javax.swing.JOptionPane;//importerer JOptionPane funksjonene.

public class Utregning
{
	public static void main(String[] args)
	{

		int nedregrense; // Her legger vi inn variablene som programmet skal bruke.
		int øvregrense;
		String resultat= "";
		int teller=1;
		int sum=0;



		do // En do-while løkke som gjør utregningene som 
		{
			resultat="";
			nedregrense =  Integer.parseInt(JOptionPane.showInputDialog( "Skriv inn nedre grense:" ));

			øvregrense = Integer.parseInt(JOptionPane.showInputDialog( "Skriv inn øvre grense:" ));
			if( øvregrense > nedregrense)
			{
				for ( int i= nedregrense; i<=øvregrense; i++)
				{
					sum=i+sum;
					if(i==øvregrense)
					{
						resultat=resultat+i;
					}
					else
					{
						resultat=resultat+i+"+";
					}

					if(teller%10==0)
					{
						resultat=resultat+"\n";
					}
					teller++;
				}
				resultat= resultat+"="+sum;

			}
			else
			{
				resultat="øvregrense er mindre enn nedregrense!";
				JOptionPane.showMessageDialog(null,resultat);
			}
		} while(!(øvregrense>nedregrense));


				JOptionPane.showMessageDialog(null,resultat);
	}

}
