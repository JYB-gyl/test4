package jiemian;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login {

    public static void main(String[] args) {
        Login log=new Login();
        log.InitUI();
    }
public void InitUI()
{

JFrame frame=new JFrame();
//���ô�������
frame.setTitle("Login");
//���ô��ڴ�С
frame.setSize(540,427);
//���ô���λ����Ļ����
frame.setLocationRelativeTo(null);
//����Ϊ3ʱ����ʾ�رմ���������˳�
frame.setDefaultCloseOperation(3);

//1.2���ô���������Ĳ��֣��˴�ʹ����ʽ����FlowLayout����ʽ����������word�Ĳ���
//��FlowLayout����һ����Ϊf1�Ķ���,��Ҫ��ӵİ���Ϊjava.awt.FlowLayout������LEFT��ʾ����룬CENTER��ʾ���ж��룬RIGHT��ʾ�Ҷ���
FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
//frame��������Ϊf1����ʽ�����
frame.setLayout(f1);

//1.3�ڴ��������ͼƬ������


ImageIcon imag1=new ImageIcon("H:/1.png");

JLabel pic1=new JLabel(imag1);
//��������ͼƬ������ӵ� ������
frame.add(pic1);



JLabel name1=new JLabel();

name1.setPreferredSize(new Dimension(110,30));
//����JLabel����봰��
frame.add(name1);

//ͬ�ϣ��˴���ӵĲ��ǿ�JLabel����������Ϊ���˺š���JLabel
JLabel name=new JLabel("�˺ţ�");
frame.add(name);

//JTextField�ڴ��������һ��������ɼ��ı����ı�����Ҫ��ӵİ���Ϊjavax.swing.JTextField.
JTextField nametext=new JTextField();
//�����ı����С
nametext.setPreferredSize(new Dimension(220, 30));
//��ӵ�������
frame.add(nametext);

//ͬname1
JLabel name2=new JLabel();
name2.setPreferredSize(new Dimension(110,30));
frame.add(name2);

//ͬname1
JLabel name3=new JLabel();
name3.setPreferredSize(new Dimension(110,30));
frame.add(name3);

//ͬname
JLabel password=new JLabel("���룺");
frame.add(password);

//JPasswordField����һ�������ı�������������ı��ǲ��ɼ��ģ�����ͬnametext
JPasswordField passwordtext=new JPasswordField();
passwordtext.setPreferredSize(new Dimension(220, 30));
frame.add(passwordtext);

//ͬname1
JLabel name4=new JLabel();
name4.setPreferredSize(new Dimension(110,30));
frame.add(name4);

//ͬname1
JLabel name5=new JLabel();
name5.setPreferredSize(new Dimension(220,30));
frame.add(name5);

//JButton����һ���ɵ���İ�ť����ť�Ͽ���ʾ�ı�ͼƬ
JButton bu=new JButton("��¼");
bu.setPreferredSize(new Dimension(80,30));
frame.add(bu);

//���ô��ڿɼ����˾�һ��Ҫ�ڴ����������ú���֮�������ӣ���Ȼ�޷�������ʾ
frame.setVisible(true);
}
}