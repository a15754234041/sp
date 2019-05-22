package com.tedu.sp01.pojo;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor //无参构造
@AllArgsConstructor	//全参构造
@Accessors(chain=true)
public class Order {
	private String id;
	private User user;
	private List<Item> items;
}