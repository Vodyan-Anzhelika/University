package university.response;

public class ResponseEntity<T> {
    private int httpStatus;
    private T body;

    public ResponseEntity(int httpStatus, T body) {
        this.httpStatus = httpStatus;
        this.body = body;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public T getBody() {
        return body;
    }
}
//проверка http
