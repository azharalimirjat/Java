class Logical_Operators{
    public static void main(String[] args) {
    // Logical operators are used to check two or more conditions at a time
    // AND(&&) Both conditions are true, result true
    // OR(||) If any pf both condition's one is true , result true
    // NOT(!) If false result (true) , if true result(false)

        int x=7;
        int y=5;
        int a=5;
        int b=9;

        boolean result= x>y || a<b; // One Correct result(True)
        System.out.println(result);

        boolean result1= x>y && a>b; // One wrong , one Correct result(false)
        System.out.println(result1);

        boolean result2= x<y || a<b; // One Correct , One Wrong result(true)
        System.out.println(result2);

        boolean result3= x>y && a<b; // Both Conditions True result(True)
        System.out.println(result3);

        boolean res = a>b; // Condition false
        System.out.println(res); // result false
        System.out.println(!res);// !(NOt) changes result to True




    }
}  