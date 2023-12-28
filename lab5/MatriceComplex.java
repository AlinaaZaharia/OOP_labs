public class MatriceComplex {

    NumarComplex[][] matrice;

    MatriceComplex(int rows, int cols){
        matrice = new NumarComplex[rows][cols];
    }

    NumarComplex[][]adunare(MatriceComplex a) {
        int rows = matrice.length;
        int cols = matrice[0].length;
        MatriceComplex rez = new MatriceComplex(rows, cols);
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                rez.matrice[i][j]=matrice[i][j].adunare(a.matrice[i][j]);
            }
        }
        return matrice;
    }

    NumarComplex[][] inmultire(MatriceComplex a) {
        int rows = matrice.length;
        int cols = matrice[0].length;
        MatriceComplex rez = new MatriceComplex(rows, cols);
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                rez.matrice[i][j]=matrice[i][j].inmultire(a.matrice[i][j]);
            }
        }
        return matrice;
    }

    NumarComplex[][] scadere(MatriceComplex a) {
        int rows = matrice.length;
        int cols = matrice[0].length;
        MatriceComplex rez = new MatriceComplex(rows, cols);
        for(int i=0; i<rows; i++)
        {
            for(int j=0; j<cols; j++)
            {
                rez.matrice[i][j]=matrice[i][j].scadere(a.matrice[i][j]);
            }
        }
        return matrice;
    }

}
