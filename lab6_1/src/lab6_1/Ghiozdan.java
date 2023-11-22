package lab6_1;

public class Ghiozdan {
	Rechizita[] lista = new Rechizita[10];
	private static int nrObiecte =0;
	
	public void add(Manual manual)
	{
		lista[nrObiecte++]=manual;
	}
	
	public void listaManual()
	{
		System.out.println("Manualele din ghiozdan: ");
		for(int i=0; i<nrObiecte; i++)
		{
			if(lista[i] instanceof Manual)
			{
				System.out.println(lista[i].getEticheta());
			}
		}
	}
	
	
	public void add(Caiet caiet)
	{
		lista[nrObiecte++]=caiet;
	}
	
	public void listaCaiet()
	{
		System.out.println("Caietele din ghiozdan: ");
		for(int i=0; i<nrObiecte; i++)
		{
			if(lista[i] instanceof Caiet)
			{
				System.out.println(lista[i].getEticheta());
			}
		}
	}
	
	public void getNrCaiete()
	{
		int k=0;
		for(int i=0; i<nrObiecte; i++)
		{
			if(lista[i] instanceof Caiet)
			{
				k++;
			}
		}
		System.out.println("Sunt " + k + " caiete.\n");
	}
	
	public void getNrManuale()
	{
		int k=0;
		for(int i=0; i<nrObiecte; i++)
		{
			if(lista[i] instanceof Manual)
			{
				k++;
			}
		}
		System.out.println("Sunt " + k + " manuale.\n");
	}
	
	public void getNrObiecte()
	{
		System.out.println("Sunt " + nrObiecte + " obiecte.\n");
	}
}
