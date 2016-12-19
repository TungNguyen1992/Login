package tung.login;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnlogin;
    TextView txtxuat;
    public static final int LOGIN_REQUEST_CODE=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnlogin= (Button) findViewById(R.id.btnlogin1);
        txtxuat= (TextView) findViewById(R.id.txtxuat);

        Typeface typeface= Typeface.createFromAsset(getAssets(),"fonts/ongdo.ttf");
        txtxuat.setTypeface(typeface);
        btnlogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(this,Main2Activity.class);
        startActivityForResult(intent,LOGIN_REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode==LOGIN_REQUEST_CODE)
        {
            if (resultCode== Activity.RESULT_OK)
        {
            txtxuat.setText("Login Succes");
            btnlogin.setVisibility(View.INVISIBLE);
        }
        else
        {
            txtxuat.setText("Login Fail");
        }
        }
    }
}
