<%-- 
    Document   : index
    Created on : Nov 27, 2010, 5:17:33 AM
    Author     : A.S.Malindi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

        <style type="text/css" media="all" >
            @import "cs/maincss.css";
            @import "../../addmoo/web/cs/maincss.css";
        </style>
        <style type="text/css">
            <!--
            #main #warp_main #warp_left #warp_row_1 {
                float: left;
                height: 250px;
                width: 600px;
            }
            #main #warp_main #warp_left #warp_Row_2 {
                float: left;
                height: 250px;
                width: 600px;
            }
            #main #warp_main #warp_left #warp_row_3 {
                float: left;
                height: 250px;
                width: 600px;
            }
            #main #warp_main #warp_left #warp_row_4 {
                float: left;
                height: 250px;
                width: 600px;
            }
            #main #warp_main #warp_left #warp_row_1 #warp_row1_col1 ,#main #warp_main #warp_left #warp_row_1 #warp_row1_col2,#main #warp_main #warp_left #warp_row_1 #warp_row1_col3,#main #warp_main #warp_left #warp_Row_2 #warp_row2_col1,#main #warp_main #warp_left #warp_Row_2 #warp_row2_col2,#main #warp_main #warp_left #warp_Row_2 #warp_row2_col3 ,#main #warp_main #warp_left #warp_row_3 #warp_row3_col1,#main #warp_main #warp_left #warp_row_3 #warp_row3_col2 ,#main #warp_main #warp_left #warp_row_3 #warp_row3_col3,#main #warp_main #warp_left #warp_row_4 #warp_row4_col1,#main #warp_main #warp_left #warp_row_4 #warp_row4_col2,#main #warp_main #warp_left #warp_row_4 #warp_row4_col3  {
                background-color: #B4DCED;
                float: left;
                height: 224px;
                width: 192px;

            }

            #main #warp_main #warp_left #warp_row_1 #warp_row1_col2,#main #warp_main #warp_left #warp_row_1 #warp_row1_col3,#main #warp_main #warp_left #warp_Row_2 #warp_row2_col2,#main #warp_main #warp_left #warp_Row_2 #warp_row2_col3 ,#main #warp_main #warp_left #warp_row_3 #warp_row3_col2 ,#main #warp_main #warp_left #warp_row_3 #warp_row3_col3,#main #warp_main #warp_left #warp_row_4 #warp_row4_col2,#main #warp_main #warp_left #warp_row_4 #warp_row4_col3 {
                margin-top: 8px;
                margin-right: 5px;
                margin-bottom: 2px;
                margin-left: 0px;
            }
            #main #warp_main #warp_left #warp_row_1 #warp_row1_col1 {
                margin-top: 8px;
                margin-right: 1px;
                margin-bottom: 2px;
                margin-left: 12px;
            }
            #main #warp_main #warp_left #warp_Row_2 #warp_row2_col1 {
                margin-top: 8px;
                margin-right: 1px;
                margin-bottom: 2px;
                margin-left: 12px;
            }
            #main #warp_main #warp_left #warp_row_3 #warp_row3_col1 {
                margin-top: 8px;
                margin-right: 1px;
                margin-bottom: 4px;
                margin-left: 12px;
            }
            #main #warp_main #warp_left #warp_row_4 #warp_row4_col1 {
                margin-top: 8px;
                margin-right: 1px;
                margin-bottom: 4px;
                margin-left: 12px;
            }
            #main #warp_main #warp_ri #search_box {
                background-color: #06F;
                float: left;
                height: auto;
                width: 380px;
            }
            #main #warp_main #warp_ri #gallery {
                background-color: #939;
                float: left;
                height: auto;
                width: 380px;
            }

            #slider {

                /* You MUST specify the width and height */
                width:300px;
                height:186px;
                position:relative;
                overflow:hidden;
            }

            #mask-gallery {

                overflow:hidden;
            }

            #gallery {

                /* Clear the list style */
                list-style:none;
                margin:0;
                padding:0;

                z-index:0;

                /* width = total items multiply with #mask gallery width */
                width:900px;
                overflow:hidden;
            }

            #gallery li {


                /* float left, so that the items are arrangged horizontally */
                float:left;
            }


            #mask-excerpt {

                /* Set the position */
                position:absolute;
                top:0;
                left:0;
                z-index:500px;

                /* width should be lesser than #slider width */
                width:100px;
                overflow:hidden;

            }

            #excerpt {
                /* Opacity setting for different browsers */
                filter:alpha(opacity=60);
                -moz-opacity:0.6;
                -khtml-opacity: 0.6;
                opacity: 0.6;

                /* Clear the list style */
                list-style:none;
                margin:0;
                padding:0;

                /* Set the position */
                z-index:10;
                position:absolute;
                top:0;
                left:0;

                /* Set the style */
                width:100px;
                background-color:#000;
                overflow:hidden;
                font-family:arial;
                font-size:10px;
                color:#fff;
            }

            #excerpt li {
                padding:5px;
            }



            .clear {
                clear:both;
            }
            #warp_main #warp_ri #gallery #slideshow #slidesContainer {
                float: left;
                height: 250px;
                width: 380px;
                margin-top: 0px;
                margin-right: auto;
                position: relative;
                background-color: #67B8DE;

            }
            #warp_main #warp_ri #gallery #slideshow #slidesContainer .slide {
                height: 250px;
                width: 380px;
                margin-top: 0px;
                margin-right: auto;
                float: left;
            }
            #next {
                position: absolute;
                left: 323px;
                top: 142px;
                z-index:auto;
            }
            #prev {
                position: absolute;
                left: 3px;
                top: 141px;
                z-index:auto;
            }
            #play{
                position: absolute;
                left: 203px;
                top: 140px;
                z-index:auto;
            }
            #pause {
                position: absolute;
                left: 177px;
                top: 142px;
                z-index: auto;

            }

            -->
        </style>
        <script type="text/javascript">
            var interval= 5000;
            var numOfSlide =4;
            var correctSlide=1;

            var captionText = new Array(numOfSlide);
            var slides = new Array(numOfSlide);

            function SetCaption(){
                captionText[1]=" image caption text 1 in here ";
                captionText[2]=" image caption text 2 in here ";
                captionText[3]=" image caption text 3 in here ";
                captionText[4]=" image caption text 4 in here ";
            }
            function autoPlay(){
            }
            function nextSlide(){
            }
            function prevSlide(){
            }
            function play(){
            }
            function resume(){
            }
            function pause(){
            }
            function show(){
            }
            function hide(){
            }


        </script>
    </head>
    <body>
        <div id="main">
            <jsp:directive.include file="jsp/jspf/header.jspf" />
            <div id="warp_main">
                <div id="warp_left">
                    <div id="warp_row_1">
                        <div id="warp_row1_col1">
                            <a href="#/">For Sale</a>
                            <ul>
                                <li>
                                    <a href="#">Electronics</a>
                                </li>
                                <li>
                                    <a href="#">Computers & Acc.</a>
                                </li>
                                <li>
                                    <a href="#">Home & Garden</a>
                                </li>
                                <li>
                                    <a href="#">Furniture</a>
                                </li>
                                <li>
                                    <a href="#">Garage & Yard Sales</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul>
                        </div>
                        <div id="warp_row1_col2"><a href="#/">Classes</a>
                            <ul>
                                <li>
                                    <a href="#">Computer - Multimedia Classes</a>
                                </li>
                                <li>
                                    <a href="#">Language Classes</a>
                                </li>
                                <li>
                                    <a href="#">Music - Theatre - Dance Classes</a>
                                </li>
                                <li>
                                    <a href="#">Tutoring - Private Lessons</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                        <div id="warp_row1_col3"><a href="#/">Vehicles</a>
                            <ul>
                                <li>
                                    <a href="#">Cars</a>
                                </li>
                                <li>
                                    <a href="#">Car Parts</a>
                                </li>
                                <li>
                                    <a href="#">Vans </a>
                                </li>
                                <li>
                                    <a href="#">Motor bikes </a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                    </div>
                    <div id="warp_Row_2">
                        <div id="warp_row2_col1"><a href="#/">Real Estate</a>
                            <ul>
                                <li>
                                    <a href="#">Apartments</a>
                                </li>
                                <li>
                                    <a href="#">Houses Annexes</a>
                                </li>
                                <li>
                                    <a href="#">Office Premises & Business Premises</a>
                                </li>
                                <li>
                                    <a href="#">Warehouses Factories</a>
                                </li>
                                <li>
                                    <a href="#">Land and plots</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                        <div id="warp_row2_col2"><a href="#/">Services</a>
                            <ul>
                                <li>
                                    <a href="#">Auto Services</a>
                                </li>
                                <li>
                                    <a href="#">Cleaning Services</a>
                                </li>
                                <li>
                                    <a href="#">Coupons</a>
                                </li>
                                <li>
                                    <a href="#">Financial Services</a>
                                </li>
                                <li>
                                    <a href="#">Health Services</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                        <div id="warp_row2_col3"><a href="#/">Community</a>
                            <ul>
                                <li>
                                    <a href="#">Announcements</a>
                                </li>
                                <li>
                                    <a href="#">Art & Music News</a>
                                </li>
                                <li>
                                    <a href="#">Music News</a>
                                </li>
                                <li>
                                    <a href="#">Film News</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                    </div>
                    <div id="warp_row_3">
                        <div id="warp_row3_col1"><a href="#/">Personal</a>
                            <ul>
                                <li>
                                    <a href="#">Friendship - Activity Partners</a>
                                </li>
                                <li>
                                    <a href="#">marriage proposals</a>
                                </li>
                                <li>
                                    <a href="#" > Pen pals</a>
                                </li>
                                <li>
                                    <a href="#">marriage proposals</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                        <div id="warp_row3_col2"><a href="#/">Jobs</a>
                            <ul>
                                <li>
                                    <a href="#">Accounting and Finance</a>
                                </li>
                                <li>
                                    <a href="#">Admin and Secretarial</a>
                                </li>
                                <li>
                                    <a href="#">Engineering</a>
                                </li>
                                <li>
                                    <a href="#">Computer and Software</a>
                                </li>
                                <li>
                                    <a href="#">Construction</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                        <div id="warp_row3_col3"><a href="#/">Pets</a>
                            <ul>
                                <li>
                                    <a href="#">Dogs</a>
                                </li>
                                <li>
                                    <a href="#">Cats</a>
                                </li>
                                <li>
                                    <a href="#">Birds</a>
                                </li>
                                <li>
                                    <a href="#">Fish</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                    </div>
                    <div id="warp_row_4">
                        <div id="warp_row4_col1"><a href="#/">Tickets</a>
                            <ul>
                                <li>
                                    <a href="#">Concert Tickets</a>
                                </li>
                                <li>
                                    <a href="#">Group Tickets</a>
                                </li>
                                <li>
                                    <a href="#">Sports Tickets</a>
                                </li>
                                <li>
                                    <a href="#">Theater Tickets</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                        <div id="warp_row4_col2"><a href="#/">For Rent</a>
                            <ul>
                                <li>
                                    <a href="#">Apartment Rentals</a>
                                </li>
                                <li>
                                    <a href="#">Condo Rentals</a>
                                </li>
                                <li>
                                    <a href="#">Home Rentals</a>
                                </li>
                                <li>
                                    <a href="#">Roommates</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                        <div id="warp_row4_col3"><a href="#/">Leisure</a>
                            <ul>
                                <li>
                                    <a href="#">Travel & Tourism</a>
                                </li>
                                <li>
                                    <a href="#">Hot Spots</a>
                                </li>
                                <li>
                                    <a href="#">Restaurants</a>
                                </li>
                                <li>
                                    <a href="#">Movies & Dramas</a>
                                </li>
                                <li>
                                    <a href="#">Clubs & Pubs</a>
                                </li>
                                <li>
                                    <a href="#">more>></a>
                                </li>
                            </ul></div>
                    </div>
                </div>
                <div id="warp_ri">
                    <div id="search_box">
                        <form action="" method="get">
                            <br />
                            <br />

                            <table width="380" border="0" cellspacing="8" cellpadding="0">
                                <tr>
                                    <td>&nbsp;
                                        <label>Location:</label>
                                    </td>
                                    <td>    <input name="" type="text" dir="ltr" />&nbsp;</td>
                                </tr>
                                <tr>
                                    <td>&nbsp;<label>Category:</label></td>
                                    <td> <input name="" type="text" />&nbsp;</td>
                                </tr>
                            </table>
                            <br />
                            &nbsp; &nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <input name="" type="submit" value="Search" />
                            <br />
                            <br />
                            <br />
                        </form>
                    </div>
                    <div id="gallery">

                        <!-- Slideshow HTML -->
                        <div id="slideshow">
                            <div id="slidesContainer">
                                <div class="slide">
                                    <img src="image/ima1.jpg" height="250" width="380"/>
                                </div>
                                <div id="next_slide">
                                </div>

                                <div id="next" ">
                                     <img src="image/next.JPG"
                                     onmouseover="this.style.opacity=1;this.filters.alpha.opacity=100"
                                     onmouseout="this.style.opacity=0.1;this.filters.alpha.opacity=10"
                                     />
                                </div>
                                <div id="prev" >
                                    <img src="image/prev.JPG"
                                         onmouseover="this.style.opacity=1;this.filters.alpha.opacity=100"
                                         onmouseout="this.style.opacity=0.1;this.filters.alpha.opacity=10"
                                         />
                                </div>
                                <div id="pause">
                                    <img src="image/tool_pause.JPG"
                                         onmouseover="this.style.opacity=1;this.filters.alpha.opacity=100"
                                         onmouseout="this.style.opacity=0.1;this.filters.alpha.opacity=10"
                                         />
                                </div>
                                <div id="play">
                                    <img src="image/play.JPG"
                                         onmouseover="this.style.opacity=1;this.filters.alpha.opacity=100"
                                         onmouseout="this.style.opacity=0.1;this.filters.alpha.opacity=10"
                                         />
                                </div>

                            </div>
                        </div>
                        <!-- Slideshow HTML -->
                    </div>
                </div>
                <jsp:directive.include file="jsp/jspf/footer.jspf" />
            </div>
        </div>
    </body>
</html>
