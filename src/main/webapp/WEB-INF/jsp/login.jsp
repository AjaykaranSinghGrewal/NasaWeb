<jsp:include page="header.jsp" />
<body>

<div class="container">
  <div class="wrapper">
    <form class="form-signin" action="connect" method="post">       
      <h2 class="form-signin-heading">Please login</h2>
      <input type="email" class="form-control" name="email" placeholder="Email Address" required autofocus />
      <input type="password" class="form-control" name="password" placeholder="Password" required/>
      <br/>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>    
    </form>
  </div>
</div>

<jsp:include page="footer.jsp" />