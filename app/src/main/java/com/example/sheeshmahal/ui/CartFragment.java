package com.example.sheeshmahal.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sheeshmahal.R;
import com.example.sheeshmahal.adapters.CartAdapter;
import com.example.sheeshmahal.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class CartFragment extends Fragment {

    List<CartModel> list;
    CartAdapter cartAdapter;
    RecyclerView recyclerView;

    public CartFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_cart, container, false);

        recyclerView = view.findViewById(R.id.cart_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        list = new ArrayList<>();

        list.add(new CartModel(R.drawable.fries1, "Order 1", "3", "4.5"));
        list.add(new CartModel(R.drawable.pizza1, "Order 2", "7", "4.5"));
        list.add(new CartModel(R.drawable.pizza2, "Order 3", "10", "4.5"));
        list.add(new CartModel(R.drawable.pizza3, "Order 4", "11", "4.7"));
        list.add(new CartModel(R.drawable.pizza4, "Order 5", "12", "5"));

        cartAdapter = new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);

        return view;
    }
}