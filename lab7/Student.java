public class Student implements Cloneable {
    String name;
    int id;
    Masina masina;

    public Student(String name, int id, Masina masina)
    {
        this.name = name;
        this.id = id;
        this.masina = masina;
    }

    public Student clone(){
        try
        {
            Student copieStudent = (Student)super.clone();
            copieStudent.masina = masina.clone();
            return copieStudent;
        }
        catch(Exception e)
        {
            System.out.println("NOT CLONABLE");
            return null;
        }
    }

    @Override
    public String toString()
    {
        return "Numele studentului este " + name + ", id-ul: " + id + ", iar masina: " + masina;
    }
}
