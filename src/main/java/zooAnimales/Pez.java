package zooAnimales;
import java.util.*;
public class Pez extends Animal {
	
	private static List<Pez> listado= new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez(String nombre,int edad,String habitat,String genero,String colorEscamas,int cantidadAletas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.cantidadAletas=cantidadAletas;
		listado.add(this);
	}
	public Pez(){listado.add(this);}
	
	
	public static int cantidadPeces() {
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size();
		}
	}
	
	public String movimiento() {
		return "nadar";
	}
	
	public static Pez crearSalmon(String nombre,int edad,String genero){
		Pez salmon = new Pez(nombre,edad,"oceano",genero,"rojo",6);
		salmones++;
		return salmon;
	}
	public static Pez crearBacalao(String nombre,int edad,String genero){
		Pez bacalao = new Pez(nombre,edad,"oceano",genero,"gris",6);
		bacalaos++;
		return bacalao;
	}
	public static List<Pez> getListado() {
		return listado;
	}
	public static void setListado(List<Pez> listado) {
		Pez.listado = listado;
	}
	public static int getSalmones() {
		return salmones;
	}
	public static void setSalmones(int salmones) {
		Pez.salmones = salmones;
	}
	public static int getBacalaos() {
		return bacalaos;
	}
	public static void setBacalaos(int bacalaos) {
		Pez.bacalaos = bacalaos;
	}
	public String getColorEscamas() {
		return colorEscamas;
	}
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	public int getCantidadAletas() {
		return cantidadAletas;
	}
	public void setCantidadAletas(int cantidadAletas) {
		this.cantidadAletas = cantidadAletas;
	}
	
	
	
}
