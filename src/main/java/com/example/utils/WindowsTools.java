package com.example.utils;

import java.awt.*;

import java.awt.event.*;

import java.io.*;

import javax.swing.*;

import java.util.*;

public class WindowsTools {
    private JFrame fr;

    private JButton bu1, bu2, bu3, bu4, bu5, bu6, bu7, bu8, bu9, bu10, bu11, bu12, bu13;

    private JButton bu14, bu15, bu16, bu17, bu18, bu19, bu20, bu21;

    private JLabel la1, la2, la3, la4, la5, la6, la7, la8, la9, la10, la11, la12, la13;

    private JLabel la14,la15,la16,la17,la18,la19,la20,la21,la22,la23,la24,la25;

    private ImageIcon ico;

    private JPanel pa;

    private JDialog dia;

    private JTextArea ta;

    Runtime rt;

    Process pr;

    private void init() {
        fr = new JFrame();
        JPanel panel = new JPanel();

        panel.setOpaque(false);

//这一步设置布局非常关键，这样设置可以用于其他组建的定位,设置为null后，每一个组建都要设置大小和位置

        panel.setLayout(null);

//bu2用作测试

        bu2 = new JButton("Open");

        bu2.setSize(80,40);

        bu2.setLocation(20, 40);

//la2用于设置大标签

        la2 = new JLabel("Tools For Windows8.1&10");

        la2.setSize(290,40);

        la2.setLocation(200,16);

        la2.setFont(new java.awt.Font("Dialog",1,20));

        la2.setForeground(Color.black);

//la3用于显示工具类

        la3 = new JLabel("工具类");

        la3.setSize(80,40);

        la3.setLocation(70,50);

        la3.setFont(new java.awt.Font("Dialog",1,17));

        la3.setForeground(Color.black);

/*

截图

*/

        ico = new ImageIcon(this.getClass().getResource("/test.png"));

//label在初始化时可以传入一个ICO

        la4 = new JLabel(ico);

        la4.setSize(100,45);

        la4.setLocation(60,86);

        la4.setText("截图");

        ico = new ImageIcon(this.getClass().getResource("/test.png"));

//Button在初始化时可以默认文本为空，并传入一个ico

        bu1 = new JButton(null,ico);

        bu1.setSize(38,38);

        bu1.setLocation(160,86);
        panel.add(la4);//添加截图

        panel.add(bu1);
        fr.setVisible(true);

        event();
    }
    private void event()
    {
        bu1.addMouseListener(new MouseAdapter()

        {
            public void mouseClicked(MouseEvent e)

            {
                rt = Runtime.getRuntime();

                try

                {
                    pr = rt.exec("C:\\Windows\\System32\\SnippingTool.exe");

                }

                catch(IOException ie)

                {
                    System.out.println("文件不存在或无法打开");

                }

            }

        });

    }
    WindowsTools()

    {
        init();

    }

    public static void main(String[] args) throws IOException {
        //new WindowsTools();
        Runtime rt =Runtime.getRuntime();
        rt.exec("C:\\Windows\\System32\\SnippingTool.exe");

    }
}
