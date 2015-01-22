// Ż�� �������̽�
interface iVehicle
{
    void vShow ();
}
// ���� �������̽�
interface iMaterial
{
    void mShow();
}
// �ڵ��� Ŭ����
class Car implements iVehicle, iMaterial
{
    private int num;
    private double gas;
    public Car(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("���� ��ȣ�� " + num + " �̸�, ���� ���� " + gas + " �� �ڵ����� ����������ϴ�.");
    }
    public void vShow()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
    public void mShow()
    {
        System.out.println("�ڵ����� ������ ö�Դϴ�.");
    }
}
class Sample4
{
    public static void main(String[] args)
    {
        Car car1 = new Car(1234, 20.5);
        car1.vShow();
        car1.mShow();
    }
}