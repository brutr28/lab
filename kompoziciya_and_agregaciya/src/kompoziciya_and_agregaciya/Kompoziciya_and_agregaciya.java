//����������-��� ���������, ��� ������� ���� ������ ������� �� ������ �������� � ����� ���� ���������� ������� �����, ������ �� ����� ������������ ��� ��� ����������� � ���������� �� ����� ������������ ��� ����
//���������-��� ����� ������ ���������, ����� ������ �������� � ���� ������ ������, �� ����� ����� ������������ � ��� ����
package kompoziciya_and_agregaciya;

public class Kompoziciya_and_agregaciya {

    public static void main(String[] args) {
       Engine e = new Engine(530);
       Remont remont=new Remont();
       remont.GetEngine(e);
    }
    
}
//����� �������� ������ ���������� �� ������� ������ � �� ���������
class Engine
{   boolean sostoyanie=true;
    int power;
    public Engine(int p)
    {
        power = p;
    }
}

class Car
{
    String model = "Porshe";
    Engine engine;//����� �� ��������������� � ������ ������� ������ ���������, ����� �� ����� ������������ ��� ����
    public Car()//��� �������� �������� ����������, � ����������� ������ ���� ������� ����� �����
    {
        this.engine = new Engine(360);
    }
}

class Remont//� ������ �� ������ �������� ������ ���������, ����� ����� ��������� ������������ � ������ � �������� ���������
{   double cena_remonta=1000.50;//�� ����� ������ � ����� ��������� ����� ������������ �� �����������

    public void GetEngine (Engine e)
    {
        System.out.println("������ ���������");
        if (e.sostoyanie=false)
        {
            e.sostoyanie=true;
        }
    }
}