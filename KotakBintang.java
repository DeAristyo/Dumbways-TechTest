public class main {
    public static void main(String[] args){

        int x=5;
        System.out.println(" --- panjang --- ");

        for(int i=1;i<=x;i++){
            for(int j=1;j<=x;j++){
                if(i==1||i==3||i==x||j==1||j==x){
                    System.out.print("*   ");
                } else {
                    System.out.print("=   ");
                }
            }
            System.out.println();
        }
        
    }
    
}

  
  //output
//   --- panjang --- 
//  *   *   *   *   *   
//  *   =   =   =   *   
//  *   *   *   *   *   
//  *   =   =   =   *    
//  *   *   *   *   *   
