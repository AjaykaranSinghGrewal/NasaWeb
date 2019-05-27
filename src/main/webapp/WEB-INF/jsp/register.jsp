<jsp:include page="header.jsp" />
<body>

<div class="container">
  <div class="wrapper">
    <form class="form-signin" action="register" method="post">       
      <h2 class="form-signin-heading">Register</h2>
      <input type="text" class="form-control" name="register-name" placeholder="Name" required autofocus />
      <input type="email" class="form-control" name="register-email" placeholder="Email Address" required />
      <input type="password" class="form-control" name="register-password" placeholder="Password" required/>
      <br/>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Register</button>    
    </form>
  </div>
</div>

<jsp:include page="footer.jsp" />