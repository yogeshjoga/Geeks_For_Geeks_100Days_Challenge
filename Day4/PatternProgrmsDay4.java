package Day4;

public class PatternProgrmsDay4 {
    /**
     * Here we can learn advance for loops tricks
     * While Loop funcationalty and do while loop
     *  NOTE: Loops are very importent 
     *          understand the concept while writing the loops 
     *              we have to find the best way to wirte the loops
     *                  whatever it may be we need to develop the code by using 
     *                  loops so, best way to solve the complex problems 
     * hee hee lets try to write some programms in JAVA code
     */
    //LETS TAKE SOME PATTERNS:-
    //Pyramid Pattern

    public int pyramid_Pattern(){
        // pryamid pattern we need to print into console
        int i;
        for(i=0; i<5; i++){
            // the outer for loop itrating 5 times 
            // outer for loop the ROWS 
            for(int j=0; j<=i; j++){
                // we need to give print statment y bcoz we are not moving nextLine
                System.out.print("* ");
            }
        // here we are using println statment, y bcoz we need to go nextLine
         System.out.println();   
        }
        return 0;
    }

}
