import java.io.*;

class Sample5
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("������ �Է��Ͻʽÿ�.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        System.out.println(num + "(��)�� �ԷµǾ����ϴ�.");
    }
}