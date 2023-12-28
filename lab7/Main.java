import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {

        Masina m = new Masina("Audi", "BLACK");
        Student s = new Student("Andreea", 10, m);

        Student s1 = new Student("Ioana", 7, m);
        s = s1.clone();

        System.out.println(s);
        System.out.println(s1);

        s1.masina.vopseste("GREY");
        System.out.println(s);

        Masina mas = new Masina("BMW", "WHITE");
        m = mas.clone();
        System.out.println(m);

        Masina m1 = new Masina("Logan", "3");
        Masina m2 = new Masina("Ford", "2");
        Masina m3 = new Masina("BMW", "1");

        Masina arr[];
        arr = new Masina[3];
        arr[0] = m1;
        arr[1]=m2;
        arr[2]=m3;
        Arrays.sort(arr);

        for(int i=0; i<arr.length; i++)
        {
            System.out.println(arr[i]);
        }

        String a1 = "Ana are mere";
        String a2 = "Bianca are mere";
        System.out.println(a1.compareTo(a2));
    }

}
