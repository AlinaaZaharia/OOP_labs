public class MainClass {

    public static void main(String[] args) {

        NumarComplex a = new NumarComplex(2, 6);
        NumarComplex b = new NumarComplex(3, 9);
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.adunare(b));
        System.out.println(a.scadere(b));
        System.out.println(a.inmultire(b));

        int[][] arr = new int[3][5];
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        arr2 = arr; // shallow copy
        arr2[1][1] = 5; // modificare shallow copy

        System.out.println(arr[1][1]); // se va afisa 5

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }

        // Inversare matrice
        int m = arr.length;
        int n = arr[0].length;

        int i = 0;
        int aux;
        int j = n - 1;
        while (i < j) {
            for (int k = 0; k < m; k++) {
                aux = arr[k][i];
                arr[k][i] = arr[k][j];
                arr[k][j] = aux;
            }
            i++;
            j--;
        }

        // Afisare matrice
        for (int k = 0; k < m; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }

        // Initializare si operatii pe matrice de numere complexe
        int rows = 3;
        int cols = 5;
        MatriceComplex m1 = new MatriceComplex(rows, cols);
        MatriceComplex m2 = new MatriceComplex(rows, cols);

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                m1.matrice[row][col] = new NumarComplex(row, col);
                m2.matrice[row][col] = new NumarComplex(row * 2, col * 2);
            }
        }

        NumarComplex[][] rezultatAdunare = m1.adunare(m2);

        // Afisare matrice de numere complexe
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(rezultatAdunare[row][col] + " ");
            }
            System.out.println();
        }
    }
}
