package com.asiainfo.chapter1.dongwenchao.day12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by 超超 on 2017/8/7 0007.
 */
public class demo2 extends JFrame{
    public demo2(String[]texts){
        super("interrupt方法的使用-字体滚动");
        this.setSize(400,300);
        this.setLocation(300,260);
        if (texts==null||texts.length==0)
            this.add(new RollbyJPanel("欢迎学习java程序设计"));
        else {
            this.setLayout(new GridLayout(texts.length,1));
            for (int i=0;i<texts.length;i++)
                this.add(new RollbyJPanel(texts[i]));
        }
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }
    public demo2(){
        this(null);
    }
    private class RollbyJPanel extends JPanel implements ActionListener,Runnable{
        private JTextField text_word;
        private  JTextField text_sleep;
        private JButton button_start,button_interrupt;
        private JTextField text_state;
        private Thread duixiang;
        private int sleeptime;
        private RollbyJPanel(String text){
            this.setLayout(new GridLayout(2,1));
            for (int i=0;i<100;i++)
                text=text+"";
            text_word=new JTextField(text);
            this.add(text_word);
            JPanel panel_sub=new JPanel(new FlowLayout(FlowLayout.LEFT));
            this.add(panel_sub);
            panel_sub.add(new JLabel("sleep"));
            this.sleeptime=1888;
            text_sleep=new JTextField(""+sleeptime,5);
            panel_sub.add(text_sleep);
            text_sleep.addActionListener(this);
            button_start=new JButton("启动");
            panel_sub.add(button_start);
            button_start.addActionListener(this);
            button_interrupt=new JButton("中断");
            panel_sub.add(button_interrupt);
            button_interrupt.addActionListener(this);
            duixiang=new Thread(this);
            panel_sub.add(new JLabel("state"));
            button_interrupt.setEnabled(false);
            text_state=new JTextField(""+duixiang.getState(),10);
            text_state.setEnabled(false);
            panel_sub.add(text_state);
        }
        public void run(){
            while (duixiang.isAlive()&&!duixiang.isInterrupted()){
                try {
                    String str=text_word.getText();
                    str=str.substring(1)+str.substring(0,1);
                    text_word.setText(str);
                    duixiang.sleep(sleeptime);
                }catch (InterruptedException e) {
                    break;
                }
            }
        }
        public void actionPerformed(ActionEvent e){
            if (e.getSource()==button_start){
                duixiang.start();
                text_state.setText(""+duixiang.getState());
                button_start.setEnabled(false);
                button_interrupt.setEnabled(true);
            }
            if (e.getSource()==button_interrupt){
                duixiang.interrupt();
                text_state.setText(""+duixiang.getState());
                button_start.setEnabled(true);
                button_interrupt.setEnabled(false);
            }
        }
    }
    public static void main(String []args){
        String[] texts={"我叫董稳超","欢迎你","来我这测试"};
        new demo2(texts);
    }
}
