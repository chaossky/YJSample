// �ڵ��� Ŭ����
class Car
{
    int num;
    double gas;
    void show()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
}

class Sample1
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.num = 1234;
        car1.gas = -10.0;
        car1.show();
    }
}