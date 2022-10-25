package com.example.demo.business;

import com.example.demo.exception.BaseException;
import com.example.demo.exception.UserException;
import com.example.demo.model.MRegisterRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Objects;

@Service
public class TestBusiness {
    public String register(MRegisterRequest request) throws BaseException {
        if (request == null) {
            throw UserException.requestNull();
        }
        //validate.email
        if (Objects.isNull(request.getEmail())) {
            throw UserException.emailNull();
        }
        return "received" + request;
    }

    public String uploadProfilePicture(MultipartFile file){
        if ( file == null){
            // throw error
        }

//        if ( file.getSize() >  )
    }

}
