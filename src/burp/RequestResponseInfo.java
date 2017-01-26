package burp;

import java.net.URL;
import java.util.List;

/**
 * Created by fengxuan on 17/1/26.
 */
public class RequestResponseInfo {

    public IHttpRequestResponse RequestResponseInfo;
    public IRequestInfo analyzedReq;
    public String FullResponse;

    public RequestResponseInfo(IExtensionHelpers helpers,IHttpRequestResponse RequestResponseInfo){
        analyzedReq = helpers.analyzeRequest(RequestResponseInfo);
        FullResponse = new String(RequestResponseInfo.getRequest());

    }

    public String getMethod(){
        return analyzedReq.getMethod();
    }


    public String getBody(){
        return FullResponse.substring(analyzedReq.getBodyOffset());
    }

    public URL getUrl(){
        return analyzedReq.getUrl();
    }

}
