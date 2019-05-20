<jsp:include page="header.jsp" />
<body>

<div class="container">

  <h1 class="font-weight-light text-center text-lg-left mt-4 mb-0">Pic of the day</h1>
  <hr class="mt-2 mb-5">
  
  <div class="form-group">
  	<div class='input-group date' id='datetimepicker1'>
    	<input type='text' class="form-control" />
        	<span class="input-group-addon">
            	<span class="glyphicon glyphicon-calendar">
                </span>
            </span>
     </div>
   </div>
  
  <div class="row" id="imageDiv">
        <div class="col-6">
            <img class="img-responsive center-block" src="" alt=""> 
        </div>
    </div>
  
  <div class="embed-responsive embed-responsive-16by9" id="videoDiv"> 
	  <iframe class="embed-responsive-item" src=""></iframe>
  </div>
  
</div>

</body>
<jsp:include page="footer.jsp" />