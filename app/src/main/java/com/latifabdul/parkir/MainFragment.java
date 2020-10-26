package com.latifabdul.parkir;

import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.latifabdul.parkir.databinding.MainFragmentBinding;
import com.latifabdul.parkir.model.ParkirModel;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;


    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        final MainFragmentBinding binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        binding.setViewModel(mViewModel);
        binding.setLifecycleOwner(this);
        binding.btnMasuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mViewModel.masuk(binding.edtTextPlatNomor.getText().toString(), binding.spinnerJenisKendaraan.getSelectedItem().toString());
                Navigation.findNavController(view).navigate(R.id.secondaryFragment);
            }
        });
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // TODO: Use the ViewModel
    }

}