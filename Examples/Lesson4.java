import java.io.*;

class SampleP2
{
    public static void main(String[] args)
    {
        int ans1 = 0-4;
        double ans2 = 3.14*2;
        double ans3 = (double)5/3;
        int ans4 = 30%7;
        double ans5 = (7+32)/(double)5;

        System.out.println("0-4 �� " + ans1 + " �Դϴ�.");
        System.out.println("3.14��2 �� " + ans2 + " �Դϴ�.");
        System.out.println("5��3 �� " + ans3 + " �Դϴ�.");
        System.out.println("30��7 �� ������ ���� " + ans4 + " �Դϴ�.");
        System.out.println("(7+32)��5 �� " + ans5 + " �Դϴ�.") ;
    }
}

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���簢���� �� ���� ���̸� �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int width = Integer.parseInt(str);

        System.out.println("�簢���� ������ " + (width * width) + "�Դϴ�.") ;
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�ﰢ���� �غ��� ���̸� �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        int height = Integer.parseInt(str1);
        int width = Integer.parseInt(str2);

        System.out.println("�ﰢ���� ������ " + ((height * width)  / (double) 2) + "�Դϴ�.");
    }
}

class SampleP5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���� 1~5�� ������ ������ �Է��Ͻʽÿ�.") ;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        int sum = 0;
        sum += Integer.parseInt(str1);
        sum += Integer.parseInt(str2);
        sum += Integer.parseInt(str3);
        sum += Integer.parseInt(str4);
        sum += Integer.parseInt(str5);

        System.out.println("5�� ������ ������ " + sum + " �� �Դϴ�.");
        System.out.println ("5�� ������ ������� " + (sum / (double) 5) + " �� �Դϴ�.") ;
    }
}

