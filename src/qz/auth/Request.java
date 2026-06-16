package qz.auth;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

public class Request {

    final private JSONObject requestData;
    boolean initialConnect;

    public Request(JSONObject requestData) {
        this.requestData = requestData;
        this.initialConnect = false;
    }

    public JSONObject getRequestData() {
        return requestData;
    }

    public boolean isInitialConnect() {
        return initialConnect;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        try {
            json.put("initial-connect", initialConnect);
        } catch(JSONException ignore) {}

        return json;
    }

}
