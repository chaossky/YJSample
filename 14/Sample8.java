import java.io.*;

class Sample8
{
    public static void main(String[] args)
    {
        try{
            BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
            String str1 = br.readLine();
            String str2 = br.readLine();
            System.out.println("���Ͽ� ��ϵ� 2���� ���ڿ��� ");
            System.out.println( str1 + " �Դϴ�.");
            System.out.println( str2 + " �Դϴ�.");
            br.close();
        }
        catch(IOException e){
            System.out.println("����� ������ �߻��߽��ϴ�.");
        }
    }
}