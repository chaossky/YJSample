// �ڵ��� Ŭ����
class Car
{
    int num;
    double gas;

    void setNum(int n){}
    void setGas(double g){}

    void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("���� ��ȣ�� " + num + " ����, ���� ���� " + gas + " �� �ٲپ����ϴ�.");
    }
    void show()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
}

class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        int number = 1234;
        double gasoline = 20.5;
        car1.setNumGas(number, gasoline);
    }
}