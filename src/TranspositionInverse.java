
/**
 * Chiffre les messages en inversant l'ordre des lettres.
 */

public class TranspositionInverse implements ProtocoleChiffrement
{

	@Override
	public String chiffre(String message) 
	{
		return new StringBuffer(message).reverse().toString();
	}

	@Override
	public String dechiffre(String message) 
	{
		return new StringBuffer(message).reverse().toString();
	}
	
}
