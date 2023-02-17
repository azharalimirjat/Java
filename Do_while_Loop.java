class Do_while_Loop{
    public static void main(String[] args) {
        // This loop used b/c, it always executed for 1st time
       
        int i=1;

        do // 1st exexutes at 1st time than checks condition
        {
            System.out.println("Hi "+i);
            i++;
        }
        while(i<=5);

    }
}