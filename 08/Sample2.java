// �ڵ��� Ŭ����
class Car
{
    int num;
    double gas;
    void show ()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
}

class Sample2
{
    public static void main(String[] args)
    {
        Car car1;
        car1 = new Car ();
        car1.num = 1234;
        car1.gas = 20.5;
        car1.show();
        car1.show();
    }
}