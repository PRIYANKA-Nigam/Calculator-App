package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
public Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bpi,bdot,bequal,bplus,bminus,bmul,bdiv,blog,bln,bsin,bcos,btan,bsquare,bsqrt,bfact,binv,bb1,bb2,bc,bac;
TextView tvmain,tvsec; String pi="3.14159265";@Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);b2=(Button)findViewById(R.id.b2); b3=(Button)findViewById(R.id.b3);b4=(Button)findViewById(R.id.b4);b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);b7=(Button)findViewById(R.id.b7);b8=(Button)findViewById(R.id.b8);b9=(Button)findViewById(R.id.b9);b0=(Button)findViewById(R.id.b0);
        bpi=(Button)findViewById(R.id.bpi);bdot=(Button)findViewById(R.id.bdot);bequal=(Button)findViewById(R.id.bequal);bplus=(Button)findViewById(R.id.bplus);
        bminus=(Button)findViewById(R.id.bminus);bmul=(Button)findViewById(R.id.bmul);bdiv=(Button)findViewById(R.id.bdivide);blog=(Button)findViewById(R.id.blog);
        bln=(Button)findViewById(R.id.bln);bsin=(Button)findViewById(R.id.bsin);bcos=(Button)findViewById(R.id.bcos);btan=(Button)findViewById(R.id.btan);
        bsquare=(Button)findViewById(R.id.bsquare);bsqrt=(Button)findViewById(R.id.bsqrt);bfact=(Button)findViewById(R.id.bfact);binv=(Button)findViewById(R.id.binverse);
        bb1=(Button)findViewById(R.id.bb1);bb2=(Button)findViewById(R.id.bb2);bc=(Button)findViewById(R.id.bc);bac=(Button)findViewById(R.id.bac);
        tvmain=(TextView)findViewById(R.id.tvmain);tvsec=(TextView)findViewById(R.id.tvsec);
        b1.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"1"); }});
        b2.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"2"); }});
        b3.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"3"); }});
        b4.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"4"); }});
        b5.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"5"); }});
        b6.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"6"); }});
        b7.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"7"); }});
        b8.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"8"); }});
        b9.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"9"); }});
        b0.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"0"); }});
        bdot.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"."); }});
        bac.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText("");tvsec.setText(""); }});
        bc.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { String val=tvmain.getText().toString();
                val=val.substring(0,val.length()-1);tvmain.setText(val); }});
        bln.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"ln"); }});
        blog.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"log"); }});
        bplus.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"+"); }});
        bminus.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"-"); }});
        bmul.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"*"); }});
        bdiv.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"/"); }});
        bdot.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"."); }});
        bsqrt.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { String val=tvmain.getText().toString();
               double r=Math.sqrt(Double.parseDouble(val));tvmain.setText(String.valueOf(r)); }});
        bb1.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"("); }});
        bb2.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+")"); }});
        bpi.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvsec.setText(bpi.getText());tvmain.setText(tvmain.getText()+pi); }});
        bsin.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"sin"); }});
        bcos.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"cos"); }});
        btan.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"tan"); }});
        binv.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { tvmain.setText(tvmain.getText()+"^"+"(-1)"); }});
        bfact.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { int val = Integer.parseInt(tvmain.getText().toString());
               int fact =factorial(val);tvmain.setText(String.valueOf(fact));tvsec.setText(val+"!"); }});
        bsquare.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { double d=Double.parseDouble(tvmain.getText().toString());double sq=d*d;
                tvmain.setText(String.valueOf(sq));tvsec.setText(d+"^2"); }});
        bequal.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) { String val = tvmain.getText().toString();
                String replacedstr = val.replace('÷','/').replace('×','*');double result = eval(replacedstr);
                tvmain.setText(String.valueOf(result));tvsec.setText(val); }}); }
    int factorial(int n){ return (n==1||n==0)?1:n*factorial(n-1); }
    public static double eval(final String str) { return new Object() {int pos = -1, ch;
    void nextChar() { ch = (++pos < str.length()) ? str.charAt(pos) : -1; }
            boolean eat(int charToEat) { while (ch == ' ')
                nextChar();if (ch == charToEat) { nextChar();return true; }return false; }
            double parse() { nextChar();double x = parseExpression();if (pos < str.length()) throw new RuntimeException("Unexpected: " + (char)ch);return x; }
        double parseExpression() { double x = parseTerm();for (;;) { if      (eat('+')) x += parseTerm(); // addition
                    else if (eat('-')) x -= parseTerm(); // subtraction
                    else return x; } }
            double parseTerm() { double x = parseFactor();for (;;) { if      (eat('*')) x *= parseFactor(); // multiplication
                    else if (eat('/')) x /= parseFactor(); // division
                    else return x; } }
            double parseFactor() { if (eat('+')) return parseFactor(); // unary plus
                if (eat('-')) return -parseFactor(); // unary minus
                double x;int startPos = this.pos;
                if (eat('(')) { // parentheses
                    x = parseExpression(); eat(')'); } else if ((ch >= '0' && ch <= '9') || ch == '.') { // numbers
                    while ((ch >= '0' && ch <= '9') || ch == '.') nextChar();x = Double.parseDouble(str.substring(startPos, this.pos));
                } else if (ch >= 'a' && ch <= 'z') { // functions
                    while (ch >= 'a' && ch <= 'z') nextChar();String func = str.substring(startPos, this.pos);x = parseFactor();
                    if (func.equals("sqrt")) x = Math.sqrt(x);
                    else if (func.equals("sin")) x = Math.sin(Math.toRadians(x));
                    else if (func.equals("cos")) x = Math.cos(Math.toRadians(x));
                    else if (func.equals("tan")) x = Math.tan(Math.toRadians(x));
                    else if (func.equals("log")) x = Math.log10(x);
                    else if (func.equals("ln")) x = Math.log(x);
                    else throw new RuntimeException("Unknown function: " + func);
                } else {
                    throw new RuntimeException("Unexpected: " + (char)ch); }
                if (eat('^')) x = Math.pow(x, parseFactor()); // exponentiation
                return x; }}.parse(); }}