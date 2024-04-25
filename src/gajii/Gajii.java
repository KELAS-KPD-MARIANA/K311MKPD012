package gajii;

import java.util.Scanner;

public class Gajii {


    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double jumlah_gaji;
        double komisyen;
        int bil;
        
        System.out.println("Masukkan bilangan kereta = ");
        
        bil = input.nextInt();
        
        if (bil >= 10){
        komisyen = 10000;
        } else if (bil >=5 && bil <=9){
            komisyen = 6000;
        } else if (bil >=1 && bil <=4){
            komisyen = 3000;
        } else {
            komisyen = 0;
        }
        
        jumlah_gaji = komisyen + 1800;
        
        System.out.println("Jumlah kereta yang berjaya dijual = " + bil);
        System.out.println("Jumlah komisyen yang diperoleh = " + komisyen);
        System.out.println("jumlah gaji : RM" + jumlah_gaji);
    }
    
}
