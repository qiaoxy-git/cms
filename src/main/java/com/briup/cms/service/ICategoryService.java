package com.briup.cms.service;

import com.briup.cms.bean.Category;
import com.briup.cms.exception.CustomerException;

public interface ICategoryService {

    void saveOrupateCategory(Category category) throws CustomerException;
}
