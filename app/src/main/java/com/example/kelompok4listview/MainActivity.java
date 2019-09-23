package com.example.kelompok4listview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] laptopNames = {"Asus VivoBook Ultra A412","Asus VivoBook Ultra A412 (Ryzen)","Asus ROG Zephyrus G GA502DU","Asus TUF Gaming FX505 (Ryzen)","Asus ROG Zephyrus S GX531","Asus VivoBook Ultra K403","Asus VivoBook 15 X505ZA-BR511T"};
    String[] laptopHarga = {"Rp.7,559,000","Rp.6.599.000","Rp.20.299.000","Rp.10.299.000","Rp.35.999.000","Rp.8.099.000","Rp.7.680.000"};
    int[] laptopImages = {R.drawable.asus_vivobook_ultra_a412,R.drawable.asus_vivobook_ultra_a412_ryzen_series,R.drawable.asus_rog_zephyrus_g_ga502du,R.drawable.asus_tuf_gaming_fx505_ryzen_series,R.drawable.asus_rog_zephyrus_s_gx531,R.drawable.asus_vivobook_ultra_k403,R.drawable.asus_vivobook_15_x505za_br50t};
    String[] laptopSpesifikasi = {"spesifikasi"};
    String[] laptopProcessor = {"Processor : Intel Core i3-8145U Dual Core @ 2.1 GHz (4M cache, up to @ 3.9 GHz)","Processor : AMD Ryzen 3 3200U Dual Core @ 2.6 GHz (4M cache, up to @ 3.5 GHz)","Processor : AMD Ryzen 7 3750H Quad Core @ 2.3 GHz (4M cache, up to 4.0 GHz)","Processor : AMD Ryzen 5 3550H Quad Core @ 2.1 GHz (4M cache, up to @ 3.7 GHz)","Processor : Intel Core i7-8750H Hexa Core @ 2.2 GHz (9M cache, up to 4.1 GHz)","Processor : Intel Core i3-8145U Dual Core @ 2.1 GHz (4M cache, up to @ 3.9 GHz)","Processor : AMD Ryzen 5 2500U Quad Core @ 2.0 GHz (2M cache, up to @ 3.6 GHz)"};
    String[] laptopRam = {"Ram : 4GB of DDR4","Ram : 4GB of DDR4","Ram : 8GB of DDR4 RAM","Ram : 8GB of DDR4 RAM","Ram : 8GB of DDR4 RAM","Ram : 4GB of DDR4","Ram : 8GB DDR4 RAM"};
    String[] laptopStorage = {"Storage : 512GB M.2 SSD","Storage : 1TB HDD","Storage :  PCIe Gen3 SSD","Storage : 1TB HDD","Storage : 512GB PCIe Gen3 SSD","Storage : 512GB M.2 SSD","Storage : 256GB M.2 SSD"};
    String[] laptopOs = {"Os : Windows 10","Os : Windows 10","Os : Windows 10","Os : Windows 10","Os : Windows 10 pro","Os : Windows 10","Os : Windows 10 Home"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding listview
        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),activity_listdata.class);
                intent.putExtra("name",laptopNames[i]);
                intent.putExtra("image",laptopImages[i]);
                intent.putExtra("processor",laptopProcessor[i]);
                intent.putExtra("ram",laptopRam[i]);
                intent.putExtra("storage",laptopStorage[i]);
                intent.putExtra("os",laptopOs[i]);
                intent.putExtra("harga",laptopHarga[i]);
                intent.putExtra("spesifikasi",laptopSpesifikasi[0]);
                startActivity(intent);

            }
        });
    }

    private class CustomAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return laptopImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.row_data,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.laptop);
            TextView harga = view1.findViewById(R.id.harga);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(laptopNames[i]);
            harga.setText(laptopHarga[i]);
            image.setImageResource(laptopImages[i]);
            return view1;



        }
    }

    public void kelompok(View view) {
        Intent kelompok = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(kelompok);
        finish();
    }
}
