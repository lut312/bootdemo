<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<body style="background-image: none;">
<div class="body_wrap">
    <div class="container">
        <div class="alert alert-success text-center" role="alert">Sptring Boot学习资源</div>
        <table class="table table-striped table-bordered">
            <tr>
                <td>作者</td>
                <td>教程名称</td>
                <td>地址</td>
            </tr>
            <c:forEach var="learn" items="${learnList}">
                <tr class="text-info">
                    <td th:text="${learn.name}">嘟嘟MD</td>
                    <td th:text="${learn.des}">SPringBoot干货系列</td>
                    <td><a href="#" th:href="${learn.url}" class="btn btn-search btn-green" target="_blank"><span>点我</span></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>
</body>