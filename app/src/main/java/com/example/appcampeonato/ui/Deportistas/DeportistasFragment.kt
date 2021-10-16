package com.example.appcampeonato.ui.Deportistas


import android.content.ContentValues
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.appcampeonato.R
import com.example.appcampeonato.SQLite
import kotlinx.android.synthetic.main.fragment_deportistas.*


class DeportistasFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)







    }

    fun insertar(view: View ){




        var conexion= SQLite(context,"Campeonato", null,1)
        var baseDatos= conexion.writableDatabase
        var Documento=txtDocumento?.text.toString()
        var Nombres=txtNombres?.text.toString()
        var Apellidos=txtApellidos?.text.toString()
        var Fecha=txtFecha?.text.toString()
        var Email=txtEmail?.text.toString()


        if(Documento.isEmpty()==false && Nombres.isEmpty()==false && Apellidos.isEmpty()==false && Fecha.isEmpty()==false && Email.isEmpty()==false){

            var registro=ContentValues()
            registro.put("Documento",Documento)
            registro.put("Nombres",Nombres)
            registro.put("Apellidos",Apellidos)
            registro.put("Fecha",Fecha)
            registro.put("Email",Email)
            baseDatos.insert("Deportistas",null,registro)

            txtDocumento?.setText("")
            txtNombres?.setText("")
            txtApellidos?.setText("")
            txtFecha?.setText("")
            txtEmail?.setText("")

            Toast.makeText(context,"Registro ingreso correctamente",Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Registro no ingresado",Toast.LENGTH_LONG).show()
        }

    }






    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_deportistas, container, false)
    }


}