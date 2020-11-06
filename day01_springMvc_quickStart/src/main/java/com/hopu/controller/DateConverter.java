package com.hopu.controller;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateConverter implements Converter<String,Date> {
    //������ʵ���Զ������͵�ת��
    @Override
    public Date convert(String  s) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");
        try {
            return dateFormat.parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;

    }
}
