/* 과제명: 모바일소프트웨어 중간평가 과제
 * 분반: 01분반
 * 학번: 20180955, 성명: 김은진
 * 제출일: 2020년 5월 20일
 * 가산점 기능 구현 항목: 화면 디자인 개선, 오류 처리, 연속 계산 기능*/
package ddwucom.mobile.test09.midtermproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text;
    String msg = null;
    double firstOperand = 0;
    double secondOperand = 0;
    String operator = null;
    double result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.editText);

        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiply = findViewById(R.id.buttonMultiply);
        Button buttonDivision = findViewById(R.id.buttonDivision);

        Button buttonPower = findViewById(R.id.buttonPower);
        Button buttonSquareRoot = findViewById(R.id.buttonSquareRoot);
        Button buttonSin = findViewById(R.id.buttonSin);

        Button buttonClear = findViewById(R.id.buttonClear);
        Button buttonResult = findViewById(R.id.buttonResult);

        buttonPlus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (operator != null) {
                        secondOperand = Integer.parseInt(msg);
                        msg = null;
                        switch (operator) {
                            case "+":
                                firstOperand = firstOperand + secondOperand;
                                break;
                            case "-":
                                firstOperand = firstOperand - secondOperand;
                                break;
                            case "*":
                                firstOperand = firstOperand * secondOperand;
                                break;
                            case "/":
                                firstOperand = firstOperand / secondOperand;
                                break;
                        }

                        operator = "+";
                        text.setText("");
                        text.setHint("+");
                    }
                    else {
                        firstOperand = Integer.parseInt(msg);
                        msg = null;
                        operator = "+";
                        text.setText("");
                        text.setHint("+");
                    }
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        buttonMinus.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (operator != null) {
                        secondOperand = Integer.parseInt(msg);
                        msg = null;

                        switch (operator) {
                            case "+":
                                firstOperand = firstOperand + secondOperand;
                                break;
                            case "-":
                                firstOperand = firstOperand - secondOperand;
                                break;
                            case "*":
                                firstOperand = firstOperand * secondOperand;
                                break;
                            case "/":
                                firstOperand = firstOperand / secondOperand;
                                break;
                        }

                        operator = "-";
                        text.setText("");
                        text.setHint("-");
                    }
                    else {
                        firstOperand = Integer.parseInt(msg);
                        msg = null;
                        operator = "-";
                        text.setText("");
                        text.setHint("-");
                    }
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        buttonMultiply.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (operator != null) {
                        secondOperand = Integer.parseInt(msg);
                        msg = null;
                        switch (operator) {
                            case "+":
                                firstOperand = firstOperand + secondOperand;
                                break;
                            case "-":
                                firstOperand = firstOperand - secondOperand;
                                break;
                            case "*":
                                firstOperand = firstOperand * secondOperand;
                                break;
                            case "/":
                                firstOperand = firstOperand / secondOperand;
                                break;
                        }

                        operator = "*";
                        text.setText("");
                        text.setHint("*");
                    }
                    else {
                        firstOperand = Integer.parseInt(msg);
                        msg = null;
                        operator = "*";
                        text.setText("");
                        text.setHint("*");
                    }
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        buttonDivision.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    if (operator != null) {
                        secondOperand = Integer.parseInt(msg);
                        msg = null;

                        switch (operator) {
                            case "+":
                                firstOperand = firstOperand + secondOperand;
                                break;
                            case "-":
                                firstOperand = firstOperand - secondOperand;
                                break;
                            case "*":
                                firstOperand = firstOperand * secondOperand;
                                break;
                            case "/":
                                firstOperand = firstOperand / secondOperand;
                                break;
                        }

                        operator = "/";
                        text.setText("");
                        text.setHint("/");
                    }
                    else {
                        firstOperand = Integer.parseInt(msg);
                        msg = null;
                        text.setText("");
                        operator = "/";
                        text.setHint("/");
                    }
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        buttonPower.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    firstOperand = Integer.parseInt(msg);
                    msg = null;
                    text.setText("");
                    operator = "power";
                    text.setHint("power");
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        buttonSquareRoot.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    firstOperand = Integer.parseInt(msg);
                    msg = null;
                    text.setText("");
                    operator = "root";
                    text.setHint("root");
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();

                }
            }
        });

        buttonSin.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    firstOperand = Integer.parseInt(msg);
                    msg = null;
                    text.setText("");
                    operator = "sin";
                    text.setHint("sin");
                }
                catch (Exception e) {
                    Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonClear.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                msg = null;
                operator = null;
                text.setText("");
                text.setHint("");
            }
        });

        buttonResult.setOnClickListener(myResultClickListener);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_choice, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        LinearLayout layout = (LinearLayout)findViewById(R.id.LinearLayout5);

        switch (item.getItemId()) {
            case R.id.general:
                if (item.isChecked()) { item.setChecked(false); }
                else { item.setChecked(true); }
                layout.setVisibility(View.INVISIBLE);
                break;
            case R.id.engineering:
                if (item.isChecked()) { item.setChecked(false); }
                else { item.setChecked(true); }
                layout.setVisibility(View.VISIBLE);
                break;
        }
        return true;
    }

    public void onClick(View v) {
        if (msg == null) {
            msg = "";
        }

        switch (v.getId()) {
            case R.id.button0:
                msg += "0";
                break;
            case R.id.button1:
                msg += "1";
                break;
            case R.id.button2:
                msg += "2";
                break;
            case R.id.button3:
                msg += "3";
                break;
            case R.id.button4:
                msg += "4";
                break;
            case R.id.button5:
                msg += "5";
                break;
            case R.id.button6:
                msg += "6";
                break;
            case R.id.button7:
                msg += "7";
                break;
            case R.id.button8:
                msg += "8";
                break;
            case R.id.button9:
                msg += "9";
                break;
        }
        text.setText(msg);
    }

    View.OnClickListener myResultClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            try {
                if (operator != "root" && operator != "sin") {
                    secondOperand = Integer.parseInt(msg);
                }

                switch (operator) {
                    case "+":
                        result = firstOperand + secondOperand;
                        break;
                    case "-":
                        result = firstOperand - secondOperand;
                        break;
                    case "*":
                        result = firstOperand * secondOperand;
                        break;
                    case "/":
                        result = firstOperand / secondOperand;
                        break;
                    case "power":
                        result = 1;
                        for (int count = 0; count < secondOperand; count++) {
                            result *= firstOperand;
                        }
                        break;
                    case "root":
                        if (msg != null) {
                            throw new Exception();
                        }
                        result = Math.sqrt(firstOperand);
                        break;
                    case "sin":
                        if (msg != null) {
                            throw new Exception();
                        }
                        result = Math.sin(Math.toRadians(firstOperand));
                        break;
                }
                text.setText(Double.toString(result));
            }
            catch (Exception e) {
                Toast.makeText(MainActivity.this, "잘못된 입력입니다.", Toast.LENGTH_SHORT).show();
                msg = null;
                operator = null;
                firstOperand = 0;
                secondOperand = 0;
                result = 0;
                text.setText("");
                text.setHint("");
            }
        }
    };

}
