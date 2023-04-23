package ordering;

public class APIRequest {

    private String header, endPoint, param, restaurantURL, operation;

    public APIRequest(String header, String endPoint, String param, String restaurantURL, String operation){
        this.header = header;
        this.endPoint = endPoint;
        this.param = param;
        this.restaurantURL = restaurantURL;
        this.operation = operation;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getRestaurantURL() {
        return restaurantURL;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setRestaurantURL(String restaurantURL) {
        this.restaurantURL = restaurantURL;
    }

    public String execute(){
        return "";
    }
}
