package io.github.syndicate017.portofoliobambang.portofolio;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.github.syndicate017.portofoliobambang.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PortofolioFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PortofolioFragment extends Fragment {

    List<PortofolioItem> mdata;
    RecyclerView rv_portofolio;
    PortofolioAdapter portofolioAdapter;

    public PortofolioFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_portofolio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        rv_portofolio = view.findViewById(R.id.rv_portofolio);

        //Create a list of portofolio items
        mdata = new ArrayList<>();
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());
        mdata.add(new PortofolioItem());

        portofolioAdapter = new PortofolioAdapter(mdata);

        //Set up grid recycle view
        rv_portofolio.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        rv_portofolio.setAdapter(portofolioAdapter);
    }
}