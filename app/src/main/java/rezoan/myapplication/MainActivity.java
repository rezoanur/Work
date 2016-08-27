package rezoan.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class MainActivity extends AppCompatActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener{

    private TextView myfield;
    private GestureDetector gestureDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.myfield =(TextView)findViewById(R.id.myfield);
        this.gestureDetector= new GestureDetector(this,this);
        gestureDetector.setOnDoubleTapListener(this);


    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {

        myfield.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {

        myfield.setText("DoubleTap");
        return false;



    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        myfield.setText("DoubleTapEvent");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {

        myfield.setText("Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

        myfield.setText("DoubleTapEvent");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {

        myfield.setText("SingleTapUp");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {

        myfield.setText("onScroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

        myfield.setText("onLongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {

        myfield.setText("onFling");
        return false;
    }
}
