<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>눈 내리는 효과</title>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==" crossorigin="anonymous" />
  <link rel="stylesheet" href="/resources/css/user/style.css" />
  <script src='https://code.jquery.com/jquery-3.3.1.min.js'></script>
</head>
<body>
 <script type="text/javascript">
 setInterval(createSnow, 100);
 
 function createSnow() {
    const snow = document.createElement('i');
    snow.classList.add('fas');
    snow.classList.add('fa-snowflake');
    snow.style.left = Math.random() * window.innerWidth + 'px';
    snow.style.animationDirection = Math.random() * 3 + 2 + 's';
    snow.style.opacity = Math.random();
    snow.style.fontSize = Math.random() * 10 + 10 + 'px';
  
    document.body.appendChild(snow);
  
    setTimeout(() => {
       snow.remove();
    }, 5000);
 }
  
 </script>
</body>
</html>