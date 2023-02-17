class Nested_for_Loop{
    public static void main(String[] args) {

        /*This loop is used when we don't know, 
        what no: of times statements should be printed */

        // Increment Order
        System.out.println("Increment Order");
        for (int i=1; i<=5; i++) 
        {
            System.out.println("Hi "+i);
            for(int j=1; j<=9; j++)
            {
                System.out.println("\t"+(j+8)+" - "+(j+9));
            }   
        }

        //Decrement Order
        System.out.println("Decrement Order");
        for (int i=5; i>=1; i--) 
        {
            System.out.println("Hi "+i);   
        }

    }
}