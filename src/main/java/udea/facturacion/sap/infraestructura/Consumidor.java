package udea.facturacion.sap.infraestructura;

import com.google.gson.Gson;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Component;
import udea.facturacion.sap.controllers.Registro;
import udea.facturacion.sap.modelo.DtoFactura;

@Component
public class Consumidor implements MessageListener {

    @Override
    public void onMessage(Message message) {
        Gson gson = new Gson();
        DtoFactura factura = gson.fromJson(new String(message.getBody()), DtoFactura.class);
        Registro.crear(factura);
    }
}