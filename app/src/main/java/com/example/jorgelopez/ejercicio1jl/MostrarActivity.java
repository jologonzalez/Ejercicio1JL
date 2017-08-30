package com.example.jorgelopez.ejercicio1jl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MostrarActivity extends AppCompatActivity {

    Bundle bundle;

    String nombre;
    String apellido;
    String direccion;
    String correo;

    TextView textView1;
    TextView textView2;
    TextView textView3;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);

        bundle = getIntent().getExtras();

        textView1 = (TextView)findViewById(R.id.txtVNombre);
        nombre = bundle.getString("nombre");
        textView1.setText(nombre);

        textView2 = (TextView)findViewById(R.id.txtVApellido);
        apellido = bundle.getString("apellido");
        textView2.setText(apellido);

        textView3 = (TextView)findViewById(R.id.txtVDireccion);
        direccion = bundle.getString("direccion");
        textView3.setText(direccion);

        textView4 = (TextView)findViewById(R.id.txtVCorreo);
        correo = bundle.getString("correo");
        textView4.setText(correo);
    }
}
