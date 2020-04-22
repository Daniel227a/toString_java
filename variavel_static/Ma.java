public class Ma
{
    public static void main(String[]args)
    {

        Exemplo a1=new Exemplo();

        System.out.println(a1.x);
        System.out.println("variavel static primeiro objeto"+a1.y);
        Exemplo a2=new Exemplo();
        System.out.println();
        System.out.println(a2.x);
        System.out.println("variavel static segundo objeto "+a2.y);

    }

}
