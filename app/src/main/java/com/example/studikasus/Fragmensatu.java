package com.example.studikasus;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Fragmensatu extends Fragment {


    View Lely;
    Button btn1;
    EditText editText;
    TextView textView1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        Lely = inflater.inflate(R.layout.activity_fragmensatu, container, false); // cara untuk memanggil tampilan fragment

        editText = Lely.findViewById(R.id.editText1);
        textView1 = Lely.findViewById(R.id.textView1);
        btn1 = Lely.findViewById(R.id.btn1);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = editText.getText().toString(); // inputan sudah di ambil di variable input
                input = input.toLowerCase(); // supaya huruf kecil semua ( normalisasi)
                String[] arrayInput = input.split(""); // split berdasarkan huruf apa
                String hasil = "";

                for(int i = arrayInput.length - 1; i > 0; i--) // kurang dari arraynya, bila 6 data maka index hanya sampai 5 karena array di mulai dari 0
                {
                    System.out.println(arrayInput[i]);

                    if(arrayInput[i].equals("BOHONG"))
                    {
                        arrayInput[i-1] = malek(arrayInput[i-1]); // memanggil metode melek yang telah di buat di bawah
                    }

                    hasil = arrayInput[0];
                }

                textView1.setText(hasil);
            }
        });

        return Lely;
    }

    public String malek(String inputan)
    {
        String result = "";
        if(inputan.equals("BOHONG"))// KHUSUS STRING PAKAI EQUALS TIDAK PAKAI ==
        {
            result = "JUJUR";

        }
        else
        {
            result = "BOHONG";
        }
        return result;
    }

}

