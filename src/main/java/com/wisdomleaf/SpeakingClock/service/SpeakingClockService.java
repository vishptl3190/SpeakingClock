package com.wisdomleaf.SpeakingClock.service;

import com.wisdomleaf.SpeakingClock.bean.RequestBean;
import com.wisdomleaf.SpeakingClock.bean.ResponseBean;
import com.wisdomleaf.SpeakingClock.impl.SpeakingClockImpl;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class SpeakingClockService implements SpeakingClockImpl {

    @Override
    public ResponseBean processTime(RequestBean bean) {
        ResponseBean respBean = new ResponseBean();

        try {

            if (bean.getInput_time() == null) {
                respBean.setErrorCode(100);
                respBean.setErrorMessage("Input is null, please enter proper time.");
                return respBean;
            } else {
                String timealpha[] = {"zero", "one", "two", "three", "four",
                        "five", "six", "seven", "eight", "nine",
                        "ten", "eleven", "twelve", "thirteen",
                        "fourteen", "fifteen", "sixteen", "seventeen",
                        "eighteen", "nineteen", "twenty", "twenty one",
                        "twenty two", "twenty three", "twenty four",
                        "twenty five", "twenty six", "twenty seven",
                        "twenty eight", "twenty nine", "thirty", "thirty one",
                        "thirty two", "thirty three", "thirty four", "thirty five", "thirty six",
                        "thirty seven", "thirty eight", "thirty nine", "forty", "forty one",
                        "forty two", "forty three", "forty four", "forty five", "forty six",
                        "forty seven", "forty eight", "forty nine", "fifty", "fifty one",
                        "fifty two", "fifty three", "fifty four", "fifty five", "fifty six",
                        "fifty seven", "fifty eight", "fifty nine"
                };

                int hh, mm;

                String ampm;

                String hour = null, minute = null;

                String dayCalc;

                String response;

                hh = Integer.parseInt(bean.getInput_time().split(":")[0]);
                mm = Integer.parseInt(bean.getInput_time().split(":")[1]);
                ampm = bean.getInput_time().split(":")[2];

                if (hh > 0 || hh <= 24) {
                    hour = timealpha[hh];
                }

                if (mm > 0 || mm < 60) {
                    minute = timealpha[mm];
                }

                if (ampm.equalsIgnoreCase("am")) {
                    dayCalc = "MidNight";
                } else {
                    dayCalc = "MidDay";
                }

                response = "It's " + hour + " " + minute + " and it's a " + dayCalc;

                respBean.setMessage(response);
                respBean.setErrorCode(200);
                respBean.setErrorMessage("null");
            }
        }
        catch (Exception ex){
            respBean.setErrorCode(100);
            respBean.setErrorMessage(ex.getMessage());
            return respBean;
        }

        return respBean;
    }
}
