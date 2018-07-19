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
//设置窗口名称
frame.setTitle("Login");
//设置窗口大小
frame.setSize(540,427);
//设置窗口位于屏幕中央
frame.setLocationRelativeTo(null);
//参数为3时，表示关闭窗口则程序退出
frame.setDefaultCloseOperation(3);

//1.2设置窗体上组件的布局，此处使用流式布局FlowLayout，流式布局类似于word的布局
//用FlowLayout创建一个名为f1的对象,需要添加的包名为java.awt.FlowLayout，其中LEFT表示左对齐，CENTER表示居中对齐，RIGHT表示右对齐
FlowLayout f1=new FlowLayout(FlowLayout.LEFT);
//frame窗口设置为f1的流式左对齐
frame.setLayout(f1);

//1.3在窗体上添加图片，文字


ImageIcon imag1=new ImageIcon("H:/1.png");

JLabel pic1=new JLabel(imag1);
//将创建的图片对象添加到 窗口上
frame.add(pic1);



JLabel name1=new JLabel();

name1.setPreferredSize(new Dimension(110,30));
//将空JLabel添加入窗口
frame.add(name1);

//同上，此处添加的不是空JLabel，而是内容为“账号”的JLabel
JLabel name=new JLabel("账号：");
frame.add(name);

//JTextField在窗口上添加一个可输入可见文本的文本框，需要添加的包名为javax.swing.JTextField.
JTextField nametext=new JTextField();
//设置文本框大小
nametext.setPreferredSize(new Dimension(220, 30));
//添加到窗口上
frame.add(nametext);

//同name1
JLabel name2=new JLabel();
name2.setPreferredSize(new Dimension(110,30));
frame.add(name2);

//同name1
JLabel name3=new JLabel();
name3.setPreferredSize(new Dimension(110,30));
frame.add(name3);

//同name
JLabel password=new JLabel("密码：");
frame.add(password);

//JPasswordField创建一个密码文本框，里面输入的文本是不可见的，其他同nametext
JPasswordField passwordtext=new JPasswordField();
passwordtext.setPreferredSize(new Dimension(220, 30));
frame.add(passwordtext);

//同name1
JLabel name4=new JLabel();
name4.setPreferredSize(new Dimension(110,30));
frame.add(name4);

//同name1
JLabel name5=new JLabel();
name5.setPreferredSize(new Dimension(220,30));
frame.add(name5);

//JButton创建一个可点击的按钮，按钮上可显示文本图片
JButton bu=new JButton("登录");
bu.setPreferredSize(new Dimension(80,30));
frame.add(bu);

//设置窗口可见，此句一定要在窗口属性设置好了之后才能添加，不然无法正常显示
frame.setVisible(true);
}
}