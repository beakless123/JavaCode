package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener{
    //创建按钮对象
    JButton jButton1 = new JButton("点它");
    JButton jButton2 = new JButton("再点它");
    public MyJFrame(){
        //设置游戏界面宽高
        this.setSize(603,680);
        //设置界面标题
        this.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);
        //取消组件排列布局（居中）默认方式
        this.setLayout(null);


        //设置位置、宽高
        jButton1.setBounds(0 ,0,100,50);
        jButton2.setBounds(100 ,0,100,50);
        //给按钮添加动作监听
        jButton1.addActionListener(this);
        jButton2.addActionListener(this);
        //把按钮添加到界面
        this.getContentPane().add(jButton1);
        this.getContentPane().add(jButton2);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前按钮进行判断

        //获取当前被操作的那个按钮的对象
        Object source = e.getSource();

        if (source == jButton1){
            jButton1.setSize(200,200);
        }else if(source ==jButton2){
            Random r =new Random();
            jButton2.setLocation(r.nextInt(500),r.nextInt(500));
        }
    }
}
