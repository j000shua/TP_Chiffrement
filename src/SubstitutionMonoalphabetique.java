/**
 * Chiffre les messages avec une table de substitution.
 * si la table de substition est "zybcdefghijklmnopqrstuvwxa"
 * alors les 'a' seront remplacés par des 'z', 
 * les 'b' seront remplacés par des 'y'
 * les 'c' seront remplacés par des 'b'
 * etc.
 **/

public class SubstitutionMonoalphabetique implements ProtocoleChiffrementACle 
{
	private String cle;
	char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	String alph="abcdefghijklmnopqrstuvwxyz";
	
	@Override
	public String chiffre(String message) 
	{
		String res="";
		for(int i = 0; i < message.length(); i++) {
			res += cle[alph.indexof(message.charAt(i))];
		}
		return res;
	}

	@Override
	public String dechiffre(String message) 
	{
		return "";
	}
	
	@Override
	public void setCle(String cle) {
		this.cle = cle;
	}
	
	@Override
	public String getCle() {
		return cle;
	}
}
