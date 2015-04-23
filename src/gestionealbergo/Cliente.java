package gestionealbergo;

import java.util.Vector;

@SuppressWarnings("unused")
public class Cliente
{
	private String nome;
	private String cognome;
	private String cellulare;
	private String email;
	
	public Cliente(String nome, String cognome, String cellulare)
	{
		if(nome.length() <= 0)
			throw new IllegalArgumentException("Nome deve avere lunghezza positiva");
		if(nome == null)
			throw new IllegalArgumentException("Nome non può essere null");
		this.nome = nome;
		if(cognome.length() <= 0)
			throw new IllegalArgumentException("Cognome deve avere lunghezza positiva");
		if(cognome == null)
			throw new IllegalArgumentException("Cognome non può essere null");
		this.cognome = cognome;
		if(cellulare.length() <= 0)
			throw new IllegalArgumentException("Cellulare deve avere lunghezza positiva");
		if(cellulare == null)
			throw new IllegalArgumentException("Cellulare non può essere null");
		this.cellulare = cellulare;
		this.email = null;
	}
	
	public Cliente(String nome, String cognome, String cellulare, String email)
	{
		if(nome.length() <= 0)
			throw new IllegalArgumentException("Nome deve avere lunghezza positiva");
		if(nome == null)
			throw new IllegalArgumentException("Nome non può essere null");
		this.nome = nome;
		if(cognome.length() <= 0)
			throw new IllegalArgumentException("Cognome deve avere lunghezza positiva");
		if(cognome == null)
			throw new IllegalArgumentException("Cognome non può essere null");
		this.cognome = cognome;
		if(cellulare.length() <= 0)
			throw new IllegalArgumentException("Cellulare deve avere lunghezza positiva");
		if(cellulare == null)
			throw new IllegalArgumentException("Cellulare non può essere null");
		this.cellulare = cellulare;
		if(email.length() <= 0)
			throw new IllegalArgumentException("Email deve avere lunghezza positiva");
		if(email == null)
			throw new IllegalArgumentException("Email non può essere null");
		this.email = email;
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		if(nome.length() <= 0)
			throw new IllegalArgumentException("Nome deve avere lunghezza positiva");
		if(nome == null)
			throw new IllegalArgumentException("Nome non può essere null");
		this.nome = nome;
	}

	public String getCognome()
	{
		return cognome;
	}

	public void setCognome(String cognome)
	{
		if(cognome.length() <= 0)
			throw new IllegalArgumentException("Cognome deve avere lunghezza positiva");
		if(cognome == null)
			throw new IllegalArgumentException("Cognome non può essere null");
		this.cognome = cognome;
	}

	public String getCellulare()
	{
		return cellulare;
	}

	public void setCellulare(String cellulare)
	{
		if(cellulare.length() <= 0)
			throw new IllegalArgumentException("Cellulare deve avere lunghezza positiva");
		if(cellulare == null)
			throw new IllegalArgumentException("Cellulare non può essere null");
		this.cellulare = cellulare;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		if(email.length() <= 0)
			throw new IllegalArgumentException("Email deve avere lunghezza positiva");
		if(email == null)
			throw new IllegalArgumentException("Email non può essere null");
		this.email = email;
	}

	@Override public String toString()
	{
		return "Cliente [Nome=" + nome + ", Cognome=" + cognome + ", Cellulare=" + cellulare + ", Email=" + email + "]";
	}
	
}