package io.github.syndicate017.portofoliobambang.cv;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import io.github.syndicate017.portofoliobambang.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CVFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CVFragment extends Fragment {

    RecyclerView RvCv;
    CVAdapter adapter;
    List<CVItem> items;

    public CVFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cv, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RvCv = view.findViewById(R.id.recyclerview_cv);

        //Create a list of cv items
        items = new ArrayList<>();
        items.add(new CVItem("Program Sarjana (S1) - 2020", getString(R.string.sarjana)));
        items.add(new CVItem("Program Diploma Tiga (DIII) - 2019", getString(R.string.diploma)));
        items.add(new CVItem("Sekolah Menengah Kejuruan (SMK) - 2014", getString(R.string.smk)));

        adapter = new CVAdapter(items);

        RvCv.setLayoutManager(new LinearLayoutManager(getContext()));
        RvCv.setAdapter(adapter);
    }
}