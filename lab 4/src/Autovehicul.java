
import java.awt.Color;

public class Autovehicul {
	private String marca;
	 float vitezaMaxima;
	 float vitezaCurenta;
	 int numarTrepte;
	 int treaptaCurenta;
	 Color culoare;


	public Autovehicul(String marca, float vitezaMaxima,float vitezaCurenta, int numarTrepte, int treaptaCurenta,Color culoare)
	{
		this.marca=marca;
		this.culoare=culoare;
		this.vitezaCurenta=vitezaCurenta;
		this.treaptaCurenta=treaptaCurenta;
		this.vitezaMaxima = vitezaMaxima;
	}
	
	public String getMarca()
	{
		return marca;
	}

	public void setMarca(String marca)
	{
		this.marca=marca;
	}
	
	public Color getColor()
	{
		return culoare;
	}
	
	public void setColor(Color culoare)
	{
		this.culoare=culoare;
	}
	
	public float getViteza()
	{
		return vitezaCurenta;
	}
	
	public void setViteza(float vitezaCurenta)
	{
		this.vitezaCurenta=vitezaCurenta;
	}
	
	public int getTreapta()
	{
		return treaptaCurenta;
	}
	
	public void setTreapta(int treaptaCurenta)
	{
		this.treaptaCurenta=treaptaCurenta;	
	}

	public void accelerare(int delta)
	{
		if(delta+vitezaCurenta>vitezaMaxima)
			vitezaCurenta=vitezaMaxima;
		else
			vitezaCurenta=vitezaCurenta+delta;
	}
	
	public void decelerare(int delta)
	{ 
		if (vitezaCurenta-delta<0)	
			vitezaCurenta=0;
		else
			vitezaCurenta=vitezaCurenta-delta;
	}
	
	public void schimbareTrepte(int treapta)
	{
		if(treaptaCurenta+treapta > numarTrepte)
			treaptaCurenta = numarTrepte;
		else if(treaptaCurenta+treapta < 0)
			treaptaCurenta = 0;
		else
			treaptaCurenta += treapta;
	}
	
public String toString(){
return "Marca este " + marca + ", are viteza curenta de " + vitezaCurenta + " si se afla in treapta " + treaptaCurenta;
}
}