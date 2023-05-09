package com.example.tugasakhir;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.tugasakhir.Adapter.CheckinAdapter;
import com.example.tugasakhir.Adapter.menungguAdapter;
import com.example.tugasakhir.Model.CheckinModel;
import com.example.tugasakhir.Model.MenungguModel;

import java.util.ArrayList;
import java.util.List;


public class CheckinFragment extends Fragment {

    public CheckinFragment() {
        // Required empty public constructor
    }
    private RecyclerView recyclerView;
    private CheckinAdapter myAdapter;
    private List<CheckinModel> checkinModelList;
    LinearLayoutManager layoutManager;

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_checkin, container, false);
        recyclerView = view.findViewById(R.id.checkin_tampil);
        // Inisialisasi data
        checkinModelList = new ArrayList<>();
        checkinModelList.add(new CheckinModel(R.drawable.imgsiti, "Suite Room", "500.000", "Check In"));
        checkinModelList.add(new CheckinModel(R.drawable.imgsiti, "Suite Room", "500.000", "Check In"));
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter = new CheckinAdapter(checkinModelList);
        recyclerView.setAdapter(myAdapter);
        return view;
    }
}