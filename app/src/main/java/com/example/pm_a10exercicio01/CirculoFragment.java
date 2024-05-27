package com.example.pm_a10exercicio01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pm_a10exercicio01.controller.CirculoController;
import com.example.pm_a10exercicio01.controller.IGeometria;
import com.example.pm_a10exercicio01.controller.RetanguloController;
import com.example.pm_a10exercicio01.model.Circulo;
import com.example.pm_a10exercicio01.model.Retangulo;

public class CirculoFragment extends Fragment {

    private View view;
    private EditText etRaioCir;
    private Button btnCalAreaCir;
    private Button btnCalPerimetroCir;
    private TextView tvResultado;

    private IGeometria cc = new CirculoController();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_circulo, container, false);
        etRaioCir = view.findViewById(R.id.etRaioCir);
        btnCalAreaCir = view.findViewById(R.id.btnCalAreaCir);
        btnCalPerimetroCir = view.findViewById(R.id.btnCalPerimetroCir);
        tvResultado = view.findViewById(R.id.tvResultado);

        btnCalAreaCir.setOnClickListener(op ->btnArea());
        btnCalPerimetroCir.setOnClickListener(op ->  btnPerimetro());

        return view;
    }

    private void btnPerimetro() {
        Circulo c = new Circulo(Float.parseFloat (etRaioCir.getText().toString()));
        tvResultado.setText(getString(R.string.calPerimetro)+": " +cc.calculaPerimetro(c)+"");
        clear();
    }

    private void btnArea() {
        Circulo c = new Circulo(Float.parseFloat (etRaioCir.getText().toString()));
        tvResultado.setText(getString(R.string.calArea)+": " +cc.calculaArea(c)+"");
        clear();
    }

    private void clear() {
        etRaioCir.setText("");
    }
}