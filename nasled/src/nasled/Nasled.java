//������������-��� �������� �������� �������
//�������� ���� ����� �� �������, ����� ��������� ��� � ��������� �������� ����� �������
//������������ ��������� �������� ������������ ���, �������� ��������� ����, � ����� �������� ������� ��������
package nasled;


public class Nasled {

 public static void main(String[] args) {
    sotrudnik Pavel = new sotrudnik();
    nachalnik_otdela Oleg_Dmitrievich = new nachalnik_otdela();
    Pavel.getInformation(30, "��. ��������, �.48", "������ �����");//������� ������ ������� ����� ����� ������
    Oleg_Dmitrievich.getInformation(35, "��. 50 ��� �������, �.52", "���� ����������");
    Oleg_Dmitrievich.upravlenie_otdelom();//������������ ��������� ������� ������ �������� � ��������� �������, ������������� ��������� ��� ���� ���� ����� ���
    }
    
}

class sotrudnik//����� ��������� ��������� ��������, ������� ���� � ��������� ���� ����������� �����, ������� �� ���������, ���������� ��������
{
    private int age;
    private String adress;
    protected String name;
    
    public void getInformation(int age, String adress, String name)
    {
        this.age=age;
        this.adress=adress;
        this.name=name;
    }
}

class nachalnik_otdela extends sotrudnik//������ ����� ��������� ������ � ������ ������ ���������
{
    public void upravlenie_otdelom()//����������� ����� ���������, �������� ������, �������� ���������� ���� �����������
    {
        System.out.println("��� ��� �����??");
    }
}

