/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joropies.serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author T-107
 */
public class PersistenciaNominas {
    
    ArrayList<Nomina> nominas;

    public PersistenciaNominas() {
        nominas = new ArrayList<Nomina>();
    }
    
    public void guardar (Nomina nomina) throws Exception {
    
        File file = new File("nominas");
        if (file.exists()) nominas = leerTodo();
        
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        nominas.add(nomina);
        oos.writeObject(oos);
        oos.close();
    
    }
    
    public ArrayList<Nomina> leerTodo() throws Exception {
    
        File file = new File("nominas");
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        
        nominas = (ArrayList<Nomina>) ois.readObject();
        return nominas;
    
    }
    
    public Nomina buscarPorId(int id) throws Exception {
        Nomina n = new Nomina();
        nominas = leerTodo();
        n = nominas.get(id);
        return n;
    }
}

