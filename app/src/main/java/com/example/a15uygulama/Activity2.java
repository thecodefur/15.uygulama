package com.example.a15uygulama;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.a15uygulama.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {

    private @NonNull Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Activity2Binding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);
        Intent intent = getIntent();
        Bilgiler bilgiler = (Bilgiler) intent.getSerializableExtra("bilgiler");
        binding.textViewAdiSoyadi.setText(bilgiler.getAdiSoyadi());
        binding.textViewEmail.setText(bilgiler.geteMail());
        binding.textViewTelefonNo.setText(bilgiler.getTelefonNo());
    }
}