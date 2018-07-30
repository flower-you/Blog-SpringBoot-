
//浏览器一起动就判断浏览器 获取XMLHttpRequest
/*创建异步对象的函数    */
function createXMLHttpRequest() {
	try {
		return new XMLHttpRequest();//常用的浏览器创建

	} catch (e) {
		try {
			return ActiveXObject("Msxml2.XMLHTTP");//IE6.0  
		} catch (e) {
			try {
				return ActiveXObject("Micrsoft.XMLHTTP");//IE5.5 
			} catch (e) {
				alert("当前浏览器不支持异步操作！");
				throw e;
			}
		}
	}
}

//窗体加载的时候
window.onload = function() {
	var user = document.getElementById("name");
	user.onblur = function() {
		var xmlhttp = createXMLHttpRequest();//1.创建了一个xmlhttp
		xmlhttp.open("POST", "check", true);//2.打开和服务器
		xmlhttp.setRequestHeader("Content-type",
				"application/x-www-form-urlencoded");//3.设置响应头
		xmlhttp.send("username=" + user.value);//4.发送消息给服务器
		xmlhttp.onreadystatechange = function() {//这个函数就相当于是回调函数，此步：即注册回调函数
			//alert("readyState:"+xmlhttp.readyState+"status:"+xmlhttp.status)
			if (xmlhttp.readyState == 4 && xmlhttp.status == 200) { //双重判断:xmlHttp的状态为4（服务器响应结束），以及服务器状态码为200(服务器响应成功)
				var text = xmlhttp.responseText;
				 var namespan=document.getElementById("namespan");
	                if(text=="true"){
	                    namespan.innerHTML="<font color='red' size='3'>用户名已被使用</font>";

	                }else{
	                	 namespan.innerHTML="<font color='green' size='3'>用户名可用</font>";
	                }
			}
		}
	}
}