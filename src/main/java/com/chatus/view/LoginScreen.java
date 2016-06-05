package com.chatus.view;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by gaopan on 16/5/28.
 * 登陆界面
 */
public class LoginScreen extends JFrame {

    //定义需要的组件
    JLabel jlb_name,jlb_pwd;
    JTextField jtf_name;
    JPasswordField jpf_pwd;
    JButton jb_login; //登陆按钮
    JPanel jp_login,jp_center;

    public LoginScreen() {
        jlb_name = new JLabel("用户名", JLabel.CENTER);
        jlb_pwd = new JLabel("密码", JLabel.CENTER);

        jp_login = new JPanel();
        jtf_name = new JTextField();
        jpf_pwd = new JPasswordField();

        jb_login = new JButton("登陆");

        jp_center = new JPanel(new GridLayout(2, 2));
        jp_center.add(jlb_name);
        jp_center.add(jtf_name);
        jp_center.add(jlb_pwd);
        jp_center.add(jpf_pwd);

        this.setTitle("我们聊天");

        this.add(jp_center, "North");

        jb_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("登陆");
                dispose();
                new QqFriendListScreen();
            }
        });

        jp_login = new JPanel();
        jp_login.add(jb_login, "South");
        this.add(jp_login);
        this.setBackground(Color.GREEN);
        this.setSize(285, 150);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }

    public static  void main(String [] args) {
        LoginScreen screen = new LoginScreen();

        //加载配置文件，启动
        try {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/spring-context.xml");
            context.start();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
