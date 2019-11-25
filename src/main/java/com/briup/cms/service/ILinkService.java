package com.briup.cms.service;

import com.briup.cms.bean.Customer;
import com.briup.cms.bean.Link;
import com.briup.cms.exception.CustomerException;

import java.util.List;

public interface ILinkService {

    void  saveOrupdateLink(Link link) throws CustomerException;

    void deleteLink(int id) throws CustomerException;

    Link queryLinkById(int id) throws CustomerException;

    List<Link> getAllLink() throws CustomerException;
}
