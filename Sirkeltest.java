/*
Gruppemedlemmer: Stian Hvidsten (236619), Aleksander Foss Vold (236608) og Thomas Löfstedt (236612).
Informasjonsteknolgi (Kullklassekode: INFORMATIK14HA).

Oppgave 3 Sirkel

<  nødvendig(e) import-setning(er)  >

public class SirkelTest
{
  public static void main(String[] args)
  {
    <  Deklarering og initialisering av nødvendige variabler >
    <  Les inn sirkelens radius fra brukeren. >

    <  Så lenge radius er positiv:
       Opprett et Sirkel-objekt, som ved opprettelsen blir tilført
       den radius som brukeren har skrevet inn.
       Summer radiusene ettehvert som de leses inn.
       Skriv sirkelens radius, diameter, omkrets og areal ut på skjermen
       ved å bruke en eller flere metoder i Sirkel-klassen.
       Les inn sirkelens radius på nytt fra brukeren. >

   <  Skriv ut den gjennomsnittelige radiusen for de innleste sirkelene.
      Hvis det ikke er lest inn noen skal programmet gi beskjed om det. >

  }
} // end of class SirkelTest
*/

import javax.swing.JOptionPane; //importerer JOptionPane for å kunne benytte utskrift
import java.text.DecimalFormat; //importerer decimalformatet

public class Sirkeltest	// Navngi klassen
{

    public static void main(String [] args)
	{
		double r = 0.00;					// Deklarerer variablene som skal brukes i programmet
		double r2 = 0.00;
        Sirkel sirkel;
        String utskrift = "";
        int gjennoms = 0;


		while ( r >= 0 )		//Utføres dersom det blir lest inn en positiv radius.
		{
			String tom = JOptionPane.showInputDialog("Sett en radius for skirkelen. Avslutt programmet med et negativt tall.");

			if(tom.isEmpty())	// Lar programmet vite at det ikke er lest inn en verdi.
			{
				JOptionPane.showMessageDialog(null,"Du har ikke lest inn noen verdi!");	// Dialogen som kommer dersom du ikke leser inn noen verdi, bare starter programmet.
			}
			else		// Utføres når det blir lest inn en positiv verdi
			{
				r = Double.parseDouble(tom);
				r2 += r;
				if (r >= 0)
				{
				sirkel = new Sirkel( r );
				utskrift = sirkel.vis();
				JOptionPane.showMessageDialog( null, utskrift );
				gjennoms ++;
		    }
		    }
		}

	DecimalFormat d = new DecimalFormat("0.00");		// For at vi skal sikre oss bare 2 desimaler i utskriften på gjennomsnittet av radiusene.
    double r1 = r2 / gjennoms;							// Utregningen for gjennomsnittet på radiusene som er lest inn.

    if( r1 < 0 )	// Utføres dersom det blir lest inn en negativ verdi i starten av programmet.
    {
		JOptionPane.showMessageDialog(null,"Du har ikke lest inn positiv radius!", "Feil", JOptionPane.ERROR_MESSAGE);	// Dialogen som kommer dersom det blir lest inn en negativ verdi i starten av programmet.
	}
     else		// Utføres når programmet blir avsluttet etter at positive verdier har blir lest inn.
    {

    JOptionPane.showMessageDialog(null, "Gjennomsnittet på radiusene som er lest inn \n" + r2 + " / " + gjennoms + " = " + d.format(r1));	// Utskriften på gjennomsnittet som kommer når programmet avsluttes.
    }
  }
}
