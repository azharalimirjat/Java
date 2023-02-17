class Type_Conversion{
    public static void main(String[] args) {

// CASTING=Process of Changing one datatype to another

        int num1 = 258;
        Byte num2= 127;

        // Implicit Casting
        num1=num2;
        System.out.println("By Implicit Conversion : "+num1);

        // Explicit Casting
        num2 =(byte)num1;
        System.out.println("By Explicit Conversion : "+num2);

        float b=5.6F;
        int n=(int)b;
        System.out.println("By Explicit Conversion : "+n);

        // Type Promotion
        Byte n1=10;
        Byte n2=30;

        int result =n1*n2;;
        System.out.println("By Type Promotion : "+result);

    }
}