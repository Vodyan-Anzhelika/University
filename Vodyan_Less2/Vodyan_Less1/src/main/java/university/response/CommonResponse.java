package university.response;

import java.util.List;

public class CommonResponse<T> {
    private boolean ok;
    private T data;
    private int codeError;
    private String errorMessage;
    private List<String> details;

    public CommonResponse(T data) {
        this.ok = true;
        this.data = data;
    }//без ошибок

    public CommonResponse(int codeError, String errorMessage, List<String> details) {
        this.ok = false;
        this.codeError = codeError;
        this.errorMessage = errorMessage;
        this.details = details;
    }//ошибки

    public boolean isOk() {
        return ok;
    }

    public T getData() {
        return data;
    }

    public int getCodeError() {
        return codeError;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public List<String> getDetails() {
        return details;
    }
}
//подробная инфа о http
