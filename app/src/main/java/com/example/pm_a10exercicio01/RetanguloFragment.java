package com.example.pm_a10exercicio01;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.pm_a10exercicio01.controller.RetanguloController;
import com.example.pm_a10exercicio01.model.Circulo;
import com.example.pm_a10exercicio01.model.Retangulo;


public class RetanguloFragment extends Fragment {

    private View view;
    private EditText etAlturaRet;
    private EditText etBaseRet;
    private Button btnCalAreaRet;
    private Button btnCalPerimetroRet;
    private TextView tvResultado;
    private RetanguloController rc = new RetanguloController();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_retangulo, container, false);
        etAlturaRet = view.findViewById(R.id.etAlturaRet);
        etBaseRet = view.findViewById(R.id.etBaseRet);
        btnCalAreaRet = view.findViewById(R.id.btnCalAreaRet);
        btnCalPerimetroRet = view.findViewById(R.id.btnCalcPerimetroRet);
        tvResultado = view.findViewById(R.id.tvResultadoRet);

        btnCalAreaRet.setOnClickListener(op ->btnArea());
        btnCalPerimetroRet.setOnClickListener(op ->  btnPerimetro());

        return view;
    }

    private void btnPerimetro() {
        Retangulo r = new Retangulo(
                Float.parseFloat (etAlturaRet.getText().toString()),
                Float.parseFloat(etBaseRet.getText().toString())
        );
        tvResultado.setText(getString(R.string.calPerimetro)+": " +rc.calculaPerimetro(r));
        clear();
    }

    private void btnArea() {
        Retangulo r = new Retangulo(
                Float.parseFloat (etAlturaRet.getText().toString()),
                Float.parseFloat(etBaseRet.getText().toString())
        );
        tvResultado.setText(getString(R.string.calArea)+": " +rc.calculaArea(r));
        clear();
    }

    private void clear() {
        etAlturaRet.setText("");
        etBaseRet.setText("");
    }


}