public class Autovehicul {
    Sofer sofer;
    double vitezaMaxima;
    double vitezaCurenta;

    public Autovehicul(Sofer sofer)
    {
        this.sofer = sofer;
    }
    public Autovehicul() {}

    void accelereaza(int delta)
    {
        vitezaCurenta += delta;
    }

    int accelereaza(int delta, double x)
    {
        return 0;
    }
}
