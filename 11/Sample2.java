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
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("���� ��ȣ�� " + num + " �̸�, ���� ���� " + gas + " �� �ڵ����� ����������ϴ�.");
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
// ���̽� ī Ŭ����
class RacingCar extends Car
{
    private int course;
    public RacingCar()
    {
        course = 0;
        System.out.println("���̽� ī�� ����������ϴ�.");
    }
    public RacingCar(int n, double g, int c)
    {
        super(n, g);
        course = c;
        System.out.println (" �ڽ� ��ȣ�� "+ course + " �� ���̽� ī�� ����� �����ϴ�.");
    }
    public void setCourse(int c)
    {
        course = c;
        System.out.println("�ڽ� ��ȣ�� "+ course + " �� �߽��ϴ�.");
    }
}

class Sample2
{
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar(1234, 20.5, 5);
    }
}