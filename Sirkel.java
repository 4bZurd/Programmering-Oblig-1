/*
Gruppemedlemmer: Stian Hvidsten (236619), Aleksander Foss Vold (236608) og Thomas Löfstedt (236612).
Informasjonsteknolgi (Kullklassekode: INFORMATIK14HA).

Oppgave 3

Nedenfor ser du en skisse i pseudokode av klassen Sirkel. Din oppgave er å erstatte pseudokoden med java-instruksjoner.
NB! Pass på at du velger riktig aksess-form (private eller public) for datafelt og metoder.

public class Sirkel
{
    <  Datafelt for sirkelens radius. >

    <  Konstruktør som skal gi startverdi til sirkelens radius.
       NB! Hvis startverdien er negativ, skal radius settes til 0. >

    <  set-metode for sirkelens radius.
       NB! Hvis parameterverdien er negativ, skal radius settes til 0. >

    <  get-metode for sirkelens radius.  >

    <  Metode som beregner og returnerer sirkelens diameter.  >

    <  Metode som beregner og returnerer sirkelens omkrets.  >

    <  Metode som beregner og returnerer sirkelens areal.  >

    <  Metode som returnerer en tekst som inneholder  sirkelens radius,
       diameter, omkrets og areal. NB! Du SKAL bruke klassens metoder
       for å beregne disse verdiene. >

} // end of class Sirkel
*/

import java.text.DecimalFormat; //importerer decimalformatet

public class Sirkel //Klassen må på plass
{
	  private double radius; //Datafelt med private aksessform

	  public Sirkel(double r) //Konstruktøren som beregner startverdi for sirkelens radius
	  {
		   setRadius(r);
    }

    public void setRadius(double r) //Set-metode for sirkelens radius, hvor vi også setter radius til 0 hvis parameterverdien er negativ
	  {
		  if( radius >= 0 )
		    radius = r;
		  else
		    radius = 0;
    }

    public double getRadius() //Get-metode for radius
    {
		  return radius;
    }

    public double diameter() //Get-metode for diameter
    {
		  return 2*radius;
    }

    public double omkrets() //Get-metode for omkrets
	  {
	  	return 2*Math.PI*radius;
    }

    public double  areal() //Get-metode for areal
    {
	    return 	Math.PI*radius*radius;
    }

    public String utskrift()  // Vi har importert java.text.DecimalFormat, derfor kan vi få ut desimaltall
    {
		   DecimalFormat d = new DecimalFormat("0.00");

		   String tekst = "Sirkelens radius er " + d.format(radius) +
		   				"\nSirkelens diameter er " + d.format(diameter()) +
		               	"\nSirkelens omkrets er " + d.format(omkrets())+
		               	"\nSirkelens areal er " + d.format(areal());

		   return tekst;
    }

}
