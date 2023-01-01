package com.wisdomleaf.SpeakingClock.impl;

import com.wisdomleaf.SpeakingClock.bean.RequestBean;
import com.wisdomleaf.SpeakingClock.bean.ResponseBean;

public interface SpeakingClockImpl {
    public ResponseBean processTime(RequestBean bean);
}
