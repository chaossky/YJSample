import java.io.*;

class SampleP1
{
    public static void main(String[] args)
    {
        System.out.println("1 ~ 10������ ¦���� ����մϴ�.") ;

        for(int i=1; i<=10; i++){ if((i % 2) == 0)
            System.out.println(i);
        }
    }
}

class SampleP2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("���� ������ �Է��Ͻʽÿ�. (0 �� �Է��ϸ� �����մϴ�)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int sum = 0;

        do {
            String str = br.readLine();
            num = Integer.parseInt(str);
            sum += num;
        }while(num != 0);

        System.out.println("���� ������ �հ�� " + sum + " �� �Դϴ�.") ;
    }
}

class SampleP3
{
    public static void main(String[] args)
    {
        for(int i=1; i<=9; i++){
            for(int j=1; j<=9; j++){
                System.out.print(i*j+ "\t");
            }
            System.out.print ("\n");
        }
    }
}

class SampleP4
{
    public static void main(String[] args)
    {
        for(int i=1; i<=5; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

class SampleP5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("2 �̻��� ������ �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i=2; i<=num; i++){
            if(i == num){
                System.out.println(num + " �� �Ҽ��Դϴ�.") ;
            }
            else if(num % i == 0){
                System.out.println(num + " �� �Ҽ��� �ƴմϴ�.");
                break;
            }
        }
    }
}
