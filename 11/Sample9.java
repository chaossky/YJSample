// �ڵ��� Ŭ����
class Car
{
    protected int num;
    protected double gas;
    public Car ()
    {
        num = 0;
        gas = 0.0;
        System.out.println("�ڵ����� ����������ϴ�.");
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
}
class Sample9
{
    public static void main(String[] args)
    {
        Car[] cars;
        cars = new Car[2];
        cars[0] = new Car();
        cars[1] = new RacingCar();
        for(int i=0; i<cars.length; i++){
            Class cl = cars[i].getClass();
            System.out.println ((i + 1) + "��° ��ü�� Ŭ������ " + cl + " �Դϴ�.");
        }
    }
}