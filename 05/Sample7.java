import java.io.*;

class Sample7
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("����� �����Դϱ�?");
        System.out.println("Y �Ǵ� N�� �Է��Ͻʽÿ�.");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine ();
        char res = str.charAt (0);
        if (res == 'Y'|| res == 'y') {
            System.out.println("����� �����̱���.");
        }else if (res == 'N'|| res == 'n') {
            System.out.println("����� �����̱���.");
        }else{
            System.out.println("Y �Ǵ� N�� �Է��Ͻʽÿ�.");
        }
    }
}