package cn.virtuepay.serializer;

import cn.virtuepay.model.Transfer;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import cn.virtuepay.model.App;
import cn.virtuepay.model.PaymentRefundCollection;

import java.lang.reflect.Type;

/**
 * Created by sunkai on 15/5/14.
 */
public class TransferDeserializer implements JsonDeserializer<Transfer> {
    @Override
    public Transfer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {

        JsonObject transFerJson = json.getAsJsonObject();
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .registerTypeAdapter(PaymentRefundCollection.class, new PaymentRefundCollectionDeserializer())
                .create();
        JsonElement appElement = transFerJson.get("app");
        Transfer transfer = gson.fromJson(json, Transfer.class);

        if (null != appElement && appElement.isJsonObject()) {
            App app = gson.fromJson(appElement, App.class);
            transfer.setApp(app);
        }
        return transfer;
    }
}
