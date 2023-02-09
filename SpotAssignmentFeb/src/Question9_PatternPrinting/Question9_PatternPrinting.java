package Question9_PatternPrinting;

public class Question9_PatternPrinting {
    public static void main(String[] args) {
        int i,j;
        int n=5;

        for(i=0;i<n;i++){
           for(j=0;j<n;j++){
              if(j==0 || i==0 || i==n-1 || j==n-1){
                  System.out.print("1"+" ");
              }
              else if(i==1 || i==n-2 || j==1 || j==n-2){
                  System.out.print("0"+" ");
              }
              else if(i==j && i!=n/2){
                  System.out.print("1"+" ");
              }
              else {
                  System.out.print("1"+" ");
              }

           }
            System.out.println();
        }
    }
}
