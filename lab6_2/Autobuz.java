public class Autobuz extends Autovehicul{
    int ruta;

    public Autobuz(int ruta)
    {
        super(new Sofer());
        this.ruta = ruta;
    }

    @Override
    void accelereaza(int delta)
    {
        if(vitezaCurenta<vitezaMaxima)
            vitezaCurenta+=delta;
    }
}
