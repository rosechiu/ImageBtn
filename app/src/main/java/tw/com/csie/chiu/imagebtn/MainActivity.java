package tw.com.csie.chiu.imagebtn;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton imageBtn = (ImageButton)findViewById(R.id.imageBtn);
        imageBtn.setOnTouchListener(this);
    }

    int count = 0;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN || count%2 == 0){
            ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.jun));
            ++count;
        }
        else if (event.getAction() == MotionEvent.ACTION_DOWN || count%2 == 1){
            ((ImageButton)v).setImageDrawable(getResources().getDrawable(R.drawable.fa));
        }
        return true;
    }
}
