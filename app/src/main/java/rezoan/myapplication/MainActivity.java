package rezoan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mybutton=(Button)findViewById(R.id.mybutton);

        mybutton.setOnClickListener(

                new OnClickListener(){

                    public void onClick(View v) {

                        TextView mytext=(TextView)findViewById(R.id.mytext);
                        mytext.setText("Works");

                    }

                }

        );


        mybutton.setOnLongClickListener(

                new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {

                        TextView mytext=(TextView)findViewById(R.id.mytext);
                        mytext.setText("Long pressed!");
                        return true;
                    }
                }


        );



    }
}
