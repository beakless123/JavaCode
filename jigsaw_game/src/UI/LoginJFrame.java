package UI;

import Data.User;
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

public class LoginJFrame extends JFrame implements MouseListener {
    //规定登录界面相关代码书写在LoginJFrame内

    //记录初始用户信息
    static ArrayList<User> list = new ArrayList<>();
    static {
        User user1 = new User("zhangsan","123456");
        User user2 = new User("lisi","1234");
        list.add(user1);
        list.add(user2);
    }

    //定义变量path，记录图片路径
    String path = "image\\login\\";

    //定义变量checkNum，存放验证码
    Random r = new Random();
    String checkNum = "";

    //创建注册按钮图片容器对象
    JButton registeJButton = new JButton(new ImageIcon(path + "注册按钮.png"));
    //创建登录按钮图片容器对象
    JButton loginJButton = new JButton(new ImageIcon(path + "登录按钮.png"));
    //创建用户名文本框对象
    JTextField userText = new JTextField();
    //创建密码文本框对象
    JPasswordField passText = new JPasswordField();
    //创建验证码文本框对象
    JTextField checkText = new JTextField();


    public LoginJFrame() {   //空参构造方法设置登录界面初始化
        //界面初始化
        initLoginJFrame();
        //图片初始化
        initImage();

        this.setVisible(true);   //设置显示窗体,建议写在最后
    }

    /**
     * 加载图片
     */
    private void initImage() {
        this.getContentPane().removeAll();

        //创建用户名图片容器对象
        JLabel userJLabel = new JLabel(new ImageIcon(path + "用户名.png"));
        userJLabel.setBounds(120, 130, 47, 17);
        //创建密码图片容器对象
        JLabel passJLabel = new JLabel(new ImageIcon(path + "密码.png"));
        passJLabel.setBounds(127, 190, 32, 16);
        //创建验证码图片容器对象
        JLabel checkJLabel = new JLabel(new ImageIcon(path + "验证码.png"));
        checkJLabel.setBounds(116, 250, 56, 21);
        //创建随机验证码文字容器对象
        checkNum = createCheckNum();
        JLabel checkNumJLabel = new JLabel(checkNum);
        checkNumJLabel.setBounds(290, 250, 56, 21);

        loginJButton.setBounds(110, 300, 128, 47);
        loginJButton.setBorderPainted(false);//去除按钮边框
        loginJButton.setContentAreaFilled(false);//去除按钮背景
        registeJButton.setBounds(250, 300, 128, 47);
        registeJButton.setBorderPainted(false);
        registeJButton.setContentAreaFilled(false);

        //绑定鼠标监听
        loginJButton.addMouseListener(this);
        registeJButton.addMouseListener(this);


        userText.setBounds(190, 130, 160, 24);

        passText.setBounds(190, 190, 160, 24);

        checkText.setBounds(190, 250, 80, 24);

        //添加背景
        JLabel bgJLabel = new JLabel(new ImageIcon(path + "background.png"));
        bgJLabel.setBounds(0, 0, 470, 390);

        //添加到界面
        this.getContentPane().add(userJLabel);
        this.getContentPane().add(passJLabel);
        this.getContentPane().add(checkJLabel);
        this.getContentPane().add(userText);
        this.getContentPane().add(passText);
        this.getContentPane().add(checkText);
        this.getContentPane().add(checkNumJLabel);
        this.getContentPane().add(loginJButton);
        this.getContentPane().add(registeJButton);
        this.getContentPane().add(bgJLabel);

        this.getContentPane().repaint();

    }

    /**
     * 生成验证码
     *
     * @return
     */
    private String createCheckNum() {
        for (int i = 0; i < 5; i++) {
            int choose = r.nextInt(3);
            switch (choose) {
                case 0 -> {
                    char a = (char) r.nextInt(48, 58);
                    checkNum = checkNum + a;
                    break;
                }
                case 1 -> {
                    char a = (char) r.nextInt(65, 91);
                    checkNum = checkNum + a;
                    break;
                }
                default -> {
                    char a = (char) r.nextInt(97, 123);
                    checkNum = checkNum + a;
                    break;
                }
            }
        }
        return checkNum;
    }

    /**
     * 界面初始化
     */
    private void initLoginJFrame() {
        //设置登录界面宽高
        this.setSize(488, 430);
        //设置界面标题
        this.setTitle("拼图游戏 v1.0登录");
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //取消组件排列布局（居中）默认方式
        this.setLayout(null);
        //设置关闭模式
        this.setDefaultCloseOperation(3);

    }


    @Override
    public void mouseClicked(MouseEvent e) {
        Object s = e.getSource();
        if(s == loginJButton){
            String userIn = userText.getText();
            String passIn = passText.getText();
            String checkNumIn = checkText.getText();
            if (checkNumIn.equalsIgnoreCase(checkNum)){
                for (int i = 0; i < list.size(); i++) {
                    String strName = list.get(i).getUserName();
                    String strPass = list.get(i).getUserPass();
                    if(strName.equals(userIn) && strPass.equals(passIn)){
//                        System.out.println("登录成功");
                        showJDialog("登录成功");
                        this.setVisible(false);
                        new GameJFrame();
                        return;
                    }

                }
//                System.out.println("用户名或密码错误"+userIn+passIn);
                showJDialog("用户名或密码错误"+userIn+passIn);
                checkNum = "";
                initImage();
                return;
            }
//            System.out.println("验证码错误");
            showJDialog("验证码错误");
            checkNum = "";
            initImage();
            return;
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Object s = e.getSource();
        if (s == loginJButton){
            //添加登录按钮颜色变暗图片
//            System.out.println("按下不松");
            loginJButton.setIcon(new ImageIcon(path+"登录按下.png"));
//            this.getContentPane().add(pressedLogin);


        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        Object s = e.getSource();
        if (s == loginJButton) {
            //添加登录按钮颜色变暗图片
//            System.out.println("松开");
            loginJButton.setIcon(new ImageIcon(path + "登录按钮.png"));
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setBounds(0, 0, 200, 150);
        jDialog.getContentPane().add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }
}
