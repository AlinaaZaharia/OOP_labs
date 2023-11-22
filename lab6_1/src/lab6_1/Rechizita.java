package lab6_1;

abstract public class Rechizita {
	String eticheta;
	
	public Rechizita(String name)
	{
		eticheta = name;
	}
	public Rechizita() {}
	
	abstract String getEticheta();
}
