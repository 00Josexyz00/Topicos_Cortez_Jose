package com.example.deber_1_calculadora;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {


    private EditText et1;
    private TextView et2;
    private TextView tv1;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        et1= (EditText)findViewById(R.id.num1);
        et2= (EditText) findViewById(R.id.num2);
        tv1= (TextView) findViewById(R.id.titulo);



    }

    public void Sumar(View view){
        String valor_1=et1.getText().toString();
        String valor_2=et2.getText().toString();
        int v1= Integer.parseInt(valor_1);
        int v2= Integer.parseInt(valor_2);
        int res=v1+v2;
        String resultado=String.valueOf(res);
        tv1.setText(resultado);

    }
    public void Resta(View view){
        String valor_1=et1.getText().toString();
        String valor_2=et2.getText().toString();
        int v1= Integer.parseInt(valor_1);
        int v2= Integer.parseInt(valor_2);
        int res=v1-v2;
        String resultado=String.valueOf(res);
        tv1.setText(resultado);

    }
    public void Multiplicacion(View view){
        String valor_1=et1.getText().toString();
        String valor_2=et2.getText().toString();
        int v1= Integer.parseInt(valor_1);
        int v2= Integer.parseInt(valor_2);
        int res=v1*v2;
        String resultado=String.valueOf(res);
        tv1.setText(resultado);

    }
    public void division(View view){
        String valor_1=et1.getText().toString();
        String valor_2=et2.getText().toString();
        int v1= Integer.parseInt(valor_1);
        int v2= Integer.parseInt(valor_2);
        if(v2 !=0){
            double res=v1/v2;
            String resultado=String.valueOf(res);
            tv1.setText(resultado);
        }else{
            String res= "La division para cero no está definida";
            tv1.setText(res);
        }


    }

    public void seno(View view){
        String valor_1=et1.getText().toString();
        double v1= Double.parseDouble(valor_1);
        double res =Math.sin(v1);
        String resultado = String.valueOf(res);
        tv1.setText(resultado);
    }
    public void coseno(View view){
        String valor_1=et1.getText().toString();
        double v1= Double.parseDouble(valor_1);
        double res =Math.cos(v1);
        String resultado = String.valueOf(res);
        tv1.setText(resultado);
    }
    public void tangente(View view){
        String valor_1=et1.getText().toString();
        double v1= Double.parseDouble(valor_1);
        double res =Math.tan(v1);
        String resultado = String.valueOf(res);
        tv1.setText(resultado);
    }



}