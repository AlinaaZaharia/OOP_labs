public class Masina implements Cloneable, Comparable{
    int id;
    String marca;
    String culoare;

    public Masina(String marca, String culoare)
    {
        this.marca = marca;
        this.culoare = culoare;
    }

    public Masina clone(){
        try
        {
            return(Masina)super.clone();
        }
        catch(Exception e)
        {
            System.out.println("NOT CLONABLE");
            return null;
        }
    }

    public int compareTo(Object o)
    {
        Masina temp=(Masina) o;
        if(id<temp.id)
        {
            return -1;
        }
        else if(id==temp.id)
        {
            return 0;
        }
        else
            return 1;

        //return(id-temp.id);
    }

    @Override
    public String toString()
    {
        return "Marca masinii este " + marca + ", iar culoarea este " + culoare;
    }

    void vopseste(String color)
    {
        this.culoare = color;
    }
}
