package com.briup.cms.web.controller;

import com.briup.cms.bean.Link;
import com.briup.cms.service.ILinkService;
import com.briup.cms.util.Message;
import com.briup.cms.util.MessageUtil;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/link")
@Api(description = "链接管理")
public class LinkController {

    @Autowired
    private ILinkService linkService;

    @PostMapping("/add")
    @ApiOperation("添加链接")
    public Message addLink(Link link) {
        linkService.saveOrupdateLink(link);;
       return MessageUtil.success();
    }

    @GetMapping("/delete")
    @ApiOperation("删除链接")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int")
    public Message deleteLink(int id) {
        linkService.deleteLink(id);
        return MessageUtil.success();
    }

    @GetMapping("/query")
    @ApiOperation("查询链接")
    @ApiImplicitParam(name = "id",value = "链接id",paramType = "query",dataType = "int")
    public Message<Link> queryLink(int id) {
        Link link = linkService.queryLinkById(id);
        return MessageUtil.success(link);
    }

    @GetMapping("/update")
    @ApiOperation("更新链接")
    public Message update(Link link) {
        linkService.saveOrupdateLink(link);
        return MessageUtil.success();
    }

    @GetMapping("/getAll")
    @ApiOperation("查询所有链接")
    public Message<List<Link>> getAll() {
        List<Link> links = linkService.getAllLink();
        return MessageUtil.success(links);
    }
}
