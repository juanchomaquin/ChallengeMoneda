
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.net.http.HttpResponse;

public class ConversorApp {
    public static void main(String[] args) throws IOException, InterruptedException  {
        Conversor.eleccionUserMenu();
    }
    public static double obtenerTasa(String urlFinal) throws IOException, InterruptedException {
        //Código omitido
        //Conversión a JSON
        HttpResponse<Object> respuesta = null;
        JsonElement elemento = JsonParser.parseString((String) respuesta.body());
        JsonObject objectRoot = elemento.getAsJsonObject();

        //Accediendo a JsonObject
        double tasa = objectRoot.get("conversion_rate").getAsDouble();
        return tasa;
    }
}
