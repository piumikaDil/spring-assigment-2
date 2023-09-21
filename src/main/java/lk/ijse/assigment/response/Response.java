package lk.ijse.assigment.response;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Component
public class Response {
    private int statusCode;
    private String message;
    private Object data;
}
