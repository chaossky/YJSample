import java.io.*;

class SampleP2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("������ �Է��Ͻʽÿ�.") ;

        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);
        if((res % 2) == 0)
            System.out.println(res + " �� ¦���Դϴ�.");
        else
            System.out.println(res + " �� Ȧ���Դϴ�.");
    }
}

class SampleP3
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("2���� ������ �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt (str1);
        int num2 = Integer.parseInt (str2);

        if(num1 < num2){
            System.out.println(num1 + " ���� " + num2 + " �� Ů�ϴ�.") ;
        }
        else if(num1 > num2){
            System.out.println(num2 + " ���� " + num1 + " �� Ů�ϴ�.") ;
        }
        else{
            System.out.println ("�� ���� ���� ���Դϴ�.") ;
        }
    }
}

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("0 ���� 10 ������ ���� �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);
        if(res >= 0 && res <= 10){
            System.out.println("�����Դϴ�.") ;
        }
        else{
            System.out.println("Ʋ�Ƚ��ϴ�.") ;
        }
    }
}

class SampleP5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("������ �Է��Ͻʽÿ�.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);

        switch(res){
            case 1:
                System.out.println("����� �ʿ��մϴ�.") ; break;
            case 2 :
                System.out.println("���� �� ����սô�.") ; break;
            case 3 :
                System.out.println("�� ���� ������ ��ǥ�� �սô�.") ; break;
            case 4 :
                System.out.println ("�� ���߽��ϴ�.") ; break;
            case 5 :
                System.out.println ("�ſ� ����մϴ�.") ; break;
        }
    }
}
