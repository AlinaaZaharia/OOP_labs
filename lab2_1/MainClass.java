public class MainClass {

    public static void main(String[] args) {

        int varsta=18;
        int sex = 1;
        int inaltime=34;
        short info_impachetata;

        // impachetare
        info_impachetata = (short)((varsta<<9) | (sex << 8) | (inaltime));

        // despachetare
        varsta = (info_impachetata >> 9) & 0x7f;
        sex = (info_impachetata >> 8) & 1;
        inaltime = info_impachetata & 0xff;

        System.out.println("Varsta despachetata: " + varsta);
        System.out.println("Sexul despachetat: " + sex);
        System.out.println("Inaltimea despachetata: " + inaltime);
    }

}