public class NumarComplex{
    private int parteReala;
    private int parteImaginara;

    public NumarComplex( int parteReala, int parteImaginara) {
        this.parteReala=parteReala;
        this.parteImaginara=parteImaginara;
    }

    public NumarComplex adunare( NumarComplex b) {
        NumarComplex rezultat= new NumarComplex(0,0);
        rezultat.parteReala=b.parteReala+parteReala;
        rezultat.parteImaginara=b.parteImaginara+parteImaginara;
        return rezultat;
    }

    @Override
    public String toString() {
        return parteReala + "+"+ parteImaginara +"xi";
    }

    public NumarComplex scadere( NumarComplex c) {
        NumarComplex rezultat= new NumarComplex(0,0);
        rezultat.parteReala=c.parteReala-parteReala;
        rezultat.parteImaginara=c.parteImaginara-parteImaginara;
        return rezultat;
    }


    public NumarComplex inmultire(NumarComplex d) {
        NumarComplex rezultat=new NumarComplex(0,0);
        rezultat.parteImaginara=(d.parteImaginara*parteReala)+(d.parteReala*parteImaginara);
        return rezultat;
    }
}