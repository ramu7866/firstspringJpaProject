package com.twg.springboot.service;
import java.util.List;

import com.twg.springboot.entity.Newtable;
public interface NewtableService{
      public Newtable saveNewtable(Newtable newtable);
      public Newtable updateNewtable(Newtable newtable);
      public void deleteNewtable(Newtable newtable);
      public Newtable findById(long id);
      public List<Newtable>findAll();
      
      
            
}
