package pt.ipleiria.estg.booksapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Books extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_books);

        ((Button) findViewById(R.id.btnAcBookAPPBooksList)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent("pt.ipleiria.estg.booksapp.LIST");
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.btnAcBookAPPGallery)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent("pt.ipleiria.estg.booksapp.GALLERY");
                startActivity(i);
            }
        });

        ((Button) findViewById(R.id.btnAcBookAPPNewBook)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent("pt.ipleiria.estg.booksapp.NEWBOOK");
                startActivity(i);
            }
        });

        ((ImageButton) findViewById(R.id.ibAcBookAPPAbout)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent i = new Intent("pt.ipleiria.estg.booksapp.ABOUT");
                startActivity(i);
            }
        });
    }
}
