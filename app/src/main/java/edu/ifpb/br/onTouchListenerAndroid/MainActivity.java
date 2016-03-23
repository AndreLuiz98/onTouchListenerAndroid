package edu.ifpb.br.onTouchListenerAndroid;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.OnTouchListener;

public class MainActivity extends Activity {

    private Bitmap bitmap;
    private ImageView imageView;
    private TextView eventoToque;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

             eventoToque = (TextView) findViewById(R.id.textViewEvent);
             imageView = (ImageView) findViewById(R.id.imageView);

        bitmap= BitmapFactory.decodeResource(getResources(), R.drawable.download);
        imageView.setImageBitmap(bitmap);


        imageView.setOnTouchListener(onTouchListener);
    }
    OnTouchListener onTouchListener = new OnTouchListener() {

        @Override

        public boolean onTouch(View v, MotionEvent event) {


            switch (event.getAction() & MotionEvent.ACTION_MASK) {

                case MotionEvent.ACTION_DOWN:
                    eventoToque.setText("ACTION_DOWN");
                    break;

                case MotionEvent.ACTION_POINTER_DOWN:
                    eventoToque.setText("ACTION_POINTER_DOWN");
                    break;

                case MotionEvent.ACTION_MOVE:
                    eventoToque.setText("ACTION_MOVE");
                    break;

                case MotionEvent.ACTION_UP:
                    eventoToque.setText("ACTION_UP");
                    break;
            }
            return true;
        }

    };
}




