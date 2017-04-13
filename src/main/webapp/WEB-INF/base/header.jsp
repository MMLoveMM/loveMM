<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="taglibs.jsp"%>
<div class="row demo-row navbar-fixed-top">
	<div class="col-xs-12">
		<nav class="navbar navbar-inverse navbar-embossed" role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse-01">
					<span class="sr-only"></span>
				</button>
				<a class="navbar-brand" href="#">Love MM</a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-collapse-01">
				<ul class="nav navbar-nav navbar-left">
					<li><a href="#fakelink">首页</a></li>
					<li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">其他<b class="caret"></b></a>
						<span class="dropdown-arrow"></span>
						<ul class="dropdown-menu">
							<li><a href="#">待开发</a></li>
							<li><a href="#">待开发</a></li>
						</ul>
					</li>
				<li><a href="#fakelink" class="">注册<span class="navbar-unread">1</span></a></li>
				 </ul>
				 <form class="navbar-form navbar-right" action="#" role="search">
					<div class="form-group">
						<div class="input-group">
							<input class="form-control" id="navbarInput-01" type="search" placeholder="Search">
							<span class="input-group-btn">
								<button type="submit" class="btn"><span class="fui-search"></span></button>
							</span>
						</div>
					</div>
				</form>
			</div><!-- /.navbar-collapse -->
		</nav><!-- /navbar -->
	</div>
</div> <!-- /row -->