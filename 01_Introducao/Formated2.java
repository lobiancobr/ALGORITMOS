
public class Formated2
{
    public static void main(String args[])
    {
        int dec = 100;
        int oct = 0100;
        int hex = 0x100;
        
        System.out.printf("Em octal:       %4o %4o %4o\n", dec, oct, hex);
        System.out.printf("Em decimal:     %4d %4d %4d\n", dec, oct, hex);
        System.out.printf("Em hexadecimal: %4x %4x %4x\n", dec, oct, hex);
    }
}
