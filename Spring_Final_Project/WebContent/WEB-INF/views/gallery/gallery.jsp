<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<style>
.location-title {
  position: absolute;
  top: 0;
  left: 0;
  height: 100%;
  width: 100%;
  background: rgba(90,0,10,0.4);
   
  /* typographic styles */
  color: white;
  font-size: 1.5em;
  font-weight: bold;
  text-decoration: none;
   
  /* position the text centrally*/
  display: flex;
  align-items: center;
  justify-content: center;
  
  /* hide the title by default */
opacity: 0;
transition: opacity .5s;
}
.location-listing:hover .location-title {
  opacity: 1;
}


.location-listing:hover .location-image img {
  filter: blur(2px);
}

.location-image img {
  filter: blur(0px);
  transition: filter 0.3s ease-in;
  transform: scale(1.1);
}
 
.location-listing {
  position: relative;
  overflow: hidden;
}
select {
float: right;
}


</style>

<div class="child-page-listing">
 
<br>

  <article class="location-listing">
    <a class="location-title" href="galleryAlbum.do">岸府府</a>
    <div class="location-image">
      <a href="galleryAlbum.do">
        <img src="resources/fileUpload/19.gif" alt="岸府府">
      </a>
    </div>
    
  </article>
  
   <article class="location-listing">
  <a class="location-title" href="travelGal.do">咯青老扁</a>
    <div class="location-image">
      <a href="travelGal.do">
        <img src="resources/fileUpload/17.gif" alt="咯青老扁">
      </a>
    </div>
     </article>
  <!-- more articles -->
</div>
