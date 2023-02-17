class if_else_Condition{
    public static void main(String[] args) {

        // int x=10;

        // if(x>5) Condition true
        //     System.out.println("Hello"); Output Hello

        // if(x>15) Condition false
        //     System.out.println("Hello"); Output (Nothing)

        // if(x>5 && x<=20) Both Conditions true
        //     System.out.println("Hello"); Output Hello

        // if(x>5 && x<=8) one Condition false
        //     System.out.println("Hello"); this line will not be executed
        // else
        //     System.out.println("Bye"); This will be executed output (Bye)

        int a=5;
        int b=7;

        if(a>b) // Condition false
            System.out.println(a); // no output
        else
            System.out.println(b); // output (7)

        //  No {} needed for one statement line;

        if(a<b){ // Condition false
            System.out.println(a); //output (5)
            System.out.println("Done"); //Output (Done)
        } // Brackets are needed b/c there are two statements in (if) block
        else
            System.out.println(b); // output (7)
    }
}