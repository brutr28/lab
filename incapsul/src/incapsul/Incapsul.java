//������������-��� ������� �������� ���������� ������� ���������� ������� � �������������� �������� ���� ������ ����������� ������� ��� �������������� � ��������
//����� ������ ������������ ������������ ������ ���� �� ���������, �����������, �������� ������ � ���������, ������ ��������� ������������� � ����������
//����������� �������� ��, ��� ������� ������� ����� ������������ ���� ��������� ������� �������, ����� ����������� ������ ������
package incapsul;

public class Incapsul{
    public static void main(String args[])
    {
          EncapTest encap = new EncapTest();
      encap.setName("����");//������������ ����� ������ ������ �� ��������, � ����� ������� � �������
      encap.setAge(28);//������������ �� ����� ����� ��� �������� �����, ��� ���������� ������ ������, � ����� ������� ��������� ���������
      encap.setIdNum("12343ms");//����� ������� ������� ��������� ����������, �������� ����������

      System.out.print("���: " + encap.getName() + ", �������: " + encap.getAge());
    }
    
}

class EncapTest {
      private String name;//������ ������� � ������� ������� private �������������� �������� �������� �� �� ���������
   private String idNum;//������ ������� �������� ������������ ������������
   private int age;

   public int getAge() { //������� � ������� ��������� ����� ���������� ������� ������� ������������ � ������
      return age;
   }

   public String getName() {
      return name;
   }

   public String getIdNum() {
      return idNum;
   }

   public void setAge(int newAge) {
      age = newAge;
   }

   public void setName(String newName) {
      name = newName;
   }

   public void setIdNum(String newId) {
      idNum = newId;
   }
    }
    

