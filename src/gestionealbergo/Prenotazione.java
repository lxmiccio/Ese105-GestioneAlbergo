package gestionealbergo;

import java.time.LocalDateTime;
import java.time.Period;

public class Prenotazione
{
	private LocalDateTime dal;
	private LocalDateTime al;
	private Cliente cliente;
	private Camera camera;

	public Prenotazione(LocalDateTime dal, LocalDateTime al, Cliente cliente)
	{
		if(dal == null)
			throw new IllegalArgumentException("Dal non può essere null");
		if(al == null)
			throw new IllegalArgumentException("Al non può essere null");
		if(dal.isAfter(al))
			throw new IllegalArgumentException("Dal non può essere dopo Al");
		if(dal.isEqual(al))
			throw new IllegalArgumentException("Dal non può essere uguale ad Al");
		this.dal = dal;
		this.al = al;
		if(cliente == null)
			throw new IllegalArgumentException("Cliente non può essere null");
		this.cliente = cliente;
	}

	public int getNumeroNotti()
	{
		return Period.between(dal.toLocalDate(), al.toLocalDate()).getDays();
	}
	
	public LocalDateTime getDal()
	{
		return dal;
	}

	public void setDal(LocalDateTime dal)
	{
		if(dal == null)
			throw new IllegalArgumentException("Dal non può essere null");
		if(dal.isAfter(this.al))
			throw new IllegalArgumentException("Dal non può essere dopo Al");
		if(dal.isEqual(this.al))
			throw new IllegalArgumentException("Dal non può essere uguale ad Al");
		this.dal = dal;
	}

	public LocalDateTime getAl()
	{
		return al;
	}

	public void setAl(LocalDateTime al)
	{
		if(al == null)
			throw new IllegalArgumentException("Al non può essere null");
		if(this.dal.isAfter(al))
			throw new IllegalArgumentException("Dal non può essere dopo Al");
		if(this.dal.isEqual(al))
			throw new IllegalArgumentException("Dal non può essere uguale ad Al");
		this.al = al;
	}

	public Cliente getCliente()
	{
		return cliente;
	}

	public void setCliente(Cliente cliente)
	{
		if(cliente == null)
			throw new IllegalArgumentException("Cliente non può essere null");
		this.cliente = cliente;
	}

	public Camera getCamera()
	{
		return camera;
	}

	public void setCamera(Camera camera)
	{
		if(camera == null)
			throw new IllegalArgumentException("Camera non può essere null");
		this.camera = camera;
	}

	@Override public String toString()
	{
		return "Prenotazione [Dal=" + dal + ", Al=" + al + ", Notti=" + this.getNumeroNotti() + ", Cliente=" + cliente + ", Camera=" + camera + "]";
	}	
}