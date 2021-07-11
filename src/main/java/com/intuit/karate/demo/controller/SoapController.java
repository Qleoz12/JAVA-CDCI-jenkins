/*
 * The MIT License
 *
 * Copyright 2017 Intuit Inc.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.intuit.karate.demo.controller;

import java.io.InputStream;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author pthomas3
 */
@RestController
@RequestMapping("/soap")
public class SoapController {
    
    @PostMapping
    public String handle(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = soapAction == null ? "soap-1.xml" : "soap-2.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/164")
    public String handleESB164(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_164.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/165")
    public String handleESB165(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_165.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/166")
    public String handleESB166(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_166.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/167")
    public String handleESB167(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_167.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/168")
    public String handleESB168(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_168.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/169")
    public String handleESB169(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_169.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/174")
    public String handleESB174(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_174.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    
    @PostMapping
    @RequestMapping("/esb/services/soap/257")
    public String handleESB257(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_257.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
    @PostMapping
    @RequestMapping("/esb/services/soap/204")
    public String handleESB204(HttpServletRequest request) throws Exception {
        String soapAction = request.getHeader("SOAPAction");
        String filename = "ESB_204.xml";
        InputStream is = getClass().getClassLoader().getResourceAsStream(filename);
        return IOUtils.toString(is, "utf-8");
    }
    
}
