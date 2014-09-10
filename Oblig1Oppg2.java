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

		if ( y <= x )
			JOptionPane.showMessageDialog ( "Du må skrive inn et tall som er høyere enn " + x + "!", "Tallet er for lavt", JOptionPane.ERROR_MESSAGE )
		else if ( y > x )

		// vi trenger å definere hva som skjer etter at den har etablert om y er mindre enn eller lik x
		// vi må få den til å gå tilbake for å skrive inn nytt tall for øvre grense hvis ikke y er større enn x

	}
}
