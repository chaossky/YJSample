import java.io.*;

class SampleP4
{
    public static void main(String[] args) throws IOException
    {
        System.out.println("5���� ���� ������ �Է��Ͻʽÿ�.") ;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] test = new int[5];
        for(int i=0; i<test.length; i++){
            String str = br.readLine();
            int tmp = Integer.parseInt(str);
            test[i] = tmp;
        }

        int max = 0;

        for(int i=0; i<test.length; i++){
            if(max < test[i]){
                max = test[i];
            }
        }

        for(int i=0; i<test.length; i++){
            System.out.println ((i + 1) + "��° ����� ������ " + test [i] + "�Դϴ�.");
        }

        System.out.println("�ְ� ������ " + max + " �� �Դϴ�.") ;
    }
}