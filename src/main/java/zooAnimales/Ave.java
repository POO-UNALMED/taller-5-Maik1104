package zooAnimales;
import java.util.*;
public class Ave extends Animal {
	
	private static List<Ave> listado= new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	public Ave() {listado.add(this);}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorPlumas=colorPlumas;
		listado.add(this);
	}

	public static int cantidadAves() {
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size();
		}
	}
	
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre,int edad,String genero){
		Ave halcon = new Ave(nombre,edad,"montanas",genero,"cafe glorioso");
		halcones++;
		return halcon;
	}

	public static Ave crearAguila(String nombre,int edad,String genero){
		Ave aguila = new Ave(nombre,edad,"montanas",genero,"blanco y amarillo");
		aguilas++;
		return aguila;
}

	public static List<Ave> getListado() {
		return listado;
	}

	public static void setListado(List<Ave> listado) {
		Ave.listado = listado;
	}

	public static int getHalcones() {
		return halcones;
	}

	public static void setHalcones(int halcones) {
		Ave.halcones = halcones;
	}

	public static int getAguilas() {
		return aguilas;
	}

	public static void setAguilas(int aguilas) {
		Ave.aguilas = aguilas;
	}

	public String getColorPlumas() {
		return colorPlumas;
	}

	public void setColorPlumas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}

	
	
}
