package org.aplas.kuis;

import java.util.ArrayList;

public class ProtokolData {
    private static String [] protokolname = {
            "PPKM Level 1",
            "PPKM Level 2",
            "PPKM Level 3",
            "PPKM Level 4",
            "PSBB",
            "PPKM",
            "PPKM Micro",
            "PPKM Darurat",
            "Isolasi Sendiri",
            "LockDown"
    };

    private static String [] protokolDetail = {
            "PPKM level 1 artinya menunjukkan jumlah kasus positif COVID-19 kurang dari 20 orang per 100 ribu penduduk per minggu. Sementara rawat inap di di rumah sakit kurang dari 5 orang per 100 ribu penduduk per minggu, serta angka kematian kurang dari 1 orang per 100 ribu penduduk di daerah tersebut.",
            "PPKM Level 2: Angka kasus positif COVID-19 antara 20 dan kurang dari 50 orang per 100 ribu penduduk per minggu. Rawat inap di di rumah sakit antara 5 hingga kurang dari 10 orang per 100 ribu penduduk per minggu, sementara angka kematian kurang dari 2 orang per 100 ribu penduduk di daerah tersebut.",
            "PPKM Level 3: Angka kasus positif COVID-19 berkisar 50-150 orang per 100 ribu penduduk per minggu. Adapun rawat inap di rumah sakit berkisar 10-30 orang per 100 ribu penduduk per minggu, serta angka kematian antara 2-5 kasus per 100 ribu penduduk di daerah tersebut.",
            "PPKM Level 4: Angka kasus positif COVID-19 lebih dari 150 kasus COVID-19 per 100 ribu penduduk, lebih dari 30 kasus yang dirawat di rumah sakit per 100 ribu penduduk, dan lebih dari 5 kasus meninggal per 100 ribu penduduk.",
            "PSBB adalah singkatan dari Pembatasan Sosial Berskala Besar, peraturan yang diterbitkan Kementerian Kesehatan (Kemenkes) dalam rangka Percepatan Penanganan COVID-19 agar bisa segera dilaksanakan di berbagai daerah. Aturan PSBB tercatat dalam Peraturan Menteri Kesehatan Nomor 9 Tahun 2020.",
            "Pemerintah sudah resmi menetapkan pemberlakukan PPKM atau PPKM darurat sejak 3 Juli sampai 20 Juli 2021. PPKM adalah singkatan dari Perberlakukan Pembatasan Kegiatan Masyarakat. PPKM diberlakukan untuk membendung laju kenaikan angka positif virus corona atau Covid-19. Awalnya, PPKM diberlakukan di wilayah Jawa dan Bali.",
            "PPKM Mikro merupakan pendekatan PPKM berbasis mikro yang mengatur sampai dengan tingkat rukun tetangga (RT)/rukun warga (RW) yang berpotensi menimbulkan penularan Covid-19. Dalam pelaksanaannya, pembatasan kegiatan masyarakat harus mempertimbangkan perkembangan zonasi risiko wilayah di masing-masing daerah.",
            "Kebijakan PPKM Darurat adalah kebijakan yang harus diambil pemerintah untuk menekan angka penularan Covid-19. Selain itu, kebijakan tersebut juga bertujuan untuk mengurangi kebutuhan masyarakat untuk berobat di rumah sakit sehingga tidak membuat lumpuh rumah sakit akibat kelebihan kapasitas oleh pasien Covid-19",
            "Karantina wilayah adalah penerapan karantina terhadap suatu daerah atau wilayah tertentu dalam rangka mencegah perpindahan orang, baik masuk maupun keluar wilayah tersebut, untuk tujuan tertentu yang mendesak.",
            "Isolasi mandiri adalah tindakan penting yang dilakukan oleh orang yang memiliki gejala COVID-19 untuk mencegah penularan ke orang lain di masyarakat, termasuk anggota keluarga. Isolasi mandiri adalah ketika seseorang yang mengalami demam, batuk, atau gejala COVID-19 lainnya tinggal di rumah dan tidak pergi bekerja, sekolah, atau ke tempat-tempat umum. Hal ini dilakukan secara sukarela atau berdasarkan rekomendasi dari penyedia layanan kesehatan."
    };

    private static int[] protokolimage = {
        R.drawable.lvl1,
        R.drawable.lvl2,
        R.drawable.lvl3,
        R.drawable.lvl4,
        R.drawable.psbb,
        R.drawable.km,
        R.drawable.mikro,
        R.drawable.ppkm_darurat,
        R.drawable.isolasi,
        R.drawable.lockdown
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
