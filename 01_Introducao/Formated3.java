public class Formated3
{
    public static void main(String args[])
    {
        double preco = 525.75f;
        double imposto = 0.06f;

        System.out.printf("O custo do item e %.2f\n", preco);
        System.out.printf("E em linguagem de engenharia e %e\n", preco);
        System.out.printf("O imposto sobre a venda e %f\n", preco * imposto);
    }
}