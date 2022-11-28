package Test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test02 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        //设置游戏界面宽高
        jFrame.setSize(603,680);
        //设置界面标题
        jFrame.setTitle("拼图单机版 v1.0");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置关闭模式
        jFrame.setDefaultCloseOperation(3);
        //取消组件排列布局（居中）默认方式
        jFrame.setLayout(null);

        //创建一个按钮对象
        JButton jButton = new JButton("点它");
        //设置位置、宽高
        jButton.setBounds(0 ,0,100,50);
        //给按钮添加动作监听
        jButton.addActionListener(new ActionListener() { //动作监听只能监听鼠标点击或键盘空格，
            @Override                                   // 只能被一个按钮使用，可以使用匿名内部类来简化代码
            public void actionPerformed(ActionEvent e) {
                System.out.println("莫挨老子");
            }
        });
        //把按钮添加到界面
        jFrame.getContentPane().add(jButton);

        jFrame.setVisible(true);
    }
}
