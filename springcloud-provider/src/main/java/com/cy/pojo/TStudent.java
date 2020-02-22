package com.cy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.sql.DataSource;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TStudent {

  private Integer id;
  private String name;
  private Integer sex;
  private DataSource birthday;

}
