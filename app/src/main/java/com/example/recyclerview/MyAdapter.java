package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private ArrayList<Advertise> AdvertArray;
    private ArrayList<Content> ContentArray;

    public static final int Tweet_Option = 1, Advert_Option = 2;




    // MATCHING CONSTRUCTOR GIVEN BY DEFAULT :

    public MyAdapter(ArrayList<Advertise> advertArray, ArrayList<Content> contentArray) {

        AdvertArray = advertArray;
        ContentArray = contentArray;
    }






    // EXTRA METHOD PROVIDED BY ADAPTER CLASS :

    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public int getItemViewType(int position) {

        // SEQUENCE CREATED FOR SPECIFIC INDEX:
        if ((position+1) % 3 == 0){
            return Advert_Option;
        }
        return Tweet_Option;
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////


    // DEFAULT METHODS OF ADAPTER :


    @Override
    public int getItemCount() {
        return (ContentArray.size() + AdvertArray.size());
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        if (viewType == Tweet_Option){
            return new ContentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.content_banner,null));
        }
        else if (viewType == Advert_Option){
            return new AdvertViewHoldr(LayoutInflater.from(parent.getContext()).inflate(R.layout.ad_banner,null));
        }
        return null;
    }




    // DEFAULT METHOD PROVIDED BY ADAPTER CLASS :

    @Override
    public void onBindViewHolder(@NonNull  RecyclerView.ViewHolder holder, int position) {

            Util reffTo_UtilClass = new Util();


            if (getItemViewType(position) == Tweet_Option) {

                ContentViewHolder viewfromcontent = (ContentViewHolder) holder;
                Content ObjOfContent = ContentArray.get(position);                                    // DATA FROM ARRAY IS SET TO OBJECT OF RESPECTIVE CLASS.
                viewfromcontent.contenttxt.setText(ObjOfContent.getContent());
                viewfromcontent.titletxt.setText(ObjOfContent.getTitle());
                viewfromcontent.ContentImage.setImageResource(ObjOfContent.getImgid());
            }

            else if (getItemViewType(position) == Advert_Option){

                AdvertViewHoldr viewfromAdvert = (AdvertViewHoldr) holder;
                Advertise ObjOfAdvert = AdvertArray.get(position%2);
                viewfromAdvert.Adtext.setText(ObjOfAdvert.getAdTitle());
                viewfromAdvert.AdImg.setImageResource(ObjOfAdvert.getAdvImgView());
            }

    }







    // DISTINCT VIEW HOLDERS :

    public class ContentViewHolder extends RecyclerView.ViewHolder {
        public TextView titletxt, contenttxt;
        public ImageView ContentImage;

        public ContentViewHolder(@NonNull  View itemView) {
            super(itemView);
            ContentImage = itemView.findViewById(R.id.ContentImg);
            titletxt = itemView.findViewById(R.id.contentTitle);
            contenttxt = itemView.findViewById(R.id.contentContent);


        }
    }

    public class AdvertViewHoldr extends RecyclerView.ViewHolder{

        public ImageView AdImg;
        public TextView Adtext;

        public AdvertViewHoldr(@NonNull View itemView) {
            super(itemView);

            AdImg = itemView.findViewById(R.id.AdvertImage);
            Adtext = itemView.findViewById(R.id.AdverTxtView);

        }
    }


   


}


