import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class calcgui {

    private static Integer equation =0;
    private static Integer equation1 = 0;
    private static Integer equation2 = 0;
    private static Integer result = 0;
    private static String operator ;
    public static void main(String h[])
{
    JFrame f=new JFrame("Calculator");
	f.setVisible(true);
    f.setLayout(null);
	f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel backgroundcont = new JPanel() {};
    backgroundcont.setBackground(Color.BLACK);
    backgroundcont.setLayout(null); 
    backgroundcont.setBounds(45, 60, 500, 380);
    

    JTextField note =new JTextField();
	note.setBounds(0,10,600,20);
    note.setText("  Note:Only works on 2 operands.Use AC after every operation");
	f.add(note);

    JTextField equationstr =new JTextField();
	equationstr.setBounds(52,70,485,80);
    equationstr.setFont(new Font("Arial", Font.BOLD, 40)); 
	f.add(equationstr);

    JButton but9 = new JButton("9");
	but9.setBounds(60,160,80,50);
    but9.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but9);

	JButton but8 = new JButton("8");
	but8.setBounds(160,160,80,50);
    but8.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but8); 

    JButton but7 = new JButton("7");
	but7.setBounds(260,160,80,50);
    but7.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but7);
    
	JButton but6 = new JButton("6");
	but6.setBounds(60,230,80,50);
    but6.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but6); 
    
    JButton but5 = new JButton("5");
	but5.setBounds(160,230,80,50);
    but5.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but5);
    
	JButton but4 = new JButton("4");
	but4.setBounds(260,230,80,50);
    but4.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but4); 
    
    JButton but3 = new JButton("3");
	but3.setBounds(60,300,80,50);
    but3.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but3);
    
	JButton but2 = new JButton("2");
	but2.setBounds(160,300,80,50);
    but2.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but2); 
    
    JButton but1 = new JButton("1");
	but1.setBounds(260,300,80,50);
    but1.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but1); 
    
    JButton but0 = new JButton("0");
	but0.setBounds(60,370,80,50);
    but0.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(but0);
    
	JButton butdot = new JButton(".");
	butdot.setBounds(160,370,80,50);
    butdot.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(butdot); 
    
    JButton butbacksp = new JButton("AC");
	butbacksp.setBounds(260,370,80,50);
    butbacksp.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(butbacksp); 
    
    JButton butplus = new JButton("+");
	butplus.setBounds(360,160,80,50);
    butplus.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(butplus); 
    
    JButton butsub = new JButton("-");
	butsub.setBounds(450,160,80,50);
    butsub.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(butsub); 
    
    JButton butmul = new JButton("x");
	butmul.setBounds(360,230,80,50);
    butmul.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(butmul);
    
	JButton butdiv = new JButton("/");
	butdiv.setBounds(450,230,80,50);
    butdiv.setFont(new Font("Arial", Font.BOLD, 24)); 
	f.add(butdiv); 
    
    JButton butequal = new JButton("=");
	butequal.setBounds(360,300,170,120);
    butequal.setFont(new Font("Arial", Font.BOLD, 54)); 
	f.add(butequal); 
    
    f.add(backgroundcont); 
    f.setSize(600,600);
    
    
    but9.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation=equation*10+9;
          equationstr.setText(equation.toString());
         }
         });

    but8.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        equation=equation*10+8;
        equationstr.setText(equation.toString());
        }
        });


    but7.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation=equation*10+7;
            equationstr.setText(equation.toString());
            }
            });

    but6.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation=equation*10+6;
          equationstr.setText(equation.toString());
         }
         });

    but5.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        equation=equation*10+5;
        equationstr.setText(equation.toString());
        }
        });

    but4.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        equation=equation*10+4;
        equationstr.setText(equation.toString());
        }
        });


    but3.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation=equation*10+3;
            equationstr.setText(equation.toString());
            }
            });

    but2.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation=equation*10+2;
            equationstr.setText(equation.toString());
            }
            });

    but1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation=equation*10+1;
            equationstr.setText(equation.toString());
            }
            });

    but0.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation=equation*10+0;
            equationstr.setText(equation.toString());
            }
            });



    butplus.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        equation1=equation;
        equation=0;
        operator="+";
        equationstr.setText(operator);
        }
        });

    butsub.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        equation1=equation;
        equation=0;
        operator="-";
        equationstr.setText(operator);
        }
        });

    butmul.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        equation1=equation;
        equation=0;
        operator="x";
        equationstr.setText(operator);
        }
        });

    butdiv.addActionListener(new ActionListener(){
    public void actionPerformed(ActionEvent e){
        equation1=equation;
        equation=0;
        operator="/";
        equationstr.setText(operator);
        }
        });

    butequal.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation2=equation;
            if (operator.equals("+"))
            {
                result=equation1+equation2;
            }
            else if (operator.equals("-"))
            {
                result=equation1-equation2;
            }
            else if (operator.equals("x"))
            {
                result=equation1*equation2;
            }
            else if (operator.equals("/"))
            {
                result=equation1/equation2;
            }
            equationstr.setText(result.toString());
            }
            });

    butbacksp.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
            equation1=0;
            equation2=0;
            equation=0;
            operator=" ";
            equationstr.setText(operator);
            }
            });
}

}
