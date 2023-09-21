package lk.ijse.assigment.service.impl;
//Author : Piumika Dilshan
//Connect : piumikadil@gmail.com

import lk.ijse.assigment.dto.ProjectDTO;
import lk.ijse.assigment.response.Response;
import lk.ijse.assigment.service.ProjectService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class ProjectServiceImpl implements ProjectService {

    @Override
    public Response save(ProjectDTO projectDTO) {
        return null;
    }

    @Override
    public Response update(ProjectDTO projectDTO) {
        return null;
    }

    @Override
    public Response delete(String s) {
        return null;
    }

    @Override
    public Response search(String s) {
        return null;
    }

    @Override
    public Response getAll() {
        return null;
    }

    @Override
    public Response createAndSendResponse(int statusCode, String message, Object data) {
        return null;
    }
}
