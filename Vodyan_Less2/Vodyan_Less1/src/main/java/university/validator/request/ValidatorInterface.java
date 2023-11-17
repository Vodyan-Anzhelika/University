package university.validator.request;

import java.util.List;

public interface ValidatorInterface<T> {
    List<String> validate(T request);
}
