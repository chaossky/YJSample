// �ڵ��� Ŭ����
class Car
{
    private int num;
    private double gas;
    public Car()
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
// ���̽� ī Ŭ����
class RacingCar extends Car
{
    private int course;
    public RacingCar()
    {
        course = 0;
        System.out.println("���̽� ī�� ����������ϴ�.");
    }
    public void setCourse(int c)
    {
        course = c;
        System.out.println("�ڽ� ��ȣ�� "+ course + " �� �߽��ϴ�.");
    }
}

class Sample1
{
    public static void main(String[] args)
    {
        RacingCar rccar1;
        rccar1 = new RacingCar();
        rccar1.setCar(1234, 20.5);
        rccar1.setCourse(5);
    }
}