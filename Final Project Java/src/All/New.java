package All;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import TandT.TopicAndTime;

public class New extends TopicAndTime implements ActionListener,MouseMotionListener, MouseListener, ItemListener {

    //Timer
    JLabel timeLb = new JLabel();
    int min = Integer.parseInt(TopicAndTime.time_str)-1;
    int secmax = Integer.parseInt(TopicAndTime.time_str)*60;
    int sec = 59;
    Timer M;
    int second;
    static int fullscore = 100;


    //Topic and Score
    static JPanel PframeTp = new JPanel();
    public static JLabel tp = new JLabel ();
    JLabel time = new JLabel("Time");
    JLabel score = new JLabel();
    JButton stop = new JButton("stop");
    protected String Eraser = "Eraser";

    //Color
    JPanel RBT = new JPanel();
    JLabel cl = new JLabel ("Color");
    JRadioButton BlackRbt = new JRadioButton("Black");
    JRadioButton RedRbt = new JRadioButton("Red");
    JRadioButton GreenRbt = new JRadioButton("Green");
    JRadioButton BlueRbt = new JRadioButton("Blue");
    Color See = Color.BLACK;

    //DrawingArea
    int x,y;

    //AllFrame
    JFrame frame = new JFrame("");

    public void paintComponent(Graphics g) {
        g.setColor(Color.red);
        g.fillOval(25, 2, 120, 120);
        g.setColor(Color.white);
        g.setFont(new Font("Avenir",Font.BOLD,20));
        g.drawString(Eraser,55,70);

    }


    double calculatescore() {

        return Math.round(100*(min*60+sec)/secmax);

    }

    public New(){




        M = new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //second--;
                sec--;
                if(sec==0) {
                    min -=1;
                    sec +=59;
                }
                timeLb.setText(min+ ":" + sec);
            }
        });

        //TimerCode
        M.start();
//		second = (min*60)+ sec;
        timeLb.setText(min+ ":" + sec);
        timeLb.setFont(new Font("Avenir",Font.BOLD,32));
        timeLb.setVisible (true);

        stop.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                M.stop();

                //System.out.println(calculatescore());
                int sce = (int) calculatescore();
                //System.out.println(sce);
                score.setText("Score:  "+sce);


            }

        });

        //TopicTimeBackCode
        PframeTp.setLayout(new FlowLayout());
        PframeTp.add(tp);
        PframeTp.add(time);
        PframeTp.add(timeLb);
        PframeTp.add(score);
        PframeTp.add(stop);

        //ColorCode
        RBT.setLayout(new GridLayout(5,1));
        RBT.add(cl);
        RBT.add(BlackRbt);
        RBT.add(RedRbt);
        RBT.add(GreenRbt);
        RBT.add(BlueRbt);


        BlackRbt.addItemListener(this);
        RedRbt.addItemListener(this);
        GreenRbt.addItemListener(this);
        BlueRbt.addItemListener(this);


        //SetBackground
        //this.setBackground(Color.WHITE);


        //DrawingAreaCoad
        this.addMouseListener(this);
        this.addMouseMotionListener(this);


        //AllFrameCode
        frame.setLayout(new BorderLayout());
        frame.add(PframeTp,BorderLayout.NORTH);
        frame.add(RBT,BorderLayout.EAST);
        frame.add(this,BorderLayout.CENTER);


        frame.setSize(900,500);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);




        //Back.addActionListener(this);


    }


    @Override
    public void itemStateChanged(ItemEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource( ) == BlackRbt ) {
            RedRbt.setSelected(false);
            GreenRbt.setSelected(false);
            BlueRbt.setSelected(false);
            See = Color.BLACK;

        }

        else if (e.getSource() == RedRbt ) {
            BlackRbt.setSelected(false);
            GreenRbt.setSelected(false);
            BlueRbt.setSelected(false);
            See = Color.RED;

        }

        else if (e.getSource() == GreenRbt ) {
            BlackRbt.setSelected(false);
            RedRbt.setSelected(false);
            BlueRbt.setSelected(false);
            See = Color.GREEN;

        }

        else if (e.getSource() == BlueRbt ) {
            BlackRbt.setSelected(false);
            RedRbt.setSelected(false);
            GreenRbt.setSelected(false);
            See = Color.BLUE;

        }


    }


    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        Graphics g = getGraphics();
        super.paintComponent(g);
        g.setColor(Color.red);
        g.fillOval(25, 2, 120, 120);
        g.setColor(Color.white);
        g.setFont(new Font("Avenir",Font.BOLD,20));
        g.drawString(Eraser,45,68);



    }


    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
        x = e.getX();
        y = e.getY();

    }


    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub

    }


    @Override
    public void mouseDragged(MouseEvent e) {
        // TODO Auto-generated method stub
        Graphics g = getGraphics();
        g.setColor(See);
        g.fillOval(x, y, 8, 8);
        x = e.getX();
        y = e.getY();


    }


    @Override
    public void mouseMoved(MouseEvent e) {
        // TODO Auto-generated method stub

    }


}




