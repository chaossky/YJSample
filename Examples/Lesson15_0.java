class Car implements Runnable
{
    private String name;

    public Car(String nm)
    {
        name = nm;
    }
    public void run()
    {
        for(int i=0; i<5; i++){
            System.out.println(name + " �� �����ϰ� �ֽ��ϴ�.") ;
        }
    }
}
class SampleP2
{
    public static void main(String[] args)
    {
        Car car1 = new Car("1 ȣ��");

        Thread th1 = new Thread(car1);
        th1.start();

        Car car2 = new Car("2 ȣ��");

        Thread th2 = new Thread(car2);
        th2.start();

        for(int i=0; i<5; i++){
            System.out.println("main() �޼ҵ� �������Դϴ�.");
        }
    }
}


