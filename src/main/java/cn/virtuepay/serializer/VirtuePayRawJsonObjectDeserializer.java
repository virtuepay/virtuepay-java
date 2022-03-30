package cn.virtuepay.serializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import cn.virtuepay.model.VirtuePayRawJsonObject;

import java.lang.reflect.Type;

public class VirtuePayRawJsonObjectDeserializer implements JsonDeserializer<VirtuePayRawJsonObject> {
    public VirtuePayRawJsonObject deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context)
            throws JsonParseException {
        VirtuePayRawJsonObject object = new VirtuePayRawJsonObject();
        object.json = json.getAsJsonObject();
        return object;
    }
}
