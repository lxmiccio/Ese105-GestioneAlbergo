package gestionealbergo;

import java.time.LocalDateTime;
import java.util.Vector;

@SuppressWarnings("unused")
public abstract class Camera
{
	private String numero;
	private Vector<Prenotazione> prenotazioni;
	
	public Camera(String numero)
	{
		if(numero.length() <= 0)
			throw new IllegalArgumentException("Numero deve avere lunghezza positiva");
		if(numero == null)
			throw new IllegalArgumentException("Numero non può essere null");
		this.numero = numero;
		this.prenotazioni = new Vector<Prenotazione>();
	}

	public boolean isDisponibile(LocalDateTime dal, LocalDateTime al)
	{
		boolean disponibile = true;
		for(Prenotazione prenotazione : prenotazioni)
			if((!dal.isBefore(prenotazione.getDal()) && !dal.isAfter(prenotazione.getAl())) || (!prenotazione.getDal().isBefore(dal) && !prenotazione.getDal().isAfter(al))) 
				if((!al.isBefore(prenotazione.getDal()) && !al.isAfter(prenotazione.getAl())) || (!prenotazione.getAl().isBefore(dal) && !prenotazione.getAl().isAfter(al))) 
					disponibile = false;
		return disponibile;
	}

	public void addPrenotazione(Prenotazione prenotazione)
	{
		if(prenotazione == null)
			throw new IllegalArgumentException("Prenotazione non può essere null");
		if(!this.isDisponibile(prenotazione.getDal(), prenotazione.getAl()))
			throw new IllegalArgumentException("Posti non disponibili");
		prenotazione.setCamera(this);
		this.prenotazioni.add(prenotazione);
	}
	
	public String getNumero()
	{
		return numero;
	}

	public void setNumero(String numero)
	{
		if(numero.length() <= 0)
			throw new IllegalArgumentException("Il numero deve avere lunghezza positiva");
		if(numero == null)
			throw new IllegalArgumentException("Il numero non può essere null");
		this.numero = numero;
	}

	public Vector<Prenotazione> getPrenotazioni()
	{
		return prenotazioni;
	}

	@Override public String toString()
	{
		return "Camera [numero=" + numero + ", prenotazioni=" + prenotazioni.size() + "]";
	}
}