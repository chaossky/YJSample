class Car
{
    private int num;
    private double gas;

    public void setNumGas(int n, double g)
    {
        if(g > 0 && g < 1000){
            num = n;
            gas = g;
            System.out.println("���� ��ȣ�� " + num + " ����, ���� ���� " + gas + " �� �ٲپ����ϴ�.");
        }else{
            System.out.println (g + " �� �ùٸ� ���� ���� �ƴմϴ�.");
            System.out.println("���� ���� �ٲ� �� �����ϴ�.");
        }
    }
    public void show()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
}

class Sample2
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        // �̷��� ������ �Ұ����մϴ�.
        //car1.num = 1234;
        //car1.gas = -10.0;
        //car1.setNumGas(1234,  20.5);
        car1.show();
        System.out.println("�߸��� ���� �� (-10.0)�� �����ϰڽ��ϴ� ....");
        car1.setNumGas(1234,  -10.0);
        car1.show();
    }
}