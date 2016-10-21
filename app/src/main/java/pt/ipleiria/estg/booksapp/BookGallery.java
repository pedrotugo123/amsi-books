package pt.ipleiria.estg.booksapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

import pt.ipleiria.estg.booksapp.adapters.ImageCellAdapter;
import pt.ipleiria.estg.booksapp.models.ExampleData;

public class BookGallery extends AppCompatActivity {

    private GridView gvAcBookGalleryCovers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ac_bookgallery);

        gvAcBookGalleryCovers = (GridView) findViewById(R.id.gvAcBookGalleryCovers);
        gvAcBookGalleryCovers.setAdapter(new ImageCellAdapter(this, ExampleData.getAllCovers()));

        // Exercício para casa: encontrar uma forma de calcular o número de colunas automaticamente, com base na
        // dimensão do ecrã, densidade de pixel e tamanho das ImageView.
        gvAcBookGalleryCovers.setNumColumns(4);
    }
}
