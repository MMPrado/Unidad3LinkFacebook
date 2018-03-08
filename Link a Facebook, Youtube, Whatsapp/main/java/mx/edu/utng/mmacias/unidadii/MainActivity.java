package mx.edu.utng.mmacias.unidadii;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnYouTube;
    private Button  btnFacebook, btnWhatsapp;




    private static String APP_DIRECTORY = "MyPictureApp/";
    private static String MEDIA_DIRECTORY = APP_DIRECTORY + "PictureApp";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnYouTube = (Button) findViewById(R.id.buttonYouTube);
        btnYouTube.setOnClickListener(this);

        btnFacebook = (Button) findViewById(R.id.buttonFacebook);
        btnFacebook.setOnClickListener(this);
        btnWhatsapp = (Button) findViewById(R.id.buttonwhatsapp);
        btnWhatsapp.setOnClickListener(this);


    }
    @Override
    public void onClick(View v) {


        btnYouTube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.youtube.com/watch?v=FZqrf7ev6gg");
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });


        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri uriUrl = Uri.parse("https://www.facebook.com/Josefa2015/?fref=ts");
                Intent intent = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(intent);
            }
        });

        btnWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "Bienvenidos a Bar La Josefa https://www.facebook.com/Josefa2015/?fref=ts");
                intent.setPackage("com.whatsapp");
                startActivity(intent);
            }
        });
    }


}
