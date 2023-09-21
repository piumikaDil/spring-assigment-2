package lk.ijse.assigment.service;

import lk.ijse.assigment.dto.SuperDTO;
import lk.ijse.assigment.response.Response;

public interface SuperService <T extends SuperDTO,ID >{
    Response save(T t);

    Response update(T t);

    Response delete(ID id);

    Response search(ID id);

    Response getAll();

    Response createAndSendResponse(int statusCode, String message, Object data);
}
