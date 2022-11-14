import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ChiffrementTest 
{

	@Test
	void testTranspositionChiffre() 
	{
		ProtocoleChiffrement transposition = new TranspositionInverse();
		assertEquals("ytreza", transposition.chiffre("azerty"));
		assertEquals("123456789", transposition.chiffre("987654321"));
	}

	@Test
	void testTranspositionDechiffre() 
	{
		ProtocoleChiffrement transposition = new TranspositionInverse();
		assertEquals("ytreza", transposition.dechiffre("azerty"));
		assertEquals("123456789", transposition.dechiffre("987654321"));
	}
	
	@Test
	void testSubstitutionChiffre() 
	{
		ProtocoleChiffrementACle substitution = new SubstitutionMonoalphabetique();
		substitution.setCle("azertyuiopqsdfghjklmwxcvbn");
		assertEquals("zgfpgwk", substitution.chiffre("bonjour"));
		assertEquals("awktxgok", substitution.chiffre("aurevoir"));
	}

	@Test
	void testSubstitutionDechiffre() 
	{
		ProtocoleChiffrementACle substitution = new SubstitutionMonoalphabetique();
		substitution.setCle("azertyuiopqsdfghjklmwxcvbn");
		assertEquals("bonjour", substitution.dechiffre("zgfpgwk"));
		assertEquals("aurevoir", substitution.dechiffre("awktxgok"));
	}

}
