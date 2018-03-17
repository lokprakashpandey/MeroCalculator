package calculator;

import javax.swing.*;
import java.awt.event.*;

public class MeroCalculator extends JFrame implements ActionListener {

    JButton zero, one, two, three, four, five, six, seven, eight, nine;
    JButton plus, minus, multiply, divide, clear, equal;
    JTextField text;
    
    String firstNo = "";
    String secondNo ="";
    String op ;        
    
    public MeroCalculator() {
        
        setLayout(null);
        text = new JTextField();
        text.setBounds(50,10, 250,30);
        text.setEditable(false);
        add(text);
        
        zero = new JButton("0");
        zero.setBounds(30, 50, 50, 40);
        add(zero);
        
        one = new JButton("1");
        one.setBounds(100, 50, 50, 40);
        add(one);
        
        two = new JButton("2");
        two.setBounds(170, 50, 50, 40);
        add(two);
        
        three = new JButton("3");
        three.setBounds(240, 50, 50, 40);
        add(three);
        
        four = new JButton("4");
        four.setBounds(310, 50, 50, 40);
        add(four);
        
        five = new JButton("5");
        five.setBounds(30, 100, 50, 40);
        add(five);
        
        six = new JButton("6");
        six.setBounds(100, 100, 50, 40);
        add(six);
        
        seven = new JButton("7");
        seven.setBounds(170, 100, 50, 40);
        add(seven);
        
        eight = new JButton("8");
        eight.setBounds(240, 100, 50, 40);
        add(eight);
        
        nine = new JButton("9");
        nine.setBounds(310, 100, 50, 40);
        add(nine);
        
        plus = new JButton("+");
        plus.setBounds(30, 150, 50, 40);
        add(plus);
        
        minus = new JButton("-");
        minus.setBounds(100, 150, 50, 40);
        add(minus);
        
        multiply = new JButton("*");
        multiply.setBounds(170, 150, 50, 40);
        add(multiply);
        
        divide = new JButton("/");
        divide.setBounds(240, 150, 50, 40);
        add(divide);
        
        equal = new JButton("=");
        equal.setBounds(310, 150, 50, 40);
        add(equal);
        
        clear = new JButton("Clear");
        clear.setBounds(150, 225, 100, 60);
        add(clear);
        
        text.addActionListener(this);
        zero.addActionListener(this);
        one.addActionListener(this);
        two.addActionListener(this);
        three.addActionListener(this);
        four.addActionListener(this);
        five.addActionListener(this);
        six.addActionListener(this);
        seven.addActionListener(this);
        eight.addActionListener(this);
        nine.addActionListener(this);
        plus.addActionListener(this);
        minus.addActionListener(this);
        multiply.addActionListener(this);
        divide.addActionListener(this);
        equal.addActionListener(this);
        clear.addActionListener(this);
        
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == zero)
            {
            if(!"".equals(firstNo))
                firstNo = firstNo+"0";
            text.setText(firstNo);
            }
        
        if(e.getSource() == one)
            {
            firstNo = firstNo+"1";    
            text.setText(firstNo);
            }
        
        if(e.getSource() == two)
            {
            firstNo = firstNo+"2";
            text.setText(firstNo);
            }
        
        if(e.getSource() == three)
            {
            firstNo = firstNo+"3";
            text.setText(firstNo);
            }
        
        if(e.getSource() == four)
            {
            firstNo = firstNo+"4";
            text.setText(firstNo);
            }
        
        if(e.getSource() == five)
            {
            firstNo = firstNo+"5";
            text.setText(firstNo);
            }
        
        if(e.getSource() == six)
            {
            firstNo = firstNo+"6";
            text.setText(firstNo);
            }
        
        if(e.getSource() == seven)
            {
            firstNo = firstNo+"7";
            text.setText(firstNo);
            }
        
        if(e.getSource() == eight)
            {
            firstNo = firstNo+"8";
            text.setText(firstNo);
            }
        
        if(e.getSource() == nine)
            {
            firstNo = firstNo+"9";
            text.setText(firstNo);
            }
        
        if(e.getSource() == plus)
            {
            secondNo = firstNo ;
            firstNo = "" ;
            op = "+" ;
            text.setText(firstNo);
            }
        
        if(e.getSource() == minus)
            {
            secondNo = firstNo ;
            firstNo = "" ;
            op = "-" ;
            text.setText(firstNo);
            }
        
        if(e.getSource() == multiply)
            {
            secondNo = firstNo ;
            firstNo = "" ;
            op = "*" ;
            text.setText(firstNo);
            }
        
        if(e.getSource() == divide)
            {
            secondNo = firstNo ;
            firstNo = "" ;
            op = "/" ;
            text.setText(firstNo);
            }
        
        if(e.getSource() == clear)
            {
            firstNo="";
            secondNo="";        
            text.setText(firstNo);
            }
        
        if(e.getSource() == equal)
            {
                int fn = Integer.parseInt(secondNo);
                int sn = Integer.parseInt(firstNo);
                int result = 0;
                if(op.equals("+"))
                {
                    result = fn + sn ;
                } 
                else if(op.equals("-"))
                {
                    result = fn-sn;
                } else if(op.equals("*")){
                    result = fn*sn;
                } 
                else 
                {
                    result = fn/sn;
                }   
                text.setText(""+result);
            }
    }                                                                                                                                   
    
    public static void main(String args[]) {
        new MeroCalculator();
    }                     
}