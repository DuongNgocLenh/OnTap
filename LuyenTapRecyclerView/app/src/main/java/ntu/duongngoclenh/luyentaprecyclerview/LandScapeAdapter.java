package ntu.duongngoclenh.luyentaprecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.Toast;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLandHolder> {
    Context context;
    ArrayList<LandScape> lsdata;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lsdata) {
        this.context = context;
        this.lsdata = lsdata;
    }

    @NonNull
    @Override
    public ItemLandHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land,parent,false);
        ItemLandHolder holderCreated = new ItemLandHolder(vItem);
        return holderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLandHolder holder, int position) {
        //Lay doi tuong hien thi
        LandScape landScape = lsdata.get(position);
        //Trich thong tin
        String caption = landScape.getCation();
        String tenanh = landScape.getImage();
        //Dat vao cac truong thong tin cua holder
        holder.tvCaption.setText(caption);
        String packagename = holder.itemView.getContext().getPackageName();
        int imageID = holder.itemView.getResources().getIdentifier(tenanh,"mipmap",packagename);
        holder.imageViewLandscape.setImageResource(imageID);

    }

    @Override
    public int getItemCount() {
        return lsdata.size();
    }

    class ItemLandHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView imageViewLandscape;

        public ItemLandHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCation);
            imageViewLandscape = itemView.findViewById(R.id.imageViewLand);
        }
    }
}