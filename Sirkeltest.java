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

public class Sirkeltest
{

    public static void main(String [] args)
	{
		double r = 0.00;
		double r2 =0.00;
        Sirkel sirkel;
        String utskrift = "";
        int gjennoms = 0;


		while ( r >= 0)
		{
			String tom = JOptionPane.showInputDialog("Sett en radius for skirkelen. Avslutt programmet med et negativt tall.");
			if(tom.isEmpty())
			{
				JOptionPane.showMessageDialog(null,"Du har ikke lest inn noen verdi!");
			}
			else
			{
				r = Double.parseDouble(tom);
				r2+=r;
				if (r >=0)
				{
				sirkel = new Sirkel(r);
				utskrift = sirkel.vis();
				JOptionPane.showMessageDialog(null,utskrift);
				gjennoms ++;
		    }
		    }
		}


    double r1 = r2 / gjennoms;

    if(r1<0)
    {
		JOptionPane.showMessageDialog(null,"Du har ikke lest inn positiv radius!");
	}
     else
    {

    JOptionPane.showMessageDialog(null, "Gjennomsnittet på" + r2 + " / " + gjennoms + " = " + r1);
    }
  }
}
