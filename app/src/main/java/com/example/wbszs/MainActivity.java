package com.example.wbszs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Stack;
import java.math.BigDecimal;
import java.lang.Math;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_0, btn_1, btn_2, btn_3, btn_4, btn_5, btn_6,
            btn_7, btn_8, btn_9, btn_clear,
            btn_del, btn_ZF, btn_squ2, btn_div, btn_mul,
            btn_sub, btn_add, btn_equ, btn_p;
    EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_0 = (Button) findViewById(R.id.btn_0);
        btn_0.setOnClickListener(this);

        btn_1 = (Button) findViewById(R.id.btn_1);
        btn_1.setOnClickListener(this);

        btn_2 = (Button) findViewById(R.id.btn_2);
        btn_2.setOnClickListener(this);

        btn_3 = (Button) findViewById(R.id.btn_3);
        btn_3.setOnClickListener(this);

        btn_4 = (Button) findViewById(R.id.btn_4);
        btn_4.setOnClickListener(this);

        btn_5 = (Button) findViewById(R.id.btn_5);
        btn_5.setOnClickListener(this);

        btn_6 = (Button) findViewById(R.id.btn_6);
        btn_6.setOnClickListener(this);

        btn_7 = (Button) findViewById(R.id.btn_7);
        btn_7.setOnClickListener(this);

        btn_8 = (Button) findViewById(R.id.btn_8);
        btn_8.setOnClickListener(this);

        btn_9 = (Button) findViewById(R.id.btn_9);
        btn_9.setOnClickListener(this);

        btn_clear = (Button) findViewById(R.id.btn_clear);
        btn_clear.setOnClickListener(this);


        btn_del = (Button) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(this);


        btn_ZF = (Button) findViewById(R.id.btn_ZF);
        btn_ZF.setOnClickListener(this);

        btn_squ2 = (Button) findViewById(R.id.btn_squ2);
        btn_squ2.setOnClickListener(this);


        btn_div = (Button) findViewById(R.id.btn_div);
        btn_div.setOnClickListener(this);

        btn_mul = (Button) findViewById(R.id.btn_mul);
        btn_mul.setOnClickListener(this);

        btn_sub = (Button) findViewById(R.id.btn_sub);
        btn_sub.setOnClickListener(this);

        btn_add = (Button) findViewById(R.id.btn_add);
        btn_add.setOnClickListener(this);

        btn_equ = (Button) findViewById(R.id.btn_equ);
        btn_equ.setOnClickListener(this);

        btn_p = (Button) findViewById(R.id.btn_p);
        btn_p.setOnClickListener(this);

        text = (EditText) findViewById(R.id.text);
    }

    @Override
    public void onClick(View v) {
        String str = text.getText().toString();
        switch (v.getId()) {
            case R.id.btn_del:
                if (str.length() > 1) {
                    str = str.substring(0, str.length() - 1);
                } else {
                    str = "0";
                }
                text.setText(str);
                break;
            case R.id.btn_clear:
                str = "0";
                text.setText(str);
                btn_clear.setText("AC");
                break;
            case R.id.btn_0:
                if (str.equals("0")) {
                    str = "0";
                } else {
                    str += "0";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_1:
                if (str.equals("0")) {
                    str = "1";
                } else {
                    str += "1";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_2:
                if (str.equals("0")) {
                    str = "2";
                } else {
                    str += "2";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_3:
                if (str.equals("0")) {
                    str = "3";
                } else {
                    str += "3";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_4:
                if (str.equals("0")) {
                    str = "4";
                } else {
                    str += "4";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_5:
                if (str.equals("0")) {
                    str = "5";
                } else {
                    str += "5";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_6:
                if (str.equals("0")) {
                    str = "6";
                } else {
                    str += "6";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_7:
                if (str.equals("0")) {
                    str = "7";
                } else {
                    str += "7";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_8:
                if (str.equals("0")) {
                    str = "8";
                } else {
                    str += "8";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_9:
                if (str.equals("0")) {
                    str = "9";
                } else {
                    str += "9";
                }
                btn_clear.setText("C");
                text.setText(str);
                break;
            case R.id.btn_p:
                int flagp = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '.') {
                        flagp += 1;
                    }
                }

                if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || flagp == 1) {
                    Toast.makeText(MainActivity.this, "输入出错!", Toast.LENGTH_SHORT).show();
                    text.setText(str);
                } else {
                    str += ".";
                    text.setText(str);
                }

                break;
            case R.id.btn_add:
                if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                    Toast.makeText(MainActivity.this, "输入错误!", Toast.LENGTH_SHORT).show();
                    text.setText(str);
                } else {
                    str += "+";
                    text.setText(str);
                }
                break;
            case R.id.btn_sub:
                int flags = 0;
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) == '.') {
                        flags += 1;
                    }
                }
                if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                    Toast.makeText(MainActivity.this, "输入错误!", Toast.LENGTH_SHORT).show();
                    text.setText(str);
                } else if (str.charAt(0) == '0' && flags == 0 & str.length() == 1) {
                    text.setText("-");
                } else {
                    str += "-";
                    text.setText(str);
                }
                break;
            case R.id.btn_mul:
                if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                    Toast.makeText(MainActivity.this, "输入错误！", Toast.LENGTH_SHORT).show();
                    text.setText(str);
                } else {
                    str += "×";
                    text.setText(str);
                }
                break;
            case R.id.btn_div:
                if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷' || str.charAt(str.length() - 1) == '.') {
                    Toast.makeText(MainActivity.this, "输入错误!", Toast.LENGTH_SHORT).show();
                    text.setText(str);
                } else {
                    str += "÷";
                    text.setText(str);
                }
                break;
            case R.id.btn_equ:
                if (str.charAt(str.length() - 1) == '+' || str.charAt(str.length() - 1) == '-' || str.charAt(str.length() - 1) == '×' || str.charAt(str.length() - 1) == '÷') {
                    Toast.makeText(MainActivity.this, "请输入合法运算!", Toast.LENGTH_SHORT).show();
                    text.setText(str);
                } else {
                    // String ero = isMatched(str);
                    // if (ero.equals("no error")) {
                    String re = getResult();
                    if (re.contains("Infinity")) {
                        Toast.makeText(MainActivity.this, "除数不能为0!", Toast.LENGTH_SHORT).show();
                        text.setText("0");
                    } else {
                        text.setText(re);
                    }
                    // }// else {
                    //Toast.makeText(MainActivity.this, ero, Toast.LENGTH_SHORT).show();
                    //}
                }
                break;
            case R.id.btn_squ2:
                if (str.charAt(0) == '-') {
                    Toast.makeText(MainActivity.this, "负数不能被开方!", Toast.LENGTH_SHORT).show();
                    text.setText("0");
                } else if (str.contains("+") || str.contains("-") || str.contains("×") || str.contains("÷")) {
                    Toast.makeText(MainActivity.this, "符号不能开方!", Toast.LENGTH_SHORT).show();
                    text.setText("0");
                } else {
                    double x = Double.parseDouble(str);
                    x = Math.sqrt(x);
                    String x2 = String.format("%.7f", x);
                    x2 = x2.replaceAll("0+?$", "");//去掉多余的0
                    x2 = x2.replaceAll("[.]$", "");//如最后一位是.则去掉
                    text.setText(x2);
                }
                break;
            case R.id.btn_ZF:
                if (str.charAt(0) >= '0' && str.charAt(0) <= '9') {
                    if (str.equals("0")) {
                        text.setText("0");
                    } else {
                        text.setText("-" + str);
                    }
                } else if (str.charAt(0) == '-')
                    text.setText(str.substring(1, str.length()));
                else
                    text.setText(str);
                break;
            default:
                break;
        }
    }

    //将中缀表达式转换成后缀表达式
    public static StringBuffer toPostfix(String infix) {
        Stack<String> stack = new Stack<String>();   //运算符栈,顺序栈
        StringBuffer postfix = new StringBuffer(infix.length() * 2);   //后缀表达式字符串
        int i = 0;
        while (i < infix.length()) {
            char ch = infix.charAt(i);
            switch (ch) {
                case '+':
                case '-':
                    while (!stack.isEmpty() && !stack.peek().equals("(")) //如果栈不为空且栈顶元素不是"(",则出栈
                        postfix.append(stack.pop());   //且添加到后缀表达式串
                    stack.push(ch + ""); //ch入栈
                    i++;
                    break;

                case '×':
                case '÷':
                    while (!stack.isEmpty() && (stack.peek().equals("×") || stack.peek().equals("÷")))  //如果栈顶元素不为空且栈顶元素是"*"或是"/"时,则出栈
                        postfix.append(stack.pop());
                    stack.push(ch + "");
                    i++;
                    break;
//
//                case '(':
//                    stack.push(ch+""); //直接入栈
//                    i++;
//                    break;
//
//                case ')':
//                    String out=stack.pop();
//                    while(out!=null&&!out.equals("(")){    //如果栈顶元素不为空且不为"("时
//                        postfix.append(out);   //添加到后缀表达式串
//                        out=stack.pop();   //把此时位于栈顶的"("弹出
//                    }
//                    i++;
//                    break;

                default:
                    while ((i < infix.length() && ch >= '0' && ch <= '9') || (i < infix.length() && ch == '.')) {
                        postfix.append(ch);    //如果是数字直接添加到后缀表达式串
                        i++;
                        if (i < infix.length())
                            ch = infix.charAt(i);
                    }
                    postfix.append(" ");
            }

        }
        while (!stack.isEmpty())       //所有运算符出栈
            postfix.append(stack.pop());   //添加到后缀表达式中
        return postfix;
    }

    //计算后缀表达式
    public static Double toValue(StringBuffer postfix) {
        Stack<Double> stack = new Stack<Double>();   //操作数栈,链式栈
        double value = 0;
        int j = 0;
        for (int i = 0; i < postfix.length(); i++) {
            j = i;
            char ch = postfix.charAt(i);
            if ((ch >= '0' && ch <= '9') || ch == '.') {
                value = 0;
                while (ch != ' ') {
                    while (ch != ' ' && ch != '.') {
                        value = value * 10 + ch - '0';
                        j++;
                        ch = postfix.charAt(++i);
                    }
                    if (ch != ' ' && ch == '.')
                        ch = postfix.charAt(++i);
                    while (ch != ' ' && (i >= j + 1)) {
                        BigDecimal valueBD = new BigDecimal(Double.toString(value));
                        BigDecimal chBD = new BigDecimal(Double.toString(ch - '0'));
                        BigDecimal nBD = new BigDecimal(Double.toString(Math.pow(10, i - j)));
                        double temp = chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD = new BigDecimal(Double.toString(temp));
                        value = valueBD.add(tempBD).doubleValue();
                        ch = postfix.charAt(++i);
                    }

                    stack.push(value);
                }

            } else {
                if (ch != ' ') {
                    Double y = stack.pop();
                    Double x = stack.pop();
                    switch (ch) {
                        case '+':
                            value = x + y;
                            break;
                        case '-':
                            value = x - y;
                            break;
                        case '×':
                            value = x * y;
                            break;
                        case '÷':
                            value = x / y;
                            break;
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }
    public static Double toValue2(StringBuffer postfix) {
        Stack<Double> stack = new Stack<Double>();   //操作数栈,链式栈
        double value = 0;
        int j = 0;
        for (int i = 0; i < postfix.length(); i++) {
            j = i;
            char ch = postfix.charAt(i);
            if ((ch >= '0' && ch <= '9') || ch == '.') {
                value = 0;
                while (ch != ' ') {
                    while (ch != ' ' && ch != '.') {
                        value = value * 10 + ch - '0';
                        j++;
                        ch = postfix.charAt(++i);
                    }
                    if (ch != ' ' && ch == '.')
                        ch = postfix.charAt(++i);
                    while (ch != ' ' && (i >= j + 1)) {
                        BigDecimal valueBD = new BigDecimal(Double.toString(value));
                        BigDecimal chBD = new BigDecimal(Double.toString(ch - '0'));
                        BigDecimal nBD = new BigDecimal(Double.toString(Math.pow(10, i - j)));
                        double temp = chBD.divide(nBD).doubleValue();
                        BigDecimal tempBD = new BigDecimal(Double.toString(temp));
                        value = valueBD.add(tempBD).doubleValue();
                        ch = postfix.charAt(++i);
                    }

                    stack.push(value);
                }

            } else {
                if (ch != ' ') {
                    Double y = stack.pop();
                    Double x = stack.pop();
                    switch (ch) {
                        case '+':
                            value = x - y;
                            break;
                        case '-':
                            value = x + y;
                            break;
                        case '×':
                            value = x * y;
                            break;
                        case '÷':
                            value = x / y;
                            break;
                    }
                    stack.push(value);
                }
            }

        }
        return stack.pop();
    }

    public String getResult() {
        String infix = text.getText().toString();
        String re =null;
        if (infix.charAt(0) != '-') {
            StringBuffer postfix = toPostfix(infix);
            Double result = toValue(postfix);
            re = String.format("%.7f", result);//规避极小误差
            re = re.replaceAll("0+?$", "");//去掉多余的0
            re = re.replaceAll("[.]$", "");//如最后一位是.则去掉

        }
        else{
            infix = infix.substring(1,infix.length());
            StringBuffer postfix = toPostfix(infix);
            Double result = toValue2(postfix);
            if(result > 0) {
                re = '-'+ String.format("%.7f", result);//规避极小误差
            }
            else{
                result *= -1.0;
                re =String.format("%.7f", result);
            }
            re = re.replaceAll("0+?$", "");//去掉多余的0
            re = re.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return re;
    }
}
