import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Sample11
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("�� ��° ó���� �ǳ� �ٽðڽ��ϱ�?��1 ~ 10��");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int res = Integer.parseInt(str);
        for(int i=1; i<=10; i++){
            if(i == res)
                continue;
            System.out.println (i + "��° ó���Դϴ�.");
        }
    }
}