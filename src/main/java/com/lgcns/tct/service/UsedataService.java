package com.lgcns.tct.service;

import org.apache.ibatis.annotations.Param;

import com.lgcns.tct.dto.UsedListDto;
import com.lgcns.tct.dto.UsedataDto;
import java.util.*;

public interface UsedataService {

    public UsedataDto getUseData(@Param("user_no")String user_no, @Param("start_dt")String start_dt);

    public List<UsedListDto> getUsedList(@Param("user_no")String user_no, @Param("start_dt")String start_dt);
}
