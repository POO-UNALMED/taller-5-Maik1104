package zooAnimales;
import java.util.*;
public class Reptil extends Animal {

	private static List<Reptil> listado= new ArrayList<Reptil>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre,int edad,String habitat,String genero,String colorEscamas,int largoCola){
		this.setNombre(nombre);
		this.setEdad(edad);
		this.setHabitat(habitat);
		this.setGenero(genero);
		this.colorEscamas=colorEscamas;
		this.largoCola=largoCola;
		listado.add(this);
	}
	
	public Reptil() {listado.add(this);}
	
	public static int cantidadReptiles() {
		if (listado.isEmpty()) {
			return 0;
		}
		else {
			return listado.size();
		}
	}
	
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre,int edad,String genero){
		Reptil iguana = new Reptil(nombre,edad,"humedal",genero,"verde",3);
		iguanas++;
		return iguana;
	}
	public static Reptil crearSerpiente(String nombre,int edad,String genero){
		Reptil serpiente = new Reptil(nombre,edad,"jungla",genero,"blanco",1);
		serpientes++;
		return serpiente;
	}

	public static List<Reptil> getListado() {
		return listado;
	}

	public static void setListado(List<Reptil> listado) {
		Reptil.listado = listado;
	}

	public static int getIguanas() {
		return iguanas;
	}

	public static void setIguanas(int iguanas) {
		Reptil.iguanas = iguanas;
	}

	public static int getSerpientes() {
		return serpientes;
	}

	public static void setSerpientes(int serpientes) {
		Reptil.serpientes = serpientes;
	}

	public String getColorEscamas() {
		return colorEscamas;
	}

	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}

	public int getLargoCola() {
		return largoCola;
	}

	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
	
	
}
