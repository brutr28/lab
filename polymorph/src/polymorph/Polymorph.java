//����������� - ������� ��������-���������������� ����������������, ������� ��������� ������ ��������� ��������� ���� � �� �� ��������
//����������� ����� ���� ���������� � ������� ���������� �������,��������������� ������� �������� ����������� �������, �����������
//����������� ������ ��� ����� ��������, ����� ������������� � �����������, �� ����� ����� ���������� ��������� ��������� ������� � ��� ��� ���� ��������
package polymorph;


public class Polymorph {//� �������� ������� � ������������ ����������, ���� �����, �������� ��������� ����������� ����� �� ������� ��������� � ���� ���������

    public static void main(String[] args) {
      Messanger tel = new Telegram();//��������� ������ ���������� ���� � ��� �� ����� ����� � ���� ������ �������� �� �������������
      tel.GetMessage();
      
      Application app = new Telegram();
      app.InstallApplication();
    }
    
}

interface Messanger//���������, ����������� ������ �����������
{
    public void SendMessage();
    public void GetMessage();
}

interface Application//���������, ������� ������������� ������ ������ ���������� �� ����������
{
    public void InstallApplication();
    public void DeleteApplication();
}

class Telegram implements Messanger, Application {//����� ��������, ������� ����� ��������� ��� ������ ����������, ��� � �������� ������������
    
    @Override
    public void SendMessage()
    {
        System.out.println("��������� ����������");
    }
    
    @Override
    public void GetMessage()
    {
        System.out.println("��������� ��������");
    }
    
    @Override
    public void InstallApplication()
    {
        System.out.println("���������� �����������");
    }
    
    @Override 
    public void DeleteApplication()
    {
        System.out.println("���������� �������");
    }
}