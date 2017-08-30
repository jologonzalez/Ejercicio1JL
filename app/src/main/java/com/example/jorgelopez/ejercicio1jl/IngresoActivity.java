package com.example.jorgelopez.ejercicio1jl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class IngresoActivity extends AppCompatActivity {

    @BindView(R.id.txtNombre)
    EditText txtNombre;

    @BindView(R.id.txtApellido)
    EditText txtApellido;

    @BindView(R.id.txtDireccion)
    EditText txtDireccion;

    @BindView(R.id.txtCorreo)
    EditText txtCorreo;

    @BindView(R.id.btnEnviar)
    Button btnEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingreso);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.btnEnviar)
        public void clickEnviar(){

       // String Nombre = txtNombre.getText().toString();
        String Apellido = txtApellido.getText().toString();
        String Direccion = txtDireccion.getText().toString();
        String Correo = txtCorreo.getText().toString();

        Intent intent = new Intent(IngresoActivity.this, MostrarActivity.class);

        intent.putExtra("nombre",txtNombre.getText().toString());
        intent.putExtra("apellido",Apellido);
        intent.putExtra("direccion",Direccion);
        intent.putExtra("correo",Correo);

        startActivity(intent);

        finish();

    }

}
