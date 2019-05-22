package com.tedu.sp01.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor//无参构造
@AllArgsConstructor//全参构造
@Accessors(chain=true)
public class User {
	private Integer id;
	private String username;
	private String password;
}