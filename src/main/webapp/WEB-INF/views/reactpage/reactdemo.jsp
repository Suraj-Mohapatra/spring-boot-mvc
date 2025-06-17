<%-- 
    Document   : reactdemo
    Created on : 17-Apr-2025, 12:53:39 am
    Author     : SURAJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<script crossorigin src="https://unpkg.com/react@18/umd/react.development.js"></script>-->
        <!--<script crossorigin src="https://unpkg.com/react-dom@18/umd/react-dom.development.js"></script>-->
        <!--<script crossorigin src="https://unpkg.com/@babel/standalone/babel.min.js"></script>-->
        <script src="${pageContext.request.contextPath}/webjars/react/18.0.0/umd/react.development.js"></script>
        <script src="${pageContext.request.contextPath}/webjars/react-dom/18.0.0/umd/react-dom.development.js"></script>
        <script src="${pageContext.request.contextPath}/webjars/babel__standalone/7.21.2/babel.min.js"></script>
    </head>

    <body>
        <div id='root1'></div>
        <div id='root2'></div>
        <div id='root3'></div>
    </body>
    
    <script>
   		const h1 = document.createElement('h1');
    	h1.textContent = "content of this div is rendered using VanillaJS";
    	h1.style.color = "red";
		document.getElementById('root1').appendChild(h1);
    </script>
    
	<!-- Code written as per JS syntax -->
    <script>
    const style = { style: { color: "green" } };
        const App = () => React.createElement("h1",style,"this is rendered using ReactJS");
        const root = ReactDOM.createRoot(document.getElementById('root2'));
        root.render(React.createElement(App));
    </script>
    
	<!-- Code written as per JSX syntax -->
    <script type="text/babel">
        const App2 = () => (
                <div style={{fontFamily: 'sans-serif', padding: '10px', border: '1px solid #ccc', color: 'blue'}}>
                <h1>Hello from JSX in the Browser!</h1>
                <p>This JSX is compiled by Babel running in the browser.</p>
                </div> );
        const root = ReactDOM.createRoot(document.getElementById('root3'));
        root.render(<App2 />);
    </script>


</html>
