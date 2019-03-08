/********************************
 * Author: Ethan Rimer
 * Class Name: LogOrderPizzaSelection
 ********************************/
package gmoseley98.gmail.com.fatimaspizzashop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class LogOrderPizzaSelection extends AppCompatActivity {

    private RadioGroup pizzaTypeRadGroup;
    private RadioButton supremeRadBtn, meatLoversRadBtn, cheeseRadBtn,
            pepperoniRadBtn, veggieRadBtn;
    private RadioGroup pizzaSizeRadGroup;
    private RadioButton sizeMediumRadBtn, sizeLargeRadBtn;

    private Button nextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_order_pizza_selection);

        pizzaTypeRadGroup = (RadioGroup) findViewById(R.id.pizzaTypeRadGroup);
        supremeRadBtn = (RadioButton) findViewById(R.id.supremeRadBtn);
        meatLoversRadBtn = (RadioButton) findViewById(R.id.meatLoversRadBtn);
        cheeseRadBtn = (RadioButton) findViewById(R.id.cheeseRadBtn);
        pepperoniRadBtn = (RadioButton) findViewById(R.id.pepperoniRadBtn);
        veggieRadBtn = (RadioButton) findViewById(R.id.veggieRadBtn);

        pizzaTypeRadGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });

        pizzaSizeRadGroup = (RadioGroup) findViewById(R.id.pizzaSizeRadGroup);
        sizeMediumRadBtn = (RadioButton) findViewById(R.id.sizeMediumRadBtn);
        sizeLargeRadBtn = (RadioButton) findViewById(R.id.sizeLargeRadBtn);

        pizzaSizeRadGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

            }
        });

        nextBtn = (Button) findViewById(R.id.nextBtn);
        nextBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

             openExtraToppings();
            }
        }));
    }

    public void openExtraToppings() {

        Intent intent = new Intent(this, LogOrderExtraToppings.class);
        startActivity(intent);
    }
}