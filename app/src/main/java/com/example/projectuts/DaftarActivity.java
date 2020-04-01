package com.example.projectuts;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.projectuts.Adapter.VapeAdapter;
import com.example.projectuts.Model.Choice;

import java.util.ArrayList;
import java.util.List;

public class DaftarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar);
        RecyclerView teamsView = findViewById(R.id.recyclerView);

        List<Choice> teams = new ArrayList<>();
        teams.add(new Choice("https://cdn.shopify.com/s/files/1/0880/2392/products/HEXOHM---V3.0-Powder-Coated-Mod-BLACK_grande.jpg?v=1550849162",
                "HEXOHM V3.0", "MOD SYSTEM", "Harga: Rp.3.200.000,-",
                "Ukuran: 41,2x31,5x128,9mm", "Output: 5 - 180W or 3.0 - 6.0V", "Resistance: 0.1 Ohm",
                "Bahan: Alumunium","Fitur: Chipset Yang Kuat Untuk Pemakaian Jangka Panjang, No Delay Delay Club, Garansi Lifetime VapeZoo"));
        teams.add(new Choice("https://cf.shopee.co.id/file/9a4c41b135d50314129ab60c31970dec",
                "DRUGA FOXY", "MOD SYSTEM", "Harga: Rp.650.000,-",
                "Ukuran: 49x26x9,3mm", "Output: 5 - 150W or 0.5 - 6.5V", "Resistance: 0.05 - 3.0 Ohm",
                "Bahan: Zinc Alloy","Fitur: Mode VV/VW Quick Release System, OLED Screen"));
        teams.add(new Choice("https://i.pinimg.com/originals/e5/77/48/e57748d446972d192a449300dfc3f43d.jpg",
                "AEGIS X", "MOD SYSTEM", "Harga: Rp.700.000,-",
                "Ukuran: 41,2x31,5x128,9mm", "Output: 5 - 200W or 0.1 - 12V", "Resistance: 0.05 - 3.0 Ohm",
                "Bahan: Zinc Alumunium dan LSR(Light Silicone Rubber) Pada Bodynya","Fitur: Power Mode, Tahan Banting dan Tahan Air, "));
        teams.add(new Choice("https://s4.bukalapak.com/img/9124678012/w-1000/Vape_Hotcig_R233_Authentic_Produk_Tahan_Air.jpg",
                "HOTCIG R233", "MOD SYSTEM", "Harga: Rp.490.000,-",
                "Ukuran: 55x25x90mm", "Output: 10 - 233W or 1.0 - 7.5V", "Resistance: 0.1 - 3.0 Ohm",
                "Bahan: Alumunium Alloy","Fitur: Chipset Yang Tahan Air, No Delay Delay Club, Power Extream"));
        teams.add(new Choice("https://cf.shopee.co.id/file/c2f26368f61a194b02bc6486162a8c28",
                "DRAG 2 PLATINUM KIT", "MOD SYSTEM", "Harga: Rp.950.000,-",
                "Ukuran: 51x26,5x88,3mm", "Output: 5 - 177W or 0 - 7.5V", "Resistance: 0.5 - 5.0 Ohm",
                "Bahan: Zinc Alloy Resin","Fitur: Chipset FIT GENE Memberikan Power Kuat dan Proteksi, Terdapat TC Mode, Dapat RTA Dalam Paket Pembelian"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/10/14/24058066/24058066_0834fec5-8a37-4f63-9df2-048645e4631f_700_700",
                "VINCI 40W",
                "POD/MOD SYSTEM",
                "Harga: Rp.380.000,-","Ukuran: 25,3x25,3x104mm","Output: 5-40W","Resistance: 0.1 - 3.0 Ohm",
                "Bahan: Aluminum Alloy & Plastic Chassis","Fitur: Batrai Tanam 1500mAh, Mode Auto&Puff, Menggunakan Chipset GENE AI, Catride 5,5ML, Suport Fast Charging"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/9/10/6374867/6374867_e1e7d769-aa5e-4e26-b619-1d083f284f1a_700_700.jpg",
                "SMOK RPM40 KIT","POD/MOD SYSTEM",
                "Harga: Rp.350.000,-","Ukuran: 25x25x99mm","Output: 1-40W","Resistance: 0.2 - 2.50 Ohm",
                "Bahan: Aluminum Alloy & Plastic Chassis","Fitur: Batrai Tanam 1500mAh, Kompatibel Dengan Coil Smok Nord 0.6 Ohm, Catride 4,3ML, Suport Fast Charging"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/10/30/6490519/6490519_276dfc98-ec0c-40d3-9fd8-f271c877a102_1080_1080.jpg",
                "XCALIBUR","POD SYSTEM",
                "Harga: Rp.260.000,-","Ukuran: 20x10x115mm","Output: 1-40W","Resistance: 1.1 Ohm",
                "Bahan: Alumunium Alloy","Fitur: Batrai Tanam 450mAh, Real Flavour Dari Liquid Yang Digunakan, 3-5 Kali Refile, Catride 2ML"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/8/6/7296905/7296905_0fc7e4e0-4426-43ad-8f83-76e38f201526_1080_1080",
                "iSWTCH","POD SYSTEM",
                "Harga: Rp.240.000,-","Ukuran: 98x18mm","Output: 3.2V, 3.4V, 3.6V","Resistance: 1.1 Ohm",
                "Bahan: Alumunium+PCTG","Fitur: Batrai Tanam 550mAh, 3 Mode Power, Catride 1,8ML, Cocok Untuk Pengalihan Rokok Ke Vape"));
        teams.add(new Choice("https://inkuiri.net/i/large/https%2Fimagerouter.tokopedia.com%2Fimg%2F700%2Fproduct-1%2F2019%2F10%2F9%2F543932628%2F543932628_7654fd21-ac4b-4f23-8f24-8fb14dde9653_640_640.jpg",
                "OATDRIPS V1",
                "LIQUID",
                "Harga: Rp.185.000,-","Rasa: Oat Cereal","Komposisi: VG70/PG30","Nicotim: 3/6MG","Kapasitas: 100ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://cf.shopee.co.id/file/2c0ab3080df2a10aa2f907f956357780",
                "AMERICAN BREAKFAST V1",
                "LIQUID",
                "Harga: Rp.185.000,-","Rasa: Cornflake Cereal","Komposisi: VG70/PG30","Nicotim: 3/6MG","Kapasitas: 100ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2020/2/26/587643/587643_acd80330-d1ed-44cf-8ba8-471b06ac2552_579_579.jpg",
                "ECOO FREEBASE",
                "LIQUID",
                "Harga: Rp.100.000,-","Rasa: Crest, Mango Lassy, Melon Beegee ","Komposisi: VG50/PG50","Nicotim: 3MG","Kapasitas: 60ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://d1d8o7q9jg8pjk.cloudfront.net/p/lg_5e50c73659d34.jpg",
                "SATYR",
                "LIQUID",
                "Harga: Rp.160.000,-","Rasa: Macchiato Ice Cream","Komposisi: VG70/PG30","Nicotim: 3/6MG","Kapasitas: 60ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2020/2/14/8864710/8864710_0c71e56b-0431-4314-b6bd-3ec0ebce797c_700_700",
                "BUKAN LIQUID KW",
                "LIQUID",
                "Harga: Rp.130.000,-","Rasa: Anggur Merah Dingin","Komposisi: VG60/PG40","Nicotim: 3MG","Kapasitas: 60ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://scontent-yyz1-1.cdninstagram.com/v/t51.2885-15/sh0.08/e35/s640x640/75601584_466939773962842_5998074090962848196_n.jpg?_nc_ht=scontent-yyz1-1.cdninstagram.com&_nc_cat=110&_nc_ohc=rl-c-eCZL80AX9xbbtz&oh=42bb143400c1052e6d9ee0e5dcd7f9ce&oe=5E941011",
                "LUNAR HEXOHM",
                "LIQUID",
                "Harga: Rp.160.000,-","Rasa: Strawberry Cheesecake","Komposisi: VG60/PG40","Nicotim: 3MG","Kapasitas: 60ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://cf.shopee.co.id/file/7b7ff75baca26220f47e34e079c80e33",
                "HERMES",
                "LIQUID",
                "Harga: Rp.150.000,-","Rasa: Banana Cornflake","Komposisi: VG40/PG60","Nicotim: 3/6MG","Kapasitas: 60ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/7/7/41315395/41315395_5ec132b2-0cf4-45e6-8a6c-7ebb58fb3096_700_700",
                "ALA CARTE ALL VARIAN",
                "LIQUID",
                "Harga: Rp.185.000,-","Rasa: Merah-Cream Biscuit, Hitam-Cream Pundcake, Putih-Cream Custard, Kuning-Cream Banana","Komposisi: VG70/PG30","Nicotim: 3/6MG","Kapasitas: 100ML","Jenis Liquid: Freebase"));
        teams.add(new Choice("https://cf.shopee.co.id/file/540781bbd586f1e7c814854b4361a8f7",
                "REAL SALTNIC",
                "LIQUID",
                "Harga: Rp.160.000,-","Rasa: Vanilla Gelato","Komposisi: VG50/PG50","Nicotim: 25MG","Kapasitas: 30ML","Jenis Liquid: Saltnic"));
        teams.add(new Choice("https://cf.shopee.co.id/file/529a9600cdf95827d3a095f4abd9db12",
                "ECOO SALT",
                "LIQUID",
                "Harga: Rp.75.000,-","Rasa: Crest, Mango Lassy, Melon Beegee","Komposisi: VG50/PG50","Nicotim: 20MG","Kapasitas: 15ML","Jenis Liquid: Saltnic"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/product-1/2019/11/11/80799408/80799408_acef769f-0691-4f0f-b4e8-7a2dc48657ec_682_682.jpg",
                "BLUNANARILLA",
                "LIQUID",
                "Harga: Rp.95.000,-","Rasa: Blueberry Banana Smoothies","Komposisi: VG50/PG50","Nicotim: 25MG","Kapasitas: 30ML","Jenis Liquid: Saltnic"));
        teams.add(new Choice("https://ecs7.tokopedia.net/img/cache/700/attachment/2019/9/12/156829603215494/156829603215494_a1b76d25-baf3-4b7f-9062-aab677e6a9f9.png",
                "NOCLOUD",
                "LIQUID",
                "Harga: Rp.60.000,-","Rasa: Freezy Grape","Komposisi: VG40/PG60","Nicotim: 30MG","Kapasitas: 15ML","Jenis Liquid: Saltnic"));


        VapeAdapter adapter = new VapeAdapter(this, teams);
        teamsView.setAdapter(adapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        teamsView.setLayoutManager(layoutManager);
    }
}
