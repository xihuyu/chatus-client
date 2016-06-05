package com.chatus.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by gaopan on 16/5/28.
 * 好友列表界面
 */
public class QqFriendListScreen extends JFrame implements ActionListener,MouseListener {

    //卡片布局
    JPanel jphy1,jphy2,jphy3;
    JButton jphy1_jb1;
    JScrollPane jsp1;

    public static void main(String [] args) {
        QqFriendListScreen screen = new QqFriendListScreen();
    }

    public QqFriendListScreen() {
        //处理第一张卡片
        jphy1 = new JPanel(new BorderLayout());
        jphy2 = new JPanel(new GridLayout(50, 1, 4,4));
        jphy1_jb1 = new JButton("我的好友");
        jsp1 = new JScrollPane(jphy2);

        JLabel [] jlbs = new JLabel[50];

        for(int  i=0;i<jlbs.length;i++) {
            jlbs[i] = new JLabel(i+1 +"",new ImageIcon("images/mm.jpg"),JLabel.LEFT);
            jlbs[i].addMouseListener(this);
            jphy2.add(jlbs[i]);
        }

        //加入面板
        jphy1.add(jphy1_jb1, "North");
        jphy1.add(jsp1, "Center");

        this.add(jphy1, "Center");
        this.setSize(140, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }


    public void actionPerformed(ActionEvent e) {

    }

    public void mouseClicked(MouseEvent e) {

        //响应鼠标点击事件
        if(e.getClickCount() ==2) {
            //如果是双击
            String friendNo = ((JLabel)e.getSource()).getText();
            System.out.println("你希望和"  + friendNo + "聊天");
            new ChatScreen(friendNo);

        }
    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {
        JLabel jl =(JLabel)e.getSource();
        jl.setForeground(Color.BLUE);
    }

    public void mouseExited(MouseEvent e) {

    }
}
