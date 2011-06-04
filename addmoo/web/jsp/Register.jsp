<%-- 
    Document   : Register
    Created on : Dec 16, 2010, 4:24:08 PM
    Author     : Sachi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib  uri="http://struts.apache.org/tags-html"  prefix="html"%>
<%@ taglib  uri="http://struts.apache.org/tags-bean"  prefix="bean"%>
<%@ taglib  uri="http://struts.apache.org/tags-logic" prefix="logic"%>
<%@ taglib  uri="http://java.sun.com/jstl/core_rt"    prefix="c"%>

<html:html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register Page</title>
        <style type="text/css">
            *{
                margin:0px;
                padding:0px;
            }
            body{
                color:#444444;
                font-size:13px;
                background: #f2f2f2;
                font-family:"Century Gothic", Helvetica, sans-serif;
            }
            #content{
                margin:15px auto;
                text-align:center;
                width:600px;
                position:relative;
                height:100%;
            }
            #wrapper{
                -moz-box-shadow:0px 0px 3px #aaa;
                -webkit-box-shadow:0px 0px 3px #aaa;
                box-shadow:0px 0px 3px #aaa;
                -moz-border-radius:10px;
                -webkit-border-radius:10px;
                border-radius:10px;
                border:2px solid #fff;
                background-color:#f9f9f9;
                width:600px;
                overflow:hidden;
            }
            #steps{
                width:600px;
                /*height:320px;*/
                overflow:hidden;
            }
            .step{
                float:left;
                width:600px;
                /*height:320px;*/
            }
            #steps form fieldset{
                border:none;
                padding-bottom:20px;
            }
            #steps form legend{
                text-align:left;
                background-color:#f0f0f0;
                color:#666;
                font-size:24px;
                text-shadow:1px 1px 1px #fff;
                font-weight:bold;
                float:left;
                width:590px;
                padding:5px 0px 5px 10px;
                margin:10px 0px;
                border-bottom:1px solid #fff;
                border-top:1px solid #d9d9d9;
            }
            #steps form p{
                float:left;
                clear:both;
                margin:5px 0px;
                background-color:#f4f4f4;
                border:1px solid #fff;
                width:400px;
                padding:10px;
                margin-left:100px;
                -moz-border-radius: 5px;
                -webkit-border-radius: 5px;
                border-radius: 5px;
                -moz-box-shadow:0px 0px 3px #aaa;
                -webkit-box-shadow:0px 0px 3px #aaa;
                box-shadow:0px 0px 3px #aaa;
            }
            #steps form p label{
                width:160px;
                float:left;
                text-align:right;
                margin-right:15px;
                line-height:26px;
                color:#666;
                text-shadow:1px 1px 1px #fff;
                font-weight:bold;
            }
            #steps form input:not([type=radio]),
            #steps form textarea,
            #steps form select{
                background: #ffffff;
                border: 1px solid #ddd;
                -moz-border-radius: 3px;
                -webkit-border-radius: 3px;
                border-radius: 3px;
                outline: none;
                padding: 5px;
                width: 200px;
                float:left;
            }
            #steps form input:focus{
                -moz-box-shadow:0px 0px 3px #aaa;
                -webkit-box-shadow:0px 0px 3px #aaa;
                box-shadow:0px 0px 3px #aaa;
                background-color:#FFFEEF;
            }
            #steps form p.submit{
                background:none;
                border:none;
                -moz-box-shadow:none;
                -webkit-box-shadow:none;
                box-shadow:none;
            }
            #steps form button {
                border:none;
                outline:none;
                -moz-border-radius: 10px;
                -webkit-border-radius: 10px;
                border-radius: 10px;
                color: #ffffff;
                display: block;
                cursor:pointer;
                margin: 0px auto;
                clear:both;
                padding: 7px 25px;
                text-shadow: 0 1px 1px #777;
                font-weight:bold;
                font-family:"Century Gothic", Helvetica, sans-serif;
                font-size:22px;
                -moz-box-shadow:0px 0px 3px #aaa;
                -webkit-box-shadow:0px 0px 3px #aaa;
                box-shadow:0px 0px 3px #aaa;
                background:#4797ED;
            }
            #steps form button:hover {
                background:#d8d8d8;
                color:#666;
                text-shadow:1px 1px 1px #fff;
            }
        </style>
    </head>
    <body>
        <div id="content"
             <div id="wrapper">
                <div id="steps">
                    <html:form action="/signin" styleId="loginform">
                        <fieldset class="step">
                            <legend>Account</legend>
                            <p>
                                <label for="username">User name</label>
                                <html:text property="username"  maxlength="15"></html:text>
                            </p>
                            <p>
                                <label for="username">Full name</label>
                                <html:text property="fullname"  maxlength="100"></html:text>
                            </p>
                            <p>
                                <label for="password">Password</label>
                                <html:password property="password"  maxlength="15" ></html:password>
                            </p>
                            <p>
                                <label for="password">Confirm Password</label>
                                <html:password property="confirmPassword"  maxlength="15" ></html:password>
                            </p>
                            <p>
                                <label for="username">Email</label>
                                <html:text property="email"  maxlength="100"></html:text>
                            </p>
                            <p>
                                <label for="username">Confirm Email</label>
                                <html:text property="confirmEmail"  maxlength="100"></html:text>
                            </p>
                            <p align="justify">
                                <html:submit value="Register" property="submit"></html:submit>
                            </p>
                        </fieldset>
                    </html:form>
                </div>
            </div>
        </div>
    </body>
</html:html>
