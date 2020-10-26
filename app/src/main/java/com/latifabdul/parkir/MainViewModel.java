package com.latifabdul.parkir;

import androidx.lifecycle.ViewModel;

import com.latifabdul.parkir.model.ListModel;
import com.latifabdul.parkir.model.ParkirModel;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainViewModel extends ViewModel {
    public ParkirModel parkir;
    private ListModel list = new ListModel();
    private List<ParkirModel> parkirList = new ArrayList<>();

    public void masuk(String plat, String jenisKendaraan){
        Date d = new Date();
        parkir =  new ParkirModel();
        parkir.setPlatNomor(plat);
        parkir.setJamMasuk(String.valueOf(d.getTime()));
        parkir.setTglMasuk(String.valueOf(d.getDate()));
        parkir.setJenisKendaraan(jenisKendaraan);
        parkirList.add(parkir);
        list.setParkirList(parkirList);
    }

    public ParkirModel getParkir() {
        return parkir;
    }

    public void setParkir(ParkirModel parkir) {
        this.parkir = parkir;
    }
}