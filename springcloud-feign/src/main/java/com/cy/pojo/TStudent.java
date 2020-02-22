package com.cy.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TStudent {

  private long id;
  private String name;
  private long sex;
  private java.sql.Date birthday;

}