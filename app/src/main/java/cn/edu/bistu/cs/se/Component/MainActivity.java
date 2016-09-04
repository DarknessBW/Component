package cn.edu.bistu.cs.se.Component;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btC = (Button) findViewById(R.id.buttonClean);
        final EditText eTxt = (EditText) findViewById(R.id.editText);

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eTxt.setText("请输入内容");
            }
        });
    }

    public void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        TextView textView = (TextView) findViewById(R.id.textView1);
        switch (view.getId()) {
            case R.id.radioButtonMan:
                if (checked)
                    textView.setText("性别：男");
                break;
            case R.id.radioButtonWoman:
                if (checked)
                    textView.setText("性别：女");
                break;
        }
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox)view).isChecked();
        TextView textView = (TextView)findViewById(R.id.textView2);
        switch (view.getId()) {
            case R.id.checkboxA:
                if (checked)
                    textView.setText(textView.getText() + "A ");
                else{
                    String s = textView.getText().toString();
                    s = s.replace("A ","");
                    textView.setText(s);
                }
                break;
            case R.id.checkboxB:
                if (checked)
                    textView.setText(textView.getText() + "B ");
                else{
                    String s = textView.getText().toString();
                    s = s.replace("B ","");
                    textView.setText(s);
                }
                break;
            case R.id.checkboxC:
                if (checked)
                    textView.setText(textView.getText() + "C ");
                else{
                    String s = textView.getText().toString();
                    s = s.replace("C ","");
                    textView.setText(s);
                }
                break;
            case R.id.checkboxD:
                if (checked)
                    textView.setText(textView.getText() + "D ");
                else{
                    String s = textView.getText().toString();
                    s = s.replace("D ","");
                    textView.setText(s);
                }
                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
