package lab6_1;

public class MainClass {

	public static void main(String[] args) {
		
		Ghiozdan ghiozdan = new Ghiozdan();
		
		Caiet caiet1 = new Caiet("Istorie");
		Caiet caiet2 = new Caiet("Romana");
		Caiet caiet3 = new Caiet("Mate");
		Caiet caiet4 = new Caiet("Info");
		
		Manual manual1 = new Manual("Geografie");
		Manual manual2 = new Manual("Muzica");
		
		ghiozdan.add(manual2);
		ghiozdan.add(caiet3);
		ghiozdan.add(manual1);
		ghiozdan.add(caiet2);
		
		ghiozdan.getNrCaiete();
		ghiozdan.getNrManuale();
		ghiozdan.getNrObiecte();
		
		ghiozdan.listaCaiet();
		ghiozdan.listaManual();
		
	}

}
