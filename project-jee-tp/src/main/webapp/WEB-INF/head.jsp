
	<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
		<!-- Brand -->
		<a class="navbar-brand" href="#">Gestion-RH</a>

		<!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="nav-link" href="IndexTestJsp.jsp">IndexTestJsp.jsp</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="pageHasError.jsp">pageHasError.jsp</a>
			</li>
			
			<!-- Dropdown -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown"> Action Standard </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="action/jspinclude.jsp">Include</a> 
					<a class="dropdown-item" href="action/useBean.jsp">useBean</a> 
					<a class="dropdown-item" href="#">Bootstrap</a>
				</div></li>
				
							<!-- Dropdown -->
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown"> JSTL </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="dept?action=foreach">forEach</a> 
					<a class="dropdown-item" href="dept?action=if">if</a> 
					<a class="dropdown-item" href="dept?action=choose">choose</a> 
				</div></li>
		</ul>
		<!-- Right -->
		<ul class="navbar-nav ml-auto">

			<li class="nav-item"><a class="nav-link" href="logout.html">logout</a>
			</li>
		</ul>
	</nav>