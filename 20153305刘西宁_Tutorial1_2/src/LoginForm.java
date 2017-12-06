
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * 
 */
public class LoginForm extends JFrame implements ActionListener{

	JTextField jTextField;//定义文本框组件
	JPasswordField jPasswordField;//定义密码框组件
	JLabel jLabel1,jLabel2;
	JPanel jp1,jp2,jp3;
	JButton login,exit;//创建按钮
	String username;
	String password;
	/**
	 * Default constructor
	 */
	public LoginForm() {
//		init();
	}

	/**
	 * 
	 */
	private UserDAO dao;

	/**
	 * @return
	 */
	public void init() {

		
		
		dao = new UserDAO();
		return;
	}

	/**
	 * @return
	 */
	public void display() {
		jTextField = new JTextField(12);
		jPasswordField = new JPasswordField(13);
		jLabel1 = new JLabel("用户名");
		jLabel2 = new JLabel("密码");
		login = new JButton("登录");
		exit = new JButton("取消");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		//设置布局
		this.setLayout(new GridLayout(3,1));
		
		jp1.add(jLabel1); 
		jp1.add(jTextField);//第一块面板添加用户名和文本框 
		
		jp2.add(jLabel2);
		jp2.add(jPasswordField);//第二块面板添加密码和密码输入框
		
		jp3.add(login);
		jp3.add(exit); //第三块面板添加确认和取消
		
		
		login.addActionListener(this);
		exit.addActionListener(this);
		
		
		
		
		//        jp3.setLayout(new FlowLayout());  　　//因为JPanel默认布局方式为FlowLayout，所以可以注销这段代码.
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);  //将三块面板添加到登陆框上面
		//设置显示
		this.setSize(300, 200);
		//this.pack();
		this.setTitle("登陆");
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == exit){
			System.exit(0);
		}
		else{
			username = jTextField.getText();
			password = new String(jPasswordField.getPassword());
			boolean flag = dao.findUser(username, password);
			if (flag) {
				JOptionPane.showMessageDialog(null, "登录成功！"); 
			} else {
				JOptionPane.showMessageDialog(null, "用户名或密码错误！"); 
			}
		}
	}
	

}