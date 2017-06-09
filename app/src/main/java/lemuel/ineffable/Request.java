package lemuel.ineffable;

/**
 * Created by lemuel on 2017/6/9.
 */

public class Request {

    public enum RequestMethod {
        GET, POST, PUT, DELEATE
    }
    public ICallback callback;
    public String content;
    public String url;
    public RequestMethod method;

    public void setCallback(ICallback callback) {
        this.callback = callback;
    }

    public Request(String url, RequestMethod method) {
        this.url = url;
        this.method = method;
    }

    public Request(String url) {
        this.url = url;
        this.method = RequestMethod.GET;
    }

}
