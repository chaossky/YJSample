import java.io.*;

class SampleP2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���ڿ��� �Է��Ͻʽÿ�.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        StringBuffer str2 = new StringBuffer(str1);
        str2.reverse();

        System.out.println(str1 + " �� �������� " + str2 + " �Դϴ�.") ;
    }
}

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���ڿ��� �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        System.out.println("a�� �� ��ġ�� ������ �Է��Ͻʽÿ�.") ;
        String str2 = br.readLine();
        int num = Integer.parseInt(str2);

        StringBuffer str3 = new StringBuffer(str1);
        str3.insert(num, 'a');

        System.out.println(str3 + " �� �Ǿ����ϴ�.") ;
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println ( "������ 2�� �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine(); String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt (str2);
        int ans = Math.min(num1, num2);

        System.out.println(num1 + " ��(��) " + num2 + " �� ���� ���� " + ans + " �Դϴ�.") ;
    }
}
