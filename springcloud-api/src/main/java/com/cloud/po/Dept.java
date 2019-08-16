package com.cloud.po;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @program: springcloud
 * @author: yjf
 * @create: 2019-08-16 08:07
 **/
@Data
@Accessors(chain = true)
public class Dept implements Serializable{
    private Long dept_no;
    private String dept_name;
    private String db_source;

}
