import java.io.*;

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("����� �� ���Դϱ�?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);

        System.out.println("����� " + num + " �� �Դϴ�.");
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�������� ���� ���Դϱ�?");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        double pi = Double.parseDouble(str);

        System.out.println("�������� ���� " + pi + " �Դϴ�.");
    }
}

class SampleP5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("Ű�� �����Ը� �Է��Ͻʽÿ�.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
	String str2 = br.readLine();
        double num1 = Double.parseDouble(str1);      
	double num2 = Double.parseDouble(str2);

        System.out.println ("Ű�� "+ num1 + " ��Ƽ���� �Դϴ�.");
	System.out.println ("�����Դ� "+ num2 + " ų�α׷� �Դϴ�.");
    }
}

