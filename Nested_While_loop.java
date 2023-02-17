class Nested_While_loop{

    public static void main(String[] args) {
        // Loops are used for repeatation of lines

        int i=1;

        while(i<=5) // First Checks Condition.
             // if i after increments becomes 6 than condition false loop ends
        {
            System.out.println("Hi "+i);
            int j=1;
            while(j<=3)
            {
                System.out.println("\tHello");
                j++;
            }
            i++;
        }

    }

}