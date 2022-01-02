package io.github.syndicate017.portofoliobambang.portofolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

import io.github.syndicate017.portofoliobambang.R;

public class PortofolioFragmentDetails extends BottomSheetDialogFragment {

    private ImageView imgPortofolio;
    private TextView title, description;


    public PortofolioFragmentDetails() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portofolio_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imgPortofolio = view.findViewById(R.id.portofolio_details_img);
        title = view.findViewById(R.id.portofolio_details_title);
        description = view.findViewById(R.id.portofolio_details_desc);
    }

    public void loadPortofolioData(PortofolioItem item) {

        Glide.with(getContext()).load(item.getImage()).into(imgPortofolio);

        //bind title and description ...
    }
}