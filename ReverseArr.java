public class ReverseArr {
    public static void main(String[] args) {
        int[] angka = {91, 82, 73, 64, 55, 46, 37, 28, 19};
        
        System.out.println("Input Array : ");
        for(int x = 0; x<angka.length; x++){
            System.out.print(angka[x]+" ");
        }

        System.out.println();
        System.out.println("Output Array Terbalik : ");
        for(int x = angka.length-1; x>=0; x--){
            System.out.print(angka[x]+" ");
        }

    }
}

//output:
//  Input Array : 
//  91 82 73 64 55 46 37 28 19
//  Output Array Terbalik :    
//  19 28 37 46 55 64 73 82 91
