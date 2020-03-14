package gamewindow;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class GameWindow extends JFrame
{
	JButton a,b,c,d,e,f,g,h,i,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	JLabel lblword,lblmessage;
	javax.swing.JPanel keypad,key1,key2,key3,screen,notify;
	
	public GameWindow()
	{
		a=new JButton("A");
		a=new JButton("B");
		a=new JButton("C");
		a=new JButton("D");
		a=new JButton("E");
		a=new JButton("F");
		a=new JButton("G");
		a=new JButton("H");
		a=new JButton("I");
		a=new JButton("J");
		a=new JButton("K");
		a=new JButton("L");
		a=new JButton("M");
		a=new JButton("N");
		a=new JButton("O");
		a=new JButton("P");
		a=new JButton("Q");
		a=new JButton("R");
		a=new JButton("S");
		a=new JButton("T");
		a=new JButton("U");
		a=new JButton("V");
		a=new JButton("W");
		a=new JButton("X");
		a=new JButton("Y");
		a=new JButton("Z");
		
		lblmessage=new JLabel("Guess A Country Name");
		lblmessage.setFont(new Font("serif",Font.PLAIN,20));
		
		lblword=new JLabel();
		lblword.setFont(new Font("serif",Font.PLAIN,35));
		
		notify=new JPanel();
		screen.setBackground(Color.WHITE);
		screen.setSize(0,200);
		
		keypad=new JPanel();
		keypad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0,0,0)));
		keypad.setBackground(Color.BLACK);
		
		key1=new JPanel();
		key1.setBackground(Color.BLACK);
		
		key2=new JPanel();
		key2.setBackground(Color.BLACK);
		
		key3=new JPanel();
		key3.setBackground(Color.BLACK);
		
		setTitle("Hangman Game");
		setSize(500,450);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void addComponent()
	{
		GridBagConstraints gc=new GridBagConstraints();
		
		notify.setLayout(new FlowLayout());
		notify.add(lblmessage);
		
		screen.setLayout(new GridBagLayout());
		screen.add(lblword,gc);
		
		keypad.setLayout(new GridBagLayout());
		
		key1.setLayout(new FlowLayout());
		key1.add(q);
		key1.add(w);
		key1.add(e);
		key1.add(r);
		key1.add(t);
		key1.add(y);
		key1.add(u);
		key1.add(i);
		key1.add(o);
		key1.add(p);
		
		gc.gridx=0;
		gc.gridy=0;
		keypad.add(key1,gc);
		
		key2.setLayout(new FlowLayout());
		key2.add(a);
		key2.add(s);
		key2.add(d);
		key2.add(f);
		key2.add(g);
		key2.add(h);
		key2.add(k);
		key2.add(l);
		
		gc.gridx=0;
		gc.gridy=1;
		keypad.add(key2,gc);
		
		key3.setLayout(new FlowLayout());
		key3.add(z);
		key3.add(x);
		key3.add(c);
		key3.add(v);
		key3.add(b);
		key3.add(n);
		key3.add(m);
		
		gc.gridx=0;
		gc.gridy=1;
		keypad.add(key3,gc);
		
		setLayout(new BorderLayout());
		add(notify,BorderLayout.NORTH);
		add(notify,BorderLayout.CENTER);
		add(notify,BorderLayout.SOUTH);
		
	}
}
