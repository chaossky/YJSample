// �ڵ��� Ŭ����
class Car
{
    private int num;
    private double gas;
    public Car ()
    {
        num = 0;
        gas = 0.0;
        System.out.println("�ڵ����� ����������ϴ�.");
    }
    public void show()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
}

class Sample4
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.show();
    }
}