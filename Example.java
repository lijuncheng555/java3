package School;
import java.util.Scanner;
public class Example{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        Teacher A= new Teacher("111","A", "Ů", "��ѧ","����");
        Teacher B= new Teacher("122", "B", "��", "�����","Java");
        Choose C= new Choose("1","A","7:50", "��101", "����");
        Choose D= new Choose("2","B","13:30","��303", "Java");
        Student S1 = new Student("2019311000", "С��", "��","2","C");
        System.out.println("�γ̻�����Ϣ��");
        System.out.println("�γ�1��" + C);
        System.out.println("�γ�2��" + D);
        System.out.println("������γ̱�ţ�");
        int j= in.nextInt();
        switch (j) {
            case 1:
                S1.setScourse("C");
                break;
            case 2:
                S1.setScourse("D");
                break;

            default:
                System.out.println("ѡ���쳣");
                return;
        }
        System.out.println("ѡ�γɹ�����ѡ����" + j + "�ſγ�,�γ���Ϣ��");
        System.out.println(S1);
        System.out.println("�˿β������˿�������0��ȷ�ϲ���Ҫ�˿�������1��");
        int k = in.nextInt();
        if (k == 0) {
            S1.setScourse(null);
            System.out.println("�������˿�");
            System.out.println(S1);

        } else {
            System.out.println("ѡ�γɹ���");
        }
}
}
