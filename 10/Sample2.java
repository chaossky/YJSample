import java.io.*;

class Sample2
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�����ڸ� �Է��Ͻʽÿ�.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String stru = str.toUpperCase();
        String strl = str.toLowerCase();
        System.out.println ("�빮�ڷ� ��ȯ�ϸ� "+ stru + " �Դϴ�.");
        System.out.println("�ҹ��ڷ� ��ȯ�ϸ� "+ strl + " �Դϴ�.");
    }
}