class CarException extends Exception{
}

class Car
{
    private int num;  private double gas;
    public Car ()
    {
        num = 0;
        gas = 0.0;
        System.out.println("�ڵ����� ����������ϴ�.");
    }
    public void setCar (int n, double g) throws CarException
    {
        if(g < 0){
            CarException e = new CarException();
            throw e;
        } else {
            num = n;
            gas = g;
            System.out.println("���� ��ȣ�� " + num + " ����, ���� ���� " + gas + " �� �ٲپ����ϴ�.");
        }
    }
    public void show()
    {
        System.out.println("���� ��ȣ�� " + num + " �Դϴ�.");
        System.out.println("���� ���� " + gas + " �Դϴ�.");
    }
}
/*
class Sample5
{
    public static void main(String[] args)
    {
        Car car1 = new Car();
        try{
            car1.setCar(1234, -10.0);
        }
        catch(CarException e){
            System.out.println (e + "(��)�� ���������ϴ�.");
        }
        car1.show();
    }
}
*/
class Sample5
{
    public static void main(String[] args) throws CarException
    {
        Car car1 = new Car();
        car1.setCar(1234, -10.0);
        car1.show();
    }
}