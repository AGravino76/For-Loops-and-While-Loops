public class PrintingSmilies{
    public static void main(String[] args){
        //Nested loop depends on the outer loop's value
        for(int i = 5; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print(":-) ");
            }
            System.out.println();
        }
    }
}