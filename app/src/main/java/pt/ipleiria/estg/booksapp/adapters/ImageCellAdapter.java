package pt.ipleiria.estg.booksapp.adapters;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import pt.ipleiria.estg.booksapp.R;

public class ImageCellAdapter extends BaseAdapter {

    private Context context;
    private Integer[] images;

    // largura e altura das imagens em pixel, calculado com base nos valores definidos no ficheiro dimens.xml
    private int imageWidth;
    private int imageHeight;

    public ImageCellAdapter(Context context, Integer[] images) {
        this.context = context;
        this.images = images;

        // as dimensões são definidas em DP, oferecendo um tamanho independente do dispositivo (do ecrã, densidade,
        // resolução, etc), mas as imagens ao trabalharmos com imagens em código estamos a trabalhar com dimensões em
        // PX que precisamos converter.
        //
        // DP = PX / DPI * 160
        //
        // A plataforma Android já oferece alguns métodos para converão destes valores.
        imageWidth = context.getResources().getDimensionPixelSize(R.dimen.it_coveritem_image_width);
        imageHeight = context.getResources().getDimensionPixelSize(R.dimen.it_coveritem_image_height);
    }

    @Override
    public int getCount() {
        return (images != null ? images.length : 0);
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View reusedView, ViewGroup parent) {

        // Confirmar se estamos a reutilizar uma View criada anteriormente. Este método é invocado cada vez que uma
        // célula é tornada visível (atividade a iniciar ou utilizador está a fazer scroll).
        //
        // Se a View já existe, apenas alteramos os valores necessários em vez de criar novamente uma instância.
        if (reusedView == null) {
            reusedView = new ImageView(context);

            reusedView.setLayoutParams(new GridView.LayoutParams(imageWidth, imageHeight));

            // A nossas imagens devem ser centradas e ajustadas à dimensão da ImageView (scale down)
            ((ImageView) reusedView).setScaleType(ImageView.ScaleType.CENTER_CROP);

            // A margem entre células/imagens é definida na GridView e por isso colocamos o padding da ImageView a zero.
            reusedView.setPadding(0, 0, 0, 0);
        }

        ((ImageView) reusedView).setImageResource(images[position]);
        return reusedView;
    }
}
