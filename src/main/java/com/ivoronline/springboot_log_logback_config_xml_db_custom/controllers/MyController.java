package com.ivoronline.springboot_log_logback_config_xml_db_custom.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

  Logger log = LoggerFactory.getLogger(MyController.class);

  @ResponseBody
  @RequestMapping("/Hello")
  public String hello() {
    log.error("Some error occured");
    log.warn ("Some warn  occured");
    log.info ("Some info  occured");
    log.debug("Some debug occured");
    log.trace("Some trace occured");
    return "Hello from Controller";
  }

}
