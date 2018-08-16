package udea.facturacion.sap.controllers;

import udea.facturacion.sap.infraestructura.Publicador;

public class Registro {

    Publicador publicador = new Publicador();

    public void crear(String message){
        publicador.publicarMensaje("facturacion.contabilizada", "", message);
    }
}
