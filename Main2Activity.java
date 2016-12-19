package tung.login;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    Button btnaccept;
    EditText txtname,txtpass;
    TextView txtpassfont,txtnamefont;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnaccept= (Button) findViewById(R.id.btnaccept);
        txtname= (EditText) findViewById(R.id.txtname);
        txtpass= (EditText) findViewById(R.id.txtpass);
        txtnamefont= (TextView) findViewById(R.id.txtnamefont);
        txtpassfont= (TextView) findViewById(R.id.txtpassfont);

        Typeface typeface= Typeface.createFromAsset(getAssets(),"fonts/ongdo.ttf");
        txtpassfont.setTypeface(typeface);
        txtnamefont.setTypeface(typeface);

        btnaccept.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String name=txtname.getText().toString();
        String pass=txtpass.getText().toString();
        if (name.equals("tung1992")&&pass.equals("123"))
        {
            Intent intent=new Intent();
            setResult(Activity.RESULT_OK,intent);
            finish();
        }
        else
        {
            Intent intent=new Intent();
            setResult(Activity.RESULT_CANCELED,intent);
            finish();
        }

    }
}
