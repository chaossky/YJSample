class Car
{
    private int num;
    private double gas;
    public void setCar(int n)
    {
        num = n;
        System.out.println("���� ��ȣ�� " + num + " ���� �ٲپ����ϴ�.");
    }
    public void setCar(double g)
    {
        gas = g;
        System.out.println("���� ���� " + gas + " ���� �ٲپ����ϴ�.");
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

class Sample3
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.setCar(1234, 20.5); car1.show();
        System.out.println("���� ��ȣ�� ���� �Ǿ����ϴ�.");
        car1.setCar(2345);
        car1.show();
        System.out.println("���ᷮ�� ���� �Ǿ����ϴ�.");
        car1.setCar(30.5);
        car1.show();
    }
}