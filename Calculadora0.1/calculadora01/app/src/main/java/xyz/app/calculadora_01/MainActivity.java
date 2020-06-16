package xyz.app.calculadora_01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    private boolean punto=true;
    String val1,val2,signo,contenido;
    Double resultado;

    private TextView pantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pantalla=(TextView)findViewById(R.id.pantalla);

    }

    public void Uno(View view){
        pantalla.setText(pantalla.getText().toString()+"1");
    }
    public void Dos(View view){
        pantalla.setText(pantalla.getText().toString()+"2");
    }
    public void Tres(View view){
        pantalla.setText(pantalla.getText().toString()+"3");
    }
    public void Cuatro(View view){
        pantalla.setText(pantalla.getText().toString()+"4");
    }
    public void Cinco(View view){
        pantalla.setText(pantalla.getText().toString()+"5");
    }
    public void Seis(View view){
        pantalla.setText(pantalla.getText().toString()+"6");
    }
    public void Siete(View view){
        pantalla.setText(pantalla.getText().toString()+"7");
    }
    public void Ocho(View view){
        pantalla.setText(pantalla.getText().toString()+"8");
    }
    public void Nueve(View view){
        pantalla.setText(pantalla.getText().toString()+"9");
    }
    public void Cero(View view){
        pantalla.setText(pantalla.getText().toString()+"0");
    }

    public  void Punto(View view){
        String cont = (String) pantalla.getText();
        contenido = String.valueOf(pantalla.getText());
        if (contenido.length()<=0){
            pantalla.setText("0.");
        }else
            if(cont.contains(".")){

            }else{
                pantalla.setText(pantalla.getText()+".");
                punto =false;
            }
    }

    public static String Operaciones(String val1,String val2,String signo){
        Double resultadocalc = 0.0;
        String respuesta="";
        switch (signo){
            case "+":
                resultadocalc=Double.parseDouble(val1)+Double.parseDouble(val2);
                break;
            case "-":
                resultadocalc=Double.parseDouble(val1)-Double.parseDouble(val2);
                break;
            case "*":
                resultadocalc=Double.parseDouble(val1)*Double.parseDouble(val2);
                break;
            case "/":
                if (Double.parseDouble(val2)!=0) {
                    resultadocalc = Double.parseDouble(val1) / Double.parseDouble(val2);
                }else{
                    respuesta = "Division para cero no definida";
                }
                break;
        }
        if (respuesta.equals("Division para cero no definida")) {

        }else{
            respuesta=resultadocalc.toString();
        }
        return respuesta;

    }


    public void Igual(View view){

        String resultadofinal;
        val2= String.valueOf(pantalla.getText());
        if (!val2.equals("")){
            resultadofinal= Operaciones(val1,val2,signo);
            pantalla.setText(resultadofinal);
        }
    }
    public void Sumar(View view){
        if (!pantalla.getText().equals("")){
            val1=String.valueOf(pantalla.getText());
            signo="+";
            pantalla.setText("");
        }

    }
    public void Restar(View view){
        if (!pantalla.getText().equals("")){
            val1=String.valueOf(pantalla.getText());
            signo="-";
            pantalla.setText("");
        }
    }
    public void Multiplicar(View view){
        if (!pantalla.getText().equals("")){
            val1=String.valueOf(pantalla.getText());
            signo="*";
            pantalla.setText("");
        }
    }
    public void Dividir(View view){
        if (!pantalla.getText().equals("")){
            val1=String.valueOf(pantalla.getText());
            signo="/";
            pantalla.setText("");
        }
    }

    public void Borrar(View view){
        contenido = String.valueOf(pantalla.getText());
        if (contenido.length()>0){
            contenido=contenido.substring(0,contenido.length()-1);
            pantalla.setText(contenido);
        }


    }
    public void BorrarTodo(View view){
        pantalla.setText("");
    }



    public void Seno(View view){
        String num= pantalla.getText().toString();
        if (num==""){

        }else{

            double numero = Float.parseFloat(pantalla.getText().toString());
            double respuesta = Math.sin(numero);
            pantalla.setText(Double.toString(respuesta));

        }
    }
    public void Coseno(View view){
        String num= pantalla.getText().toString();
        if (num==""){

        }else{

            double numero = Float.parseFloat(pantalla.getText().toString());
            double respuesta = Math.cos(numero);
            pantalla.setText(Double.toString(respuesta));

        }
    }
    public void Tangente(View view){
        String num= pantalla.getText().toString();
        if (num==""){

        }else{

            double numero = Float.parseFloat(pantalla.getText().toString());
            double respuesta = Math.tan(numero);
            pantalla.setText(Double.toString(respuesta));
        }
    }

}