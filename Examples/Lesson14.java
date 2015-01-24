import java.io.*;

class SampleP2
{
    public static void main(String[] args)
    {
        try{
            PrintWriter pw = new PrintWriter
                    (new BufferedWriter(new FileWriter("test1.txt")));


            pw.println("A long time ago,"); pw.println("There was a little girl.");

            pw.close();
        }
        catch (IOException e) {System.out.println ( "����� ������ �߻��߽��ϴ�.") ;
        }
    }
}

class SampleP3
{
    public static void main(String[] args)
    {
        if(args.length != 1){
            System.out.println("�ùٸ� ���� �̸��� �Է��Ͻʽÿ�.") ; System.exit (1);
        }

        try{
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(args[0])));
            pw.println("A long time ago,");
            pw.println("There was a little girl.");

            pw.close();
        }
        catch (IOException e) {
            System.out.println("����� ������ �߻��߽��ϴ�.") ;
        }
    }
}