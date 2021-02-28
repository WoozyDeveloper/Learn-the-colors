package ro.adionofrei.thecolors;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button1);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);
        b7=(Button)findViewById(R.id.button7);
        b8=(Button)findViewById(R.id.button8);
        txt=(TextView)findViewById(R.id.text);

         //  ScrollView scrollable_contents=(ScrollView)findViewById(R.id.scrollbam);
          // getLayoutInflater().inflate(R.layout.activity_main,scrollable_contents);
    }
    public void goblack(View v){txt.setText("Black");}
    public void gored(View v){txt.setText("Red");}
    public void gopurple(View v){txt.setText("Purple");}
    public void goorange(View v){txt.setText("Orange");}
    public void gowhite(View v){txt.setText("White");}
    public void gogray(View v){txt.setText("Gray");}
    public void gogreen(View v){txt.setText("Green");}
    public void gopink(View v){txt.setText("Pink");}
}