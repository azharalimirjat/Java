class else_if_Condition{
    public static void main(String[] args) {
        // else if Condition is used for checking multiple Condtions

        int x=8;
        int y=7;
        int z=9;

        if(x>y && x>z) // false
        {
            System.out.println(x); // No Output
        }
        else if(y>x && y<z) // false
        {
            System.out.println(y);// No Output
        }

        else
        {
            System.out.println(z);// Output (9)
        }

    }
}