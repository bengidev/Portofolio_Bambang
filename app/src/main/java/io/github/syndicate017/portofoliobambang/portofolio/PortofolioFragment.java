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
public class PortofolioFragment extends Fragment implements PortofolioCallback{

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
        mdata.add(new PortofolioItem(R.drawable.project0));
        mdata.add(new PortofolioItem(R.drawable.project1));
        mdata.add(new PortofolioItem(R.drawable.project2));
        mdata.add(new PortofolioItem(R.drawable.project3));
        mdata.add(new PortofolioItem(R.drawable.project4));
        mdata.add(new PortofolioItem(R.drawable.project5));
        mdata.add(new PortofolioItem(R.drawable.project6));
        mdata.add(new PortofolioItem(R.drawable.project7));
        mdata.add(new PortofolioItem(R.drawable.project0));

        portofolioAdapter = new PortofolioAdapter(mdata, this);

        //Set up grid recycle view
        rv_portofolio.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        rv_portofolio.setAdapter(portofolioAdapter);
    }

    @Override
    public void onPortofolioItemClick(int pos) {

        //Handle click listener event when portofolio item clicked
        //First we need to create a fragment bottom sheet instance

        PortofolioFragmentDetails portofolioFragmentDetails = new PortofolioFragmentDetails();

        //Now we need to send portofolio item to portofolio dialog fragment
        //We will use bundle for that
        //Also we need our portofolio item data class to implement serializable interface so we can send it

        Bundle bundle = new Bundle();
        bundle.putSerializable("object", mdata.get(pos));
        portofolioFragmentDetails.setArguments(bundle);

        //Now let's open the portofolio bottom sheet fragment
        portofolioFragmentDetails.show(getActivity().getSupportFragmentManager(), "tagname");

        //Now we done opening the bottom sheet
        //Let's test it out
    }
}