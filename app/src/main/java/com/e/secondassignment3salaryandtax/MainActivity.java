package com.e.secondassignment3salaryandtax;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText ETsalary,Tview;
    TextView ETvew;
    Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETsalary = findViewById(R.id.ETsalary);
        ETvew =findViewById(R.id.ETview);
        Tview = findViewById(R.id.Tview);
        btnCal = findViewById(R.id.btnCal);
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             double Income, Tax;

             Income= Integer.parseInt(ETsalary.getText().toString());


                Tax = 0;

                IncomeCalculator incomeCalculator = new IncomeCalculator(Income,Tax);
                Tview.setText(Double.toString(incomeCalculator.TaxGenerate()));

                InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
             imm.hideSoftInputFromWindow(btnCal.getWindowToken(), InputMethodManager.RESULT_UNCHANGED_SHOWN);

            }
        });
    }
}
