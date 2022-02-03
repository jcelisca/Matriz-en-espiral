public class prueba{
    public static void main(String[] args) {

        int [][] M = new int[5][5];
        //int [][] M = { {10,0,0,11,5,0}, {3,0,0,0,0,6}, {0,0,0,0,0,0}}; 
        int [][] b = recorrerIzqDer(M, 1, 1);
        b = recorrerUpDown(b, 5, 6);
        b = recorrerDerIzq(b, 5, 10);
        b = recorrerDownUp(b, 1, 14);
        b = recorrerIzqDer(b, 2, 17);
        b = recorrerUpDown(b, 4, 20);
        b = recorrerDerIzq(b, 4, 22);
        b = recorrerIzqDer(b, 3, 24);

        System.out.println(b[0][0]);
        System.out.println(b[0][1]);
        System.out.println(b[0][2]);
        System.out.println(b[0][3]);
        System.out.println(b[0][4]);
        

        System.out.println();

        System.out.println(b[1][0]);
        System.out.println(b[1][1]);
        System.out.println(b[1][2]);
        System.out.println(b[1][3]);
        System.out.println(b[1][4]);

        System.out.println();

        System.out.println(b[2][0]);
        System.out.println(b[2][1]);
        System.out.println(b[2][2]);
        System.out.println(b[2][3]);
        System.out.println(b[2][4]);

        System.out.println();

        System.out.println(b[3][0]);
        System.out.println(b[3][1]);
        System.out.println(b[3][2]);
        System.out.println(b[3][3]);
        System.out.println(b[3][4]);

        System.out.println();

        System.out.println(b[4][0]);
        System.out.println(b[4][1]);
        System.out.println(b[4][2]);
        System.out.println(b[4][3]);
        System.out.println(b[4][4]);
       
    }

    public static int[][] recorrerIzqDer(int[][] m, int fila, int numero){
        for (int i = 0; i < m[fila].length; i++){
            if(m[fila-1][i] == 0 ){
                m[fila-1][i] = numero;
                numero+=1;
            } 
        }
        return m;
    }
    
    public static int[][] recorrerUpDown(int[][] m, int colum, int numero){
        for (int i = 0; i < m.length; i++){
            if(m[i][colum-1] == 0){
                m[i][colum-1] = numero;
                numero+=1;
            }      
        }
        return m;
    }

    public static int[][] recorrerDerIzq(int[][] m, int fila, int numero){
        for (int i = m[fila-1].length - 1 ; i >= 0; i--){
            if(m[fila-1][i] == 0){
                m[fila-1][i] = numero;
                numero+=1; 
            }     
        }
        return m;
    }

    public static int[][] recorrerDownUp(int[][] m, int colum, int numero){
        for (int i = m.length - 1; i > 0; i--){
            if(m[i][colum-1] == 0){
                m[i][colum-1] = numero;
                numero+=1;
            }    
        }
        return m;
    }
}

