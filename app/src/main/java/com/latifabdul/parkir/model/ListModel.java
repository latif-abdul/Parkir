package com.latifabdul.parkir.model;

import java.util.ArrayList;
import java.util.List;

public class ListModel {
    private List<ParkirModel> parkirList = new ArrayList<>();

    public List<ParkirModel> getParkirList() {
        return parkirList;
    }

    public void setParkirList(List<ParkirModel> parkirList) {
        this.parkirList = parkirList;
    }
}
