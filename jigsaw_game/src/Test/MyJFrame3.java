package Test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    public MyJFrame3() {
        //设置游戏界面宽高
        this.setSize(603, 680);
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

        //给窗口绑定键盘监听
        this.addKeyListener(this);


        this.setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开");
        //获取键盘上每一个按键的编号
        int code = e.getKeyCode();
        System.out.println(code);
    }
}
