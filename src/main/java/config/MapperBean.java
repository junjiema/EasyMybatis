package config;

import lombok.Data;

import java.util.List;

@Data
public class MapperBean {

    //接口名
    private String interfaceName;

    //接口下所有方法
    private List<Function> list;

}
