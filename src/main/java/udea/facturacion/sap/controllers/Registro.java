package udea.facturacion.sap.controllers;

import com.google.gson.Gson;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import udea.facturacion.sap.infraestructura.Publicador;
import udea.facturacion.sap.modelo.DtoFactura;
import udea.facturacion.sap.modelo.DtoRegistroSap;

public class Registro {
    private static final Logger logger = LogManager.getLogger(Registro.class);
    private static Publicador publicador = new Publicador();

    public static void crear(DtoFactura factura){
        logger.info("Ingresa Factura");
        String codigoSap = "CF-"+Long.toHexString(System.currentTimeMillis());
        DtoRegistroSap registroSap = new DtoRegistroSap(codigoSap);
        registroSap.setNumeroFactura(factura.getNumeroFactura());
        registroSap.setValorTotal(factura.getValorTotal());
        registroSap.setIdCliente(factura.getIdCliente());
        logger.info("Se contabilizada Factura \n{"+registroSap.toString()+"}");
        publicador.publicarMensajeAsync("facturacion.contabilizada", "", new Gson().toJson(factura));
        logger.info("Factura contabilizada envianda a BI y Compras");
    }
}
