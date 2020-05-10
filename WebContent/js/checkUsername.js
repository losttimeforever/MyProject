$(function () {
	$("#username").blur(function() {
		//获得文本框的值
		var username = $(this).val();
		//演示load方法：加载
		$("#s1").load("/myproject/UserServlet",{"username":username});
		//演示get/post方法
		$.get("/myproject/UserServlet",{"username":username},function(data){
			if (data == 1) {
				$("#s1").html("<font color = 'green'>用户名可以使用</font>");
				$("#regBut").attr("disabled",false);
			}else if (data == 2) {
				$("#s1").html("<font color = 'red'>用户名已经存在</font>");
				$("#regBut").attr("disabled",true);
			}
		})
	});
});

