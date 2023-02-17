class Ternary_Operator{
    public static void main(String[] args) {
        
        int n=4;
        int result=0;

        // if(n%2==0) // Condition True
        // {
        //     result=10; // Value (10) will be assigned to result
        // }
        // else
        // {
        //     result=20;
        // }
        // System.out.println(result); // Output (10)

    // _____________________________________________________________________
        
        // n=5;
        // if(n%2==0) // Condition false
        // {
        //     result=10; // Value (10) will be assigned to result
        // }
        // else
        // {
        //     result=20; // Value (10) will be assigned to result
        // }
        // System.out.println(result); // Output (20)

    // _____________________________________________________________________

        // TERNARY OPERATOR
        // All uper conditions in one line

        result =n%2==0 ? 10 : 20;
        System.out.println(result); // Output (10)


    }
}