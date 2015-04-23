package gestionealbergo;

import java.util.Vector;

@SuppressWarnings("unused")
public class Albergo
{
	private String nome;
	private Vector<Camera> camere;
	
	public Albergo(String nome)
	{
		if(nome.length() <= 0)
			throw new IllegalArgumentException("Nome deve avere lunghezza positiva");
		if(nome == null)
			throw new IllegalArgumentException("Nome non può essere null");
		this.nome = nome;
		this.camere = new Vector<Camera>();
	}
	
	public String getNome()
	{
		return nome;
	}

	public Vector<Camera> getCamere()
	{
		return camere;
	}

	@Override public String toString()
	{
		return "Albergo [Nome=" + nome + ", Numero Camere=" + camere.size() + "]";
	}
}