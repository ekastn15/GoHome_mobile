package com.example.tugasakhir;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.tugasakhir.Adapter.FaqAdapter;
import com.example.tugasakhir.Model.FaqModel;

import java.util.ArrayList;

public class FaqActivity extends AppCompatActivity {
    ArrayList<FaqModel> arrayList;
    RecyclerView recyclerView;
    FaqAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        recyclerView = findViewById(R.id.faq_tampil);
        arrayList = new ArrayList<>();

        arrayList.add(new FaqModel("Bagaimana Cara merubah password?", "Dengan Klik Menu Edit Profile", false));
        arrayList.add(new FaqModel("Bagaimana Cara melakuakn pemesanan Kamar?", "deskripsi 1", false));
        arrayList.add(new FaqModel("Cara melihat Transaksi?", "deskripsi 1", false));

        adapter = new FaqAdapter(arrayList, FaqActivity.this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Mengatur fungsi tombol back pada appbar
        if (item.getItemId() == android.R.id.home) {
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}