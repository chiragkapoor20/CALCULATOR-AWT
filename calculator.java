import java.awt.*;


class Calculator {

 Frame f;
 Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
 TextField t;
 Label l1;

Calculator()
{
  f=new Frame();
  f.setLayout(new FlowLayout());
  l1=new Label("calculator");
 f.add(l1);
 t=new TextField(20);
f.add(t);
b1=new Button("7");
b2=new Button("8");
b3=new Button("9");
b4=new Button("*");
b5=new Button("4");
b6=new Button("5");
b7=new Button("6");
b8=new Button("+");
b9=new Button("1");
b10=new Button("2");
b11=new Button("3");
b12=new Button("-");
b13=new Button("+/-");
b14=new Button("0");
b15=new Button(".");
b16=new Button("=");

f.add(b1);
f.add(b2);
f.add(b3);
f.add(b4);
f.add(b5);
f.add(b6);
f.add(b7);
f.add(b8);
f.add(b9);
f.add(b10);
f.add(b11);
f.add(b12);
f.add(b13);
f.add(b14);
f.add(b15);
f.add(b16);


 
f.setSize(100,300);
f.setVisible(true);

}



public static void main(String args[])
{
    
  Calculator c=new Calculator();
}

}