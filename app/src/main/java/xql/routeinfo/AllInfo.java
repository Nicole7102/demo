package xql.routeinfo;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

public class AllInfo implements Serializable{
    HashMap<String ,DayInfo> map = new HashMap<String ,DayInfo>();
                                                                                                         //timea是时间 x年x月x日
    public void addDayRouteList(String time, DayInfo dayInfo){
        map.put(time,dayInfo);
    }

    public DayInfo getDayRouteList(String time){
        return map.get(time);
    }
}
