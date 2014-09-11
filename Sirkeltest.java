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

	public static void main(String[] args) //main metode for å kunne kjøre programmet
	{
		String r = JOptionPane.showInputDialog("Skriv inn radius"); //input dialog for å hente sirkelens radius fra brukeren.

		double radius = Double.parseDouble(r); //parser radius til double, for å kunne vise desimaltall

		Sirkel s = new Sirkel(radius); //oppretter sirkel-object, der radius settes til det som ble skrevet inn av bruker

		String output = s.utskrift();

		JOptionPane.showMessageDialog(null, output);
   }
}

/* gjenstår å få til:
- Summer radiusene ettehvert som de leses inn
- test om innskrevet radius er positiv
- teste at utskrift på skjerm av sirkelens radius, diameter, omkrets og areal fungerer
- en ny innlesing av sirkelens radius etter at areal, omkrets, radius og diameter er skrevet ut på skjerm
- lage kode for å skrive ut den gjennomsnittlige radiusen for de innleste sirklene. Melding om at det ikke er lest inn noen sirkel dersom det ikke er gjort enda.
*/
