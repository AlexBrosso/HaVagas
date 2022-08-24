package com.projeto.havagas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.Toast;

import com.projeto.havagas.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding activityMainBinding;
    private Formulario formulario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(activityMainBinding.getRoot());

        activityMainBinding.salvarBt.setOnClickListener(view -> { SalvarForm(); });

        activityMainBinding.limparBt.setOnClickListener(view -> { LimparForm(); });

        activityMainBinding.celularCb.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (activityMainBinding.celularCb.isChecked()) activityMainBinding.celularEt.setVisibility(View.VISIBLE);
                else activityMainBinding.celularEt.setVisibility(View.GONE);
            }
        });

        activityMainBinding.formacaoSp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                activityMainBinding.anoFundamentalEt.setVisibility(View.GONE);
                activityMainBinding.anoMedioEt.setVisibility(View.GONE);
                activityMainBinding.graduacaoll.setVisibility(View.GONE);
                activityMainBinding.especializacaoll.setVisibility(View.GONE);
                activityMainBinding.mestradoll.setVisibility(View.GONE);
                activityMainBinding.doutoradoll.setVisibility(View.GONE);

                if (position == 0){
                    activityMainBinding.anoFundamentalEt.setVisibility(View.VISIBLE);
                } else if (position == 1) {
                    activityMainBinding.anoMedioEt.setVisibility(View.VISIBLE);
                } else if (position == 2) {
                    activityMainBinding.graduacaoll.setVisibility(View.VISIBLE);
                } else if (position == 3) {
                    activityMainBinding.especializacaoll.setVisibility(View.VISIBLE);
                } else if (position == 4) {
                    activityMainBinding.mestradoll.setVisibility(View.VISIBLE);
                } else if (position == 5) {
                    activityMainBinding.doutoradoll.setVisibility(View.VISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private void LimparForm(){
        activityMainBinding.nomeEt.setText("");
        activityMainBinding.emailEt.setText("");
        activityMainBinding.emailCb.setChecked(false);
        activityMainBinding.telefoneEt.setText("");
        activityMainBinding.telefoneSp.setSelection(0);
        activityMainBinding.celularEt.setText("");
        activityMainBinding.celularCb.setChecked(false);
        activityMainBinding.masculinoRb.setChecked(true);
        activityMainBinding.dataEt.setText("");
        activityMainBinding.formacaoSp.setSelection(0);
        activityMainBinding.vagaEt.setText("");

        activityMainBinding.anoFundamentalEt.setText("");
        activityMainBinding.anoDoutoradoEt.setText("");
        activityMainBinding.anoEspecializacaoEt.setText("");
        activityMainBinding.anoMedioEt.setText("");
        activityMainBinding.anoMestradoEt.setText("");
        activityMainBinding.anoGraduacaoEt.setText("");

        activityMainBinding.instDoutoradoEt.setText("");
        activityMainBinding.instEspecializacaoEt.setText("");
        activityMainBinding.instGraduacaoEt.setText("");
        activityMainBinding.instMestradoEt.setText("");

        activityMainBinding.monoDoutoradoEt.setText("");
        activityMainBinding.monoMestradoEt.setText("");

        activityMainBinding.orientDoutoradoEt.setText("");
        activityMainBinding.orientMestradoEt.setText("");
        formulario = null;
    }

    private void SalvarForm() {
        String emailCb = "Não receber atualizações e oportunidades.";
        String tipoSp = "Comercial";
        String sexo = "Masculino";

        if(activityMainBinding.emailCb.isChecked()) emailCb = "Receber atualizações e oportunidades.";
        if(activityMainBinding.telefoneSp.getSelectedItemPosition() == 1) tipoSp = "Residencial";
        if(activityMainBinding.femininoRb.isChecked()) sexo = "Feminino";

        formulario = new Formulario(activityMainBinding.nomeEt.getText().toString(), activityMainBinding.emailEt.getText().toString(), emailCb, activityMainBinding.telefoneEt.getText().toString(),
                                    tipoSp, activityMainBinding.celularEt.getText().toString(), sexo, activityMainBinding.dataEt.getText().toString(), activityMainBinding.anoFundamentalEt.getText().toString(),
                                    activityMainBinding.anoMedioEt.getText().toString(), activityMainBinding.anoGraduacaoEt.getText().toString(), activityMainBinding.instGraduacaoEt.getText().toString(),
                                    activityMainBinding.anoEspecializacaoEt.getText().toString(), activityMainBinding.instEspecializacaoEt.getText().toString(), activityMainBinding.anoMestradoEt.getText().toString(),
                                    activityMainBinding.instMestradoEt.getText().toString(), activityMainBinding.monoMestradoEt.getText().toString(), activityMainBinding.orientMestradoEt.getText().toString(),
                                    activityMainBinding.anoDoutoradoEt.getText().toString(), activityMainBinding.instDoutoradoEt.getText().toString(), activityMainBinding.monoDoutoradoEt.getText().toString(),
                                    activityMainBinding.orientDoutoradoEt.getText().toString(), activityMainBinding.vagaEt.getText().toString());

        Toast.makeText(this, formulario.toString(), Toast.LENGTH_LONG).show();

    }
}