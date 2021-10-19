package org.aplas.kuis;

import java.util.ArrayList;

public class ProtokolData {
    private static String [] protokolname = {
            "PPKM Level 1",
            "PPKM Level 2",
            "PPKM Level 3",
            "PPKM Level 4"
    };

    private static String [] protokolDetail = {
            "PPKM level 1 artinya menunjukkan jumlah kasus positif COVID-19 kurang dari 20 orang per 100 ribu penduduk per minggu. Sementara rawat inap di di rumah sakit kurang dari 5 orang per 100 ribu penduduk per minggu, serta angka kematian kurang dari 1 orang per 100 ribu penduduk di daerah tersebut.",
            "PPKM Level 2: Angka kasus positif COVID-19 antara 20 dan kurang dari 50 orang per 100 ribu penduduk per minggu. Rawat inap di di rumah sakit antara 5 hingga kurang dari 10 orang per 100 ribu penduduk per minggu, sementara angka kematian kurang dari 2 orang per 100 ribu penduduk di daerah tersebut.",
            "PPKM Level 3: Angka kasus positif COVID-19 berkisar 50-150 orang per 100 ribu penduduk per minggu. Adapun rawat inap di rumah sakit berkisar 10-30 orang per 100 ribu penduduk per minggu, serta angka kematian antara 2-5 kasus per 100 ribu penduduk di daerah tersebut.",
            "PPKM Level 4: Angka kasus positif COVID-19 lebih dari 150 kasus COVID-19 per 100 ribu penduduk, lebih dari 30 kasus yang dirawat di rumah sakit per 100 ribu penduduk, dan lebih dari 5 kasus meninggal per 100 ribu penduduk.",
    };

    private static int[] protokolimage = {
        R.drawable.lvl1,
        R.drawable.lvl2,
        R.drawable.lvl3,
        R.drawable.lvl4
    };
    static ArrayList<Protokol> getlistData(){
        ArrayList<Protokol> list = new ArrayList<>();
        for (int position = 0; position <protokolname.length; position++){
            Protokol protokol = new Protokol();
            protokol.setName(protokolname[position]);
            protokol.setDetail(protokolDetail[position]);
            protokol.setPhoto(protokolimage[position]);
            list.add(protokol);
        }
        return list;
    }
}
