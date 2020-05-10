<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

	<head>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<title>网上商城</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/bootstrap.min.css" type="text/css" />
		<script src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js" type="text/javascript"></script>
		<script src="${pageContext.request.contextPath }/js/bootstrap.min.js" type="text/javascript"></script>
	</head>

	<body>
		<div class="container-fluid">

			<%@include file="menu.jsp" %>

			<div class="container-fluid">
				<div class="main_con">
					<h2>公司简介</h2>
					<hr/>
					<div>
						
						
						<h4>公司简介一般包括以下几个方面：</h4>
							<p>
							1、公司概况：这里面可以包括注册时间，注册资本，公司性质，技术力量，规模，员工人数，员工素质等;<br/>
							
							2、公司发展状况:公司的发展速度,有何成绩,有何荣誉称号等;<br/>
							
							3、公司文化:公司的目标,理念,宗旨,使命,愿景,寄语等;<br/>
							
							4、公司主要产品:性能,特色,创新,超前;<br/>
							
							5、销售业绩及网络:销售量,各地销售点等;<br/>
							
							6、售后服务:主要是公司售后服务的承诺。<br/>
							
							以上几个点都是重要的因素。<br/>
							拓展资料：<br/>
							
							一、公司的定义：<br/>
							公司是依照公司法在中国境内设立的有限责任公司和股份有限公司，是以营利为目的的企业法人。它是适应市场经济社会化大生产的需要而形成的一种企业组织形式。<br/>
							
							二、公司的类型：<br/>
							
							1、无限责任公司<br/>
							
							是指全体股东对公司债务承担无限连带清偿责任的公司。<br/>
							
							2、有限责任公司<br/>
							
							是指公司全体股东对公司债务仅以各自的出资额为限承担责任的公司。<br/>
							
							3、两合公司<br/>
							
							是指公司的一部分股东对公司债务承担无限连带责任，另一部分股东对公司债务仅以出资额为限承担有限责任的公司。<br/>
							
							4、股份有限公司<br/>
							
							是指公司资本划分为等额股份，全体股东仅以各自持有的股份额为限对公司债务承担责任的公司。<br/>
							
							5、股份两合公司<br/>
							
							是指公司资本划分为等额股份，一部分股东对公司债务承担无限连带责任，另一部分股东对公司债务仅以其持有的股份额为限承担责任的公司。<br/>
						</p>
					</div>
				</div>
			</div>

		</div>
		<%@include file="footer.jsp" %>

	</body>

</html>