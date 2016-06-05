package com.chatus.view;

import javax.swing.*;

/**
 * Created by gaopan on 16/5/28.
 * 聊天界面
 */
public class ChatScreen extends JFrame {

    JTextArea jta;
    JTextField jtf;
    JButton jb;
    JPanel jp;

    public static void main(String [] args) {
        ChatScreen screen = new ChatScreen(1+"");
    }

    public ChatScreen(String friend) {

        jta = new JTextArea();
        jtf = new JTextField(15);
        jb = new JButton("发送");
        jp = new JPanel();
        jp.add(jtf);
        jp.add(jb);
        this.setTitle("你正在和"+friend +"聊天");
        this.setIconImage((new ImageIcon("images/qq.gif").getImage()));
        this.add(jta, "Center");
        this.add(jp, "South");
        this.setSize(300, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
