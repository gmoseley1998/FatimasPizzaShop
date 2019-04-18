/********************************
 * Author: Ethan Rimer
 * Class Name: PaymentSelectPayment
 * Class Description: Allows the user to select payment type (cash or credit)
 * and enter order price
 ********************************/
package gmoseley98.gmail.com.fatimaspizzashop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class PaymentSelectPayment extends AppCompatActivity {

    //  Creates an uninitialized Order object
    private Order order;

    private Button creditCardBtn, cashBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_select_payment);

        //  Receives info from the previous activity from the Parcel
        //  and stores it in 'order'
        order = getIntent().getParcelableExtra("order_parcel_data");

        creditCardBtn = (Button) findViewById(R.id.creditCardBtn);
        cashBtn = (Button) findViewById(R.id.cashBtn);

        creditCardBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                order.setPaymentType("Credit Card");
                openCreditCardInfo();
            }
        }));

        cashBtn.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                order.setPaymentType("Cash");
                completeOrder();
            }
        }));
    }

    public void openCreditCardInfo() {

        Intent intent = new Intent(this, PaymentCreditCardInfo.class);

        intent.putExtra("order_parcel_data", order);

        startActivity(intent);
    }

    public void completeOrder() {

        Intent intent = new Intent(this, LogOrderMain.class);

        /*  Insert database implementation here  */

        Toast.makeText(getApplicationContext(),
                "Order successfully logged",
                Toast.LENGTH_LONG).show();

        startActivity(intent);
    }
}