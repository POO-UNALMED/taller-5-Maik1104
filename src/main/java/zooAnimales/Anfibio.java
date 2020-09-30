package zooAnimales;
import java.util.*;
public class Anfibio extends Animal {

	private static List<Anfibio> listado= new ArrayList<Anfibio>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(){
		listado.add(this);
	}
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
	}
	
	public static int cantidadAnfibios() {
		if(listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size();
		}
	}
	
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre,int edad,String genero) {
		Anfibio rana = new Anfibio(nombre,edad,"selva",genero,"rojo",true);
		ranas++;
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre,int edad,String genero){
		Anfibio sal = new Anfibio(nombre,edad,"selva",genero,"negro y amarillo",false);
		salamandras++;
		return sal;
		
	}

	public static List<Anfibio> getListado() {
		return listado;
	}

	public static void setListado(List<Anfibio> listado) {
		Anfibio.listado = listado;
	}

	public static int getRanas() {
		return ranas;
	}

	public static void setRanas(int ranas) {
		Anfibio.ranas = ranas;
	}

	public static int getSalamandras() {
		return salamandras;
	}

	public static void setSalamandras(int salamandras) {
		Anfibio.salamandras = salamandras;
	}

	public String getColorPiel() {
		return colorPiel;
	}

	public void setColorPiel(String colorPiel) {
		this.colorPiel = colorPiel;
	}

	public boolean isVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}
	
	
}
