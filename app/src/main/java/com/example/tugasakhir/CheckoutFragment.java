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
import com.example.tugasakhir.Adapter.CheckoutAdapter;
import com.example.tugasakhir.Model.CheckinModel;
import com.example.tugasakhir.Model.CheckoutModel;

import java.util.ArrayList;
import java.util.List;

public class CheckoutFragment extends Fragment {

    private RecyclerView recyclerView;
    private CheckoutAdapter myAdapter;
    private List<CheckoutModel> checkoutModelList;
    LinearLayoutManager layoutManager;
    public CheckoutFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_checkout, container, false);
        recyclerView = view.findViewById(R.id.checkout_tampil);
        // Inisialisasi data
        checkoutModelList = new ArrayList<>();
        checkoutModelList.add(new CheckoutModel(R.drawable.imgsiti, "Suite Room", "500.000", "Check Out"));
        checkoutModelList.add(new CheckoutModel(R.drawable.imgsiti, "Suite Room", "500.000", "Check Out"));
        layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        myAdapter = new CheckoutAdapter(checkoutModelList);
        recyclerView.setAdapter(myAdapter);
        return view;
    }
}