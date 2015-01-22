//ȸ�� Ŭ����
class Company
{
    private int sum = 0;
    public synchronized void add(int a)
    {
        int tmp = sum;
        System.out.println ("���� �ݾ��� ���� "+ tmp + " �� �Դϴ�.");
        System.out.println (a + " �� �������ϴ�.");
        tmp = tmp + a;
        System.out.println ("�ݾ��� ���� "+ tmp + " ������ ����ϴ�.");
        sum = tmp;
    }
}
// ���� ��� Ŭ����
class Driver extends Thread
{
    private Company comp;
    public Driver(Company c)
    {
        comp = c;
    }
    public void run()
    {
        for(int i=0; i<3; i++){
            comp.add(50);
        }
    }
}
class Sample7
{
    public static void main(String[] args)
    {
        Company cmp = new Company();
        Driver drv1 = new Driver(cmp);
        drv1.start();
        Driver drv2 = new Driver(cmp);
        drv2.start();
    }
}