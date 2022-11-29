package UI;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.event.*;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //规定游戏界面相关代码书写在GameJFrame内

    int[][] arrData = new int[4][4];

    //定义x，y记录空白图片位置
    int x = 0, y = 0;

    //定义变量，表示当前展示图片的路径
    Random random = new Random();//规定初始图片为动物中的任意一个
    int n = random.nextInt(1,9);
    String path = "image/animal/animal"+n+"/";

    //定义一个数组表示胜利时的图片顺序
    int[][] arrWin = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义一个变量，记录步数
    int step = 0;

    //创建菜单条目对象 "重新游戏" "重新登录" "关闭游戏" "公众号"
    JMenuItem replayJMenuItem = new JMenuItem("重新游戏");
    JMenuItem reLoginJMenuItem = new JMenuItem("重新登录");
    JMenuItem closeJMenuItem = new JMenuItem("关闭游戏");
    JMenuItem accountJMenuItem = new JMenuItem("公众号");

    //创建“更换图片”按钮
    JMenu changPictJMenu = new JMenu("更换图片");

    //创建“更换图片”按钮下的条目 美女，动物，运动
    JMenuItem girlJMenuItem = new JMenuItem("美女");
    JMenuItem animalJMenuItem = new JMenuItem("动物");
    JMenuItem exerciseJMenuItem = new JMenuItem("运动");

    public GameJFrame() {
        //界面初始化
        initGameJFrame();

        //菜单初始化
        initJMenuBar();

        //数据初始化(打乱图片顺序)
        initData();

        //图片初始化
        initImage();

        //给整个界面添加键盘监听
        this.addKeyListener(this);


        this.setVisible(true);  //设置显示窗体,建议写在最后
    }

    /**
     * 打乱图片
     */
    private void initData() {
        //定义一个一维数组，存放数字代表图片的序号
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        //打乱图片序号
        int temp = 0;
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int n = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[n];
            arr[n] = temp;
        }
        //将一维数组内容存进二维数组,记录空白图片位置
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                x = i % 4;
                y = i / 4;
            }
            arrData[i / 4][i % 4] = arr[i];
        }
    }

    /**
     * 图片加载
     * 添加多张图片时，先添加的在上层
     */
    private void initImage() {
        //清空所有图片
        this.getContentPane().removeAll();
        //判断胜利,加载win图片
        if (victory()) {
            JLabel winJLabel = new JLabel(new ImageIcon("image\\win.png"));
            winJLabel.setBounds(203, 283, 197, 73);
            this.getContentPane().add(winJLabel);
        }
        //添加容器显示步数
        JLabel stepCount = new JLabel("步数" + step);
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);
        //将拼图碎片添加在界面上层
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //创建一个JLabel的对象（管理容器）
                JLabel jLabel = new JLabel(new ImageIcon(path + arrData[i][j] + ".jpg"));
                //指定图片位置
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);
                //给图片添加边框
                jLabel.setBorder(new BevelBorder(0));
                //把管理容器添加到界面中
                this.getContentPane().add(jLabel);
            }
        }
        //添加背景图片在下层
        JLabel jLabelBg = new JLabel(new ImageIcon("image\\background.png"));
        jLabelBg.setBounds(40, 40, 508, 560);
        this.getContentPane().add(jLabelBg);

        //刷新图片
        this.getContentPane().repaint();
    }

    /**
     * 菜单初始化
     */
    private void initJMenuBar() {
        //创建菜单栏对象jMenuBar
        JMenuBar jMenuBar = new JMenuBar();
        //创建菜单按钮对象 "功能" "关于我们"
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //给条目绑定动作监听
        replayJMenuItem.addActionListener(this);
        reLoginJMenuItem.addActionListener(this);
        closeJMenuItem.addActionListener(this);
        accountJMenuItem.addActionListener(this);

        //给换图片按钮下的条目绑定动作监听
        girlJMenuItem.addActionListener(this);
        animalJMenuItem.addActionListener(this);
        exerciseJMenuItem.addActionListener(this);

        //添加条目给更换图片按钮
        changPictJMenu.add(girlJMenuItem);
        changPictJMenu.add(animalJMenuItem);
        changPictJMenu.add(exerciseJMenuItem);

        //添加"更换图片"按钮到功能按钮里
        functionJMenu.add(changPictJMenu);

        //添加"功能"按钮下的菜单条目
        functionJMenu.add(replayJMenuItem);
        functionJMenu.add(reLoginJMenuItem);
        functionJMenu.add(closeJMenuItem);
        //添加"关于我们"按钮下的菜单条目
        aboutJMenu.add(accountJMenuItem);

        //将按钮添加到菜单栏
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //在界面设置菜单栏
        this.setJMenuBar(jMenuBar);
    }

    /**
     * 界面初始化
     */
    private void initGameJFrame() {
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


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int code = e.getKeyCode();
        if (code == 65) {
            //清空图片
            this.getContentPane().removeAll();
            //添加完整图片
            JLabel jLabel = new JLabel(new ImageIcon(path + "all.jpg"));
            jLabel.setBounds(83, 134, 420, 420);
            this.getContentPane().add(jLabel);
            //添加背景图片
            JLabel jLabelBg = new JLabel(new ImageIcon("image\\background.png"));
            jLabelBg.setBounds(40, 40, 508, 560);
            this.getContentPane().add(jLabelBg);
            //刷新图片
            this.getContentPane().repaint();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //胜利后停止移动
        if (victory()) {
            return;
        }

        int code = e.getKeyCode();
        if (code == 37) {
            System.out.println("向左移动");
            if (x == 3) {
                System.out.println("空白图片已在最右位置，没有图片可以左移");
            } else {
                arrData[y][x] = arrData[y][x + 1];
                arrData[y][x + 1] = 0;
                x++;
                //每移动一次，步数+1
                step++;
                initImage();
            }
        } else if (code == 38) {
            System.out.println("向上移动");
            if (y == 3) {
                System.out.println("空白图片已在最下位置，没有图片可以上移");
            } else {
                arrData[y][x] = arrData[y + 1][x];
                arrData[y + 1][x] = 0;
                y++;
                //每移动一次，步数+1
                step++;
                initImage();
            }
        } else if (code == 39) {
            System.out.println("向右移动");
            if (x == 0) {
                System.out.println("空白图片已在最左位置，没有图片可以右移");
            } else {
                arrData[y][x] = arrData[y][x - 1];
                arrData[y][x - 1] = 0;
                x--;
                //每移动一次，步数+1
                step++;
                initImage();
            }
        } else if (code == 40) {
            System.out.println("向下移动");
            if (y == 0) {
                System.out.println("空白图片已在最上位置，没有图片可以下移");
            } else {
                arrData[y][x] = arrData[y - 1][x];
                arrData[y - 1][x] = 0;
                y--;
                //每移动一次，步数+1
                step++;
                initImage();
            }
        } else if (code == 65) {  //松开A键图片恢复
            initImage();
        } else if (code == 87) {//按w一键通关
            arrData = new int[][]{
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 0}
            };
            initImage();
        }
    }

    public boolean victory() {
        for (int i = 0; i < arrData.length; i++) {
            for (int j = 0; j < arrData[i].length; j++) {
                if (arrData[i][j] != arrWin[i][j]) {
                    return false;//只要有一个不相同就返回false
                }
            }
        }
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == replayJMenuItem) {
//            System.out.println("重新开始");
            initData();
            step = 0;
            initImage();
        } else if (source == reLoginJMenuItem) {
//            System.out.println("重新登录");
            this.setVisible(false);
            new LoginJFrame();
        } else if (source == closeJMenuItem) {
//            System.out.println("关闭游戏");
            System.exit(0);
        } else if (source == accountJMenuItem) {
//            System.out.println("公众号");
            //创建弹框对象
            JDialog jDialog = new JDialog();
            //创建一个管理图片的容器对象
            JLabel jLabel = new JLabel(new ImageIcon("image\\about.png"));
            jLabel.setBounds(0, 0, 258, 258);
            jDialog.getContentPane().add(jLabel);
            jDialog.setSize(344, 344);
            jDialog.setAlwaysOnTop(true);//置顶
            jDialog.setLocationRelativeTo(null);//居中
            jDialog.setModal(true);//不关闭无法操作下面的界面
            jDialog.setVisible(true);
        } else if (source == girlJMenuItem) {
            //获取随机美女图片地址
            n = random.nextInt(1,14);
            path = "image/girl/girl"+n+"/";
            //更新图片
            step = 0;
            initData();
            initImage();
        } else if (source == animalJMenuItem) {
            //获取随机动物图片地址
            n = random.nextInt(1,9);
            path = "image/animal/animal"+n+"/";
            //更新图片
            step = 0;
            initData();
            initImage();
        } else if (source == exerciseJMenuItem) {
            //获取随机美女图片地址
            n = random.nextInt(1,11);
            path = "image/sport/sport"+n+"/";
            //更新图片
            step = 0;
            initData();
            initImage();
        }
    }

}
