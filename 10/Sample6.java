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
    public void setCar(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("���� ��ȣ�� " + num + " ����, ���� ���� " + gas + " �� �ٲپ����ϴ�.");
    }
    public void show()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
}

class Sample6
{
    public static void main(String[] args)
    {
        Car car1;
        System.out.println("car1�� �����߽��ϴ�.");
        car1 = new Car();
        car1.setCar(1234, 20.5);
        Car car2;
        System.out.println("car2�� �����߽��ϴ�.");
        car2 = car1;
        System.out.println("car2�� car1�� �����߽��ϴ�.");
        System.out.print(" car1�� ����Ű�� ");
        car1.show();
        System.out.print (" car2�� ����Ű�� ");
        car2.show ();
    }
}