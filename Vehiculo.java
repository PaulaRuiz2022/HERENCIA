import java.io.File;
import java.io.*;
import java.util.*;

public class Vehiculo{
	private int velocidad;
	private int numeroruedas;
	private char marca;
	private int modelo;
	Vehiculo(){
		this.velocidad=0;
		this.numeroruedas=0;
		this.marca='j';
		this.modelo=0;
	}
        Vehiculo(int velocidad, int numeroruedas, char marca, int modelo){
		this.velocidad=velocidad;
		this.numeroruedas=numeroruedas;
		this.marca=marca;
		this.modelo=modelo;
	}

	public int getModelo(){
		return modelo;
	}

	public void encender(){
		System.out.println("Esta encendido");
	}
	public void rodar(){
		System.out.println("Esta rodando");
	}
	public void apagar(){
		System.out.println("Esta apagado");
	}
	public void tanquear(){
		System.out.println("Esta tanqueado");
	}

}

