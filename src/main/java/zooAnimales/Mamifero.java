package zooAnimales;
import java.util.*;
public class Mamifero extends Animal {

	
	private static List<Mamifero> listado= new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	private boolean pelaje;
	private int patas;
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.pelaje=pelaje;
		this.patas=patas;
		listado.add(this);
	}
	public Mamifero() {listado.add(this);}
	
	public static int cantidadMamiferos() {
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size();
		}
		
		
	}
	
	public static Mamifero crearCaballo(String nombre,int edad,String genero){
		Mamifero caballo = new Mamifero(nombre,edad,"pradera",genero,true,4);
		caballos++;
		return caballo;
	}
	public static Mamifero crearLeon(String nombre,int edad,String genero){
		Mamifero leon = new Mamifero(nombre,edad,"selva",genero,true,4);
		leones++;
		return leon;
	}


	public static List<Mamifero> getListado() {
		return listado;
	}


	public static void setListado(List<Mamifero> listado) {
		Mamifero.listado = listado;
	}


	public static int getCaballos() {
		return caballos;
	}


	public static void setCaballos(int caballos) {
		Mamifero.caballos = caballos;
	}


	public static int getLeones() {
		return leones;
	}


	public static void setLeones(int leones) {
		Mamifero.leones = leones;
	}


	public boolean isPelaje() {
		return pelaje;
	}


	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}


	public int getPatas() {
		return patas;
	}


	public void setPatas(int patas) {
		this.patas = patas;
	}



}
