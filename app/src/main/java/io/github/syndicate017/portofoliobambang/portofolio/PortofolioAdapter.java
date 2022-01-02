package io.github.syndicate017.portofoliobambang.portofolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import io.github.syndicate017.portofoliobambang.R;

public class PortofolioAdapter extends RecyclerView.Adapter<PortofolioAdapter.PortofolioViewHolder> {

    List<PortofolioItem> mdata;
    PortofolioCallback listener;

    public PortofolioAdapter(List<PortofolioItem> mdata, PortofolioCallback listener) {
        this.mdata = mdata;
        this.listener = listener;
    }



    @NonNull
    @Override
    public PortofolioAdapter.PortofolioViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_portofolio, parent, false);

        return new PortofolioViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PortofolioAdapter.PortofolioViewHolder holder, int position) {

        Glide.with(holder.itemView.getContext()).load(mdata.get(position).getImage()).into(holder.imgPort);

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class PortofolioViewHolder extends RecyclerView.ViewHolder {

        ImageView imgPort;

        public PortofolioViewHolder(@NonNull View itemView) {
            super(itemView);

            imgPort = itemView.findViewById(R.id.item_portfolio_img);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onPortofolioItemClick(getAdapterPosition());
                }
            });
        }
    }
}
