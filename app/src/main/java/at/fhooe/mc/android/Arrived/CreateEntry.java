package at.fhooe.mc.android.Arrived;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CreateEntry extends AppCompatActivity {

    EditText phoneNumber;
    EditText message;
    EditText place;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_entry);
        phoneNumber = findViewById(R.id.nummer1);
        message = findViewById(R.id.nachricht1);
        place = findViewById(R.id.ort1);


        Button create = findViewById(R.id.createbutton);
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent();
                i.putExtra("phoneNumber", phoneNumber.getText().toString());
                i.putExtra("message", message.getText().toString());
                i.putExtra("place", place.getText().toString());
                setResult(RESULT_OK,i);
                finish();
            }
        });
    }
}
