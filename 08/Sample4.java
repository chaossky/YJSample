// �ڵ��� Ŭ����
class Car
{
        int num;
        double gas;
        void setNum(int n)
        {
            num = n;
            System.out.println("���� ��ȣ�� " + num + " ���� �ٲپ����ϴ�.");
        }
        void setGas(double g)
        {
            gas = g;
            System.out.println("���� ���� " + gas + " ���� �ٲپ����ϴ�.");
        }
        void show()
        {
            System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
            System.out.println("���� ���� " + gas + " �Դϴ�.");
        }

        void showCar() {}
}

class Sample4
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        car1.setNum(1234);
        car1.setGas(20.5);
    }
}