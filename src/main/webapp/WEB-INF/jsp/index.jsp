<jsp:include page="header.jsp" />
<body>

<a href="picoftheday">pic of the day</a>

<div class="container">

  <h1 class="font-weight-light text-center text-lg-left mt-4 mb-0">NasaApp</h1>
  <hr class="mt-2 mb-5">
  
  <form id="searchform" method="get" name="mc-embedded-subscribe-form" novalidate>
	<div class="input-group input-group-lg">
		<input type="text" name="input" class="form-control" id="inputText" placeholder="Enter a Search Item...">
		<span class="input-group-btn">
			<button type="submit" name="submit" id="mc-embedded-subscribe" class="btn btn-secondary">Search!</button>
		</span>
	</div>
  </form>

  <br>

  <div id="images">
  <!--<div class="row text-center text-lg-left" id='images'>
     <div class="col-lg-3 col-md-4 col-6">
      <a href="#" class="d-block mb-4 h-100">
            <img class="img-fluid img-thumbnail" alt="">
          </a>
    </div>
    </div>-->
  </div>
  
</div>
<!-- /.container -->
<jsp:include page="footer.jsp" />