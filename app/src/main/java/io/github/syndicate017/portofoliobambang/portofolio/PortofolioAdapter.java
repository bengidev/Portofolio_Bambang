package io.github.syndicate017.portofoliobambang.portofolio;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import io.github.syndicate017.portofoliobambang.R;

public class PortofolioAdapter extends RecyclerView.Adapter<PortofolioAdapter.PortofolioViewHolder> {

    List<PortofolioItem> mdata;

    public PortofolioAdapter(List<PortofolioItem> mdata) {
        this.mdata = mdata;
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

        holder.tvPosition.setText(String.valueOf(position));

    }

    @Override
    public int getItemCount() {
        return mdata.size();
    }

    public class PortofolioViewHolder extends RecyclerView.ViewHolder {

        TextView tvPosition;

        public PortofolioViewHolder(@NonNull View itemView) {
            super(itemView);

            tvPosition = itemView.findViewById(R.id.item_port_text);
        }
    }
}
