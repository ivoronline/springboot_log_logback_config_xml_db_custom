package com.ivoronline.springboot_log_logback_config_xml_db_custom.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  //PROPERTIES
  Logger log = LoggerFactory.getLogger(MyController.class);

  //========================================================
  // HELLO
  //========================================================
  @RequestMapping("Hello")
  String hello() {

    //LOG
    log.error("Some error occured");
    log.warn ("Some warn  occured");
    log.info ("Some info  occured");
    log.debug("Some debug occured");
    log.trace("Some trace occured");

    //RETURN
    return "Hello from Controller";

  }

}
