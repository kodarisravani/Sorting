
public class Sorting {
    public static void main(String[] args) {
        int[] a ={10,20,30,40,50};
        int steps = 1;
        for(int i=0;i<5;i++){ 
         if(a[i]==40){
             System.out.println("40 is present");
             System.out.println("Found in the step No:"+steps);
             break;
         }
         steps++;
        }
    }
}
