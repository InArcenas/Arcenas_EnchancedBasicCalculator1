package mcm.edu.ph.arcenas_enhancedbasiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            button add, Addition, Subtraction, Multipication, Division, Module

            btnAddition = findViewById(R.id.btnAddition);
            btnsub = findViewById(R.id.btnSubtraction);
            btnmultiply = findViewById(R.id.btnMultipication);
            btndivide = findViewById(R.id.btnDivision);
            btnmodulo = findViewById(R.id.btnmodulo);

            b.setOnClickListener(this);
            btnsub.setOnClickListener(this);
            btnmultiply.setOnClickListener(this);
            btndivide.setOnClickListener(this);
            btnmodulo.setOnClickListener(this);
        }
        @Override
        public void onClick (View view) {
            EditText operand1 = findViewById(R.id.txtOperand1);
            EditText operand2 = findViewById(R.id.txtOperand2);
            TextView result = findViewById(R.id.txtAnswer);

            double operandOne = 0;
            double operandTwo = 0;
            double answer = 0;

            operandOne = Double.parseDouble(operand1.getText().toString());
            operandTwo = Double.parseDouble(operand2.getText().toString());

            switch (view.getId()) {
                case R.id.btnAdd:
                    result.setText(Double.toString(doAddition(operandOne, operandTwo)));
                    break;
                case R.id.btnMinus:
                    result.setText(Double.toString(doSubtraction(operandOne, operandTwo)));
                    break;
                case R.id.btnMultiply:
                    result.setText(Double.toString(doMultiply(operandOne, operandTwo)));
                    break;
                case R.id.btnDivide:
                    result.setText(Double.toString(doDivide(operandOne, operandTwo)));
                    break;
                case R.id.btnModulo:
                    result.setText(Double.toString(doModulo(operandOne, operandTwo)));
                    break;

            }


        }

        public static double doAddition (double operandOne, double operandTwo) {
            return operandOne + operandTwo;
        }

        public static double doSubtraction (double operandOne, double operandTwo) {
            return operandOne - operandTwo;
        }

        public static double doMultiply (double operandOne, double operandTwo) {
            return operandOne * operandTwo;
        }

        public static double doDivide (double operandOne, double operandTwo) {
            return operandOne / operandTwo;
        }

        public static double doModulo (double operandOne, double operandTwo) {
            return operandOne % operandTwo;
        }

}