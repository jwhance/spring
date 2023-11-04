package com.example.spring.service;

import org.springframework.stereotype.Service;
import org.webservicesoap.birthday.GetAgeResponse;
import org.webservicesoap.birthday.GetBirthdayRequest;

import com.example.spring.dao.RequestSystemIdDao;
import com.example.spring.entity.RequestSystemId;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
import java.util.List;

@Service
public class BirthdayService {
    public GetAgeResponse age(GetBirthdayRequest request){
        GetAgeResponse getAgeResponse = new GetAgeResponse();
        if(validateDay(request) && validateMonth(request) && validateYear(request)) {
            getAgeResponse.setAge(getAge(request.getDay(), request.getMonth(), request.getYear()));

            RequestSystemIdDao requestSystemIdDao = new RequestSystemIdDao();
            List<RequestSystemId> requestSystemIds = requestSystemIdDao.getRequestSystemIds();

            if (requestSystemIds.size() > 0) {
                getAgeResponse.setRequestSystemInfo(requestSystemIds.get(0).toString());
            } else {
                getAgeResponse.setRequestSystemInfo("None found");
            }

            RequestSystemId requestSystemId = new RequestSystemId();
            requestSystemId.setCreateTimestamp(new Date(System.currentTimeMillis()));
            requestSystemId.setCreateId("JOE");
            requestSystemId.setUpdateTimestamp(new Date(System.currentTimeMillis()));
            requestSystemId.setUpdateId("JOE");
            requestSystemId.setSystemName("HibernateSystemCreated");
            requestSystemId.setEmailAddrText("jwh20@hotmail.com");

            requestSystemIdDao.saveRequestSystemId(requestSystemId);


        }
        return getAgeResponse;
    }

    public boolean validateDay(GetBirthdayRequest request) {
        return request.getDay() > 0 && request.getDay() <= 31;
    }

    public boolean validateMonth(GetBirthdayRequest request) {
        return request.getMonth() > 0 && request.getMonth() <= 12;
    }

    public boolean validateYear(GetBirthdayRequest request) {
        return request.getYear() >= 1920 && request.getYear() <= LocalDate.now().getYear();
    }

    public int getAge(int day, int month, int year) {
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);

        Period period = Period.between(birthday, today);
        return period.getYears();
    }
}
