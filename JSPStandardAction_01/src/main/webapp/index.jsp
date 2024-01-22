<%@ page language="java"%>
<jsp:useBean id="calculator" class="in.ineuron.bean.Calculator"/>

<h1>
The Square of 5 is :: <%= calculator.squareIt(5)%> <br/>
The Square of 6 is :: <%= calculator.squareIt(6)%> <br/>
</h1>

