package gestion;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	
	private String nombre;
	private String ubicacion;
	private List<Zona> zonas = new ArrayList<Zona>();
	
	Zoologico(){
	}
	
	public Zoologico(String nombre, String ubicacion){
		this.nombre = nombre;
		this.ubicacion = ubicacion;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Zona> getZonas() {
		return zonas;
	}

	public void setZonas(List<Zona> zonas) {
		this.zonas = zonas;
	}

	public int cantidadTotalAnimales() {
		int a = 0;
		for (Zona zona : zonas) {
			a += zona.cantidadAnimales();
		}
		return a;
	}
	
	public void agregarZonas(Zona zona) {
		zonas.add(zona);
	}
}
