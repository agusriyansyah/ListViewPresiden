package com.example.listviewpresiden.Model

import com.example.listviewpresiden.R

object DataPresiden {
    private val namaPresiden = arrayOf(
        "Soekarno",
        "Soeharto",
        "BJ Habibie",
        "Abdurrahman Wahid",
        "Megawati Soekarno Putri",
        "Susilo Bambang Yudhoyono",
        "Joko Widodo"
    )

    private val deskripsi = arrayOf(
        "Presiden pertama Republik Indonesia, Soekarno yang biasa dipanggil Bung Karno, lahir di Blitar, Jawa Timur, 6 Juni 1901 dan meninggal di Jakarta, 21 Juni 1970.",
        "Soeharto adalah Presiden kedua Republik Indonesia. Beliau lahir di Kemusuk, Yogyakarta, tanggal 8 Juni 1921.",
        "Presiden ketiga Republik Indonesia, Bacharuddin Jusuf Habibie lahir di Pare-Pare, Sulawesi Selatan, pada 25 Juni 1936. ",
        "Gus Dur adalah putra pertama dari enam bersaudara yang dilahirkan di Denanyar Jombang Jawa Timur pada tanggal 4 Agustus 1940.",
        "Presiden Republik Indonesia ke-5, Megawati Soekarnoputri lahir di Yogyakarta, 23 Januari 1947.",
        "Susilo Bambang Yudhoyono adalah presiden RI ke-6, SBY ini lahir di Pacitan, Jawa Timur 9 September 1949.",
        "Jokowi (lahir di Surakarta, Jawa Tengah, 21 Juni 1961; umur 58 tahun) adalah Presiden ke-7 Indonesia yang mulai menjabat sejak 20 Oktober 2014. "
    )

    private val IconPoster = intArrayOf(
        R.drawable.soekarno,
        R.drawable.soeharto,
        R.drawable.habibie,
        R.drawable.gusdur,
        R.drawable.megawati,
        R.drawable.sby,
        R.drawable.jokowi
    )

    val listModelList: ArrayList<ModelList>
    get() {
        val list = arrayListOf<ModelList>()
        for (position in namaPresiden.indices){
            val presiden = ModelList()
            presiden.name = namaPresiden[position]
            presiden.data = deskripsi[position]
            presiden.poster = IconPoster[position]
            list.add(presiden)
        }
        return list
    }
}