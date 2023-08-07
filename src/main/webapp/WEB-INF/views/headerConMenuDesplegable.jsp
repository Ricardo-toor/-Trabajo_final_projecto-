<header class="bg-dark text-white">
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container">
		<a class="navbar-brand" href="crearclientesrest">Sprint</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
			aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNav">
			<ul class="navbar-nav list-unstyled d-flex justify-content-center ms-auto">
				<li class="nav-item mx-2">
					<a class="nav-link text-white text-decoration-none" href="">Inicio</a>
				</li>
				<li class="nav-item dropdown mx-2">
					<a class="nav-link dropdown-toggle text-white text-decoration-none" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Usuario</a>
					<ul class="dropdown-menu">
						<li class="nav-item">
							<a class="nav-link dropdown-item" href="#"></a>
						</li>
						<li class="">
							<a class="nav-link dropdown-item" href="#">Profesional</a>
						</li>
						<li class="">
							<a class="nav-link dropdown-item" href="#">Administrativo</a>
						</li>
					</ul>
				</li>
				<li class="nav-item dropdown mx-2">
					<a class="nav-link dropdown-toggle text-white text-decoration-none" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">Listar Usuarios</a>
					<ul class="dropdown-menu">
						<li class="">
							<a class="nav-link dropdown-item" href="#">Cliente</a>
						</li>
						<li class="">
							<a class="nav-link dropdown-item" href="#">Profesional</a>
						</li>
						<li class="">
							<a class="nav-link dropdown-item" href="#">Administrativo</a>
						</li>
					</ul>
				</li>
				<!-- Verificar si el usuario ha iniciado sesion -->
				<c:if test="${pageContext.request.userPrincipal != null}">
					<li class="nav-item mx-2">
						<a class="nav-link text-white text-decoration-none" href="logout">Cerrar Sesión</a>
					</li>
				</c:if>
			</ul>
		</div>
	</div>
</nav>
</header>