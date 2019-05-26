<jsp:include page="header.jsp" />
<body>

<div class="container">

  <h1 class="font-weight-light text-center text-lg-left mt-4 mb-0">Pic of the day</h1>
  <hr class="mt-2 mb-5">
  
	<input type="date" name="bday" id="datePicker">
	<input type="button" value="date" id="datebtn">
	<p class="getDate"></p>
  
  <div id="container" class="container">
	  <div class="row" id="imageDiv">
	        <div class="col-4">
	            <img id="imageframe" class="img-responsive center-block" src="" alt=""> 
	        </div>
	    </div>
	  
	  <div class="embed-responsive embed-responsive-16by9" id="videoDiv"> 
		  <iframe id="videoframe" class="embed-responsive-item" src=""></iframe>
	  </div>
	  
	  <h1 id="title" class="display-3"></h1>
	  
	  <blockquote class="blockquote">
		<p class="mb-0" id="explanation"></p>
		<footer class="blockquote-footer">Image credits: <cite id="credit" title="Image Credits"></cite></footer>
	  </blockquote>
  </div>
	    
</div>

</body>
<jsp:include page="footer.jsp" />